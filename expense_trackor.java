import java.util.*;
public class expense_trackor {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter your salary:");
int salary=sc.nextInt();
int expense=sc.nextInt();
 if(salary>10000 && salary<20000) {
        int savings=salary-expense;
        int loan_expense=25000;
        System.out.println("You can save 20% of your salary");
    }
    
}
