#include<stdio.h>
#include<conio.h>
int main()
{
 int s1,s2,s3,s4,s5,t,p;
 

 printf("\n Enter marks of 5 subjects each out of 100 ");
 printf("\n\n ********************************************");

 printf("\n\n coa = ");
 scanf("%d",&s1);

 printf("\n logic design = ");
 scanf("%d",&s2);

 printf("\n statistics = ");
 scanf("%d",&s3);

 printf("\n data structures = ");
 scanf("%d",&s4);

 printf("\n java = ");
 scanf("%d",&s5);
 printf("\n ********************************************");

 t=s1+s2+s3+s4+s5;  
 printf("\n Total marks = %d/500",t);

 p=t/5;  
 printf("\n\n Percentage = %d%",p);
 printf("\n ********************************************");
 if(p>=80)
    printf("\n\n Your Grade : A+");

   else if(p>=75)
     printf("\n\n Your Grade : A");

     else if(p>=60)
       printf("\n\n Your Grade : B");

        else if(p>=45)
          printf("\n\n Your Grade : C");

            else if(p>=35)
              printf("\n\n Your grade : D");

   else
     printf("\n\n You Are Fail");
 getch();
}
