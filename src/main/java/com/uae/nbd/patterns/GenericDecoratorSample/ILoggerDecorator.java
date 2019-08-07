package com.uae.nbd.patterns.GenericDecoratorSample;

@FunctionalInterface
public interface ILoggerDecorator {

    public void createLogger();

    default public ILoggerDecorator logEvent(){
        System.out.println("logevent...");
        return this;
    }

    default public ILoggerDecorator addTraceing(){
        System.out.println("added tracing...");
        return this;
    }

    default public ILoggerDecorator enableDebug(){
        System.out.println("Debug enabled...");
        return this;
    }

    default public ILoggerDecorator setTraceID(String traceID){
        System.out.println("Debug enabled..." + traceID);
        return this;
    }

}
