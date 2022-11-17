package generation.italy.shop;

public class Main {
	 public static void main(String[] args) {  
		 Prodotto p1 = new Prodotto("orologio" , "fashion", 120);
	 
		System.out.println("The price is: "+ p1.price());
		System.out.println("The price with taxes is : "+ p1.priceTax());
		System.out.println( p1.toString());
	 }
	 
}
