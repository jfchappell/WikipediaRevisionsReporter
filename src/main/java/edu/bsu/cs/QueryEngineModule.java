package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.model.FakeQueryEngine;
import edu.bsu.cs.model.QueryEngine;
import edu.bsu.cs.model.WikipediaQueryEngine;
import edu.bsu.cs.view.BetterRevisionFormatter;
import edu.bsu.cs.view.Formatter;

import java.time.Duration;

public class QueryEngineModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(QueryEngine.class).to(WikipediaQueryEngine.class);
        bind(Duration.class).toInstance(Duration.ofSeconds(2));
        bind(Formatter.class).to(BetterRevisionFormatter.class);
    }
}
