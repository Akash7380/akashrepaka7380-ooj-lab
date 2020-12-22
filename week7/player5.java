/*5. [HIERARCHIAL+ABSTRACT] Write a Java program to create a class PLAYER with instance variables name, 
matches_played and average. This class has an abstract method cal_average(String,int,int). String:name, 
int:matches-played, int:average. Derive two classes BATSMAN and BOWLER from PLAYER. Class BATSMAN has an
 instance variable runs_scored. Class BOWLER has an instance variable runs_given. Create m BATSMAN objects 
 and n BOWLER objects. Calculate and display the average runs scored by each BATSMAN and average runs given
  by each BOWLER.*/


import java.util.*;
import java.lang.*;
abstract class player
{
    String name = "";
    int matches_played , average;

    abstract void calc_average(String name , int matches_played , int average);
    
}
class batsman extends player
{
    
    void calc_average(String name , int matches_played , int average)
    {
     int total_runs =0 , runs_scored=0;
        System.out.println("Enter the runs scored in matches");
        Scanner sc1 = new Scanner(System.in);
        for(int i = 0; i < matches_played ; i++)
        {
            runs_scored = sc1.nextInt();    
            total_runs = total_runs + runs_scored;
        }
        average = total_runs / matches_played ;
        System.out.println("The name of batsman is " +name+"\n"+"The average of the total runs played is "+average);
    }
}
class bowler extends player
{
    
    void calc_average(String name , int matches_played , int average)
    {
     int total_runs =0 , runs_given=0;
        System.out.println("Enter the runs given in matches");
        Scanner sc2 = new Scanner(System.in);
        for(int i = 0; i < matches_played ; i++)
        {
            runs_given = sc2.nextInt();    
            total_runs = total_runs + runs_given;
        }
        average = total_runs / matches_played ;
        System.out.println("The name of bowler is " +name+"\n"+"The average of the total runs given is "+average);
    }
}
class Main51
    {
        public static void main(String args[])
        {
            int m , n ;
            int mp =0, average = 0;
            String name;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of batsmen and number of bowlers");
            m = sc.nextInt();
            n = sc.nextInt();
            batsman b[] = new batsman[m];
            bowler b1[] = new bowler[n];
            int i , j;
            for(i = 0; i<m; i++)
            {
                b[i] = new batsman();
                System.out.println("Enter the details of batsman :");
                System.out.println("Enter name and matches played");
                name = sc.next();
                mp = sc.nextInt();
                b[i].calc_average(name , mp , average);
            }
             for(j = 0; j<n; j++)
            {
                b1[j] = new bowler();
                System.out.println("Enter the details of bowler:");
                System.out.println("Enter name and no. of matches played");
                name = sc.next();
                mp = sc.nextInt();
               
                b1[j].calc_average(name , mp , average);
            }
            
        }
    }