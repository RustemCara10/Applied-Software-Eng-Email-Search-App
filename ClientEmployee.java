package aseemailsearch;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rcara
 */
public class ClientEmployee implements UserType{
    private int id;
    private String name;
    private String surname;
    

    public ClientEmployee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;

    }

 
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    

    @Override
    public String getRole() {
        return "ClientE";

    }
    public static List<ClientEmployee> createClientEmployees(){
    List<ClientEmployee> clientEmployees = new ArrayList<>(); 
    clientEmployees.add(new ClientEmployee(1,"Daniela","Cara"));
    clientEmployees.add(new ClientEmployee(2,"Avni","Cara"));
    clientEmployees.add(new ClientEmployee(3,"Dava","Cara"));  
    clientEmployees.add(new ClientEmployee(4,"Dyle","Cara"));  
    clientEmployees.add(new ClientEmployee(5,"Rrushe","Cara"));   
    return clientEmployees;
    }
  
}
