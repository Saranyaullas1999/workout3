class Medicine{
    String companyName,companyAddress;
    Medicine(String companyName,String companyAddress)
    {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public void displayLabel()
    {
        System.out.println("Company Name :" +companyName);
        System.out.println("Company Address :" +companyAddress);
    }
}
class Tablet extends Medicine{
    String name;
    Tablet(String name,String companyName,String companyAddress)
    {
        super(companyName,companyAddress);
        this.name = name;
    }

    void getLabel(){
        super.displayLabel();
        System.out.println("Tablebt Name :" +name);
        System.out.println("Store in a cool dry place");
    }
}

class Syrup extends Medicine{
    String name;
    Syrup(String name,String companyName, String companyAddress)
    {
        super(companyName,companyAddress);
        this.name = name;
    }
    void getLabel()
    {
        super.displayLabel();
        System.out.println("Syrup Name :" +name);
        System.out.println("Store in a cool place");
    }
}
 class Ointment extends Medicine{
    String name;
    Ointment(String name,String companyName, String companyAddress)
    {
        super(companyName,companyAddress);
        this.name = name;
    }
    void getLabel(){
        super.displayLabel();
        System.out.println("Ointment Name :" +name);
        System.out.println("Store in a cool dry place");
        System.out.println("For external use only");
    }

        }
public class TestMedicine {
    public static void main(String[] args) {
        int random;
        for(int i=0;i<3;i++)
        {
            random = (int) ((Math.random()*(3-1+1))+1);
            System.out.println(random);

            switch (random){
                case  1 :
                    Tablet t1 = new Tablet("Dolo 650","Micro Labs Ltd","Bengaluru");
                    t1.getLabel();
                    continue;

                case  2 :
                    Syrup s1 = new Syrup("Benadryl DR Syrup","Johnson & Johnson Private Limited","Mumbai");
                    s1.getLabel();
                    continue;

                case 3 :
                    Ointment o1 = new Ointment("Aloe Vera Gel","Aloe Laboratories Inc.","United States");
                    o1.getLabel();
                    continue;

                default:
                    System.exit(0);
            }
        }
    }
}
