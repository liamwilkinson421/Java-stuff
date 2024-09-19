class Student
{
    int rollno;
    String name;
    int marks;
}

public class EnhancedForLoop {  
    public static void main(String[] args){

        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 4;

            //for enumerator in array
        for(int n : nums){
            System.out.println(n);
        }
        
        Student s1 =  new Student();
        s1.rollno = 1;
        s1.name = "Liam";
        s1.marks = 88;

        Student s2 =  new Student();
        s2.rollno = 2;
        s2.name = "Barry";
        s2.marks = 60;

        Student s3 =  new Student();
        s3.rollno = 3;
        s3.name = "John";
        s3.marks = 75;

            
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
            //for objects in array
        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
    
}
