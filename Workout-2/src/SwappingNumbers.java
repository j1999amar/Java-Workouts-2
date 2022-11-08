import java.util.Scanner;
class callByValue{
    int Number1;
    int Number2;
    int temp;
    void swappingCallByValue(){
        System.out.println("Call By Value");
        System.out.println("Before Swapping");
        System.out.println("First Number : "+Number1+" Second Number : "+Number2);
        temp=Number1;
        Number1=Number2;
        Number2=temp;
        System.out.println("After Swapping");
        System.out.println("First Number : "+Number1+" Second Number : "+Number2+"\n");


    }

}

public class SwappingNumbers {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        callByValue c1=new callByValue();
        System.out.println("Swapping Numbers  ");
        System.out.println("Enter the first number ");
        c1.Number1=scanner.nextInt();
        System.out.println("Enter the second number ");
        c1.Number2=scanner.nextInt();
        c1.swappingCallByValue();
        callByReference(c1);
    }
    static void callByReference(callByValue c2){
        System.out.println("Call By Reference");
        System.out.println("After Swapping");
        System.out.println("First Number : "+c2.Number1+" Second Number : "+c2.Number2+"\n");
    }
}
