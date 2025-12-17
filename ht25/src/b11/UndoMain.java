package b11;

public class UndoMain {

    public static void main(String[] args) {

        StringBuilder doc = new StringBuilder("HI1027, Objektorienterad programmering");
        EditCommandManager mgr = new EditCommandManager(doc);

        mgr.execute(new AppendCommand(" HT2025"));
        System.out.println(doc); // HI1027, Objektorienterad programmering HT2025

        mgr.execute(new InsertCommand("Kurs ",0));
        System.out.println(doc); // Kurs HI1027, Objektorienterad programmering HT2025

        mgr.undo();
        System.out.println(doc); // HI1027, Objektorienterad programmering HT2025

        mgr.redo();
        System.out.println(doc); // Kurs HI1027, Objektorienterad programmering HT2025

        mgr.execute(new InsertCommand("-",19));
        System.out.println(doc); // Kurs HI1027, Objekt-orienterad programmering HT2025

        while(mgr.doneSize() > 0) {
            mgr.undo();
            System.out.println(doc);
        }
    }
}
