import java.util.Scanner;

class Book
{
    String name;
    String author;
    String price;
    String num_pages;
    public Book()
    {
        name="abc";
        author="xyz";
        price="100rs";
        num_pages="500";
    }
    void getData()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Book name:");
        name=s1.next();
        System.out.println("Enter Author name:");
        author=s1.next();
        System.out.println("Enter Book price:");
        price=s1.next();
        System.out.println("Enter number of pages:");
        num_pages=s1.next();
    } 
    public String toString(){
    return("Book: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nNumber of pages:"+num_pages);
    }

}
public class BookMain
{
    public static void main(String args[])
    {      
        int i,n;
        Book tempobj=new Book();
        System.out.println("Constructor values:");
        System.out.println(tempobj.toString());
        System.out.println("Enter number of books:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        Book [] ob=new Book[n];
        for(i=0;i<n;i++)
        {          
            ob[i]=new Book();
            ob[i].getData();
            System.out.println("----");
        }
        System.out.println("Details of all books:");
        for(i=0;i<n;i++)
        {
            System.out.println("Book : "+(i+1)); 
            System.out.println(ob[i].toString());
        }
    }
}