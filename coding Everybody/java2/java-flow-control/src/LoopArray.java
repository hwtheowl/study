
public class LoopArray {

	public static void main(String[] args) {
		/*
		 * <li>hwtheowl</li>
		 * <li>egoing</li>
		 * <li>jinhuck</li>
		 */
				
		String[] users = new String[3];
		users[0] = "hwtheowl";
		users[1] = "egoing";
		users[2] = "jinhuck";
		
		for(int i=0; i<users.length; i++) {
			if(i != 2) {
				System.out.println(users[i]+",");
			} else {
				System.out.println(users[i]);
			}
			
		}
		
	}

}
