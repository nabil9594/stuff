import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MediaRentalSystem {

        public static void main(String[] args) throws IOException {
                Scanner sc = new Scanner(System.in);
                while (Menu()) {
                        int choice = 0;
                        System.out.println("Enter choice");
                        choice = sc.nextInt();
                        Manager m = new Manager();
                        switch (choice) {
                        case 1:
                        	Manager manager = new Manager();
                        
                        	
                        	
                                break;

                        case 2:
                                System.out.println("Enter media title ");
                                String title=sc.next();
                             //   m.findMedia(title);
                                
                                break;

                        case 3:
                                System.out.println("Enter media id :");
                                int id =sc.nextInt();
                              //  m.rentMedia(id);
                                break;

                        case 9:
                                System.exit(0);
                                break;

                        default:
                                System.out.println("Enter valid choice ");
                                break;
                        }
                }
                sc.close();
        }

        private static boolean Menu() {
                System.out.println("Welcome to media rental system");
                System.out.println("1: Load Media objects ");
                System.out.println("2: Find Media objects ");
                System.out.println("3: Rent Media objects ");
                System.out.println("9: exit ");
                return true;
        }
} 
	
	
	


