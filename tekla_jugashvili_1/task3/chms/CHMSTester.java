package chms;

public class CHMSTester {
    public static void main(String[] args) {
        Craft craft1 = new Craft();
        craft1.setName("Svaneti Carpet");
        craft1.setDescription("A traditional Svaneti carpet with intricate patterns.");
        craft1.setRegion("Svaneti");

        Craft craft2 = new Craft();
        craft2.setName("Khachapuri Cheese");
        craft2.setDescription("A cheese made from cow's milk in the Khachapuri region.");
        craft2.setRegion("Khachapuri");

        CHMS chms = new CHMS();

        chms.addCraft(craft1);
        chms.addCraft(craft2);

        chms.removeCraft(craft1);

        chms.printStorage();
    }
}
