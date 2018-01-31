import java.util.Scanner;


public class WiproSavingsBankMS {
    
    // Declaring Variables
    int age;
    float min_bal,avail_bal;
    String name,address;
    String statement;
    
    WiproSavingsBankMS(float min_bal,float avail_bal,int age,String name, String address)
    {
        this.age = age;
        this.min_bal=min_bal;
        this.avail_bal=avail_bal;
        this.name=name;
        this.address=address;
        statement="";
    }
    
    //creating function to access various features
    void deposit(int amount)
    {
        avail_bal=avail_bal+amount;
        System.out.println("The money is deposited sucessfully and the balance has been updated.");
        statement += "Credited : "+amount+", Balance: "+avail_bal+"\n";
    }
    void withdrawal(int amount)
    {
        if(avail_bal>=min_bal)
        {
            avail_bal=avail_bal-amount;
            statement += "Debited : "+amount+", Balance: "+avail_bal+"\n";
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
    
    void miniStatement()
    {
        System.out.println("MINI STATEMENT:\n"+statement);
    }
    
    public static void main(String args[]) 
    {
       WiproSavingsBankMS a=new WiproSavingsBankMS(2000,10000,22,"Sai","Cdc2 Wipro office");
       WiproSavingsBankMS b=new WiproSavingsBankMS(2000,15000,30,"Rohit","Cdc5 Wipro office");
       
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
       
       a.miniStatement();
       
       //For Customer b
       //Deposit
       System.out.println("Enter the amount to be deposited : ");
       b.deposit(c.nextInt());
       b.balEnquiry();
       
       //Withdrawl
       System.out.println("Enter the amount to be withdrawn : ");
       b.withdrawal(c.nextInt());
       b.balEnquiry();
     
       b.miniStatement();
    }

}

