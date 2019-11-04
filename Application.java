import java.util.*;
import java.io.*;

public class Application {
  public static void main(String[] args){
    DuplicateRemover rem = new DuplicateRemover();
    System.out.println(System.getProperty("user.dir"));

    rem.remove("problem1.txt");
    rem.write("unique_word.txt");
}
