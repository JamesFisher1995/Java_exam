import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner start = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String s = start.next(); 
		System.out.println("hello : " + s + " " + "the game is beggining");
		System.out.println("You awaken to find yourself in a barren moor,Grey foggy clouds float oppressively close to you, \r\n" + 
				"\r\n" + 
				"reflected in the murky grey water which reaches up your shins.\r\n" + 
				"\r\n" + 
				"you have the worst possible hangover ");
		compass c = new compass();
		grid i = new grid();
		System.out.println("------------------------------");
		System.out.println("you have a sword in your backpack"  );
		System.out.println("you have a compass in your hand, it says:"  );
		c.HowFar();
		//moving
		do {System.out.println("please enter north or  east or  west or  south or look or quit"  ); 
		String m = start.next(); 
		if(m.equals("north")){
			player.MoveNorth();
			c.HowFar();
			System.out.println("---------------------------");
			}
		if(m.equals("east")) {
			player.MoveEast();
			c.HowFar();
			System.out.println("---------------------------");
		}
		if(m.equals("west")) {
			player.MoveWest();
			c.HowFar();
			System.out.println("---------------------------");
		}
		if(m.equals("south")) {
			player.MoveSouth();
			c.HowFar();
			System.out.println("---------------------------");
		}
		if(m.equals("look")) {
			player.PlayerLook();
			
		}
		if(m.equals("beer'o'clock")) {
			player.beer();
			break;
			
		}
		if(m.equals("map")) {
			if(inventory.MapRequired == true) { 
			i.printGrid2();
			}
			if(inventory.MapRequired == false) { 
				System.out.println("you don't have the map but keep looking");
				}
		}
		if(player.xl== 5 & player.yl==5 & inventory.MapRequired == false) {
			System.out.print("you have found a magic map and put it into your inventory, you can access this by typing map at anytime   ");
			inventory.MapRequired = true;
		}
		if(player.xl == 7 & player.yl == 7)
		{
			System.out.print("a crocadile has appeard with a health of 100    ");
			crocodile.attack();
			System.out.println("type strike to use sword");
			String strike = start.next();
			if(strike.equals("strike")) {
				player.Strike();
				if(crocodile.health1 >0) {
					crocodile.attack();
					
				}
			}
			
		}
		if(player.xl ==0 & player.yl == 10) {
			System.out.println("you find an empty pot");
			System.out.println("it seems to be a portal to another world");
			System.out.println("type enter to see where it goes");
			String enterpot = start.next();
			if(enterpot.equals("enter")) {
				player.teleport();
				
			}
		}
		
		
		if(m.equals("quit")) {
			System.out.println("you quit the game..loser");
			break;
		}
		
		
		if(player.xl == treasure.xt & player.yl == treasure.yt ) {
			System.out.print("you have found the treasure  " + s + "   its bright and gold. it transports you back home");
			treasure.found = true;
		}
		
		}
		while(treasure.found == false);
        
	}

	}

