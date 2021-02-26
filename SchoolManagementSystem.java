
package schoolmanagementsystem;

public class SchoolManagementSystem {

    public static void main(String[] args) {
        //int a,int d,int the_due
       Payment Sohana = new Payment(2000,25);
       Payment Abir = new Payment(100,4);
       Accountmanager MrX= new Accountmanager();
       Student student = new Student(2,"Rafiq","A",6);
       Teacher teacher = new Teacher(12,1234,"Mr.Karim");
       Admin MrY= new Admin();
       Addmission ForclassSix = new Addmission(30,500,"For addmission");
       
       //student
       System.out.println("Student info...");
       System.out.println("Name : "+student.name);
       System.out.println("Roll : "+student.roll);
       System.out.println("Section : "+student.section);
       System.out.println("Class : "+student.cls);
       
       //Account manager check student payment....
         System.out.print("The student payment statement : ");
         MrX.check_student_payment(Sohana);
         
         //Call due method
         System.out.println();
         Sohana.The_due();
         System.out.println();
         //Student check Registerd status by payment
         student.check_registration_status(Sohana);
         
         
         //Teacher......
         System.out.print("Teacher info: ");
         System.out.println();
         System.out.println("Name : "+teacher.name);
         System.out.println("ID : "+teacher.id);
         //Call check_attendance method
         teacher.check_attendance();
         System.out.println();
         //Admin check attendance status of teacher
         MrY.Check_redmark(teacher);
         System.out.println();
         //Addmission info...
         System.out.println("Addmission information");
         System.out.println("Addmission last date: "+ForclassSix.Addmissiondate);
         System.out.print("Addmission fee: "+ForclassSix.fee);
         System.out.println();
         //Student check Addmission status
         System.out.print("Addmission status For class Six : ");
         student.Check_addmission_status(ForclassSix);
}
}
