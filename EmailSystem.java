
package aseemailsearch;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rcara
 */
public interface EmailSystem {

    List<Email> searchEmails(String keyword);
    void storeEmail(Email email);

}
    

