import java.util.*;

class ThreadM implements Runnable
{
String name;
int number;
Thread t;
ThreadM(String tn, int n)
{
name=tn;
number=n;
t=new Thread(this, name);
System.out.println("Thread :"+t);
t.start();
}

public void run()
{
try{
if(number==1)
{
for(int i=6; i>0; i--){
System.out.println(name+": "+i);
Thread.sleep(10000);
}
}
if(number==2)
{
for(int i=6; i>0; i--){
System.out.println(name+": "+i);
Thread.sleep(2000);
}}
}
catch(InterruptedException e)
{
System.out.println(name+" Interrupted");
}
System.out.println(name+" Exiting");
}}
class ThreadMain
{
public static void main(String[] args)
{
new ThreadM("B.M.S College of Engineering", 1);
new ThreadM("C.S.E", 2); 
}}
 