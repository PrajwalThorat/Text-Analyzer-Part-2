import java.io.FileNotFoundException;
import java.io.IOException;

public class WordsCountFrequency {
    
TextFileReader textFileReader;
Word startNode;



public  void sortingWordCount() throws IOException,FileNotFoundException
{
    textFileReader = new TextFileReader();
    textFileReader.addingWordsToList();
    startNode = textFileReader.ToReturnStartAddress();
}

public void showFrequentWords()
{
    if(startNode==null)
    {
        return;
    }else
    {
        Word currentNode=startNode;
        while(currentNode!=null)
        {
            Word tempNode=currentNode;
            while(tempNode!=null)
            {
                if(currentNode.getWordsCount()>tempNode.getWordsCount())
                {
                    String name=currentNode.getWordsInTextFile();
                    int count=currentNode.getWordsCount();
                    currentNode.setWordsInTextFile(tempNode.getWordsInTextFile());
                    currentNode.setWordsCount(tempNode.getWordsCount());
                    tempNode.setWordsInTextFile(name);
                    tempNode.setWordsCount(count);
               }
               else if(currentNode.getWordsCount()==tempNode.getWordsCount())
               {
                   int compare=currentNode.getWordsInTextFile().compareTo(tempNode.getWordsInTextFile());
                   if(compare>0)
                   {
                     String name=currentNode.getWordsInTextFile();
                    int count=currentNode.getWordsCount();
                    currentNode.setWordsInTextFile(tempNode.getWordsInTextFile());
                    currentNode.setWordsCount(tempNode.getWordsCount());
                    tempNode.setWordsInTextFile(name);
                    tempNode.setWordsCount(count); 
                   }
               }
               tempNode=tempNode.getNextNode();
            }
            currentNode=currentNode.getNextNode();
        }
    }
}

public void showWordList ()
{
    Word tempNode=startNode;
    while(tempNode!=null)
    {
        System.out.println(tempNode.getWordsInTextFile()+"   "+tempNode.getWordsCount());
        tempNode=tempNode.getNextNode();
    }
}

      


}
