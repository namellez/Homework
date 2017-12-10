package homework.tasks.sixth;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Notepad {

    private String FILENAME;
    File f;


    public Notepad() {
        this.FILENAME = "D:\\test\\filename.txt";
        f = new File(FILENAME);
    }

    public Notepad(String filename) {
        this.FILENAME = filename;
        f = new File(FILENAME);
    }

    public void addNote(String text) {


        Note note = new Note(text);

        try {
            BufferedWriter bw;
            FileWriter fw;

            fw = new FileWriter(FILENAME, true);
            bw = new BufferedWriter(fw);

            bw.write(note.toString());
            bw.newLine();

            bw.close();
            fw.close();
            System.out.println("Note created!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeNote(int number) {

        String readLine;
        int count = 0;
        List<String> array = new ArrayList<String>();

        try {
            BufferedReader b = new BufferedReader(new FileReader(f));

            while ((readLine = b.readLine()) != null) {

                if (count != number) {
                    array.add(readLine);
                }
                count++;
            }

            if (count < number) {
                System.out.println("There is no note with that number\n");
            } else {
                System.out.println("The note has been removed!\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        removeAllNotes();

        for (String str : array
                ) {
            try {
                BufferedWriter bw;
                FileWriter fw;

                fw = new FileWriter(FILENAME, true);
                bw = new BufferedWriter(fw);

                bw.write(str);
                bw.newLine();

                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void removeAllNotes() {

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.print("");
        writer.close();
    }

    public void findNote(String request) {

        String readLine;
        int count = 0;

        try {
            BufferedReader b = new BufferedReader(new FileReader(f));

            while ((readLine = b.readLine()) != null) {

                if (readLine.contains(request)) {
                    System.out.println("Here is your result: \n" + readLine + "\n");
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("No results found for " + "'" + request + "'\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void printAllNotes() {

        String readLine;

        try {
            BufferedReader b = new BufferedReader(new FileReader(f));

            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
            }
            System.out.println("All notes have been printed!\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
