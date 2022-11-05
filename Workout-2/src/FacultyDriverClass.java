import java.util.Scanner;

class Faculty{
    int facultyId;
    float salary;
}
class FullTimeFaculty extends Faculty{
    float basic;
    float allowance;
    void input(int facultyId,float basic,float allowance){
        this.facultyId=facultyId;
        this.basic=basic;
        this.allowance=allowance;
        this.salary=basic+allowance;

    }
    void display(){
        System.out.println("Full Time faculty ");
        System.out.println("Salary of faculty : "+facultyId +" is : "+salary+"\n");
    }
}
class PartTimeFaculty extends Faculty{
    float hour;
    float rate;
    void input(int facultyID,float hour, float rate ){
        this.facultyId=facultyID;
        this.hour=hour;
        this.rate=rate;
        this.salary=hour*rate;
    }
    void display(){
        System.out.println("Part Time faculty ");
        System.out.println("Salary of faculty : "+facultyId +" is : "+salary);
    }
}
public class FacultyDriverClass {
    public static void main (String [] args){
        Scanner scanner= new Scanner(System.in);
    FullTimeFaculty fullTimeFaculty= new FullTimeFaculty();
    PartTimeFaculty partTimeFaculty= new PartTimeFaculty();
    for(int i=1;i<=2;i++){
        System.out.println("Enter the Full Time Faculty's Faculty ID, Basic & Allowance : ");
        fullTimeFaculty.input(scanner.nextInt(),scanner.nextFloat(),scanner.nextFloat());
        System.out.println("Enter the Part Time Faculty's Faculty ID, Hours & Rate : ");
        partTimeFaculty.input(scanner.nextInt(),scanner.nextFloat(),scanner.nextFloat());
        fullTimeFaculty.display();
        partTimeFaculty.display();
        System.out.println();
    }
    }
}