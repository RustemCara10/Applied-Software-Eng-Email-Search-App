
package MyTesting;

import aseemailsearch.Employee;
import aseemailsearch.User;
import aseemailsearch.UserType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rcara
 */
public class UserAuthenticateTest {
    private User user;
    public UserAuthenticateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
 
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Employee employee = new Employee(1, "Rustem", "Cara", 0);
        user = new User("Rustem", "Eniiza2021", employee);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAuthenticate() {
    
       

        // Test with correct credentials
        assertTrue(user.authenticate("Rustem", "Eniiza2021"));

        // Test with incorrect username
        assertFalse(user.authenticate("wrongUser", "Eniiza2021"));

        // Test with incorrect password
        assertFalse(user.authenticate("Rustem", "wrongPassword"));

        // Test with both incorrect username and password
        assertFalse(user.authenticate("wrongUser", "wrongPassword"));
    }

}
