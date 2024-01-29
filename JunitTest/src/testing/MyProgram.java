package testing;

public class MyProgram {
	
	public int squ(int x) {
		return x * x ;
	}
	
	public int countA(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++ ) {
			if (word.charAt(i) == 'A' || word.charAt(i) == 'a')
				count++ ;
		}
		return count;
	}
}

	

