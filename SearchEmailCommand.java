
package aseemailsearch;

import static aseemailsearch.Email.searchEmailsInList;
import java.util.List;

/**
 *
 * @author rcara
 */
public class SearchEmailCommand implements Command{
    private EmailSystemComponent emailSystem;
    private String keyword;
    private List<Email> searchResults;

    public SearchEmailCommand(EmailSystemComponent emailSystem, String keyword) {
        this.emailSystem = emailSystem;
        this.keyword = keyword;
    }

    @Override
    public void execute() {
    this.searchResults = emailSystem.searchEmails(keyword);
    }

    public List<Email> getSearchResults() {
        return searchResults;
    }
    
}
