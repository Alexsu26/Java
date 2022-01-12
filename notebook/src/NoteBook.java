import java.util.ArrayList;
import java.util.HashSet;

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {
        notes.add(s);
    }

    public void add(String s, int index) {
        notes.add(index, s);
    }

    public int getSize() {
        return notes.size();
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
/*
        for( int i = 0; i<notes.size(); i++)
        {
            a[i] = notes.get(i);
        }
*/
        notes.toArray(a);
        return a;
    }

    public String toString() {
        return notes.toString();
    }

    public static void main(String[] args) {
        NoteBook nb = new NoteBook();
        nb.add("first");
        nb.add("second");
        System.out.println(nb.getSize());
        nb.add("third", 2);
        nb.removeNote(0);
        String[] a = nb.list();
        for (String s : a) {
            System.out.println(s);
        }
        System.out.println("---------------");
        nb.add("second");
        System.out.println(nb);

        System.out.println("---------------");
        HashSet<String> s = new HashSet<>();
        s.add("first");
        s.add("second");
        s.add("first");
        System.out.println(s);
    }
}
