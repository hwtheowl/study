
public class AuthApp3 {

	public static void main(String[] args) {
		
//		String[] users = {"hwtheowl", "egoing", "jinhuck"};
		String[][] users = {
				{"hwtheowl", "1111"},
				{"egoing", "2222"},
				{"jinhuck", "3333"}
		};
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(
					current[0].equals(inputId) && 
					current[1].equals(inputPass)
			) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you?");
		}

	}

}