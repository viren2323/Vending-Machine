public class VendingMachine {



    private static VendingMachine vendingMachine;

    Inventory inventory;

    private VendingMachineState idle;

    private VendingMachineState ready;

    private VendingMachineState dispense;

    private VendingMachineState returnChange;

    private VendingMachineState currentState;

    private Product selectProduct;

    private double totalPrice;

    private VendingMachine() {

        idle = new Idle(this);

        ready = new Ready(this);

        dispense =new Dispense(this);

        returnChange = new ReturnChangeState(this);

        currentState=idle;

        inventory =new Inventory();

        selectProduct = null;

        totalPrice = 0.0;

    }

    public static VendingMachine getVendingMachine() {

        if(vendingMachine == null){

            vendingMachine =new VendingMachine();

        }

        return vendingMachine;

    }

    public void selectProduct(Product product){

        currentState.selectProduct(product);

    }

    public void insertNote(Note note){

        currentState.insertNote(note);

    }

    public void dispense(){

        currentState.dispense();

    }

    public void returnChange(){

        currentState.returnChange();

    }

    void setCurrentState(VendingMachineState state){

        currentState=state;

    }

    public VendingMachineState getIdle() {

        return idle;

    }

    public VendingMachineState getReady() {

        return ready;

    }

    public VendingMachineState getDispense() {

        return dispense;

    }

    public VendingMachineState getReturnChange() {

        return returnChange;

    }

    public Product getSelectProduct() {

        return selectProduct;

    }

    public void setSelectProduct(Product selectProduct) {

        this.selectProduct = selectProduct;

    }

    void resetSelectedProduct(){

        this.selectProduct =null;

    }

    public double getTotalPrice() {

        return totalPrice;

    }

    void addNote(Note note){

        totalPrice += note.getValue();

    }

    void resetPrice(){

        totalPrice=0.0;

    }

}


















































