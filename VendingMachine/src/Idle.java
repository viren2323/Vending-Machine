public class Idle implements VendingMachineState {



    private final VendingMachine vendingMachine;

    public Idle(VendingMachine vendingMachine){

        this.vendingMachine=vendingMachine;

    }

    @Override

    public void selectProduct(Product product) {

        if(vendingMachine.inventory.isAvailaible(product)){

            vendingMachine.setSelectProduct(product);

            vendingMachine.setCurrentState(vendingMachine.getReady());

            System.out.println("Select Product is : "+ product.getName());

        }

        else{

            // emplement the notifaction here

            System.out.println("Product not available: " + product.getName());

        }

    }

    @Override

    public void insertNote(Note note) {

        System.out.println("Please select the product first ");

    }

    @Override

    public void dispense() {

        System.out.println("No product to dispense at this State");

    }

    @Override

    public void returnChange() {

        System.out.println("No change to return at this State");

    }

}

