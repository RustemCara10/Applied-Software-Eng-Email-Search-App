
package aseemailsearch;
import java.util.List;
/**
 *
 * @author rcara
 */
public class TeamMember {
  
   public List<Employee> teamMembers;
   public List<ClientEmployee> clientMembers;

    public TeamMember(List<Employee> teamMembers, List<ClientEmployee> clientMembers) {
        this.teamMembers = teamMembers;
        this.clientMembers = clientMembers;
    }

        
    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    public List<ClientEmployee> getClientMembers() {
        return clientMembers;
    }
    public void addTeamMember(Employee employee){
        teamMembers.add(employee);
    }
    public void addClientMember(ClientEmployee clientEmployee){
        clientMembers.add(clientEmployee);
    }
    public static TeamMember createNewTeam() {
        List<Employee> employees = Employee.createEmployees().subList(0,3);
        List<ClientEmployee> clientEmployees = ClientEmployee.createClientEmployees().subList(0,3);
        return new TeamMember(employees, clientEmployees);
    }
    
}


