package client;

import java.util.Scanner;

public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Circle Calculator");
            System.out.println("1.Area of a Circle");
            System.out.println("2.Cirumference");
            System.out.println("0.exit");
            System.out.print("Enter menu number : ");
            menu = sc.nextInt();
            double radius;
            switch (menu) {
            case 1:
                System.out.println("Area of a Circle");
                System.out.print("Enter radius : ");
                radius = sc.nextDouble();
                System.out.println("Area = " + areaofaCircle(radius));
                break;
            case 2:
                System.out.println("Cirumference");
                System.out.print("Enter radius : ");
                radius = sc.nextDouble();
                System.out.println("Cirumference = " + circumference(radius));
                break;
            case 0:
                break;
            default:
                System.out.println("invalid input.");
            }
            System.out.println("------------------");
        } while (menu != 0);
    }

    private static double areaofaCircle(double radius) {
        services.CircleCalculatorWebService_Service service = new services.CircleCalculatorWebService_Service();
        services.CircleCalculatorWebService port = service.getCircleCalculatorWebServicePort();
        return port.areaofaCircle(radius);
    }

    private static double circumference(double radius) {
        services.CircleCalculatorWebService_Service service = new services.CircleCalculatorWebService_Service();
        services.CircleCalculatorWebService port = service.getCircleCalculatorWebServicePort();
        return port.circumference(radius);
    }
}
