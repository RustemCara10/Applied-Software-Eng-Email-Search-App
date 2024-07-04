
 
package MyTesting;
import aseemailsearch.Employee;
import aseemailsearch.Extranet;
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
public class RewardEmployeeTest {
    private Extranet extranet;
    public RewardEmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    Employee employee = new Employee(7,"Haxhi","Balluku",0);
    extranet = new Extranet(employee);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testRewardEmployee() {
        // Create a sample employee
      

        // Get the initial score
        int initialScore = extranet.getEmployee().getBeenz();

        // Call the method to test
        extranet.rewardEmployee(extranet.getEmployee());

        // Get the updated score
        int updatedScore = extranet.getEmployee().getBeenz();

        // Assertions
        assertEquals(initialScore + 1, updatedScore); // Assuming the reward is 1 point
        // You may add more assertions based on your specific requirements
    }

}


