class Medicine {
    String Name="Biocon Medicine";
    String Address="No.6,Main townhall,Trichy";
    void displayLabel(){
        System.out.println(Name);
        System.out.println(Address);
    }
}
class Tablet extends Medicine{
    void displayLabel(){
        System.out.println("Tablet");
        System.out.println("store in a cool dry place");
    }
}
class Syrup extends Medicine{
    void displayLabel(){
        System.out.println("Syrup");
        System.out.println("close the cap tight");
    }
}
class Ointment extends Medicine{
    void displayLabel(){
        System.out.println("Ointment");
        System.out.println("for external use only");
    }
}

public class TestMedicine {
    public static void main(String []args){
        Medicine medicine[] = new Medicine[5];
                int randomNumber = (int) (Math.random()*4);
                System.out.println(randomNumber);
                switch(randomNumber)
                {
                    case 1:
                        medicine[0] = new Medicine();
                        medicine[1] = new Tablet();
                        medicine[0].displayLabel();
                        medicine[1].displayLabel();
                        break;
                    case 2:
                        medicine[2] = new Medicine();
                        medicine[3] = new Syrup();
                        medicine[2].displayLabel();
                        medicine[3].displayLabel();
                        break;
                    case 3:
                        medicine[4] = new Medicine();
                        medicine[5] = new Ointment();
                        medicine[4].displayLabel();
                        medicine[5].displayLabel();
                        break;
            default: System.out.println("Invalid Choice");
        }



    }
}
