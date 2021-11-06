
public class FirstProgram {

    public static void calc(int a, int b, String operation) {
        int result;
        switch (operation) {
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            case "-":
                result = a - b;
                System.out.println(result);

                break;
            case "*":
                result = a * b;
                System.out.println(result);

                break;
            case "/":
                result = a / b;
                System.out.println(result);

                break;
            default:
                System.out.println("Что-то пошло не так, повторите заново");
        }
    }

    public static void main(String[] args) {
        calc(10 , 2 , "+" );
        calc(10 , 2 , "-" );
        calc(10 , 2 , "*" );
        calc(10 , 2 , "/" );


    }

}
