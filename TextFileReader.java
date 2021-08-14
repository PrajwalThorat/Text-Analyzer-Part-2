
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader 
{

    private BufferedReader bufferedReader;
    private Word startNode;
    

    public void TextFileReader() throws FileNotFoundException{
        bufferedReader = new BufferedReader(new FileReader("./data/daffodils.txt"));
        startNode=null;
    }

    public Word createWordsList(String wordsInTextFile)
    {
        Word word=new Word();
        word.setWordsInTextFile(wordsInTextFile.toLowerCase());
        word.setWordsCount(1);
        word.setNextNode(null);
        return word;


    }

   
    public void addingWordsToList() throws IOException,FileNotFoundException
    {
        while(true)
        {   
            Word[] word;
            String readEachLine = bufferedReader.readLine();
            //Word[] word;
            if(readEachLine!=null)
            {
           
            readEachLine = readEachLine.replace(";","");
            readEachLine = readEachLine.replace(":","");
            readEachLine = readEachLine.replace(",","");
            readEachLine = readEachLine.replace(".","");
            String[] SeperateWords=readEachLine.split(" ");
            word=new Word[SeperateWords.length];
            for(int i=0;i<word.length;i++)
            {
                word[i]=createWordsList(SeperateWords[i]);
                if(SeperateWords[i].equals(""))
                {
                    continue;
                }else if(startNode ==null)
                {
                    word[i]=startNode;

                }else 
                {
                    Word temp=startNode;
                    int checkDuplicatedWords=0;
                    
                    while(temp.getNextNode()!=null)
                    {
                        int countNumOfWords=1; 
                        if(temp.getWordsInTextFile().equals(word[i].getWordsInTextFile()))
                        {
                            temp.setWordsCount(countNumOfWords++);
                            countNumOfWords++;
                            //break;

                        }
                        temp=temp.getNextNode();

                    }
                    if(checkDuplicatedWords==0)
                    {
                        temp.setNextNode(word[i]);
                    }
               
                }
            }
        }
        else{
            break;
        }
    }
    
}

    

    public void showWordList()
    {
        Word temp =startNode;
        if(temp.getNextNode()!=null)
        {
            System.out.println(temp.getWordsInTextFile());
            temp=temp.getNextNode();
        }

    }


    public Word ToReturnStartAddress()
    {
        return startNode;

    }




    

    
    

}
