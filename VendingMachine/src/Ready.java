public class Ready implements VendingMachineState{



    private final VendingMachine vendingMachine;

    public Ready(VendingMachine vendingMachine){

        this.vendingMachine=vendingMachine;

    }

    @Override

    public void selectProduct(Product product) {

        System.out.println("Product is Already Selected , Please make the payment ");

    }

    @Override

    public void insertNote(Note note) {

        vendingMachine.addNote(note);

        System.out.println("Note inserted: " + note);

        if(checkPaymentStatus()){

            vendingMachine.dispense();

        }

    }

    @Override

    public void dispense() {

        System.out.println("Please make payment first.");

    }

    @Override

    public void returnChange() {

        System.out.println("Please make payment first.");

    }

    private boolean checkPaymentStatus(){

        if(vendingMachine.getTotalPrice()>=vendingMachine.getSelectProduct().getPrice()){

            vendingMachine.setCurrentState(vendingMachine.getDispense());

            return true;

        }

        else{

            System.out.println("Insufficent fund please add more fund ");

            return false;

        }

    }

}








