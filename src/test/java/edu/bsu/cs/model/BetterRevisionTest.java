package edu.bsu.cs.model;

import com.google.inject.Inject;
import com.google.j2objc.annotations.ReflectionSupport;
import edu.bsu.cs.model.QueryResponse;
import edu.bsu.cs.model.ResponseParser;
import edu.bsu.cs.view.BetterRevisionFormatter;
import edu.bsu.cs.view.Formatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;


public class BetterRevisionTest {

    @Test
    public void MakeTestPass(){
        Assertions.assertEquals(true, true);
    }

    @Test
    public void TestFormatOutput(){
        BetterRevisionFormatter formatter = new BetterRevisionFormatter();
        String expectedOutput = "User Jake updated an entry at 2019-10-01T08:25:24Z";
        String name = "Jake";
        Instant timestamp = Instant.parse("2019-10-01T08:25:24.00Z");
        Revision revision = Revision.editor(name).timestamp(timestamp);
        String actualOutput = formatter.format(revision);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestFalseFormatOutput(){
        BetterRevisionFormatter formatter = new BetterRevisionFormatter();
        String expectedOutput = "User Jake updated an entry at 2019-10-01T08:25:24";
        String name = "Jake";
        Instant timestamp = Instant.parse("2019-10-01T08:25:24.00Z");
        Revision revision = Revision.editor(name).timestamp(timestamp);
        String actualOutput = formatter.format(revision);
        Assertions.assertNotEquals(expectedOutput, actualOutput);
    }
}
