package generation.italy.shop;

import java.util.Random;

public class Prodotto {  
    
	   // instance variables  
	   int code;  
	   String name;
	   String description;
	   int price;
	   int iva = 20;
	   
	   Random rcode = new Random();
	   
	   public Prodotto(String name, String description, int price) {
		   
		this.code = rcode.nextInt(99999);
		this.name = name;
		this.description = description;
		this.price = price;
	   }
	   
	   /* primo metodo */
	   
	   public int price () {
		      return price;
	   }
	   
	   /* secondo metodo */
	   
	   public int priceTax () {   
		      int tax = price * 20 / 100;
		      return tax + price;
	   }
	   
	   /* terzo metodo */
	   
	   public String toString () {   
		      return "Il codice del prodotto è: " + this.code + "\nIl prodotto in questione è: " + this.name + "\nFa parte della categoria: " + this.description + "\nIl prezzo è di: " + priceTax(); 
	   } 
	   
	   
   
	  
	   
} 
