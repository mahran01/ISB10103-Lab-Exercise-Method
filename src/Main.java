import java.util.*;

public class Main {
    
    public static void main(String args[]) {
        
        char lessonID, skillID;
        
        lessonID = GetLesson();
        skillID = GetSkill();
        
        CalculateFees(lessonID, skillID);
    }
    
    static char GetLesson() {
        
        int choice;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Choose a lesson:");
        System.out.println("1. Swim");
        System.out.println("2. Snorkel");
        System.out.println("3. Dive");
        
        choice = s.nextInt();
        
        switch(choice) {
            case 1: return '1';
            case 2: return '2';
            case 3: return '3';
            default: return GetLesson();
        }
    }
    
    static char GetSkill() {
        
        int choice;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Choose a skill:");
        System.out.println("1. Basic");
        System.out.println("2. Intermediate");
        System.out.println("3. Advanced");
        
        choice = s.nextInt();
        
        switch(choice) {
            case 1: return 'B';
            case 2: return 'I';
            case 3: return 'A';
            default: return GetSkill();
        }
    }
    
    static void CalculateFees(char lessonID, char skillID) {
        
        int price = 0;
        
        switch (lessonID) {
            case '1': price += 50;
                      break;
            case '2': price += 25;
                      break;
            case '3': price += 100;
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