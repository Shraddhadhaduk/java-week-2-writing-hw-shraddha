package java_week_2;

/**
 * write a java programme using the following steps.
 * 1.1 Declare two Instance variables.
 * 1.2 Declare one Instance method.
 * 1.3 Call both Instance variables into the instance method inside the print statement.
 * 1.4 Declare the main method
 * 1.5 Call the above instance method into the main method and run the programme.
 */
public class Programme_1 {
    //1.1 Declare two Instance variables.
    int a = 10;
    int b = 20;
    //1.2 Declare one Instance method.
    //1.3 Call both Instance variables into the instance method inside the print statement.
    public void instanceMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    //1.4 Declare the main method
    //1.5 Call the above instance method into the main method and run the programme.
    public static void main(String[] args) {
        Programme_1 programme_1 = new Programme_1();
        programme_1.instanceMethod();
    }
}
