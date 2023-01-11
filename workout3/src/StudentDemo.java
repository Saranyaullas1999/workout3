
class InvalidFeeException extends Exception{
    InvalidFeeException(){
        super();
    }
}

interface StudentFee{
    void getFee() throws InvalidFeeException;
}

class Students implements StudentFee {
    String name;
    int fees;

    Students(String name,int fees)
    {
        this.name = name;
        this.fees = fees;

        try {
            if(fees<0)
                this.getFee();
                System.out.println("Success");
            }
            catch (InvalidFeeException e){
                System.out.println("Entered negative value");
            }
        }

        public void getFee() throws InvalidFeeException{
            if(fees<0)
                throw new InvalidFeeException();
    }

}



public class StudentDemo {
    public static void main(String[] args) {
        Students s1 = new Students("Anand",-8);
        System.out.println("Continuing");
    }
}

