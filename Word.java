public class Word
{
    private String wordsInTextFile;
    private int wordsCount;
    private Word nextNode;
   
    public Word() 
    {
    }

    public Word(String wordsInTextFile, int wordsCount, Word nextNode) {
        this.wordsInTextFile = wordsInTextFile;
        this.wordsCount = wordsCount;
        this.nextNode = nextNode;
    }

    public String getWordsInTextFile() {
        return wordsInTextFile;
    }

    public void setWordsInTextFile(String wordsInTextFile) {
        this.wordsInTextFile = wordsInTextFile;
    }

    public int getWordsCount() {
        return wordsCount;
    }

    public void setWordsCount(int wordsCount) {
        this.wordsCount = wordsCount;
    }

    public Word getNextNode() {
        return nextNode;
    }

    public void setNextNode(Word nextNode) {
        this.nextNode = nextNode;
    }

    


    
}
