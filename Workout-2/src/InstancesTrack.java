import java.util.Scanner;
public class InstancesTrack {
    static int count = 0;
    InstancesTrack() {
        count++;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of instances ");
        int numberOfObject=scanner.nextInt();
        InstancesTrack instancesTrack[] = new InstancesTrack[numberOfObject];

        for (int i=0;i<numberOfObject;i++){
            instancesTrack[i]=new InstancesTrack();
        }
        System.out.println("Enter how many instances you need to destory ");
        int instancesDeletion=scanner.nextInt();
        for(int j=0;j<instancesDeletion;j++){
            instancesTrack[j]=null;

        }
        System.out.println("Object Created : "+(numberOfObject));
        System.out.println("Destoyed Object : "+(instancesDeletion));
        System.out.println("Alive Objects : "+(numberOfObject-instancesDeletion));
        System.gc();

    }
    protected void finalize()throws Throwable{

    }


}