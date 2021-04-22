# Project Report

Jake Chappell

## Challenge #1 Complete

Challenge #1 discusses changing the guice configuration to ensure
the application uses the real WikipediaQueryEngine instead of the fake. The 
QueryEngineModule class had an instance in which the QueryEngine interface was binded 
to FakeQueryEngine. I changed the instance of FakeQueryEngine to WikipediaQueryEngine to 
make sure the interface binds to the real engine.

## Challenge #2 Complete

Challenge #2 discusses making a new revision formatter that presents the information
on revisions in a more user-friendly way, as well as incorporating it into the 
application in a way that allows for the dependency to oppose the flow of execution. 
I created the BetterRevisionFormatter class that presents the data in the format of 
"User %s updated an entry at %s". This format is much more presentable and makes 
for easy viewing. I also created the Formatter interface that is implemented by all
formatters and injected the module created in the QueryEngineModule class that binds 
Formatter to the BetterRevisionFormatter class in the WikipediaAnalyzer class. I also 
created the BetterRevisionTest class, in which I wrote a few tests to validate the 
output of the new revision formatter.

## Challenge #3 Complete

(Explain your solution to Challenge #3. If it is not complete, change
the subsection title above to "Incomplete" and explain how far you got
and where you got stuck.)

## Reflection Question #1: Functional vs OO

(Write one or more paragraphs comparing and contrasting the iterative and functional  
approaches to string concatenation you explored in challenge #3. Which do you
prefer, and why?)

## Reflection Question #2: Polymorphism and Dependency Inversion

(Explain how polymorphism engendered dependency inversion in this little
application. Be clear and precise here, as this is, in part, an assessment of
your correct use of technical terminology.
Consider, for example, where exactly is polymorphism used?
Where exactly is a dependency inverted?)

