package chms;

import java.util.ArrayList;
import java.util.List;

public class CHMS {
    private List<Craft> storage = new ArrayList<>();

    public void addCraft(Craft craft) {
        storage.add(craft);
    }

    public boolean removeCraft(Craft craft) {
        return storage.remove(craft);
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (Craft craft : storage) {
                System.out.println(craft);
            }
        }
    }
}
