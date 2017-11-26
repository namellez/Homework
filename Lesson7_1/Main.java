package homework.tasks.seventh;

public class Main {

    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook(new Book("War and Peace", "Tolstoy", 1812, 15));
        lib.addBook(new Book("Java 8", "Shcmidt", 2008, 25));
        lib.addBook(new Book("Generation P", "Pelevin", 2011, 10));
        lib.addBook(new Book("Thunder", "Chekov", 1900, 10));
        lib.addBook(new Book("Idiot", "Dostoevsky", 1860, 12));
        lib.addBook(new Book("Moron", "Dostoevsky", 1873, 18));
        lib.addBook(new Book("Fool", "Dostoevsky", 1867, 120));
        lib.addBook(new Book("Cretin", "Dostoevsky", 1859, 16));
        lib.addBook(new Book("Dumb", "Dostoevsky", 1880, 10));
        lib.addBook(new Book("Stupid", "Dostoevsky", 1860, 14));


        lib.printSearchResults(lib.searchBooks("Dostoevsky1"), true);
        System.out.println("--------------------------------");
        lib.printSearchResults(lib.searchBooks("Dostoevsky1"), false);

    }
}


//В приложении Library добавить возможность поиска книг определенного автора с их сортировкой 1) по стоимости, 2) по дате выхода.