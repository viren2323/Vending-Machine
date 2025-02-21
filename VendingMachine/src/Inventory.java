import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {



    private final Map<Product,Integer> productList;

    public Inventory(){

        productList = new ConcurrentHashMap<>();

    }

    public void addProduct(Product product,int quantity){

        productList.put(product,quantity);

    }

    public void removeProduct(Product product){

        productList.remove(product);

    }

    public void updateQuantity(Product product,int quantity){

        if(quantity ==0){

            System.out.println(product +" is out of stock ");

        }

        productList.put(product,quantity);

    }

    public boolean isAvailaible(Product product){

        if(productList.get(product)==0){

            System.out.println(product.getName() +" is out of stock !Please add stock to continue the process ");

        }

        return productList.containsKey(product) && productList.get(product)>0;

    }

    public int getQuantity(Product product) {

        return productList.getOrDefault(product, 0);

    }

    public void displayInventory(){

        for(Map.Entry<Product,Integer> x:productList.entrySet()){

            System.out.println(" product Name is : "+x.getKey().getName() +" product price is : "+x.getKey().getPrice() + " and product quantity is : "+x.getValue());

        }

    }

}






















