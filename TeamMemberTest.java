
package MyTesting;

import aseemailsearch.ClientEmployee;
import aseemailsearch.Employee;
import aseemailsearch.TeamMember;
import java.util.List;
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
public class TeamMemberTest {
    
    public TeamMemberTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createNewTeamTest() {
      TeamMember team =TeamMember.createNewTeam();
      assertTrue(team.getTeamMembers().size() <= 3);
       assertTrue(team.getClientMembers().size() <= 3);
     }

}
