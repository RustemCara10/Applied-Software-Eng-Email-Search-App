
package aseemailsearch;

/**
 *
 * @author rcara
 */
public class EmailInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
    
    
}
