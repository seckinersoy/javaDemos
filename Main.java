package classesWithAttributes;


public class Main {
	 public static void main(String[] args) {
	        Product product = new Product();
	        product.setId(1);
	        product.setName("Laptop");
	        product.setDescription("Asus Laptop");
	        product.setPrice(5000);
	        product.setStockAmount(3);
	        ProductManager productManager = new ProductManager();
	        productManager.add(product);

	        System.out.println(product.getCode());

	        Product product2 = new Product(2, "Mouse", "Asus Mouse", 250, 5);
	        productManager.add(product2);
	    }
	
}

	
	
