#include <stdio.h>


int main()

{
    
int t,x=0,n,i;
    
scanf("%d",&t);

    //printf("no of test cases are:%d",t);
    
printf("\n");
 
while(x<t)

{
        
scanf("%d",&n);

       // printf("the number is:%d",n);
printf("\n");
        
for(i=1;i<=n;i++)
 {
           
 if((i%3==0)&&(i%5==0))
 {
                
printf("fizzbuzz");
               
 printf("\n");
      
      }

  else if(i%3==0)
            
{

printf("fizz");
 printf("\n");
  }
         
 else if(i%5==0)
 
 {
             
 printf("buzz");

 printf("\n");
         
 }
          
else
          
{
          
printf("%d",i);
          
printf("\n");
          
}
     
      
}
      
x++;

}
 
return 0;

}
