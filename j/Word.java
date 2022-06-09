package j;

public class Word {
	private String letters;
	
	public static void main(String[] args) {
		Word word = new Word("hello world~");
		
		for (int i = 0 ; i < word.letters.length() ; i++) {
			System.out.println(i + "번쨰 : " + word.isVowel(i));
		}
	}

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
	// i번째 글자가 모음인지 확인, a,i,u,e,o
	public boolean isVowel(int i) {
		String[] vowel = {"a", "i", "u", "e", "o"};
		for (int j = 0 ; j < vowel.length ; j++) {
			if (letters.subSequence(i, i+1).equals(vowel[j])) {
				return true;
			}
		}
		return false;
	}
}
