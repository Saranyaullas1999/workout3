import java.util.*;
class Faculty{
    int facultyid;
    double salary;
}
class FullTimeFaculty extends Faculty{
    double basic,allowance;

        FullTimeFaculty(){}
        int accept()
        {
            System.out.println("Enter faculty id:");
            Scanner sc = new Scanner(System.in);
            this.facultyid = sc.nextInt();
            return facultyid;
        }
        FullTimeFaculty(double basic,double allowance)
        {
            this.basic = basic;
            this.allowance = allowance;

        }
        double salary()
        {
         this.salary = basic+allowance;
         return salary;
        }
        public void display()
    {
System.out.println("Faculty ID :" +accept());
        System.out.println("Salary of " +salary());
    }
}

class PartTimeFaculty extends Faculty{
    double hour,rate;

    PartTimeFaculty(){}
    int accept()
    {
        System.out.println("Enter faculty id:");
        Scanner sc = new Scanner(System.in);
        this.facultyid = sc.nextInt();
        return facultyid;
    }
    PartTimeFaculty(double hour,double rate)
    {
        this.hour = hour;
        this.rate = rate;

    }
    double salary()
    {
        this.salary = hour*rate;
        return salary;
    }
    public void display()
    {
        System.out.println("Faculty ID :" +accept());
        System.out.println("Salary of " +salary());
    }

}

class XYZ
{
    public static void main(String args[]){
        FullTimeFaculty ft = new FullTimeFaculty(5000,405.1);
        ft.display();
        FullTimeFaculty ft2 = new FullTimeFaculty(4000,710.56);
        ft2.display();
        PartTimeFaculty pt = new PartTimeFaculty(67.5,100);
        pt.display();
        PartTimeFaculty pt1 = new PartTimeFaculty(89.1,100);
        pt1.display();
    }
}