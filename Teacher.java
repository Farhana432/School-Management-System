
package schoolmanagementsystem;

public class Teacher {
  int ATTEND;
  int salary;
  int id;
  String name;
  Teacher(int att,int i,String na){
     ATTEND=att;
     id=i;
     name=na;
}
    void check_attendance(){
        int total;
        total=30-ATTEND;
        System.out.print("Total absent:"+total);
    }
}
