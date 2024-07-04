
package MyTesting;
import aseemailsearch.Email;
import aseemailsearch.EmailSystemComponent;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 *
 * @author rcara
 */
public class EmailSearchTest {

    public EmailSearchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void searchEmails_ShouldReturnMatchingResults_WhenKeywordExists() {
        // Arrange
        List<Email> emails = Email.createEmails();
        EmailSystemComponent emailSystem = new EmailSystemComponent(emails);

        // Act
        List<Email> searchResults = emailSystem.searchEmails("Client");

        // Assert
        assertFalse(searchResults.isEmpty());
    }
    @Test
    public void searchEmails_ShouldReturnEmptyList_WhenKeywordDoesNotExist() {
        // Arrange
        List<Email> emails = Email.createEmails();
        EmailSystemComponent emailSystem = new EmailSystemComponent(emails);

        // Act
        List<Email> searchResults = emailSystem.searchEmails("NonexistentKeyword");

        // Assert
        assertTrue(searchResults.isEmpty(), "Search results should be empty. Actual results: " + searchResults);
    }
}
