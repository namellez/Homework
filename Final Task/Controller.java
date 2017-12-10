package homework.tasks.sixth;

import java.util.Scanner;

public class Controller {

    final Notepad notepad = new Notepad();
    private boolean running = true;


    public void start() {

        while (running) {

            System.out.println("Select your action: " +
                    "\n1: Add a new note" +
                    "\n2: Find a note" +
                    "\n3: Remove a note" +
                    "\n4: Remove all notes" +
                    "\n5: Print all notes" +
                    "\n6: Quit app" +
                    "\n>: ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    findNote();
                    break;
                case 3:
                    removeNote();
                    break;
                case 4:
                    removeAllNotes();
                    break;
                case 5:
                    printAllNotes();
                    break;
                case 6:
                    quit();
                    break;
                default:
                    System.out.println("Invalid option! Try again!\n");
                    break;
            }
        }

    }

    private void addNote() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your text: ");
        notepad.addNote(sc.nextLine());
    }

    private void findNote() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your search request: ");
        notepad.findNote(sc.nextLine());
    }

    private void removeNote() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of the note to be removed: ");
        notepad.removeNote(sc.nextInt());
    }

    private void removeAllNotes() {
        notepad.removeAllNotes();
    }

    private void printAllNotes() {
        notepad.printAllNotes();
    }

    private void quit() {
        running = false;
        System.out.println("App closed");
    }
}
