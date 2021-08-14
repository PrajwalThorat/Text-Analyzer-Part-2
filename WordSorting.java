import java.io.FileNotFoundException;
import java.io.IOException;

public class WordSorting {
    TextFileReader wordsList;
    Word startNode;



    public WordSorting() 
    { 
        wordsList = new TextFileReader();
        startNode = wordsList.ToReturnStartAddress();

        
    }

    public void sorting()
    {
        Word currentNode = startNode;
        if(currentNode==null)
        {
            return ;
        }
        else 
        {
        while(currentNode!=null) 
        {
            Word temp=currentNode.getNextNode();
            while(temp!=null)
            {
            int CompareNodePosition= currentNode.getWordsInTextFile().compareTo(temp.getWordsInTextFile());
            if(CompareNodePosition>0)
            {
                String newstr = currentNode.getWordsInTextFile();
                currentNode.setWordsInTextFile(temp.getWordsInTextFile());
                temp.setWordsInTextFile(newstr);
            }
            else{
            temp=temp.getNextNode();
            }
            }
            currentNode=currentNode.getNextNode();

        }
    }
    }

    public void showWordList ()
    {
        Word temp=startNode;
        while(temp!=null)
        {
            System.out.println(temp.getWordsInTextFile());
            temp=temp.getNextNode();
        }
    }


    public void ShowWordsInReverse( )
    {

        Word currentNode = startNode;
        if(currentNode==null)
        {
            return ;
        }
        else 
        {
        while(currentNode!=null) 
        {
            Word temp=currentNode.getNextNode();
            while(temp!=null)
            {
            int CompareNodePosition= currentNode.getWordsInTextFile().compareTo(temp.getWordsInTextFile());
            if(CompareNodePosition>0)
            {
                String newstr = currentNode.getWordsInTextFile();
                currentNode.setWordsInTextFile(temp.getWordsInTextFile());
                temp.setWordsInTextFile(newstr);
            }
            else{
            temp=temp.getNextNode();
            }
            }
            currentNode=currentNode.getNextNode();

        }
    }
      
    }

    

   


    
}

