package com.uae.nbd.patterns.GenericDecoratorSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericDecoratorSampleApplication implements CommandLineRunner {


	public static void main(String[] args) { SpringApplication.run(GenericDecoratorSampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
     String me = "";
		ILoggerDecorator l;
		l = new BasicLogger(ILoggerDecorator::addTraceing,ILoggerDecorator::enableDebug,ILoggerDecorator::logEvent);
		l.createLogger();


	}

}
