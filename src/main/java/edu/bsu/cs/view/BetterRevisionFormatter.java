package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;
import java.time.format.DateTimeFormatter;

public final class BetterRevisionFormatter implements Formatter{
    public String format(Revision revision){
        return String.format("User %s updated an entry at %s",
                revision.name,
                DateTimeFormatter.ISO_INSTANT.format(revision.timestamp));
    }
}
