package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }


    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\" );
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char z = 'Z';
        int h = 0xface;
        int o = 012;
        long l = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double q = 8.88e1;
        double d = 99.9;
        int sum = z + h + o + (int) l + (int) e +  (int) f + (int) q + (int) d;
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x+y);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);


    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.println("n1: n2: n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n1: n2: n2 > n1");
        }else if (n1 == n2) {
            System.out.println("n1: n2: n1 == n2");
        }else {
            System.out.println("OUT OF REQUEST!");
        }
    }


    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        System.out.print("Enter annual Revenue: ");
        int z = scanner.nextInt();

        if(z < 0 || z >= 100000){
            System.out.println("Invalid Revenue");
        } else if (0 <= z && z < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (20000 <= z && z < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (50000 <= z && z < 80000) {
            System.out.println("Good Sales Revenue");
        }else if (80000 <= z && z < 100000) {
            System.out.println("Excellent Sales Revenue");
        }else {
            System.out.println("OUT OF REQUEST");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        System.out.print("Enter CommissionClass: ");
        int a = scanner.nextInt();
        float b = (float) a;
        switch (a) {
            case 1:
                b = b / 100;
                System.out.println("Your Commission Rate was set to " + b);
                break;
            case 2:
                b = b / 100;
                System.out.println("Your Commission Rate was set to " + b);
                break;
            case 3:
                b = b / 100;
                System.out.println("Your Commission Rate was set to " + b);
                break;
            case 4:
                b = b / 100;
                System.out.println("Your Commission Rate was set to " + b);
                break;
            default: b = b*0;
                System.out.println("Your Commission Rate was set to " + b);

        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        System.out.print("Year: ");
        int a = scanner.nextInt();

        if (a % 100 == 0 && a % 400 != 0){
            System.out.println("Not a Leapyear");
        }else if (a % 400 == 0){
            System.out.println("Leapyear");
        } else if (a % 4 == 0) {
            System.out.println("Leapyear");
        }else {
            System.out.println("Not a Leapyear");
        }
    }


    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        int a,b,c,d;

        System.out.print("Number: ");
        a = scanner.nextInt();

        if(a > 999) {
            System.out.println("Sorry, only 3 digits allowed!");
        }else {

            b = a % 10;
            c = a % 100 / 10;
            d = a % 1000 / 100;

            /*System.out.println("Number is: " + a);
            System.out.println("Number is: " + b);
            System.out.println("Number is: " + c);
            System.out.println("Number is: " + d);*/

            String e = "" +b+c+d;

            System.out.println(e);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
