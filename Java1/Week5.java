import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner in=new Scanner(System.in);
  final int SIZE=101;
  int[] e1=new int[SIZE];
  int[] e2=new int[SIZE];
  int n1=0,n2=0;
  do{
   n1=in.nextInt();
   n2=in.nextInt();
   if( n1>=0 && n1<SIZE )
   {
    e1[n1]=n2;
   }
  }while( n1!=0 );
  
  do{
   n1=in.nextInt();
   n2=in.nextInt();
   if( n1>=0 && n1<SIZE )
   {
    e2[n1]=n2;
   }
  }while( n1!=0 );
  
  for( int i=0 ; i<SIZE ; i++ ){
   if( e2[i]!=0 )
   {
    e1[i]+=e2[i];
   }
  }
  int flag=0;
  int cnt=0;
  for( int i=e1.length-1 ; i>=0 ; i-- ){
   if( e1[i]!=0 )
   {
    if( flag==0 )
    {
     if( i==0 )
     {
      System.out.print(e1[i]);
      cnt++;
     }
     else if( i==1 )
     {
      if( e1[i]==1 )
      {
       System.out.print("x");
      }
      else if( e1[i]==-1 )
      {
       System.out.print("-x");
      }
      else
      {
       System.out.print(e1[i]+"x");
      }
      cnt++;
     }
     else
     {
      if( e1[i]==1 )
      {
       System.out.print("x"+i);
      }
      else if( e1[i]==-1 )
      {
       System.out.print("-x"+i);
      }
      else
      {
       System.out.print(e1[i]+"x"+i);
      }
      cnt++;
     }
     flag=1;
    }
    else 
    {
     if( i==0 )
     {
      if( e1[i]>0 )
      {
       System.out.print("+"+e1[i]);
      }
      else
      {
       System.out.print(e1[i]);
      }
      cnt++;
     }
     else if( i==1 )
     {
      if( e1[i]>0 )
      {
       if( e1[i]==1 )
       {
        System.out.print("+x");
       }
       else
       {
        System.out.print("+"+e1[i]+"x");
       }
      }
      else
      {
       if( e1[i]==-1 )
       {
        System.out.print("-x");
       }
       else
       {
        System.out.print(e1[i]+"x");
       }
      }
      cnt++;
     }
     else
     {
      if( e1[i]>0 )
      {
       if( e1[i]==1 )
       {
        System.out.print("+x"+i);
       }
       else
       {
        System.out.print("+"+e1[i]+"x"+i);
       }
      }
      else
      {
       if( e1[i]==-1 )
       {
        System.out.print("-x"+i);
       }
       else
       {
        System.out.print(e1[i]+"x"+i);
       }
      }
      cnt++;
     }
    }
   }
  }
  if( cnt==0 )
  {
   System.out.print("0");
  }
  System.out.println();
 }
}