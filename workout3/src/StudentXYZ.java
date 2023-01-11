import java.util.Scanner;

class Student{
    int rollno;
    double percentage;


    Student() {

    }

    Student(int rollno, double percentage){
        this.rollno = rollno;
        this.percentage = percentage;
    }

    void show(){
        System.out.println("Rollno :" +rollno);
        System.out.println("Percentage :" +percentage);

    }

}

class CollegeStudent extends Student{

    int semester;

    CollegeStudent(){

    }

    CollegeStudent(int semester,int rollno,double percentage) {
        super(rollno, percentage);
        this.semester = semester;
    }
        void show(){
            super.show();
            System.out.println("Semster :" +semester);
            System.out.println("=================================================");
        }

}

class SchoolStudent extends Student{
    int classname;

    SchoolStudent(){

    }

    SchoolStudent(int classname,int rollno,double percentage){
        super(rollno,percentage);
        this.classname = classname;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Classname :" +classname);
        System.out.println("================================");
    }
}

public class StudentXYZ {
    public static void main(String[] args) {


        CollegeStudent cs1 = new CollegeStudent(1,55,87);
        CollegeStudent cs2 = new CollegeStudent(5,77,84);
        SchoolStudent ss1 = new SchoolStudent(10,5,88);
        SchoolStudent ss2 = new SchoolStudent(8,1,77);
        SchoolStudent ss3 = new SchoolStudent(8,8,88);
        Student[] s1 = {cs1,cs2,ss1,ss2,ss3};
       int counter = 0;
       for (int i =0;i<s1.length;i++)
       {
           s1[i].show();
           if(s1[i].percentage>75)
           {
               counter++;
           }
       }
        System.out.println("Students having A grade " +counter);
        Scanner sc = new Scanner(System.in);
        int rn = sc.nextInt();
       int flag =0;
       for(int i=0;i<s1.length;i++)
       {
           if(s1[i].rollno == rn)
           {
               flag = 1;
               if(s1[i] instanceof CollegeStudent){
                   System.out.println("\nRollno " +rn+ " belongs to College");
                   break;
               }
               else {
                   System.out.println("\nRollno " +rn+ " belongs to School");
                   break;
               }
           }
       }
       if(flag==0)
       {
           System.out.println("\nRollno not found");
       }
    }
}
