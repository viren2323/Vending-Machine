public class Dispense implements VendingMachineState{

    private final VendingMachine vendingMachine;

    public Dispense(VendingMachine vendingMachine){

        this.vendingMachine=vendingMachine;

    }

    @Override

    public void selectProduct(Product product) {

        System.out.println("the product is already selected , please take your product");

    }

    @Override

    public void insertNote(Note note){

        System.out.println("the payment is already done , please take your product");

    }

    @Override

    public void dispense() {

        vendingMachine.setCurrentState(vendingMachine.getReady());

        Product p= vendingMachine.getSelectProduct();

        vendingMachine.inventory.updateQuantity(p,vendingMachine.inventory.getQuantity(p)-1);

        System.out.println("Product dispensed: " + p.getName());

        vendingMachine.setCurrentState(vendingMachine.getReturnChange());

        vendingMachine.returnChange();

    }

    @Override

    public void returnChange() {

        System.out.println("please take your product first");

    }

}