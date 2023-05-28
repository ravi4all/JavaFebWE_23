import java.util.Date;
import java.util.Scanner;

class Message {
    private String msg;
    private String id;
    private Date date;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}

class View {
    void doLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID : ");
        String id = scanner.nextLine();

        System.out.println("Enter Password : ");
        String pwd = scanner.nextLine();

        Model model = new Model();
        // String msg = model.checkLogin(id, pwd);
        Message msg = model.checkLogin(id, pwd);
        // System.out.println("Message is : " + msg);
        System.out.println("Date : " + msg.getDate());
        System.out.println("ID : " + msg.getId());
        System.out.println("Message : " + msg.getMsg());

        scanner.close();
    }
}

class Model {
    Message checkLogin(String id, String pwd) {
        // String msg;
        // Date date = new Date();
        Message msg = new Message();
        if(id.equals("101") && pwd.equals("1234")) {
            // msg = "Login Success";
            msg.setMsg("Login Success...");
        }
        else {
            // msg = "Login Failed..";
            msg.setMsg("Login Failed...");
        }
        msg.setDate(new Date());
        msg.setId(id);
        // return msg;
        return msg;
    }
}

public class EmpLoginSystem {
    public static void main(String[] args) {
        View view = new View();
        view.doLogin();
    }

}
