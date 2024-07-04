
package aseemailsearch;

import java.util.Scanner;

/**
 *
 * @author rcara
 */
public interface UserInterface {

    static boolean authenticateUser(User user) {
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 3;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();
            
            
            boolean isAuthenticated = user.authenticate(enteredUsername, enteredPassword);


            if (isAuthenticated) {
                System.out.println("Authentication successful!");
                //scanner.close();
                return true;
            } else {
                attempts++;
                System.out.println("Authentication failed. Try again (" + attempts + "/" + maxAttempts + ")");
            }
        }

        System.out.println("Maximum login attempts reached. Exiting.");
        //scanner.close();
        return false;
    }
}

        
    
    

