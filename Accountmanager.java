
package schoolmanagementsystem;

public class Accountmanager {
    int user_id;
    String Password;
    
    void check_student_payment(Payment p){
        if(p.amount==2000){
            System.out.print("you have clearence.");
        }
        else{
            System.out.print("you have due.");
        }
    }
}

    