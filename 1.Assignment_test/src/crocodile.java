
public class crocodile {

	
 	static int health1;
	
	public static void attack() {
		int AttackPower = 10;
		System.out.println("the croc snapped at you causing damage");
		System.out.print("your health:");
		player.health = player.health - AttackPower;
		System.out.println(player.health);
	}

	
	public void health(int health) {
	  int health1 = 100;
	  System.out.print(health1);
	}

}
