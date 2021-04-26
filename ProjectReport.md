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

Challenge #3 discusses using java streams instead of a for loop using a string
builder. I streamed the results to the higher order function map in order to apply
a function to each of the elements. These elements were then joined with a java
collector, with the joiner being "\n".

## Reflection Question #1: Functional vs OO

The iterative approach that was originally in the program used a StringBuilder,
a mutable string of characters. I then changed this to a list
stream and used the higher-order function map in order to return a stream of
results that are then applied to the format that I created in 
BetterRevisionFormatter. The StringBuilder that was originally in the program
would take the revision responses and append them together, as well as appending
a new line onto the end of each response. Instead, the stream will take the responses
and map them within the format that was created in BetterRevisionFormatter,
collect them together and join them with a new line. Both create a list of responses,
but the stream is able to be done on a single line of code rather than requiring
a for loop.

## Reflection Question #2: Polymorphism and Dependency Inversion

Originally in the project, polymorphism can be seen with the QueryEngine
interface. Any implementation where this interface is in the program shares the 
same method signature in its definition. In the interface that I created, 
Formatter, there has only one method defined, format. Every class that implements 
Formatter will also define a method with the same signature. I also injected the 
dependency into the WikipediaAnalyzer class, which allows guice to inject the 
dependent modules at runtime.