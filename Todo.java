import java.sql.SQLOutput;
import java.util.*;
public class Todo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the To-do List");
        ArrayList<String> task = new ArrayList<>();
        System.out.println("what do you want to do:-");
        System.out.println("1.Add a task");
        System.out.println("2.View tasks");
        System.out.println("3.Mark task as completed");
        System.out.println("4.Delete a task");
        System.out.println("5.Exit");
        while(true){
            System.out.println("what do you want to do:-");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice>0 && choice<5){
                if(choice==1){
                    System.out.print("Enter the task:");
                    String temp = sc.nextLine();
                    task.add(temp);
                    System.out.println("Task added successfully");
                }
                else if(choice==2){
                    if(task.isEmpty()){
                        System.out.println("Nothing in the list");
                    }
                    else{
                        System.out.println("SHOWING TASKS");
                        display(task);
                    }
                }
                else if(choice==3){
                    System.out.println("which task should be marked down as completed:");
                    display(task);
                    System.out.print("Enter your choice:");
                    int comp = sc.nextInt();
                    if(comp>=1 && comp<=task.size()){
                        String lat = task.get(comp-1)+" [COMPLETED]";
                        task.set(comp-1,lat);
                        System.out.println("Task marked successfully!!");
                    }
                    else{
                        System.out.println("No task is present at that number");
                    }
                }
                else {
                    System.out.println("which task should be deleted");
                    display(task);
                    System.out.print("Enter your choice:");
                    int del = sc.nextInt();
                    if(del>=1 && del<= task.size()){
                        task.remove(del-1);
                        System.out.println("Task deleted successfully!!");
                    }
                    else{
                        System.out.println("Not a valid choice for deletion!!");
                    }
                }
            } else if (choice==5) {
                System.out.println("Exited from the program!!");
                break;
            }
            else{
                System.out.println("Enter a valid number{1-5}");
            }
        }
    }
    public static void display(ArrayList x){
        int num = 1;
        for(int i=0;i<x.size();i++){
            System.out.println(num+"."+x.get(i));
            num++;
        }
    }
}
