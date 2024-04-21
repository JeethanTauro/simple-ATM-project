import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String user;
        Scanner sc  = new Scanner(System.in);
            Account acc = new Account(10000);
        System.out.println("Do you want to withdraw or deposit or view your account?");
        System.out.println("for withdrawal press 'w' , for depositing press 'd' , for viewing acc balance press 'v'");
        user = sc.next();
        char c = user.charAt(0);

        if(c == 'w')
        {
            System.out.println("enter the amount to withdraw");
            double w = sc.nextDouble();
            acc.withdraw(w);
        }
        else if(c == 'd')
        {
            System.out.println("enter the amount to deposit");
            double d = sc.nextDouble();
            acc.deposit(d);
        }
        else if (c == 'v')
        {
            acc.view();
        }
        else
        {
            System.out.println("wrong input");
        }


    }
}
