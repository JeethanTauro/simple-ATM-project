public class Account {
    private double balance;
    Account(float balance){
        this.balance = balance;
    }

    public void withdraw(double withdrawal){
        if(this.balance>withdrawal)
        {
            this.balance = this.balance - withdrawal;
            System.out.println("Transaction successful");
            view();
        }
        else
        {
            System.out.println("Not enough balance");
            view();
        }


    }
    public void deposit(double deposting){
        if(deposting>0)
        {
            this.balance = this.balance + deposting;
            System.out.println("Transaction successful");
            view();
        }
        else
        {
            System.out.println("please enter the correct amount");
        }
    }
    public void view()
    {
        System.out.println("The current bank balance is : "+this.balance);
    }
}
