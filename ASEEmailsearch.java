
package aseemailsearch;
import java.util.List;
import java.util.Scanner;
/*
 * @author rcara
 */
public class ASEEmailsearch {
    public static void main(String[] args) {
       
        User eni = new User("Rustem", "Eniiza2021", new Employee(1, "Rustem", "Cara", 0));
        User dani = new User("Daniela", "Daenir2021", new ClientEmployee(1, "Daniela", "Cara"));

        // Perform user authentication
        boolean isAuthenticated = UserInterface.authenticateUser(dani);
         if (isAuthenticated) {
        // Create a project and assign the new team to it
        //Project newProject = new Project("MyProject", newTeam);
        List<Email> emails = Email.createEmails();
        Project newProject = Project.createNewProject("NewProject");
        newProject.addEmail(emails); 
        // Print team members after logging in
        newProject.printTeamMembers();
        // Print project emails
        newProject.printEmails();   
        Scanner scanner = new Scanner(System.in);
            // Prompt the user for the search keyword
            System.out.print("Enter search keyword: ");
            String keyword = scanner.nextLine();      
            // Create an EmailSystemComponent with the email list
            EmailSystemComponent emailSystem = new EmailSystemComponent(emails);
            //Initiate command and exceute
             SearchEmailCommand searchEmailCommand = new SearchEmailCommand(emailSystem, keyword);
             EmailInvoker emailInvoker = new EmailInvoker();
             emailInvoker.setCommand(searchEmailCommand);
             emailInvoker.executeCommand();
            // Print the search results
            List<Email> searchResults = searchEmailCommand.getSearchResults();
            if (!searchResults.isEmpty()) {
                  System.out.println("Search Results:");
             for (Email result : searchResults) {
                  System.out.println(result);
            }
            } else {
                    System.out.println("No emails found matching the search criteria.");
}
            //Checks user type
             UserType userType = dani.getUserType();

          if (userType instanceof Employee) {
            // Prompt the user to open an email and get rewarded   
                Employee eniEmployee = (Employee) userType;
                Extranet extranetComponent = new Extranet(eniEmployee);
                extranetComponent.loadState(eniEmployee, emails);
                extranetComponent.openEmailAndReward(eniEmployee, searchResults, scanner);
                extranetComponent.saveState(eniEmployee, emails);
            } else if (userType instanceof ClientEmployee) {
                // Message that features are not available for this user type
                System.out.println("ClientEmployee does not have access to extranet features.");
                
        } else {
            System.out.println("No emails found matching the search criteria.");
        }

        // Don't forget to close the scanner
        //scanner.close();
         }
    }
}
    

    


        
  

    
    
    

