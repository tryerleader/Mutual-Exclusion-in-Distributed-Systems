package leo;

import leo.Message.Message;
import leo.Message.MessageNodeID;
import leo.Message.MessageOk;

public class MessageFactory {
	
	static MessageFactory single = new MessageFactory();
	public static MessageFactory getSingleton(){
		return single;
	}
	
	MessageOk okmsg = new MessageOk();

	public Message getMessageOk(){
		return okmsg;
	}
	
	public Message getMessageNodeID(int id){
		MessageNodeID msg = new MessageNodeID(id);
		return msg;
	}
}
