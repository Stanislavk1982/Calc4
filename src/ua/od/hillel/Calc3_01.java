package ua.od.hillel;

public class Calc3_01 {

    public static void main(String[] args) {
        // write your code here
        int number1 = 0, number2 = 0, result = 0;
        char operation;
        String string= args[2];
        //string = args[0];
        //operation = string.charAt(0);
        //operation = args[0].charAt(0);
        number1 = Integer.parseInt(args[0]);
        number2 = Integer.parseInt(args[1]);
        switch (string) {
            case "+":
                result=number1+number2;
                break;
            case "-":
                result=number1-number2;
                break;
            case "*":
                result=number1*number2;
                break;
            case "/":
                result=number1/number2;
                break;
        }
        System.out.println(string);
        System.out.println("Result: " +result);

        //c= args.;


    }
}
