import java.util.*;
class Electric
{
int cno;
String name;
double unit;
double bill=0;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter customer number:");
cno=sc.nextInt();
System.out.println("Enter customer name:");
name=sc.next();
System.out.println("Enter number of units:");
unit=sc.nextDouble();
if(unit>0 && unit<=100)
bill=(50+(unit*1.50));
else if(unit>100 && unit<=200)
bill=(50+(unit*1.50)+(unit*1.80));
else if(unit>200)
bill=(50+(unit*2.50));
if (bill>300)
bill=(bill+(bill*(15/100)));
}
void display()
{
System.out.println("Customer number:"+cno+"\nCustomer name is"+name+"\nBill="+bill);
}
public static void main(String args[])
{
int i,count;
Electric ec[]=new Electric[100];
Scanner sc=new Scanner(System.in);
System.out.println("Enter for how many customers:");
count=sc.nextInt();
for(i=0;i<count;i++)
{
ec[i]=new Electric();
ec[i].accept();
}
for(i=0;i<count;i++)
{
ec[i].display();    
}
}
}