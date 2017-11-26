package homework.tasks.sixth;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> booksAsString;
        List<Book> booksAsObj;
        Reader reader = new Reader();

        booksAsString = reader.readFile();              //read file and put all boks into String array
        booksAsObj = reader.parseFile(booksAsString);   //read String array and convert it into <Book> array
        reader.printBooks(booksAsObj);                  //print <Book> array
    }
}
