public class encry {

	public static void main(String[] args) {
		String message = "declare a string that contains a secret message that is at least xyz characters in length";
		int shift=2;
		char[] encry=message.toCharArray();
		//Encryption
		for (int i = 0; i < encry.length; i++) {
		    char letter = encry[i];
		    if(letter!= ' '){
		    	letter = (char) (letter + shift);
		    	if (letter > 'z') {
		    		letter = (char) (letter - 26);
		    	} 
		    	else if (letter < 'a') {
		    		letter = (char) (letter + 26);
		    	}
		    }
		    else{
		    	letter=' ';
		    }
		    encry[i] = letter;
		}
		String secret = new String(encry);
		System.out.printf("Encrypted message: %s%n",secret);
		
		//Decryption
		char[] decry=secret.toCharArray();
		for (int i = 0; i < decry.length; i++) {
		    char letter2 = decry[i];
		    if(letter2 != ' '){
		    	letter2 = (char) (letter2 - shift);
		    	if (letter2 > 'z') {
		    		letter2 = (char) (letter2 - 26);
		    	} else if (letter2 < 'a') {
		    		letter2 = (char) (letter2 + 26);
		    	}
		    }
		    else{
		    	letter2= ' ';
		    }
		    decry[i] = letter2;
		}
		String obvious = new String(decry);
		System.out.printf("Decrypted message: %s%n",obvious);

	}

}
