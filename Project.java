
package aseemailsearch;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rcara
 */
public class Project {
    public String ProjectTopic;
    public TeamMember teamMember;
      private List<Email> emails;

       public Project(String ProjectTopic, TeamMember teamMember) {
       this.ProjectTopic = ProjectTopic;
        this.teamMember = teamMember;
        this.emails = new ArrayList<>();
    }
    

    public List<Email> getEmails() {
        return emails;
    }

 

    public String getProjectTopic() {
        return ProjectTopic;
    }

    public TeamMember getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(TeamMember teamMember) {
        this.teamMember = teamMember;
    }
    public void addEmail(List<Email> emails){
        this.emails.addAll(emails);
    }

    public void printTeamMembers() {
        System.out.println("Team Members for Project " + ProjectTopic + ":");
        for (Employee employee : teamMember.getTeamMembers()) {
            System.out.println("  " + employee.getName());
        }
        for (ClientEmployee clientEmployee : teamMember.getClientMembers()) {
            System.out.println("  " + clientEmployee.getName());
        }
    }
    public void printEmails(){
        System.out.println("Emails for Project" + ProjectTopic+":");
        for (Email email : emails){
            System.out.println(" "+email.getSubject());
        }
    }
    // Static method to create a new project with a new team
    public static Project createNewProject(String ProjectTopic) {
        TeamMember newTeam = TeamMember.createNewTeam();
        return new Project(ProjectTopic, newTeam);
    }
}
   
   /* @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Project Topic: ").append(ProjectTopic).append("\n");
        sb.append("Team Members:\n");
        sb.append("Employees:\n");
        for (Employee employee : teamMember.getTeamMembers()) {
            sb.append("  ").append(employee.getName()).append("\n");
        }
        sb.append("Client Employees:\n");
        for (ClientEmployee clientEmployee : teamMember.getClientMembers()) {
            sb.append("  ").append(clientEmployee.getName()).append("\n");
        }
        
        return sb.toString();         
  
    }*/



         //public Project(String ProjectTopic, List<Employee> employees, List<ClientEmployee> clientEmployees) {
     //this.ProjectTopic = ProjectTopic;
           //if (employees.size() != 3 || clientEmployees.size() != 3) {
          //  throw new IllegalArgumentException("A project must have exactly 3 employees and 3 client employees.");
        
    
       
     //this.teamMember = new TeamMember(employees ,clientEmployees);
    

