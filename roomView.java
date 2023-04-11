//Monday, April 10th 2023 Room View
import java.util.*;
public class roomView {
	public static void main(String[] args) {
		String username; //this is an arbitrary value that will be changed later, just used as a placeholder
	        
	        while (true) { //Change to while view is room 
	            // Display chat room view
	            // Prompt for user input
	            Scanner scnr = new Scanner (System.in);
	            String input = scnr.next(); // Read user input
	            
	            if (input.startsWith("/")) {
	                // If input starts with '/', treat as command
	                String[] command = input.split("\\s+"); // Parse command from input
	                
	                switch (command[0]) {
	                    case "/list":
	                        // Returns a list of users currently in this chat room.
	                    	System.out.println("Here are the current users logged into this chat room: ");
	                        break;
	                    case "/leave":
	                        // Exits the chat room
	                    	System.out.println("You have exited the chat room.");
	                    	scnr.close();
	                        break;
	                    case "/history":
	                        // Prints all past messages for the room
	                    	System.out.println("Here are all of the past messages sent in this chat room: ");
	                        break;
	                    case "/help":
	                    	// Prints the list of available commands
	                    	System.out.println("/list shows all users currently in the room.");
	                    	System.out.println("/leave allows you to leave the chat room.");
	                    	System.out.println("/history displays all past messages for the room.");
	                    	System.out.println("/help displays all available commands.");
	                        break;
	                    default:
	                        System.out.println("Sorry! That's an invalid comand! Try again.");
	                        break;
	                }
	            } else {
	                // Treat input as chat message
	                System.out.println(username + ": " + input); //Check with team to see what to use for username variable 
	            }
	        }
	    }
	    
	    // Implement methods to handle various commands, if needed
	}
