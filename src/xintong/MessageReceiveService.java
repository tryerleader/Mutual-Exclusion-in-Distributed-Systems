package xintong;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MessageReceiveService {
	Node node=null;
	private static MessageReceiveService instance = new MessageReceiveService();
	protected List<IreceiveMessage> listenerList = new CopyOnWriteArrayList<IreceiveMessage>();
	
	public static MessageReceiveService getInstance(){		
		return instance;
	}
	/**
	 * connect MessageReceiveService with node
	 * @param node
	 * @throws IOException
	 */
	public void connectNode(Node node) throws IOException{
		this.node=node;

	}
	
	/**
	 * receive message from network socket
	 * @param msg
	 * @param ippaddress
	 */
	public  void receive(String msg,String ippaddress){
		int channelID = parseIpaddr(ippaddress);
	
		for(IreceiveMessage obj:listenerList){
			obj.receive(msg, channelID);
		}
	}
	
	/**
	 * register to the message receive event.
	 * @param obj
	 */
	public void register(IreceiveMessage obj){
		listenerList.add(obj);
	}
	
	/**
	 * unregister from receiving any coming message
	 * @param obj
	 */
	public void unregister(IreceiveMessage obj){
		listenerList.remove(obj);
	}
	
	/**
	 * parse the ippaddress to corresponding channelid which contains the ip as remote node
	 * @param ippaddress
	 * @return
	 */
	public int parseIpaddr(String ippaddress){
		
		n\
		
		
	}
	
	
	

}
