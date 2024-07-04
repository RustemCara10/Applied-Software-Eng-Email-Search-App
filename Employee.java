package aseemailsearch;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rcara
 */
public class Employee implements UserType{
    private int id;
    private String name;
    private String surname;
    private int beenz;
    
    public Employee(int id, String name, String surname, int beenz) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.beenz = beenz;
        
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

    public void setBeenz(int beenz) {
        this.beenz = beenz;
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

    public int getBeenz() {
        return beenz;
    }

    public static List<Employee> createEmployees() {
        List<Employee> employees = new ArrayList<>();
        
        // Adding 3 employees with their details
        employees.add(new Employee(1, "Rustem", "Cara", 0 ));
        employees.add(new Employee(2, "Izabela", "Rosiak", 0 ));
        employees.add(new Employee(3, "Irisi", "Cara", 0)); 
        employees.add(new Employee(4, "Dejvid", "Cara", 0)); 
        employees.add(new Employee(5, "Arber", "Cara", 0)); 
        return employees;
    }
    public void openEmail(Email email){
        if(!email.isOpened()){
            this.beenz++;
            email.setOpened(true);
            
            System.out.println("Email opened by " + name + " " + surname);
        } else {
            System.out.println("Email is already opened by " + name + " " + surname);
        }
    }

    @Override
    public String getRole() {
   return "Employee";
    }

}

  
    

