import java.util.Date;
import java.util.Scanner;

class Emp {
    private String name;
    private String id;
    private String pwd;
    private int phone;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}

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

    Emp emp;
    View() {
        emp = new Emp();
    }

    void doRegister() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID : ");
        String id = scanner.nextLine();

        System.out.println("Enter Name : ");
        String name = scanner.nextLine();

        System.out.println("Enter Password : ");
        String pwd = scanner.nextLine();

        System.out.println("Enter Phone : ");
        int phone = scanner.nextInt();
        emp.setId(id);
        emp.setName(name);
        emp.setPhone(phone);
        emp.setPwd(pwd);

    }

    void doLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID : ");
        String id = scanner.nextLine();

        System.out.println("Enter Password : ");
        String pwd = scanner.nextLine();

        Model model = new Model();
        // String msg = model.checkLogin(id, pwd);
        Message msg = model.checkLogin(id, pwd, emp);
        // System.out.println("Message is : " + msg);
        System.out.println("Date : " + msg.getDate());
        System.out.println("ID : " + msg.getId());
        System.out.println("Message : " + msg.getMsg());

        scanner.close();
    }
}

class Model {
    Message checkLogin(String id, String pwd, Emp emp) {
        // String msg;
        // Date date = new Date();
        Message msg = new Message();
        // if(id.equals("101") && pwd.equals("1234")) {
        //     // msg = "Login Success";
        //     msg.setMsg("Login Success...");
        // }
        // else {
        //     // msg = "Login Failed..";
        //     msg.setMsg("Login Failed...");
        // }

        if(id.equals(emp.getId()) && pwd.equals(emp.getPwd())) {
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
        view.doRegister();
        view.doLogin();
    }

}
