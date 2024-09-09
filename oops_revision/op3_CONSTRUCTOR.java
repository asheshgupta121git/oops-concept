package oops_revision;

public class op3_CONSTRUCTOR {
    public static void main(String[] args) {
        student s1 = new student("aman");
        System.out.println(s1.name);
        s1.roll=123;
        s1.password="asdf";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        student s2 = new student();
        student s3 = new student(s1);
        s1.marks[1]=100;
        s3.password ="ashg";
        for (int i = 0; i < 3; i++) {
            System.out.println(s3.marks[i]);
        }
        
    


    }
}

class student{
    String name;
    int roll;
    String password;
    int marks[];
    //this is shallow copy constructor.
    // student(student s1){
    //     marks = new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks = s1.marks;
    // }

    //this is deep copy constructor
    student(student s1){
        marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=s1.marks[i];
        }
    }


    // this is parametrized cosrtuctor
   student(String name){
    marks = new int[3];
    this.name = name;
   }
   //this is non-parametrized constuctor.
   student(){
    marks = new int[5];
    System.out.println("this is constructor.....");
   }
   student(int roll){
    marks = new int[3];
    this.roll=roll;
   }
}