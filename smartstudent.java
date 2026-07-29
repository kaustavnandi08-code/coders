import java.util.*;
public class smartstudent {
  /**
 * @param args
 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter your username and password:");
    String username=sc.nextLine();
     String password=sc.nextLine();
   if(username.equals("kaustav") && password.equals("kaustav123")){
        System.out.println("Welcome to the smart student portal");
    }
    else{
        System.out.println("Invalid username or password");
    }
 if(username.equals("kaustav") && password.equals("kaustav123")){
    System.out.println("Enter the feature you want to use: timetable manager, to-do list manager, cgpa calculator");
    String search=sc.nextLine();
    if(search.equals("timetable manager")){
        int study_hours=sc.nextInt();
       int sleep_hours=sc.nextInt();
       int leisure_hours=sc.nextInt();
       int total_hours=study_hours+sleep_hours+leisure_hours; 
       System.out.println("You have " + study_hours + " hours of study time allocated📕.");
    System.out.println("You have " + sleep_hours + " hours of sleep time allocated😴.");
    System.out.println("You have " + leisure_hours + " hours of leisure time allocated😊.");
    System.out.println("Your total allocated time is " + total_hours + " hours🕐.");
    }
else if(search.equals("to-do list manager")){
    int task_count=sc.nextInt();
    String task_1=sc.nextLine();
     System.out.println("You have " + task_count + " tasks in your to-do list.\n your task are:"+task_1);
     }
else if(search.equals("cgpa calculator")){
    int subject_count=sc.nextInt();
    double total_marks=0;
    for(int i=0;i<subject_count;i++){
        double marks=sc.nextDouble();
        total_marks+=marks;
    }
    double cgpa=total_marks/subject_count;
    System.out.println("Your CGPA is: " + cgpa);
}
  }
}
}
