
package Project;
import java.util.Scanner;
public class xogame
{
    
    public static void main(String args[])
    {
        xogame ob =new xogame();
        int k=1,g=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\n\n\n\t\t\t\tEnter Player 1 name");
        String p1=sc.nextLine();
        System.out.println('\u000c');
        System.out.println("\n\n\n\n\n\t\t\t\tEnter Player 2 name");
        String p2=sc.nextLine();
        System.out.println('\u000c');
        int cc=0;
        String score[]=new String[6];
        for(int i=0;i<6;i++)
        score[i]=" ";
        try{
        while(k==1)
        {
            ++g;
        
        char ar[]={'1','2','3','4','5','6','7','8','9'};
        int co=0,in=0,a=1,c=0;
        do{
                  
            System.out.println('\u000c');
            if(g%2!=0)
            {
            if(c%2==0)
            System.out.println("\n\n\t\t\t\t"+p1+"(x)");
            else
            System.out.println("\n\n\t\t\t\t"+p2+"(o)");
        }
        
        else
        {
            
            if(c%2==0)
            System.out.println("\n\n\t\t\t\t"+p2+"(x)");
            else
            System.out.println("\n\n\t\t\t\t"+p1+"(o)");
        }
        System.out.println("\n\n\t\t\t \t \t \t\t"+p1+"\t"+p2);
            System.out.println("\n\n\t\t\t"+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t\t"+score[0]+"\t"+score[1]);
            System.out.println("\n\t\t\t"+ar[3]+"\t"+ar[4]+"\t"+ar[5]+"\t\t"+score[2]+"\t"+score[3]);
            System.out.println("\n\t\t\t"+ar[6]+"\t"+ar[7]+"\t"+ar[8]+"\t\t"+score[4]+"\t"+score[5]);
            if(g%2!=0)
            {
            if(a==0)
            {
            score[cc]="1";
            ++cc;
            score[cc]="0";
            ++cc;
            System.out.println('\u000c');
            System.out.println("\n\n\t\t\t \t \t \t\t"+p1+"\t"+p2);
            System.out.println("\n\n\t\t\t"+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t\t"+score[0]+"\t"+score[1]);
            System.out.println("\n\t\t\t"+ar[3]+"\t"+ar[4]+"\t"+ar[5]+"\t\t"+score[2]+"\t"+score[3]);
            System.out.println("\n\t\t\t"+ar[6]+"\t"+ar[7]+"\t"+ar[8]+"\t\t"+score[4]+"\t"+score[5]);
            boolean ad=ob.print(p1+" wins");
            break;
        }
            if(a==2)
            {
            score[cc]="0";
            ++cc;
            score[cc]="1";
            ++cc;
            System.out.println('\u000c');
            System.out.println("\n\n\t\t\t \t \t \t\t"+p1+"\t"+p2);
            System.out.println("\n\n\t\t\t"+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t\t"+score[0]+"\t"+score[1]);
            System.out.println("\n\t\t\t"+ar[3]+"\t"+ar[4]+"\t"+ar[5]+"\t\t"+score[2]+"\t"+score[3]);
            System.out.println("\n\t\t\t"+ar[6]+"\t"+ar[7]+"\t"+ar[8]+"\t\t"+score[4]+"\t"+score[5]);
                boolean ad=ob.print(p2+" wins");
            break;
        }
    }
    else
    {
        
            if(a==0)
            {
                score[cc]="0";
            ++cc;
            score[cc]="1";
            ++cc;
            System.out.println('\u000c');
            System.out.println("\n\n\t\t\t \t \t \t\t"+p1+"\t"+p2);
            System.out.println("\n\n\t\t\t"+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t\t"+score[0]+"\t"+score[1]);
            System.out.println("\n\t\t\t"+ar[3]+"\t"+ar[4]+"\t"+ar[5]+"\t\t"+score[2]+"\t"+score[3]);
            System.out.println("\n\t\t\t"+ar[6]+"\t"+ar[7]+"\t"+ar[8]+"\t\t"+score[4]+"\t"+score[5]);
            boolean ad=ob.print(p2+" wins");
            break;
        }
            if(a==2)
            {
                score[cc]="1";
            ++cc;
            score[cc]="0";
            ++cc;
            System.out.println('\u000c');
            System.out.println("\n\n\t\t\t \t \t \t\t"+p1+"\t"+p2);
            System.out.println("\n\n\t\t\t"+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t\t"+score[0]+"\t"+score[1]);
            System.out.println("\n\t\t\t"+ar[3]+"\t"+ar[4]+"\t"+ar[5]+"\t\t"+score[2]+"\t"+score[3]);
            System.out.println("\n\t\t\t"+ar[6]+"\t"+ar[7]+"\t"+ar[8]+"\t\t"+score[4]+"\t"+score[5]);
                boolean ad=ob.print(p1+" wins");
            break;
        }
    }
        if(c==9)
        {
            boolean ad=ob.print("DrAw");
            break;
        }
            in=sc.nextInt();
            c=c+1;
            
            if(co%2==0)
            ar[in-1]='X';
            else
            ar[in-1]='O';
            ++co;
            if(ar[0]=='X')
            {
                if((ar[1]=='X'&&ar[2]=='X')||(ar[3]=='X'&&ar[6]=='X')||(ar[4]=='X'&&ar[8]=='X'))
                {
                     
                    a=0;
                }
            }
                if(ar[1]=='X'&&ar[4]=='X'&&ar[7]=='X')
                {
                         
                    a=0;
                }
            if(ar[2]=='X')
            {
                if((ar[4]=='X'&&ar[6]=='X')||(ar[5]=='X'&&ar[8]=='X'))
                {
                         
                    a=0;
                }
            }
                 if(ar[3]=='X'&&ar[4]=='X'&&ar[5]=='X')
                {
                         
                    a=0;
                }
                 if(ar[6]=='X'&&ar[7]=='X'&&ar[8]=='X')
                {
                         
                    a=0;
                }
                
                if(ar[0]=='O')
            {
                if((ar[1]=='O'&&ar[2]=='O')||(ar[3]=='O'&&ar[6]=='O')||(ar[4]=='O'&&ar[8]=='O'))
                {
                       
                    a=2;
                }
            }
                if(ar[1]=='O'&&ar[4]=='O'&&ar[7]=='O')
                {
                           
                    a=2;
                }
            if(ar[2]=='O')
            {
                if((ar[4]=='O'&&ar[6]=='O')||(ar[5]=='O'&&ar[8]=='O'))
                {
                           
                    a=2;
                }
            }
                 if(ar[3]=='O'&&ar[4]=='O'&&ar[5]=='O')
                {
                           
                    a=2;
                }
                 if(ar[6]=='O'&&ar[7]=='O'&ar[8]=='O')
                {
                           
                    a=2;
                }
            
            }while(true);
        System.out.println("\nEnter 1 to Continue \n\nEnter 0 to quit");
        k=sc.nextInt();
    }
       System.out.println('\u000c');
       System.exit(0);
    }
   catch(Exception e)
    {
        System.out.println("Error");
    }
    
    }
    
boolean print(String input)
{
    int x=input.length();
    
                System.out.println("\n\n\t\t\t");
         for(int j=0;j<x;j++)
         {
             char c=input.charAt(j);
             
             for(double i=0.0;i<=10000000.0;i+=0.1)
             
             for(double i1=0.0;i<=10000000.0;i+=0.1)
             
             for(double i2=0.0;i<=10000000.0;i+=0.1)
             
             for(double i3=0.0;i<=10000000.0;i+=0.1)
             
             for(double i4=0.0;i<=10000000.0;i+=0.1)
             
             for(double i5=0.0;i<=10000000.0;i+=0.1){}
             System.out.print(c);
            }
            System.out.println();
            return true;
        }
}