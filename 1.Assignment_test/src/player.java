
public class player {
    static int xl = 0;
    static int yl = 0;
    static int health = 100;
    
    
    public static void MoveEast() {
    	xl = xl + 1;
    }
    
    public static void MoveNorth() {
    	yl = yl +1;
    }
    
    public static void MoveSouth() {
    	yl = yl -1;
    }
    
    
    public static void MoveWest() {
    	xl = xl -1;
    }
    public static void beer() {
    	System.out.println("---------------------");
    	System.out.println("you find a beer on the floor and crack it open. you pass out and die. oh dear....game over");
    	
    }
    public static void teleport(){
    	xl = xl +10;
    	System.out.println("---------------------------");
    	System.out.println("the pot has teleported you to the treasure");
    }
    public static void PlayerLook() {
    	if(inventory.MapRequired == false) {
    		System.out.println("---------------------------------------------------");
    		System.out.println("you see an object in the distance, its roughly 5,5 you predict on the compass");
    	}
    	if(inventory.MapRequired == true) {
    		System.out.println("---------------------------------------------------------");
    		System.out.println("you cannot see anymore objects...but there may be mosters");
    	}
    }
    public static void Strike() {
    	crocodile.health1 = health - 100;
    	System.out.print("you strike the monster   the crocodile's health is:" + crocodile.health1 + " and it has died, please continue...");
    }
    
}
