public class Main
{ public static void main(String[] args)
{
   Product product=new Product(1,"laptop","asus laptop",3000,2,"siyah");
   //product.setName("laptop");
  // product.setId(1);
  // product.setDescription("asus laptop");
  // product.setPrice(5000);
  // product.setStockAmount(3);

   ProductManager productManager=new ProductManager();
   productManager.Add(product);  //product kullan parantezde

   System.out.println(product.getKod());
    }
}