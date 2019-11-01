//import com.journaldev.java.dependencyinjection.consumer.Consumer;
import java_dependency_injection.consumer.Consumer;
//import com.journaldev.java.dependencyinjection.consumer.MyDIApplication;
import java_dependency_injection.consumer.MyDIApplication;
//import com.journaldev.java.dependencyinjection.service.SMSServiceImpl;
import java_dependency_injection.service.SMSSer;
public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}