import java.util.Scanner;

class MathFunction{
    void multiply(int number_1,int number_2){
        System.out.println("Multiplication of "+number_1+" & "+number_2+ (":  "+(number_1*number_2)));
    }
    void multiply(float number_1,float number_2){
        System.out.println("Multiplication of "+number_1+" & "+number_2+ (":  "+(number_1*number_2)));
    }
    void multiply(float number_1,int number_2){
        System.out.println("Multiplication of "+number_1+" & "+number_2+ (":  "+(number_1*number_2)));
    }
}
public class Multiplication {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        MathFunction mathFunction=new MathFunction();
        System.out.println("\nMutliplication of two Int");
        System.out.println("Enter the first int & Second int number : ");
        mathFunction.multiply(scanner.nextInt(),scanner.nextInt());
        System.out.println("\nMutliplication of two Floats");
        System.out.println("Enter the first float & Second float number : ");
        mathFunction.multiply(scanner.nextFloat(), scanner.nextFloat());
        System.out.println("\nMutliplication of one Float & one Int");
        System.out.println("Enter the first float & Second float number : ");
        mathFunction.multiply(scanner.nextFloat(), scanner.nextInt());


    }
}
