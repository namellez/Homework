package homework.tasks.sixth;

import java.io.File;

import static org.junit.Assert.*;

public class NotepadTest {

    String filename = "D:\\test\\test.txt";

    @org.junit.Test
    public void addNote() throws Exception {
        File f = new File(filename);
        Notepad tester = new Notepad(filename);

        long sizeBefore = f.length();
        tester.addNote("test");
        long sizeAfter = f.length();

        assertTrue("File size didn't increase after adding a note!", sizeAfter > sizeBefore);
    }

    @org.junit.Test
    public void removeNote() throws Exception {
        File f = new File(filename);
        Notepad tester = new Notepad(filename);

        tester.addNote("test");
        long sizeBefore = f.length();
        tester.removeNote(0);
        long sizeAfter = f.length();
        assertTrue("File size didn't decrease after removing a note!", sizeAfter < sizeBefore);
    }

    @org.junit.Test
    public void removeAllNotes() throws Exception {
        File f = new File(filename);
        Notepad tester = new Notepad(filename);

        tester.addNote("test");
        tester.addNote("test");
        tester.addNote("test");
        assertTrue("File size isn't > 0 after adding notes", f.length() > 0);

        tester.removeAllNotes();
        assertTrue("File size isn't 0 after removing all notes!", f.length() == 0);

    }
}