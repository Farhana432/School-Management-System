
package schoolmanagementsystem;

public class Student {
    int roll;
    String name;
    String address;
    int phn_num;
    String section;
    int cls;
    Student(int r,String n,String sec,int c){
        roll=r;
        name=n;
        section=sec;
        cls=c;
        
    }   
    void check_registration_status(Payment a){
        
        if(a.amount <500){
            System.out.println("Registration delay.");     
        }
        else{
            System.out.println("You are registerd now.");
        }  
    }  
    void Check_addmission_status(Addmission a){
        if(a.fee == 500){
            System.out.println("You are addmitted.");     
        }
        else{
            System.out.println("No addmitted.");
        }  
    }
}
