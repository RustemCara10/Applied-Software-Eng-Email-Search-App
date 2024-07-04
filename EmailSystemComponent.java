
package aseemailsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rcara
 */
public class EmailSystemComponent implements EmailSystem {
private List<Email> emailStorage;
private List<Email> searchResults; 


    public EmailSystemComponent(List<Email> emailStorage) {
        this.emailStorage = emailStorage;
    }
  

    @Override
    public void storeEmail(Email email) {
     emailStorage.add(email);    
        
    }

    @Override
    public List<Email> searchEmails(String keyword) {
   if (keyword.trim().isEmpty()) {
        System.out.println("Search keyword cannot be empty.");
        return searchResults;
    }

    // Call the searchEmailsInList method from the Email class
    searchResults = Email.searchEmailsInList(emailStorage, keyword);

    return searchResults;
}
    }
    



 


    

  


    

