package com.ituple.logging.appender.nosql;
 
public class Main {
 
    public static void main( String[] args ) {
        TestService service = new TestService();
        service.retrieveMessage();
        service.retrieveMessage();
       // service.exampleException();
    }
}