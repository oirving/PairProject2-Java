import bean.Word;
import until.AdvancedWordCount;

//import bean.CommandLine;
//import until.Command;

public class Main {
	public static void main(String[] args) {
//		Command command = new Command();
//		CommandLine commandLine = command.ParseCommand(args);

		AdvancedWordCount advancedWordCount = new AdvancedWordCount();
		System.out.println("characters: " + advancedWordCount.characterCount("input.txt"));
		System.out.println("words: " + advancedWordCount.wordCount("input.txt"));
		System.out.println("lines: " + advancedWordCount.lineCount("input.txt"));
		Word word[] = advancedWordCount.topKWordsWeighting("input.txt", 3,10, false);
		for(int i = word.length - 1; i >= 0; i--) {
			System.out.print("<"+word[i].getKey()+">: "+word[i].getCountNum()+"\r\n");
		}
		

	}
}
