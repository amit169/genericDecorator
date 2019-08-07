package com.uae.nbd.patterns.GenericDecoratorSample;

import java.util.function.Function;
import java.util.stream.Stream;

public class BasicLogger implements ILoggerDecorator {

private Function<ILoggerDecorator,ILoggerDecorator> logger;

public BasicLogger(Function<ILoggerDecorator,ILoggerDecorator>... logtypes){
    logger = Stream.of(logtypes).reduce(Function.identity(),Function::andThen);
}

@Override
public void createLogger (){
    System.out.println("Basic Logger Created... ");
    logger.apply(this);
}

}
