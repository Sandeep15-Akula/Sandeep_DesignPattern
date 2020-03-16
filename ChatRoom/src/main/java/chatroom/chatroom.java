package chatroom;

import java.util.Date;

public class chatroom {
   public static void showMessage(User user, String message){
	   System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);    
   }
}