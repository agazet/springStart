package aga.app.runner.console;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aga.app.helloworld.Hello;
import aga.app.lottery.Winner;
import aga.app.runner.Printer;
import aga.app.springconfig.AppConfig;

public class AppRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
		
		Printer helloPrinter = context.getBean("hello", Hello.class);
		Printer winner = context.getBean("winner", Winner.class);
		
		helloPrinter.print();
		winner.print();
		
		context.close();
	}

}
