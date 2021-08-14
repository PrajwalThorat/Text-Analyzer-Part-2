import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        Scanner scanner=new Scanner(System.in);
       TextFileReader textFileReader=new TextFileReader();
        WordSorting sort=new WordSorting();
        WordsCountFrequency wordCountFreq=new WordsCountFrequency();
     while(true)
     {
        System.out.println("Enter Choice\n1.Adding Word from File\n2.To alphabetical order\n3.To Reverse Alphabetical order\n4.Frequency of word in ascending order\n5.Exit");
        int choice=scanner.nextInt();
        switch(choice)
        {
            case 1:textFileReader.addingWordsToList();
              textFileReader.showWordList();
              break;
            case 2:sort.sorting();
            sort.showWordList();
            break;
            case 3:sort.ShowWordsInReverse( );
            break;
            case 4:wordCountFreq.showFrequentWords();
             wordCountFreq.showWordList();
             break;
             case 5:System.exit(0);
             break;
        }
    }
   
    }

    
}
