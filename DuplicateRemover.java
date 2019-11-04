import java.util.*;
import java.io.*;

public class DuplicateRemover {
  public String remove(String dataFile){
    String uniqueWords = "";
    int i;
    int counter = 0;
    int j = 0;
    Filereader file;
    try{
      file = new Filereader(dataFile);
      while((i = file.read()) != -1){
          uniqueWords += (char)i;
      }

    ArrayList<String> arr = new ArrayList<String>;
    for(i = 0; i < uniqueWords.length(); i++){
      if(uniqueWords.charAt(i) == ' '){
        arr.add(uniqueWords.substring(j,i));
        j = i + 1;
      }
    }
    uniqueWords = "";
    for(i = 0; i < arr.size(); i++){
      for(j = 0; j < arr.size(); j++){
        if(arr.get(i) = arr.get(j)){
          counter++;
          if(counter == 2){
            arr.remove(i);
            counter = 0;
          }
        }
      }
      uniqueWords += arr.get(i);
      uniqueWords += " ";
      counter = 0;
    }
    return uniqueWords;
  } catch(FileNotFoundException e){
    System.out.println("File not found");
  } catch (IOException e){
    System.out.println("Input/Output Incorrect");
  } finally {
    System.out.println("File read Successfully.");
  }

  public String write(String outputFile){
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    writer.write(outputFile);
    writer.close;
}
