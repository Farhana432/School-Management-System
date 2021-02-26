
package schoolmanagementsystem;

public class Payment {
    int amount;
    int date;
    
    Payment(int a,int d){
        amount=a;
        date=d;
        
    }
    
    void The_due(){
        int due;
        due=2000-amount; 
        System.out.print("Your due:" +due);
    }
    
}
