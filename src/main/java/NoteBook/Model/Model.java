package NoteBook.Model;

import NoteBook.Model.Entity.NoteBookItem;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public class Model {
    private static final int INT = 1000;
    private static NoteBookItem[] noteBook = new NoteBookItem[INT];
    private static int itemQuantity;

    public Model() {
        noteBook = new NoteBookItem[INT];
    }

    public void addItem(){
        NoteBookItem noteBookItem = new NoteBookItem();
        if (itemQuantity == INT) {
            noteBook[itemQuantity++] = noteBookItem;
        }
    }


}
