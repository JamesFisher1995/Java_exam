
public class grid {
	
public void printGrid2() {
	   int xp = player.xl;
	   int yp = player.yl;
	
	
	    for(int x=0;x<10;x++) {
	    	 
	    	 System.out.println("X");
	    	 for(int y = 0;y<9;y++) {
	    		
	    		if(x==xp & y == yp) {
	    			System.out.print("p");
	    		}
	    		
	    		else {System.out.print("X");}	
	    	 }
	    	 
	    }
}

}
