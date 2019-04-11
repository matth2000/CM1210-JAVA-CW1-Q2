import java.io.*;

public class Encrypt{
	public static void main(String[] args) {
		if (args.length == 1){
			System.err.println("One argument expected!");
			System.exit(1);
		}
		InputStream in = null;
		int i;
		char c;
		String enString = "";
		String newString = "";
		try{
			in = new FileInputStream("secret.dat");
			while((i = in.read()) != -1){
				c = (char) i;
				enString = (enString + c);
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally{
			if (in != null){
				try{
					in.close();
				}
				catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		for (int j = 7; j < enString.length(); j++){
			char charAsc = enString.charAt(j);
			int ascii = (int) charAsc;
			int newAscii = 0;
			if (ascii >= 97 && ascii <= 122){
				newAscii = ascii - 1;
				if (newAscii < 97){
					newAscii = 123 - (97 - newAscii);
				}
			}
			else{
				newAscii = ascii;
			}
			newString = newString + (char)newAscii;
		}
		System.out.println(newString);
	}

}
