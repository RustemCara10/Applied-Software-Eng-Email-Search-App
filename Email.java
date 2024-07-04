
package aseemailsearch;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rcara
 */
public class Email implements EmailSystem {
    private String subject;
    private String content;
    private List<Attachment> attachments ;
    private boolean opened;

    public Email(boolean opened) {
        this.opened = opened;
    }
    public Email(String subject, String content, List<Attachment> attachment) {
        this.subject = subject;
        this.content = content;
        this.attachments = new ArrayList<>();
        
    }
    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }
    
    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }
    public void addAttachment(String filename , int filesize,byte[]filetype){
    Attachment attachment = new Attachment(filename, filesize,filetype);
    attachments.add(attachment);   
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subject: ").append(subject).append("\n");
        sb.append("Content: ").append(content).append("\n");
        sb.append("Attachments:\n");
        for (Attachment attachment : attachments) {
            sb.append("  ").append(attachment).append("\n");
        }
        return sb.toString(); 
    }
    
     public static List<Email> createEmails() {
        List<Email> emails = new ArrayList<>();

        // Created some example emails
        Email email1 = new Email("Meeting Agenda", "Agenda for the team meeting", null);
        Email email2 = new Email("Project Update", "Latest update on the project", null);
        Email email3 = new Email("Client Presentation", "Presentation for the client meeting", null);
        Email email4 = new Email("Appointment", "Dear all,I hope this email finds you well. We have scheduled a meeting on to discuss "
                + "important matters "
                + "and collaborate on upcoming projects. "
                + "Please find below the agenda for our meeting", null);
        // Added the emails to the list
        emails.add(email1);
        emails.add(email2);
        emails.add(email3);
        emails.add(email4);
        return emails;
    }
    public static void searchEmails(List<Email> emails, String keyword) {
            List<Email> searchResults = searchEmailsInList(emails, keyword);

            if (!searchResults.isEmpty()) {
                System.out.println("Search Results:");
                for (Email result : searchResults) {
                    System.out.println(result);
                }
            } else {
                System.out.println("No emails found matching the search criteria.");
            }
        }

    static List<Email> searchEmailsInList(List<Email> emails, String keyword) {
        // Implement email search logic in the list
        // For example, iterate through emails and find emails containing the keyword
        List<Email> results = new ArrayList<>();
        for (Email email : emails) {
            if (email.getSubject().contains(keyword) || email.getContent().contains(keyword)) {
                results.add(email);
            }
        }
        return results;
    }

    @Override
    public List<Email> searchEmails(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void storeEmail(Email email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
        
    private static class Attachment {
    private String filename;
    private int filesize;
    private byte[]filetype;

        public Attachment(String filename, int filesize, byte[] filetype) {
            this.filename = filename;
            this.filesize = filesize;
            this.filetype = filetype;
        }

        

        
    }
    
}
