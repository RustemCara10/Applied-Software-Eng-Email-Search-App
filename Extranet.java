
package aseemailsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rcara
 */
public class Extranet implements ExtranetInterface {
private Employee employee;



    public Extranet(Employee employee) {
        this.employee = employee;
       
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
      
    }
 public void rewardEmployee(Employee employee) {
        System.out.println("Congratulations! You've been rewarded.");

        // Custom logic for rewarding the employee
        // For example, you can update employee's score, grant points, etc.
        int currentScore = employee.getBeenz();
        int rewardPoints = 1; 
        int newScore = currentScore + rewardPoints; // You can adjust the reward points as needed
        employee.setBeenz(newScore);
        System.out.println("Your new beenz amount: " + newScore);
    }

    public void openEmailAndReward(Employee employee, List<Email> emails, Scanner scanner) {
        System.out.print("Do you want to open an email and get rewarded? (yes/no): ");
        String openEmailChoice = scanner.nextLine();

        if (openEmailChoice.equalsIgnoreCase("yes")) {
            // Prompt the user to select an email by index
            System.out.println("Select an email to open (enter index): ");
            for (int i = 0; i < emails.size(); i++) {
                System.out.println(i + ". " + emails.get(i).getSubject());
            }

            int selectedEmailIndex = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Check if the selected index is valid
            if (selectedEmailIndex >= 0 && selectedEmailIndex < emails.size()) {
                Email selectedEmail = emails.get(selectedEmailIndex);

                // Check if the email is already opened (optional)
                    if (!selectedEmail.isOpened()) {
                    // Mark the email as opened
                    selectedEmail.setOpened(true);

                    // Display email content
                    System.out.println("Email Content:");
                    System.out.println("Subject: " + selectedEmail.getSubject());
                    System.out.println("Content: " + selectedEmail.getContent());

                    // Reward the employee
                    rewardEmployee(employee);
                } else {
                    System.out.println("Email is already opened.");
                }
            } else {
                System.out.println("Invalid email index.");
            }
        }
    }
public void saveState(Employee employee, List<Email> openedEmails) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("state.txt"))) {
            writer.println("Beenz:" + employee.getBeenz());
            writer.println("OpenedEmails:");
            for (Email email : openedEmails) {
                if (email.isOpened()) {
                    writer.println(email.getSubject());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadState(Employee employee, List<Email> emails) {
        try (Scanner scanner = new Scanner(new File("state.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("Beenz:")) {
                    int beenz = Integer.parseInt(line.substring(6));
                    employee.setBeenz(beenz);
                } else if (line.equals("OpenedEmails:")) {
                    while (scanner.hasNextLine()) {
                        String emailSubject = scanner.nextLine();
                        for (Email email : emails) {
                            if (email.getSubject().equals(emailSubject)) {
                                email.setOpened(true);
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            // Ignore if the file doesn't exist
        }
    }    
    
}
