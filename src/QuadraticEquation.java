import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        double delta = this.b * 2 - 4 * this.a * this.c;
        return delta;
    }
    public double getRoot1(){
        double root1;
        if (this.getDiscriminant()>=0){
            root1 = (-b + Math.pow(Math.pow(b,2) - 4 * a * c,0.5))/(2 * a);
            return root1;
        } else return 0;
    }
    public double getRoot2(){
        double root2;
        if (this.getDiscriminant()>=0){
            root2 = (-b - Math.pow(Math.pow(b,2) - 4 * a * c,0.5))/(2 * a);
            return root2;
        } else return 0;
    }
    public void equation(){
        if (getDiscriminant()>0){
            System.out.print("The equation has two roots: " + getRoot1() + " and " + getRoot2());
        } else if (getDiscriminant()==0){
            System.out.print("The equation has one root: " + getRoot1());
        } else {
            System.out.print("The equation has no real root ");
        }
    }
}

