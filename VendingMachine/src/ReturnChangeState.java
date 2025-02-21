public class ReturnChangeState implements VendingMachineState{



    private final VendingMachine vendingMachine;

    public ReturnChangeState(VendingMachine vendingMachine){

        this.vendingMachine=vendingMachine;

    }

    @Override

    public void selectProduct(Product product) {

        System.out.println("the product is already selected , please take your change");

    }

    @Override

    public void insertNote(Note note) {

        System.out.println("the payment is already done, please take your change");

    }

    @Override

    public void dispense() {

        System.out.println("the product is already dispense, please take your change");

    }

    @Override

    public void returnChange() {

        double change=vendingMachine.getTotalPrice() - vendingMachine.getSelectProduct().getPrice();

        if(change>0){

            System.out.println("Change returned: " + change);

            vendingMachine.resetPrice();

        }

        else{

            System.out.println("No change to return.");

        }

        vendingMachine.resetSelectedProduct();

        vendingMachine.setCurrentState(vendingMachine.getIdle());

    }

}














