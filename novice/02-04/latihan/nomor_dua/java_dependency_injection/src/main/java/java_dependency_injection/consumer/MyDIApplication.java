package java_dependency_injection.consumer;

import java_dependency_injection.service.*;

public class MyDIApplication implements Consumer{

	private MessageService service;
	
	public MyDIApplication(MessageService svc){
		this.service=svc;
	}
	
	@Override
	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
	}

}