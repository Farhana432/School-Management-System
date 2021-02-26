
package schoolmanagementsystem;

public class Admin {
    int use_id;
    String pass;
    
    void Check_redmark(Teacher a){
        if(a.ATTEND <= 15){
            System.out.print("You have redwmark star.Be carefull.");
        }
        else{
            System.out.print("No Redmark star.");
        }
        
    }
    
}
