public interface VendingMachineState {

    void selectProduct(Product product);

    void insertNote(Note note);

    void dispense();

    void returnChange();


}
