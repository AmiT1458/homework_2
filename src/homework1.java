import java.util.Scanner;
public class homework1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter exercise number from 1 to 10 : ");
        int exercise = scanner.nextInt();

        if (exercise == 1)
        {
            f1();
        }
        else if (exercise == 2)
        {
            f2();
        }
        else if (exercise == 3)
        {
            f3();
        }

        else if (exercise == 5)
        {
            f5();
        }
        else if (exercise == 6)
        {
            f6();
        }
        else if (exercise == 7)
        {
            f7();
        }
        else if (exercise == 8)
        {
            f8();
        }
        else if (exercise == 9)
        {
            f9();
        }
        else if (exercise == 10)
        {
            f10();
        }
        else {
            System.out.println("Invalid number, try again from 1 to 10");
        }
    }

    public static void f1() {
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();
        char last_name_ini = scanner.next().charAt(0);
        int newage = age + 10;
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("height in meters : " + height);
        System.out.println("last name initial : " + last_name_ini);
        System.out.println("age in ten years : " + newage);

    }

    public static void f2() {
        int secs = scanner.nextInt();
        if (secs / 3600 >= 1) {
            int hours = secs / 3600;
            secs %= 3600;
            System.out.println("hours : " + hours);
        }
        if (secs / 60 >= 1) {
            int mins = secs / 60;
            secs %= 60;
            System.out.println("mins : " + mins);
        }

        System.out.println("seconds : " + secs);
    }

    public static void f3() {
        double bill = scanner.nextDouble();
        double tip = scanner.nextDouble();
        tip = tip / 100;
        int payers = scanner.nextInt();
        System.out.println("tip : " + (bill * tip));
        System.out.println("total : " + (bill * tip + bill));
        System.out.println("per person : " + (double) (bill * tip + bill) / payers);
    }

    public static void f5() {
        double distance = scanner.nextDouble();
        int minutes = scanner.nextInt();
        double hours = minutes / 60.0;
        double averageSpeed = distance / hours;
        System.out.println("Time in hours: " + hours);
        System.out.println("Average speed: " + averageSpeed + " km/h");
        System.out.println("Distance in one hour: " + averageSpeed + " km");
    }

    public static void f6()
    {
        double assignments = scanner.nextDouble();
        double quiz = scanner.nextDouble();
        double finalExam = scanner.nextDouble();
        double finalGrade = (assignments * 0.2) + (quiz * 0.3) + (finalExam * 0.5);
        System.out.println("Final grade: " + finalGrade);
        if (finalGrade >= 60)
        {
            System.out.println("Result: Pass");
        }
        else
        {
            System.out.println("Result: Fail");
        }
    }
    public static void f7()
    {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2)
        {
            System.out.println("The first number is greater: " + num1);
        }
        else if (num2 > num1)
        {
            System.out.println("The second number is greater: " + num2);
        }
        else
        {
            System.out.println("The numbers are equal");
        }
        if (num1 % 2 == 0)
        {
            System.out.println("The first number is even");
        }
        else
        {
            System.out.println("The first number is odd");
        }

        if (num2 % 5 == 0)
        {
            System.out.println("The second number is divisible by 5 without a remainder");
        } else
        {
            System.out.println("The second number is not divisible by 5 without a remainder");
        }

        int sum = num1 + num2;
        if (sum > 0)
        {
            System.out.println("The sum is positive: " + sum);
        }
        else if (sum < 0)
        {
            System.out.println("The sum is negative: " + sum);
        }
        else
        {
            System.out.println("The sum is zero");
        }
    }
    public static void f8()
    {
        int age = scanner.nextInt();
        if (age < 6)
        {
            System.out.println("Ticket price: 0 shekels");
        }
        else if (age <= 17)
        {
            System.out.println("Ticket price: 30 shekels");
        }
        else if (age <= 64)
        {
            System.out.println("Ticket price: 45 shekels");
        }
        else
        {
            System.out.println("Ticket price: 25 shekels");
        }
    }
    public static void f9()
    {
        String word = scanner.nextLine();
        System.out.println("Length: " + word.length());
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());
        System.out.println("First character: " + word.charAt(0));
        System.out.println("Last character: " + word.charAt(word.length() - 1));
    }
    public static void f10()
    {
        int a1 = 7;
        int b1 = 2;
        System.out.println(a1 / b1);
        System.out.println(a1 / 2.0);

        int num2 = 2147483647;
        System.out.println(num2);
        System.out.println(num2 + 1);

        double a3 = 0.1;
        double b3 = 0.2;
        System.out.println(a3 + b3);
        System.out.println(a3 + b3 == 0.3);

        float smallPrecision = 10000000.0f;
        double highPrecision = 10000000.0;
        System.out.println(smallPrecision + 1);
        System.out.println(highPrecision + 1);
    }
}