import java.net.SocketOption;
import java.util.Scanner;

class OneBHK{
    int roomArea;
    int hallArea;
    int price;
OneBHK(){
    roomArea=0;
    hallArea=0;
    price=0;
}
    OneBHK(int roomArea,int hallArea,int price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    void show(){
        System.out.println("ONE BHK");
        System.out.println("Room Area : "+roomArea);
        System.out.println("Hall Area : "+hallArea);
        System.out.println("BHK Price : "+price);
    }
}
class TwoBHK extends OneBHK{
    int room2Area;
    TwoBHK(int roomArea,int hallArea,int price,int room2Area){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
        this.room2Area=room2Area;
    }
    void show(){
        System.out.println("TWO BHK ");
        System.out.println("Room Area : "+roomArea);
        System.out.println("Hall Area : "+hallArea);
        System.out.println("BHK Price : "+price);
        System.out.println("Room2Area : "+room2Area);
    }
}

public class BHKDriverClass {
    public static void main (String []args ){
        Scanner scanner=new Scanner(System.in);
        int oneBHK_Flat=0;
        int twoBHK_Flat=0;
        int toatlFlat=0;
        System.out.println("Enter the number of One BHK Flat : ");
        oneBHK_Flat=scanner.nextInt();
        for(int i=1;i<=oneBHK_Flat;i++){
            System.out.println("Enter the One BHK Room Area, Hall Area& Price");
            OneBHK oneBHK=new OneBHK(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
            oneBHK.show();
            System.out.println();
        }
        System.out.println("Enter the number of Two BHK Flat : ");
        twoBHK_Flat=scanner.nextInt();
        for(int i=1;i<=twoBHK_Flat;i++){
            System.out.println("Enter the Two BHK Room Area, Hall Area, Price& Room2Area");
            TwoBHK twoBHK=new TwoBHK(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
            twoBHK.show();
            System.out.println();
        }
        toatlFlat=oneBHK_Flat+twoBHK_Flat;
        System.out.println("Total Number Of Flat's : "+toatlFlat);

    }
}
