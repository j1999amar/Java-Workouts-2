import java.util.Scanner;

class Employee{
    String Name;
    int EmpId;
    int assessment1;
    int assessment2;
    int assessment3;
    int Result;
    int Percentage;

    Employee(String Name,int EmpId){
        this.Name=Name;
        this.EmpId=EmpId;
    }
    void assessment(int assessment1,int assessment2,int assessment3){
        this.assessment1=assessment1;
        this.assessment2=assessment2;
        this.assessment3=assessment3;

        if(assessment1>=75){
            if(assessment2>=75){
                if(assessment3>=75){
                    calculation();
                    display();
                    System.out.println("Promoted");
                }else{
                    calculation();
                    display();
                    System.out.println("Demoted");
                }
            }else{
                calculation();
                display();
                System.out.println("Demoted");
            }
        }else{
            calculation();
            display();
            System.out.println("Demoted");
        }

    }
    void calculation(){
        Result=assessment1+assessment2+assessment3;
        Percentage=(Result*100)/300;

    }
    void display(){
        System.out.println("Name : "+Name);
        System.out.println("Employee : "+EmpId);
        System.out.println("Result : "+Result);
        System.out.println("Percentage : "+Percentage+"%");

    }
}
public class Emp {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Name & EmpId : ");
        Employee emp=new Employee(scanner.next(),scanner.nextInt());
        System.out.println("Enter the three assessment values : ");
        emp.assessment(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

    }
}
