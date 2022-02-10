import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputABC= new Scanner(System.in);
        System.out.print("Enter number a: ");
        double numb1 = inputABC.nextDouble();
        System.out.print("Enter number b: ");
        double numb2 = inputABC.nextDouble();
        System.out.print("Enter number c: ");
        double numb3 = inputABC.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(numb1,numb2,numb3);
        quadraticEquation.equation();
    }
}
