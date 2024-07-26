import java.util.Scanner;

public class account {
    public static void main(String[] args) {
        acc p1 = new acc();

    }
}

class acc {
    private String accno;
    private String name;
    private String phoneno;
    private String acc_type;
    private long balance;

    public void openAcc() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Opening Account Desk");
        System.out.println("Enter your Name: ");
        String n1 = sc.nextLine();

        System.out.println("Enter your age: ");
        int num1 = sc.nextInt();

        System.out.println("Enter your phone number : ");
        int phone_no = sc.nextInt();
        System.out.println("select your account type you want : ");
        System.out.println("1. Savings Account \n 2. Business account");
    }

}