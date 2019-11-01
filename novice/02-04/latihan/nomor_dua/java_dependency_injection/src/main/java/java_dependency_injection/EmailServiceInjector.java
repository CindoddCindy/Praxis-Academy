package java_dependency_injection;
//import com.journaldev.java.dependencyinjection.consumer.Consumer;
import java_dependency_injection.consumer.Consumer;
//import com.journaldev.java.dependencyinjection.consumer.MyDIApplication;
import java_dependency_injection.consumer.MyDIApplication;

//import com.journaldev.java.dependencyinjection.service.EmailServiceImpl;

import java_dependency_injection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}