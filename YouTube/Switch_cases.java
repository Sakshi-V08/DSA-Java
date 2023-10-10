import java.util.Scanner;

public class Switch_cases {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1-7: ");
        int n = sc.nextInt();
        System.out.println("Enter the work : ");
        String work = sc.next();

        // switch cases example and nested switch cases example
        switch (n) {
            case 1: {
                System.out.println("Monday");
                switch (work) {
                    case "Dance":
                        System.out.print("Dancing is fun");
                        break;
                    case "Study":
                        System.out.print("Read the book");
                        break;
                    case "Food":
                        System.out.print("Eat th food");
                        break;

                }
                break;
            }

            case 2:
                System.out.println("Tuesday");
                switch (work) {
                    case "Dance":
                        System.out.print("Dancing is fun");
                        break;
                    case "Study":
                        System.out.print("Read the book");
                        break;
                    case "Food":
                        System.out.print("Eat th food");
                        break;

                }
                break;
            case 3:
                System.out.println("Wednesday");
                switch (work) {
                    case "Dance":
                        System.out.print("Dancing is fun");
                        break;
                    case "Study":
                        System.out.print("Read the book");
                        break;
                    case "Food":
                        System.out.print("Eat th food");
                        break;

                }
                break;
            case 4:
                System.out.println("Thursday");
                switch (work) {
                    case "Dance":
                        System.out.print("Dancing is fun");
                        break;
                    case "Study":
                        System.out.print("Read the book");
                        break;
                    case "Food":
                        System.out.print("Eat th food");
                        break;

                }
                break;
            case 5:
                System.out.println("Friday");
                switch (work) {
                    case "Dance":
                        System.out.print("Dancing is fun");
                        break;
                    case "Study":
                        System.out.print("Read the book");
                        break;
                    case "Food":
                        System.out.print("Eat th food");
                        break;

                }
                break;
            case 6:
                System.out.println("Saturday");
                switch (work) {
                    case "Dance":
                        System.out.print("Dancing is fun");
                        break;
                    case "Study":
                        System.out.print("Read the book");
                        break;
                    case "Food":
                        System.out.print("Eat th food");
                        break;

                }
                break;
            case 7:
                System.out.println("Sunday");
                switch (work) {
                    case "Dance":
                        System.out.print("Dancing is fun");
                        break;
                    case "Study":
                        System.out.print("Read the book");
                        break;
                    case "Food":
                        System.out.print("Eat th food");
                        break;

                }
                break;
            default:
                System.out.print("You enter wrong. Please again your input.");
        }
    }

}
