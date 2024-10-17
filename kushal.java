// import java.util.*;
// public class kushal{
//     public static void main(String[] args){
//         int a;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter first number:");
//         a = sc.nextInt();
//         System.out.print("enter second number:");
//         int b = sc.nextInt();
//         System.out.print("your answer is:" + (a+b));
//         sc.close();
//     }
// }

// import java.util.*;
// public class kushal{
//     public static void main(String[] args){
//         Scanner sc= new  Scanner(System.in);
//         System.out.print("enter the no. of elements in series :");
//         int n= sc.nextInt();
//         int a=0;
//         int b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int temp;
//         for(int i=0;i<=(n-3);i++)
//         {
//             temp=a+b;
//             a=b;
//             b=temp;
//             System.out.println(temp);
//         }
//         sc.close();
//     }
// }


//  import java.util.*;
//  public class kushal{
//      public static void main(String[] args){
//      char a='A';
//      if(a>=65 && a<91 || a>=97 && a<123){
//          System.out.print("alphabet");
//      }
//      else{
//          System.out.print("not alphabet");
//      }
//  }
//  }

// public class kushal{
//     public static void main(String[] args){
//         char alpha;
//         for(alpha='a';alpha<='z';alpha++)
//         {
//             System.out.print( alpha +" " );
//         }
//     }
// }

// public class kushal{
//     public static void main(String[] args){
//         int num=123457886;
//         int a=num%10;
//         System.out.println(a);
//         while(num>=10)
//         {
//             num=num/10;
//         }
//         System.out.println(num);
//     }
// }


// public class kushal {
//     public static void main(String[] args){
//         int a=10,b=12,c=0;
//         for(int i=1;i<=4;i++)
//         {
//             if(a%i==0 && b%i==0)
//             {
//                  c=i;
//             }
//         }
//         System.out.print(c);
//     }
// }



// public class kushal{
//     public static void main(String[] args){
//         int num=1234;
//         int c=num;
//         int temp=0;
//         int x=0;
//         while(num!=0)
//         {
//             temp=num%10;
//             x=x*10+temp;
//             num=num/10;
//         }
//         if(x==c)
//         {
//             System.out.print("pallindrome");
//         }
//         else{
//             System.out.print("not in pallindrome");
//         }
//     }
// }

// public class kushal{
//     public static void main(String[] args){
//         int n=1000;
//         for(int i=2;i<=n;i++){
//             int temp=0;
//             for(int j=1;j<=i;j++){
//                 if(i%j==0){
//                     temp++;
//                 }
//             }
//             if(temp==2){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// public class kushal {
//     public static void main(String[] args){
//         int num=1;
//         int c=num;
//         int a=1;
//         int mul=1;
//         int sum=0;
//         while(num!=0){
//             mul=1;
//             a=num%10;
//             for(int j=1;j<=a;j++)
//             {
//                 mul=mul*j;
//             }
//             sum=sum+mul;
//             num=num/10;
//         }
//          if(sum==c)
//             {
//                 System.out.print("strong");
//             }
//             else{
//                 System.out.print("not strong");
//             }
//     }
// }



// import java.util.*;
// public class kushal{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the  required lines of triangle pattern:");
//         int num=sc.nextInt();
//         for(int i=0;i<=num;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }



// import java.util.*;
// public class kushal{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the  required lines of triangle pattern:");
//         int num=sc.nextInt();
//         for(int i=num;i>0;i--)
//         {
//             for(int j=i;j>0;j--)
//             {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }



// import java.util.*;
// public class kushal{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the  required lines of triangle pattern:");
//         int num=sc.nextInt();
//         for(int i=0;i<num;i++)
//         {
//             for(int j=0;j<i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         for(int i=num;i>0;i--)
//         {
//             for(int j=i;j>0;j--)
//             {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }



// import java.util.*;
// public class kushal{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the number of line required:");
//         int num =sc.nextInt();
//         for(int i=num;i>0;i--)
//         {
//             for(int j=i;j>0;j--)
//             {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//          for(int i=0;i<=num;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//         }
// }

// public class kushal{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         }
//     }

// import java.util.*;
// public class kushal {
//     public static void print_name(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//          System.out.print("enter any name:");
//          String name=sc.next();
//          print_name(name);
//          sc.close();
//     }
// }

// import java.util.*;
// public class kushal {
//     public static void evenorodd(int n){
//         if(n%2==0){
//             System.out.println("even");
//         }
//         else {
//             System.out.println("odd");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter any number:");
//         int n=sc.nextInt();
//         evenorodd(n);
//         sc.close();
//     }

    
// }

// import java.util.Scanner;

// public class kushal {
//     public static void sum(float a,float b){
//         System.out.println(a+b);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter first no:");
//         float a=sc.nextFloat();
//         System.out.print("Enter second no:");
//         float b=sc.nextFloat();
//         sum(a,b);
//         sc.close();
//     }

    
// }

// import java.util.*;
// public class kushal {
//     public static void multiply(float a,float b){
//         System.out.println(a*b);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter first no:");
//         float a=sc.nextFloat();
//         System.out.print("Enter second no:");
//         float b=sc.nextFloat();
//         multiply(a,b);
//         sc.close();
//     }
// }

// import java.util.*;
// public class kushal{
//     public static void factorial(int n){
//         int mul=1;
//         for(int i=1;i<(n+1);i++){
//             mul=mul*i;
//         }
//         System.out.println(mul);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n=sc.nextInt();
//         factorial(n);
//         sc.close();
//     }
// }

// import java.util.*;
// public class kushal{
//     public static void avg(int a,int b,int c){
//         int x=(a+b+c)/3;
//         System.out.println(x);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter first number:");
//         int a=sc.nextInt();
//         System.out.println("Enter second number");
//         int b=sc.nextInt();
//         System.out.println("Enter third number:");
//         int c=sc.nextInt();
//         avg(a,b,c);
//         sc.close();
//     }
// }




// import java.util.*;
// public class kushal{
//     public static void odd_sum(int n){
//         int sum=0;
//         for(int i=0;i<=n;i++){
//             if(i%2!=0){
//                 sum=sum+i;
//             }
//         }
//         System.out.println(sum);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter number upto:");
//         int n=sc.nextInt();
//         odd_sum(n);
//         sc.close();
//     }
// }

// import java.util.*;
// public class kushal{
//     public static void greater(int a,int b){
//         if(a>b){
//             System.out.println("a is greater");
//         }
//         else if(b>a){
//             System.out.println("b is greater");
//         }
//         else{
//             System.out.println("both are equal");
//         }
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter first number:");
//         int a=sc.nextInt();
//         System.out.println("Enter second number:");
//         int b=sc.nextInt();
//         greater(a,b);
//         sc.close();
//     }
// }

// import java.util.*;
// public class kushal{
//     public static void input(int n){
//         for(int i=1;i<=n;i++){
//             Scanner sc=new Scanner(System.in);
//             System.out.println("enter a number:");
//             int a=sc.nextInt();
//         }
//         System.out.println("Thank you!");
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the range:");
//         int n=sc.nextInt();
//         input(n);
//         sc.close();
//     }
// }


// import java.util.*;
// public class kushal{
//     public static void fabonacci(int n){
//         int a=0,b=1,c=0;
//         System.out.println(a);
//         System.out.println(b);
//         for(int i=0;i<(n-2);i++){
//             c=a+b;
//             a=b;
//             b=c;
//             System.out.println(c);
//         }
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the range:");
//         int n=sc.nextInt();
//         fabonacci(n);
//         sc.close();
//     }
// }


//  import java.util.*;
//  public class kushal{
//     public static void hcf(int a,int b){
//         int c=0,x=0;
//         if(a>b){
//             c=a;
//         }
//         else
//         {
//             c=b;
//         }
//         for(int i=1;i<=c;i++){
//             if(a%i==0 && b%i==0){
//                 x=i;
//             }
//         }
//         System.out.println(x);
//         return;

//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter first number:");
//         int a=sc.nextInt();
//         System.out.println("enter second number:");
//         int b=sc.nextInt();
//         hcf(a,b);
//         sc.close();
//     }
//  }

// import java.util.*;
// public class kushal{
//     public static void power(int x,int n){
//         int a=(int)Math.pow(x,n);
//         System.out.println(a);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter base number:");
//         int x=sc.nextInt();
//         System.out.println("enter power number:");
//         int n=sc.nextInt();
//         power(x,n);
//         sc.close();
//         }
// }


// Pattern
// public class kushal{
//     public static void  main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class kushal{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class kushal{
//     public static void main(String[] args){
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class kushal{
//     public static  void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=5;k>=i;k--){
//                 System.out.print("*");
//             }
//             System.out.println(); 
//         }
//     }
// }


// public class kushal{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1 || j==1 || i==n || j== n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             } System.out.println();
//         }
//     }
// }

// public class kushal{
//     public static  void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public  class kushal{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class kushal{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class kushal {

//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int marks[]=new int[n];
//         for(int i=1;i<n;i++){
//         System.out.print(marks[i]+" ");
//         }
//     }
// }

// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                if(i==1 || j==1 || i==n || j==n || i==j || i+j==n+1){
//                 System.out.print("* ");
//                 if(i==j &&  i+j==n+1){
//                     j++;
//                 }
//                }
//                else{
//                 System.out.print("  ");
//                }
//             }
//             System.out.println();
//         }
//     }
    
// }

// import java.util.*;
// public class kushal {
//     int n=5;
//     public static void main(String[] args) {
//         for(int i=1;i<=n;i++){
//             System.out.println(i);
//         }
//     }
    
// }

/**
 * kushal
 */
// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int c=0;
//         for(int i=1;i<=n;i++){
//          if(n%i==0){
//             c++;
//          }   
//         }
//         if(c==2){
//             System.out.println("prime");
//         }
//         else{
//             System.out.print("not prime");
//         }
//     }
    
// }

// import java.util.*;
// /**
//  * kushal
//  */
// public class kushal {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a=0,b=1,c=0;
//         System.out.println(a);
//         System.out.println(b);
//         for(int i=1;i<=(n-2);i++){
//             c=a+b;
//             a=b;
//             b=c;
//             System.out.println(b);
//         }
//     }
// }

// import java.util.*;
// /**
//  * kushal
//  */
// public class kushal {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=0,d=0;
//         if(a<b){
//             c=a;
//         }
//         else{
//             c=b;
//         }
//         for(int i=1;i<=c;i++){
//             if(a%i==0 && b%i==0){
//                 d=i;
//             }
//         }
//         System.out.println(d);
//     }
// }

// import java.util.*;
// public class kushal{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int array[]= new int[n];
//         for(int i=0;i<n;i++){
//             int a=sc.nextInt();
//             array[i]=a;
//         }
//         int x=sc.nextInt();
//         for(int i=0;i<n;i++){
//             if(array[i]+array[i+1]==x){
//                 System.out.print(i);
//                 System.out.print(i+1);
//             }
//         }
//     }
// }


// import java.util.*;
// public class kushal{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int count=0;
//         while(a>0){
//             int rem=0;
//             rem=a%10;
//             if(rem==b){
//                 count=count+1;
//             }
//             a=a/10;
//         }
//         sc.close();
//         System.out.println(count);
//     }
// }

// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int rem=0,rev=0;
//         while(n>0){
//             rem=n%10;
//             rev=rev*10+rem;
//             n=n/10;
//         }
//         System.out.println(rev);
//         sc.close();
//     }
    
// }

// convert binary to decimal.
// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int rem,sum=0,x=0,y;
//         while(n>0){
//             rem=n%10;
//             y=(int)Math.pow(2,x);
//             sum=sum+rem*y;
//             x++;
//             n=n/10;
//         }
//         System.out.println(sum);
//     }
    
// }

//LCM
// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2=sc.nextInt();
//         int c=0,d=0;
//         if(n1>n2){
//             c=n2;
//         }
//         else{
//             c=n1;
//         }
//         for(int i=c;i<=(n1*n2);i++){
//             if(i%n1==0 && i%n2==0){
//                 d=i;
//                 break;
//             }
//         }
//         System.out.println(d);
//         sc.close();
//     }
    
// }


// print nth fabonacci element.

// import  java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a=0,b=1,c;
//         for(int i=0;i<=(n-2);i++){
//             c=a+b;
//             a=b;
//             b=c;
//         }
//         System.out.println(b);
//     }
    
// }


// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         float x;
//         double y=0.556;
//         int z;
//         for(int i=a;i<=b;i=i+c){
//             z=i-32;
//             x=(int)(y*z);
//             System.out.print(i+" ");
//             System.out.println((int)x);
//         }
//     }
// }

// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a=0,rem=0,sum=0;
//         int k=n;
//         while(n>0){
//             rem=n%10;
//             if(rem==0){
//                 rem=5;
//             }
//             n=n/10;
//         }
//         System.out.println(k);
//     }
    
// }

// import  java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int count=0,sum=0,rem;
//         int k=n;
//         int l=n;
//         while(n>0){
//             count=count+1;
//             n=n/10;
//         }
//         while(k>0){
//             rem=k%10;
//             sum=sum+(int)Math.pow(rem,count);
//             k=k/10;
//         }
//         if(sum==l){
//             System.out.println("true");
//         }
//         else{
//             System.out.println("false");
//         }
//     }   
// }


// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2=sc.nextInt();
//         int n;
//         for(int i=1;i<=n1;i++){
//             if((3*i+2)%n2!=0){
//                 System.out.println(3*i+2);
//             }
//             else{
//                 n1++;
//             }
//         }
//         sc.close();
//     }
    
// }

// import java.util.*;
// public class kushal {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int sum=0;
//     while(true){
//         int n=sc.nextInt();
//         sum=sum+n;
//         if(sum<0){
//             break;
//         }
//         System.out.println(n);
//     }
// }
    
// }

// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2=sc.nextInt();
//         int count=0,rem1,rem2,sum=0;
//         for(int i=n1;i<=n2;i++){
//             int k=i;
//             while(i>0){
//                 rem1=i%10;
//                 count++;
//                 i=i/10;
//             }
//             while(i>0){
//                 rem2=i%10;
//                 sum=sum+(int)Math.pow(rem2,count);
//                 i=i/10;
//                 if(sum==k){
//                     System.out.println(k);
//                 }
//             }

//         }
//     }
    
// }


// import java.util.*;
// public class kushal{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=1,sum=0,i=2;
//         int k=n;
//         while(n>m){
//             if(n%i==0){
//                 sum=sum+i;
//                 n=n/i;
//                 m=m*i;
//             }
//             else{
//                 i++;
//             }
//         }
//         if(k==sum){
//             System.out.println("true");
//         }
//         else{
//             System.out.println("false");
//         }
//     }
// }

// import java.util.*;
// public class kushal {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int pos,rem=0,sum=0,i=1;
//     while(n>0){
//         rem=n%10;
//         sum=sum+(int)(i*Math.pow(10,rem-1));
//         i++;
//         n=n/10;
//     }
//     System.out.println(sum);
// }
    
// }

// import java.util.*;
// public class kushal {
//     public static void add(int a,int b){
//         int c=a+b;
//         System.out.println(c);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         add(a,b);
//         sc.close();

//     }
// }    

// Array
// array is non-premitive data.
// import java.sql.Array;
// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int sum=0;
//         int n=sc.nextInt();
//         int arr[]=new int[5];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             sum=sum+arr[i];
//         }
//         System.out.println(sum);
//     }
    
// }



/**
 * kushal
 */
// public class kushal {

//     public static void main(String[] args) {
//         int[] arr=new int[5];
//         System.out.println(arr);
//         arr[1]=7;
//         System.out.println(arr.length);
//         int[] other= arr;  // other is reference variable.
//         System.out.println(other);
//         System.out.println(other[1]);
//     }
// }

// import java.util.*;
// /**
//  * kushal
//  */
// public class kushal {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int  b=9;
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             arr[i]=b;
//             b--;
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[j]+" ");
//             }
//         }
//     }
// }


// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         a=a^b;
//         b=a^b;
//         a=a^b;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int arr1[]={6,7,8,9,1};
//         int arr2[]={1,2,3,4,5};
//         for(int i=0;i<arr1.length;i++){
//             int arr3[i]=arr1[i]+arr2[i];
//         }
//         System.out.println();
//     }
// }

// java is call by value...............




// import java.util.Scanner;
// public class kushal {
// 	public static int primeFactors(int n) 
//     {   int sum= 0 ;
//         while (n%2==0) 
//         { 
//             sum+=2; 
//             n /= 2; 
//         } 
//         for (int i = 3; i <= Math.sqrt(n); i+= 2) 
//         { 
//             while (n%i == 0) 
//             { 
//             	sum+=i;
//             	n /= i; 
//             } 
//         } 
   
//         if (n > 2) 
//             sum+=n ;  
        
//         return sum ;
//     } 
// 	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in) ; 
//        long N= sc.nextLong();
//        int x=0;
//        long temp=N ;
//        while(temp!=0)
//        {
//            x+=temp%10;
//            temp/=10;
//        }
//        for(int i=2;i*i<=N;i++)
//            if(N%i==0)
//            {
//                int count=0;
//                while(N%i==0)
//                {
//                    N/=i;
//                    count++;
//                }
//                int sum=0;
//                 temp=i;
//                while(temp!=0)
//                {
//                    sum+=temp%10;
//                    temp/=10;
//                }
//                x-=sum*count;
//            }
//        if(N!=1)
//        {
//            int sum=0;
//                temp=N;
//                while(temp!=0)
//                {
//                    sum+=temp%10;
//                    temp/=10;
//                }
//            x=x-sum;
//        }
//        if(x==0)
//        System.out.println("1");
//        else 
//     	   System.out.println("0");
//        }
// 	}

// import java.util.*;
// public class kushal{
//     public static void main(String args[]) {
// Scanner sc= new Scanner(System.in);
// int t=sc.nextInt();
// while(t!=0)
// {
//     int a,b;
//      a=sc.nextInt();
//      b=sc.nextInt();
//     int x=0;
//     int y=0;
//     for(int i=1;;i++)
//     {
//         if(i%2==0)
//         {
//             if(y+i<=b)
//             {
//                 y=y+i;
//             }
//             else{
//                 System.out.println("Aayush");
//                 break;
//             }

//         }else{
//             if(x+i<=a)
//             {
//                 x=x+i;
//             }
//             else{
//                 System.out.println("Harshit");
//                 break;
//             }
//             }
// }
// t--;}}}


// import java.util.*;
// public class kushal{
//     public static void main(String args[]) {
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();


// while(a!=0)
// {int b=0;
//     int c=0;
// int n=sc.nextInt();
// while(n!=0)
// {
//     if((n%10)%2==0)
//     {
//         b=b+n%10;
//     }
//     else{
//         c=c+n%10;
//     }
//     n=n/10;
// }
//    if(c%3==0 || b%4==0)
//     {
//         System.out.println("Yes");
//     }
//     else{
//         System.out.println("No");
//     }
//     a--;
// }
//     }
// }

// import java.util.*;
// public class kushal{
//     public static void main(String args[]) {
//         // Your Code Here
//         Scanner sc=new Scanner(System.in);
//         int  n=sc.nextInt();
//         long a=0;
//         int mul=1;
//         while(n!=0)
//         {
//             long rem=n%10;
//             if(rem>=5){
//                 if(rem==9 && (n/10)==0)
//                 {

//                 }
//                 else{
//                     rem=9-rem;
//                 }
//             }

//             a=a+rem*mul;
//             mul=mul*10;
//             n=n/10;
//         }
//         System.out.print(a);

//         sc.close();


//     }
// }

// import java.util.*;
// public class kushal {
//     public static void main(String args[]) {
// Scanner sc=new Scanner(System.in);
// String s=sc.nextLine();


// StringBuilder arr=new StringBuilder();

// for(int i=0;i<s.length();i++)
// {
//     if(s.charAt(i)!='0')
//     {
//         arr.append(s.charAt(i));
//     }
//     else{
//         arr.append('5');
//     }
// }
// System.out.print(arr.toString());


//     }
// }



// import java.util.*;
// public class kushal {
//    public static int array(int arr[],int n){
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]==n){
//             return i;
//         }
//     }
//     return -1;
//    }
//    public static void main(String[] args) {
//     int arr[]={1,2,3,4,5,6,7};
//    int n=7;
//    int x= array(arr,n);
//    System.out.println(x);
//    }
// }

// max value in any array.

/**
 * kushal
 */
// public class kushal {

//     public static int max(int arr[]){
//         int a=arr[0];
//         for(int i=1;i<arr.length;i++){
            // if(a<arr[i]){
            //     a=arr[i];
            // }

            //or

//             a=Math.max(arr[i],a);
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,10};
//         int x=max(arr);
//         System.out.println(x);
//     }
// }


// reverse ann array


// public class kushal {

//     public static int reverse(int arr[]){
//         for(int i=0;i<arr.length/2;i++){
//             arr[i]=arr[i]+arr[arr.length-i-1];
//             arr[arr.length-i-1]=arr[i]-arr[arr.length-i-1];
//             arr[i]=arr[i]-arr[arr.length-i-1];
//         }
//         for(int j=0;j<arr.length;j++){
//             System.out.print(arr[j]+" ");
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6};
//         reverse(arr);
//     }
// }



// public class kushal {

//     public static int reverse(int arr[]){
//          int a=2,b=6;
//         for(int i=a;i<b/2;i++){
//             arr[i]=arr[i]+arr[b-i-1];
//             arr[b-i-1]=arr[i]-arr[b-i-1];
//             arr[i]=arr[i]-arr[b-i-1];
//         }
//         for(int j=0;j<arr.length;j++){
//             System.out.print(arr[j]+" ");
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8,9,10};
//         reverse(arr);
//     }
// }


// Bubble Sort
/**
 * kushal
 */
// public class kushal {
// public static void sort(int []arr){
//    for(int i=1;i<arr.length;i++){
//     for(int j=0;j<arr.length-i;j++){
//         if(arr[j]>arr[j+1]){
//         int temp=arr[j];
//         arr[j]=arr[j+1];
//         arr[j+1]=temp;
//         }
//     }
    
//    }
    
// }
// public static void printer(int arr[]){
//     for(int i=0 ; i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
// }
// // public static void main(String[] args) {
//     int []arr={3,2,5,1,4};
//     sort(arr);
//     printer(arr);
// }
    
// }

/**
 * kushal
 */
// public class kushal {
//     public static void main(String[] args){
//         int[] arr={2,1,3,4,5};
//         int a=2;
//         int x=min_value(arr,a);
//         System.out.println(x);
//     }
//     public static int min_value(int[]arr,int a){
//         int b=a;
//         for(int i=a+1;i<arr.length;i++){
//             if(arr[i]<arr[a]){
//               b=i;
//             }
//         }
//         return b;
//     }

// }

/**
 * kushal
 */
// public class kushal {

//     public static void main(String[] args) {
//         int[] arr={2,4,5,7,3};
//         right(arr);
//     }
//     public static void right(int[] arr){
//         for(int i=arr.length-1;i>=0;i--){
//             if(arr[i]<arr[i-1]){
//                 arr[i]=arr[i]^arr[i-1];
//                 arr[i-1]=arr[i]^arr[i-1];
//                 arr[i]=arr[i]^arr[i-1];
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

/**
 * kushal
 */
// public class kushal {

//     public static void main(String[] args) {
//         int n=146,k=3;
//         int x=kthroot(n, k);
//         System.out.print(x);

//     }
//     public static int kthroot(int n,int k){
//         int lo=0;
//         int hi=n;
//         int ans=0;
//         while(lo<=hi){
//             int mid=(lo+hi)/2;
//             if(Math.pow(mid,k)<=n){
//                 ans=mid;
//                 lo=mid+1;
//             }
//             else{
//                 hi=mid-1;
//             }
//         }
//         return ans;
//     }
// }

// import java.util.*;
// public class kushal{
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int  i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int target=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 for(int k=0;k<n;k++){
//                     if(arr[i]+arr[j]+arr[k]==target){
//                         System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
//                     }
//                 }
//             }
//         }
//     }
// }

// import java.util.*;
// public class kushal{
//     public static  int search(int[] arr,int x){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==x){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int x=sc.nextInt();
//         search(arr,x);
//     }
// }


// import java.util.*;
// public class kushal {
//     public static void  rose(int[] arr,int x){
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 if(arr[i]+arr[j]==x){
//                     if(arr[i]<arr[j]){
//                         System.out.println("Deepak should buy roses whose prices are "+arr[i]+" and "+arr[j]+".");  
//                         return;
//                     }
//                     else if(arr[i]>=arr[j]){
//                         System.out.println("Deepak should buy roses whose prices are "+arr[j]+" and "+arr[i]+".");
//                         return;
//                     }
//                 }
//             }
//         }
// //     }
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t>0){
//             int n=sc.nextInt();
//             int[] arr=new int[n];
//             for(int i=0;i<n;i++){
//                 arr[i]=sc.nextInt();
//             }
//             int x=sc.nextInt();
//             rose(arr,x);
//             System.out.println();
//             t--;
//         }

//     }
// }

// import java.util.*;
// public class Main {
//     public static void main(String args[]) {

// Scanner in=new Scanner(System.in);
// int t=in.nextInt();
// while(t>0){
//     int min=Integer.MAX_VALUE;
//     int a=0;
//     int b=0;
// int n=in.nextInt();
// int arr[]=new int[n];
// for(int i=0;i<n;i++){
//     arr[i]=in.nextInt();
// }
// int m=in.nextInt();
// Arrays.sort(arr);
// for(int i=0;i<n;i++){
//     for(int j=i+1;j<n;j++){
//         if(arr[i]+arr[j]==m){
//             if(Math.abs(arr[i]-arr[j])<min)
//             {min=Math.abs(arr[i]-arr[j]);
//                  a=arr[i];
//                  b=arr[j];
//             }
           
            
//         }
//     }
// }
//  System.out.print("Deepak should buy roses whose prices are "+a+" and "+b+".");
//  System.out.println();
// t--;
//     }
// }
// }


// import java.util.*;
// public class Main {
//     public static void square(int[] arr){
//         int[] temp=new int[arr.length];
//         int x=arr.length;
//         for(int i=0;i<x;i++){
//             temp[i]=arr[i]*arr[i];
//         }
//         sort(temp);
//     }
//     public static void sort(int[] temp){
//         int y = temp.length;
//         for(int i=0;i<temp.length-1;i++){
//             if(temp[i]<temp[i+1]){
//                 continue;
//             }
//             else{
//                 temp[i]=temp[i]^temp[i+1];  
//                 temp[i+1]=temp[i]^temp[i+1];
//                 temp[i]=temp[i]^temp[i+1];     
//                 }
//         }
//         for(int i=0;i<y;i++){
//             System.out.print(temp[i]);
//         }
//     }
//     public static void main (String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] =new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//     }
// }


// import java.util.*;
// public class kushal{
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int[] left=new int[n];
//         left[0]=1;
//         for(int i=1;i<n;i++){
//             left[i]=left[i-1]*arr[i-1];
//         }
//         int[] right=new int[n];
//         right[n-1]=1;
//         for(int i=n-2;i>=0;i--){
//             right[i]=right[i+1]*arr[i+1];
//         }
//         for(int i=0;i<n;i++){
//             arr[i]=left[i]*right[i];
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
        
//     }
// }


// *******************************************************************************************************************************************************************************************************************************
/**
 * kushal
 */
// public class kushal {
//     public static void main(String[] args) {
//         String str1="Hello";  // string declaration without new keyword in built in heap memory and in string or intern pool.
//         String str2="Hello"; // duplication is not applied in string pool so both duplicate string assign same address.
//         String str3=new String("Hello"); // string  declaration with new keyword will built outside the pool and duplication is allowed outside the pool.
//         String str4=new String("Hello"); // it has defferent adderess with str3 because it is assigned outside the pool and duplication is allowed outside the pool..
//         System.out.println(str1);
//         System.out.println(str2);
//         System.out.println(str3);
//         System.out.println(str4);
//         System.out.println(str1==str3);
//         System.out.println(str1==str2);
//         System.out.println(str1==str3);
//         str1 = str1 + " bye";
//         System.out.println(str1);
//         str1 = str3 + " bye";
//         System.out.println(str1);
//         str4=str1 + " bye";
//         System.out.println(str4);

//     }
    
// }

/**
 * kushal
 */
// public class kushal {
//     public static void main(String[] args) {
//         String s="Hello bye ok";
//         System.out.println(s.length());
//         System.out.println(s.charAt(5));
//         String s1="hello";
//         String s2=new String("hello");
//        // System.out.println(s1.equals(s2));
//        equals(s1,s2);

//     }
//     public static boolean equals(String s1,String s2){
//         if(s1==s2){
//             return  true;
//         }
//         if(s1.length()!=s2.length()){
//             return false;
//         }
//         for(int i=0;i<=s1.length();i++){
//             if(s1.charAt(i)!=s2.charAt(i)){
//                 return false;
//             }
//             else{
//                 return true;
//             }
//         }
//         return true;
//     }
// }


// compare two string.
/**
 * kushal
 */
// public class kushal {

//     public static void main(String[] args) {
//         String s1="rajesh";
//         String s2="raj";
//         //System.out.println(s1.compareTo(s2));
//         int a=compare(s1,s2);
//         System.out.println(a);
//     }
//     public static int compare(String s1,String s2){
//         int n=Math.min(s1.length(),s2.length());
//         if(s1.length()<s2.length()){
//             return s1.length()-s2.length();
//         }
//         for(int i=0;i<n;i++){
//             if(s1.charAt(i)!=s2.charAt(i)){
//                 return s1.charAt(i)-s2.charAt(i);
//             }
//         }
//         return s2.length()-s1.length();
//     }
// }


// subsstring 
/**
 * kushal
//  */
// public class kushal {

//     public static void main(String[] args) {
//         String s="hello";
//         //System.out.println(s.substring(2,7));
//         SubString(s);
//     }
//     public static void SubString(String s){
//         for(int i=0;i<s.length();i++){
//             for(j=i+1;j<=s.length();j++){
//                 System.out.println(s.substring(i, j));
//             }
//         }
//     }
// }

/**
 * kushal
 */
// pallendrome of a string.
// public class kushal {

//     public static void main(String[] args) {
//         String s="naman";
//         for(int i=0;i<s.length()/2;i++){
//             if(charAt(i)!=charAt(s.length()-i)){
//                 System.out.println("no");
//                 exit;
//             }
//             else{

//             }
//         }
//     }
// }


/**
 * kushal
 */
// import java.util.*;
// public class kushal {
//     public static void main(String[] args) {
//         String s="helol";
//         SubString(s);

//     }
//     public static void SubString(String str){
//         for(int i=1;i<= str.length();i++){
//             for(int j=i;j<=str.length();j++){
//                 int x=j-i;
//                 System.out.println(str.substring(i, j));
//             }
//         }
//     }
// }

// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
// 		Scanner sc=new Scanner(System.in);
		
//     }
// 	public static boolean iscb(long n){
// 		if(n == 0 || n == 1){
// 			return false;
// 		}
// 		int[] arr=
// 	}
// }

/**
 * kushal
 */
// public class kushal {
//     public static void main(String[] args) {

//     String s=" a good   example ";

//     }
//     public static String reverseWords(String s){
//         s=s.trim();
//         String[] arr=s.split("\s+");
//         String ans="";

//     }
// }

// import java.util.*; 
// public class kushal{
//     public static void main(String[] args){
//         int[] arr= {1,2,8,4,9};
//         int cow = 3;
//         Arrays.sort(arr);
//         System.out.println(largest_minimum(arr, cow));
        
//     }
//     public static int largest_minimum(int[] arr,int cow){
//         int low = arr[0];
//         int hi = arr[arr.length-1];
//         int ans = 0;
//         while(low <= hi){
//             int mid = (low+hi)/2;
//             if(isitpossible(arr,ans , mid)){
//                 ans=mid;
//                 low=mid=1;
//             }
//             else{
//                 hi = mid-1;
//             }
//         }
//         return ans;
//     }
//     public static boolean isitpossible(int[] arr,int ans,int mid){
//         int ans = arr[0];
//         int t=1;
//         for(int i=1;i<arr.length;i++){
//             if(arr[i] - ans >= mid){
//                 t++;
//                 ans = arr[i];
//             }
//             if(t == mid){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

/**
 * kushal
//  */
// import java.util.*;
// public class kushal {

//     public static void main(String[] args) {
        // Integer A = 10;
        // int a = 10;
        // System.out.println(A);
        // System.out.println(a);
        // int b=1;
        // Integer b1 = 1;
        // b=b1;
        //  Integer c1 = 12;
        // Integer c2 = 12;
        // Integer c3 = 128;
        // Integer c4 = 128;
        // System.out.println(c1==c2);
        // System.out.println(c3==c4);
        // ArrayList<Integer> ls = new ArrayList<Integer>(4);
        // ls.add(32);
        // ls.add(36);
        // ls.add(38);
        // ls.add(68);
        // ls.add(62);
        // ls.add(64);
        // ls.add(61);
        // ls.add(60);
        // ls.add(65);
        // ls.add(69);
        // ls.add(74);
        // ls.add(70);
        // System.out.println();
        // System.err.println(ls.size());
        // System.out.println(ls);
        // System.err.println(ls.remove(3));
        // System.out.println(ls);
        // System.out.println(ls.get(2));
        // for(int i=0;i<ls.size();i++){
        //     System.out.print(ls.get(i)+" ");
        // }
        // System.out.println();
        // for(int v:ls){
        //     System.out.print(v+" ");
        // }
        
//     }
// } 


// import java.util.*;
// public class kushal {
//     public static void main (String args[]) {
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int[] arr1 = new int[n];
// 		for(int i=0;i<n;i++){
// 			arr1[i]=sc.nextInt();
// 		}
// 		int m = sc.nextInt();
// 		int[] arr2 = new int[m];
// 		for(int i=0;i<m;i++){
// 			arr2[i]=sc.nextInt();
// 		}
// 		int sum1=0;
// 		int sum2=0;
// 		int temp1=0;
// 		int temp2=0;
// 		for(int i=n-1;i>=0;i--){
// 			temp1 = arr1[i];
// 			sum1=sum1*10+temp1;
// 		}
// 		for(int i=m-1;i>=0;i--){
// 			temp2 = arr2[i];
// 			sum2=sum2*10+temp2;
// 		}
// 		int sum = sum1+sum2;
// 		System.out.println(sum);
		
// 		    }
// }


// import java.util.*;
// public class kushal {
//     public static void main (String args[]) {
// 		ArrayList<Integer> ls1 = new ArrayList<Integer>();
// 		ArrayList<Integer> ls2 = new ArrayList<Integer>();
// 		ArrayList<Integer> ans = new ArrayList<Integer>();
// 		Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
// 		for(int i=0;i<n;i++){
// 			int a=sc.nextInt();
// 			ls1.add(i,a);
// 		}
// 		int m=sc.nextInt();
// 		for(int i=0;i<m;i++){
// 			int b=sc.nextInt();
// 			ls2.add(i,b);
// 		}
// 		int i=ls1.size()-1;
// 		int j=ls2.size()-1;
// 		int carry = 0;
// 		while(i>=0 && j>=0){
// 			int sum = carry + ls1.get(i) +ls2.get(j);
// 			ans.add(sum%10);
// 			carry = sum/10;
// 			i--;
// 			j--;
// 		}
// 		if(carry>0){
// 			ans.add(carry);
// 		}
//         System.out.print(ans);
// 		sc.close();
//     }
// 


/**
 * kushal
 */
// public class kushal {

//         public static void main(String[] args) {
//                 int[] arr={1,2,3,4,6};
//                 int a= numberSubarray(arr);
//                 System.out.println(a);

//         }
//         public static long numberSubarray(int arr[]){
//                 long sum = 0;
//                 int n = arr.length;
//                 long[] freq = new long[n];
//                 for(int i=0 ; i<n ;i++){
//                         sum=sum+arr[i];
//                         int idx= (int)(sum%n);
//                         if(idx<0){
//                                 idx+=n;
//                         }
//                         freq[idx]=freq[idx]+1;
                
//                 }
//                 long ans = 0;
//                 for(int i=0;i<freq.length;i++){
//                         long p = freq[i];
//                         if(p >= 2){
//                                 ans =ans+(p*(p-1))/2;
//                         }
//                 }
//                 return ans;
//         }
// }

// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//          Scanner scn=new Scanner(System.in);
//         int t = scn.nextInt(); 
//         while(t-->0){
//            int n = scn.nextInt(); 
//            int[] arr=new int[n];
//            for (int i = 0; i < n; i++) 
//             arr[i]=scn.nextInt();
//             System.out.println(subarraysDivByK(arr)); 
//         }
//     }
//     public static long subarraysDivByK(int arr[]) {
//         long sum = 0;
//         int n = arr.length;
//         int freq[] = new int[n];
//         freq[0] = 1;
//         for (int i = 0; i < n; i++) {
//             sum = sum + arr[i];
//             int idx = (int) (sum % n);
//             if (idx < 0) {
//                 idx += n;
//             }
//             freq[idx] = freq[idx] + 1;
//         }
//         long ans = 0;
//         for (int i = 0; i < freq.length; i++) {
//             long p = freq[i];
//             if (p >= 2) {
//                 ans = ans + (p * (p - 1)) / 2;
//             }
//         }
//         return ans;
//     }
// }


// --------------------Back_Tracking--------------------------------
 

// public class kushal{
//         public static void main(String[] args){
//                 int n=4;
//                 boolean board[] =new boolean[n];
//                 int tq = 2;
//                 permutation(board,tq,0,"");
//         }
//         public static void permutation(boolean board[] , int tq,int qpsf,String ans){
//                 if(tq==qpsf){
//                         System.out.println(ans);
//                         return;
//                 }
//                 for(int i=0;i<board.length;i++){
//                         if(board[i]==false){                      
//                                 board[i]=true;
//                                 permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
//                                 board[i]=false;
//                         }
//                 }
//         }
// }



/**
 * kushal
//  */
// public class kushal {

//         public static void main(String[] args) {
//                 int[] coin={1,3,5};
//                 int amount=6;
//                 Coin_Change(coin,amount,"");
//         }
//         public static void Coin_Change(int[] coin,int amount,String ans){

//                 if(amount==0){
//                         System.out.println(ans);
//                         return;
//                 }
//                 for(int i=0;i<coin.length;i++){
//                         if(amount>=coin[i]){
//                                 Coin_Change(coin,amount-coin[i],ans+coin[i]);
//                         }
//                 }
//         }
// }

import java.util.Scanner;

/**
 * kushal
 */

// import java.util.*;
// public class kushal {
//         public static void Display(int ans[][]){
//                 for(int i=0;i<ans.length;i++){
//                         for(int j=0;j<ans[0].length;j++){
//                                 System.out.print(ans[i][j]);
//                         }
//                         System.out.println();
//                 }
//         }
//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 int n=sc.nextInt();
//                 int m=sc.nextInt();
//                 char maze[][]=new char[n][m];
//                 for(int i=0;i<maze.length;i++){
//                         String str=sc.next();
//                         for(int j=0;j<str.length();j++){
//                                 maze[i][j]=str.charAt(j);
//                         }
//                 }
//                 int[][] ans=new int[n][m];
//                 print(maze,0,0,ans);
//                 if(val == 0){
//                         System.out.println("NO PATH FOUND");
//                 }
//     }
//     static int val=0;
//     public static void print(char [][]maze,int cr,int cc,int ans[][]){
//         if(cr==maze.length-1 && cc==maze[0].length-1){
//                 ans[cr][cc]=1;
//                 Display(ans);
//                 return;
//         }
//         if(cr < 0 || cr >= maze.length || cc < 0 || cc >= maze[0].length || maze[cr][cc]=='X'){
//                 return;
//         }
//         maze[cr][cc]='X';
//         ans[cr][cr]=1;
//         print(maze,cr-1,cc,ans);
//         print(maze,cr,cc-1,ans);
//         print(maze,cr+1,cc,ans);
//         print(maze,cr,cc+1,ans);
//         maze[cr][cc]='O';
//     }
// } 


