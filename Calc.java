public class Calc {
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[2]);
        String opr = args[1];
        int result = 0;
        if(opr.equals("+")) {
            result = firstNum + secondNum;
        }
        else if(opr.equals("-")) {
            result = firstNum - secondNum;
        }
        System.out.println("Result is : " + result);
    }
}
