import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
    System.out.println(add());
    System.out.println(subtract());
    System.out.println(multiply());
    System.out.println(divide());
//    System.out.println(multiplication());
    }

    public static int add(){
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Give me a number");
        num1 = scanner.nextInt();
        System.out.println("Give me another number");
        num2 = scanner.nextInt();
        return num1 + num2;
    }

    public static int subtract(){
        Scanner scanner = new Scanner(System.in);
        int num3;
        int num4;
        System.out.println("give me a number");
        num3 = scanner.nextInt();
        System.out.println("give me a number to subtract from that");
        num4 = scanner.nextInt();
        return num3 - num4;
    }

//    public static int multiply(){
//        Scanner scanner = new Scanner(System.in);
//        int num5;
//        int num6;
//        System.out.println("give me a number");
//        num5 = scanner.nextInt();
//        System.out.println("multiply that number by:");
//        num6 = scanner.nextInt();
//        return num5 * num6;
//
//}

    public static int multiply(){
        Scanner scanner = new Scanner(System.in);
        int num5;
        int num6;
        System.out.println("give me a number");
        num5 = scanner.nextInt();
        System.out.println("multiply that number by:");
        num6 = scanner.nextInt();
        return num5 * num6;
//        for(int i = 0; num6 <= 0; num6--){
//            num5 = num5 + num5;
//        }
//        return num5;

    }
    public static int divide() {
        Scanner scanner = new Scanner(System.in);
        int num7;
        int num8;
        System.out.println("give me a number");
        num7 = scanner.nextInt();
        System.out.println("divide that number by:");
        num8 = scanner.nextInt();
        return num7 / num8;
    }



//    public static int multiplication() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("give me a number");
//        int num9;
//        num9 = scanner.nextInt();
//        int num10;
//        num10 = scanner.nextInt();
////       for(int i = 0; num9 <= 0; num9--){
////            num10 = num9 + num9;
////        }
//
////        System.out.println("give me a number");
////        return multiply( num9, num10);
//    }
}

