import java.util.Scanner;


public class WiproSavingsBank {
    
    // Declaring Variables
    int age;
    float min_bal,avail_bal;
    String name,address;
    
    WiproSavingsBank(float min_bal,float avail_bal,int age,String name, String address)
    {
        this.age = age;
        this.min_bal=min_bal;
        this.avail_bal=avail_bal;
        this.name=name;
        this.address=address;
    }
    
    //creating function to access various features
    void deposit(int amount)
    {
        avail_bal=avail_bal+amount;
        System.out.println("The money is deposited sucessfully and the balance has been updated.");
    }
    void withdrawal(int amount)
    {
        if(avail_bal>=min_bal)
        {
            avail_bal=avail_bal-amount;
            System.out.println("The money is withdrawn successfully and the balance has been updated.");
        }
        else
        {
            System.out.println("Your minimum balance is low.Update your balance to perform the following transaction.");
        }
    }

    void balEnquiry()
    {
        System.out.println("The remaing balance is:"+avail_bal);
    }
    public static void main(String args[]) 
    {
       WiproSavingsBank a=new WiproSavingsBank(2000,10000,22,"Sai","Cdc2 Wipro office");
       WiproSavingsBank b=new WiproSavingsBank(2000,15000,30,"Rohit","Cdc5 Wipro office");
       
       Scanner c = new Scanner(System.in);
       
       //For Customer a
       //Deposit
       System.out.println("Enter the amount to be deposited : ");
       a.deposit(c.nextInt());
       a.balEnquiry();
       
       //Withdrawl
       System.out.println("Enter the amount to be withdrawn : ");
       a.withdrawal(c.nextInt());
       a.balEnquiry();
       
       //For Customer b
       //Deposit
       System.out.println("Enter the amount to be deposited : ");
       b.deposit(c.nextInt());
       b.balEnquiry();
       
       //Withdrawl
       System.out.println("Enter the amount to be withdrawn : ");
       b.withdrawal(c.nextInt());
       b.balEnquiry();
     
    }

}

