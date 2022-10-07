import java.util.Scanner;
public class EAAA {
    public static void main(String[] argv) {
        int value;
        int value2;
        int value3;
        System.out.println("Enter your first value:");
        Scanner inputValue1;
        inputValue1 = new Scanner(System.in);
        value = inputValue1.nextInt();
        System.out.println("Enter your second value:");
        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        value2 = inputValue2.nextInt();

        System.out.println("Enter your third value:");
        Scanner inputValue3;
        inputValue3 = new Scanner(System.in);
        value3 = inputValue3.nextInt();

        if ( value >= value2 ) {
            if (value2 >= value3)
                System.out.println("" + value3 + "," + value2 + "," + value);
            else if (value3 >= value )
                System.out.println("" + value2 + "," + value + "," + value3);
            else if (value > value3)
                System.out.println("" + value2 + "," + value3 + "," + value);

        }

        if  (value2 > value)
        {
            if (value3 >= value2)
                System.out.println("" + value + "," + value2 + "," + value3);
           else if (value3 >= value)
                System.out.println("" + value2 + "," + value + "," + value3);
          else  if (value > value3)
                System.out.println("" + value2 + "," + value3 + "," + value);



        }
    }
}



