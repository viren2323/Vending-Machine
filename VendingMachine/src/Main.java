//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



     public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("Hello and welcome to JAAT Coding Land");

        VendingMachine vendingMachine = VendingMachine.getVendingMachine();

        Product coke = new Product("coke",10);

        Product limeWater= new Product("limeWater",20);

        Product water = new Product("water",15);

        vendingMachine.inventory.addProduct(coke,4);

        vendingMachine.inventory.addProduct(limeWater,3);

        vendingMachine.inventory.addProduct(water,6);

        System.out.println("======================================================");

        vendingMachine.inventory.displayInventory();

        System.out.println("======================================================");

// / select product

        vendingMachine.selectProduct(limeWater);

// insert note

        vendingMachine.insertNote(Note.TWENTY);

        vendingMachine.selectProduct(limeWater);

        vendingMachine.insertNote(Note.TWENTY);

        vendingMachine.selectProduct(limeWater);

        vendingMachine.insertNote(Note.TWENTY);

        System.out.println("======================================================");

        vendingMachine.inventory.displayInventory();

        System.out.println("======================================================");

    }

}

