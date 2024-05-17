import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList; 
public class example {

	public static void main(String[] args) {
		BufferedReader reader;
		//creates array list
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		try {
			reader = new BufferedReader(new FileReader("example.txt"));
			String line = reader.readLine();
			int i = 0;
			while (line != null) {
				//adds to array list
				numbers.add(Integer.parseInt(line));
				line = reader.readLine();
			}
			//adds all numbers of an int together
			int x = 0;
			for(int p = 0; p < numbers.size(); p++){
				x += numbers.get(p);
			}
			System.out.println(String.valueOf(x));
		
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}