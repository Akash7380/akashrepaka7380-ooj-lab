import java.util.*;
class ThreeGen<T, V, S> 
{
 T ob1;
 V ob2;
 S ob3;

 ThreeGen(T o1, V o2, S o3)
 {
 ob1 = o1;
 ob2 = o2;
 ob3 = o3;
 }
 void showTypes() 
 {
 System.out.println("Type of T is " + ob1.getClass().getName());
 System.out.println("Type of V is " + ob2.getClass().getName());
 System.out.println("Type of S is " + ob3.getClass().getName());
 }
 T getob1()
 {
 return ob1;
 }
 V getob2()
 {
 return ob2;
 }
 S getob3()
 {
 return ob3;
 }
}

class Gen
 {
 public static void main(String args[]) 
  {
 ThreeGen<Integer, String, Double> tgObj = new ThreeGen<Integer, String, Double>(88, "Generics", 0.4);
 tgObj.showTypes();
 int v = tgObj.getob1();
 System.out.println("value: " + v);
 String str = tgObj.getob2();
 System.out.println("value: " + str);
 double s = tgObj.getob3();
 System.out.println("value: " + s); 
 }
}