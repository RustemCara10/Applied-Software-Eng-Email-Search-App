
package aseemailsearch;
import java.util.List;
import java.util.logging.Logger;
/**
 *
 * @author rcara
 */
public class User {
private static final Logger LOGGER = Logger.getLogger(User.class.getName());    
public String username;
private String password;
 private UserType userType;
    public User(String username, String password,UserType userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }
    public UserType getUserType() {
        return userType;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
 public boolean authenticate(String enteredUsername, String enteredPassword){
    boolean authenticated = username.equals(enteredUsername) && password.equals(enteredPassword);

        if (!authenticated) {
            LOGGER.warning("Authentication failed for username: " + enteredUsername);
        }

        return authenticated;
 } 

    @Override
    public String toString() {
      return "User{username='" + username + "'}";
    }
}
