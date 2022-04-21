import java.util.*;

public class Main {
    
    public static void main(String args[]) {
        
        int lessonID;
        char skillID;
        
        lessonID = GetLesson();
        skillID = GetSkill();
        
        CalculateFees(lessonID, skillID);
    }
    
    static int GetLesson() {
        
        int choice;
        Scanner s = new Scanner(System.in);
        
        System.out.println("1. Swim");
        System.out.println("2. Snorkel");
        System.out.println("3. Dive");
        System.out.println("Choose a lesson:");
        
        choice = s.nextInt();
        
        System.out.println();
        
        switch(choice) {
            case 1: case 2: case 3: return choice;
            default: return GetLesson();
        }
    }
    
    static char GetSkill() {
        
        char choice;
        Scanner s = new Scanner(System.in);
        
        System.out.println("B. Basic");
        System.out.println("I. Intermediate");
        System.out.println("A. Advanced");
        System.out.println("Choose a skill:");
        
        choice = s.next().charAt(0);
        
        System.out.println();
        
        switch(choice) {
            case 'B': case 'I': case 'A': return choice;
            default: return GetSkill();
        }
    }
    
    static void CalculateFees(int lessonID, char skillID) {
        
        int price = 0;
        
        switch (lessonID) {
            case 1: price += 50;
                    break;
            case 2: price += 25;
                    break;
            case 3: price += 100;
                    break;
        }
        
        switch (skillID) {
            case 'B': price += 10;
                      break;
            case 'I': break;
            case 'A': price -= 15;
                      break;
        }
        
        System.out.format("The fee is RM %d.00", price);
    }
}