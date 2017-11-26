package homework.tasks.seventh;

import java.util.*;

public class Library {

    private List<Book> books = new ArrayList<Book>();


    public void addBook(Book book) {
        books.add(book);
    }

    //remove all books with that title or author.
    // Iterator is required because we modify abd iterate the collection at the same time.

    public void removeBooks(String request) {
        for (Iterator<Book> iterator = books.iterator(); iterator.hasNext(); ) {
            Book bk = iterator.next();
            if (bk.getTitle().equals(request) || bk.getAuthor().equals(request)) {
                iterator.remove();
            }
        }
    }

    public List<Book> searchBooks(String request) {     //returns list of books with that title or author

        List<Book> temp = new ArrayList<Book>();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(request)) {
                temp.add(books.get(i));
            }
        }
        return temp;
    }

    public void printAllBooks() {           //prints all books

        for (Book bk : books
                ) {
            System.out.println(bk);
        }

    }

    public void printSearchResults(List<Book> books) {      //prints unsorted search results

        if (books.isEmpty()) {
            System.out.println("Books not found!");
        } else {
            for (Book bk : books
                    ) {
                System.out.println(bk);
            }
        }
    }


    public void printSearchResults(List<Book> books, boolean sortByPrice) {    //prints search results sorted by price or by year

        if (books.isEmpty()) {
            System.out.println("Books not found!");
            return;
        }

        Comparator<Book> comparator;

        if (sortByPrice) {
            comparator = new PriceComparator();
        } else {
            comparator = new YearPublishedComparator();
        }

        Collections.sort(books, comparator);

        for (Book bk : books
                ) {
            System.out.println(bk);
        }
    }

    public class YearPublishedComparator implements Comparator<Book> {
        public int compare(Book o1, Book o2) {
            int yearPublished1 = o1.getYearPublished();
            int yearPublished2 = o2.getYearPublished();
            if (yearPublished1 < yearPublished2) {
                return -1;
            } else if (yearPublished1 == yearPublished2) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public class PriceComparator implements Comparator<Book> {
        public int compare(Book o1, Book o2) {
            int price1 = o1.getPrice();
            int price2 = o2.getPrice();
            if (price1 < price2) {
                return -1;
            } else if (price1 == price2) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
