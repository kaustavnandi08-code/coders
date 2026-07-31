import java.util.*;
public class expense_trackor {
     Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    create_account(new Scanner(System.in));
    }
      static void create_account(Scanner sc){
System.out.println("welcome to expense tracker");
String choice;
System.out.println("Do you already have an account? (yes/no)");
choice = sc.nextLine();
if (choice.equals("yes")){
    System.out.println("Enter your username and password:");
    String username=sc.nextLine();
     String password=sc.nextLine();
}
else{
System.out.println("select the login method: ");
}
}
}
