package homework.tasks.sixth;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    final private String fileName = "D:\\BookList.txt";


    public List<String> readFile() throws IOException {

        List<String> books = new ArrayList<>();
        String line;

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            books.add(line);
        }
        bufferedReader.close();

        return books;
    }


    public List<Book> parseFile(List<String> booksAsString) {

        List<Book> booksAsObj = new ArrayList<>();

        for (int i = 0; i < booksAsString.size() - 1; i++) {

            String[] split = booksAsString.get(i).split(", ");

            Book book = new Book();
            book.setTitle(split[0]);
            book.setAuthor(split[1]);
            book.setYearPublished(Integer.parseInt(split[2]));
            book.setPrice(Integer.parseInt(split[3]));
            booksAsObj.add(book);
        }
        return booksAsObj;
    }

    public void printBooks(List<Book> books) {

        for (Book bk : books
                ) {
            System.out.println(bk);
        }

    }

}
