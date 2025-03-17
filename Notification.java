/**
 * A notification sent from the OFWB system to a participant or trainer. Recipients can view their notifications when they access the system. In the real system, notifications may also be sent using external tools such as emails or SMS messaging.
 */
public class Notification {

	private Person recipient;
	private DateAndTime timeSent;
	private boolean read;
	/**
	 * The content of the notification.
	 */
	private string messageBody;

}