import java.util.*;
class student{
    String name,usn;
    double credits [] = new double[5];
    double marks [] = new double[5];
    double a[] =  new double[5];
    double total=0,tc=0,sgpa=0,tmc=0;
    void getDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name and usn");
        name=in.nextLine();
        usn=in.nextLine();
        for(int i=0;i<5;i++){
            System.out.println("Enter marks and credits of subject "+(i+1));
            marks[i]=in.nextDouble();
            credits[i]=in.nextDouble();
        }
    }
    void displayDetails(){
        System.out.println("Name        : "+name);
        System.out.println("USN         : "+usn);
        for(int j=0;j<5;j++){
            total+=marks[j];
        }
        System.out.println("Total marks : "+total);
    }
    void SGPA(){
        for(int j=0;j<5;j++){
            if(marks[j]>=90)
                a[j]=10.0;
            else if(marks[j]>=80 && (marks[j]<90))
                a[j]=9.0;
            else if(marks[j]>=70 && (marks[j]<80))
                a[j]=8.0;
            else if(marks[j]>=60 && (marks[j]<70))
                a[j]=7.0;
            else if(marks[j]>=50 && (marks[j]<60))
                a[j]=6.0;
            else
                a[j]=0.0;
        }
        for(int n=0;n<5;n++){
            tc+=credits[n];
            tmc+=(credits[n]*a[n]);
        }
        sgpa=(tmc/tc);
        System.out.println("SGPA        : "+sgpa);
    }
}
public class studentSgpa{
     public static void main (String[] args) {
     student s1=new student();
     s1.getDetails();
     s1.displayDetails();
     s1.SGPA();
    }
}