import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int year;
        
        System.out.println("Please Enter a year: ");
        year = scnr.nextInt(); 
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { 
            System.out.println("Leap");
        } else { 
            System.out.println("Regular");
        }
    }
}
