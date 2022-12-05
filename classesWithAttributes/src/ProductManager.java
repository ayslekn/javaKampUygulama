public class ProductManager

{
    //ürün ile ilgili operasyonlar
    public void Add(Product product){
        //jdbc veri tabanı
        System.out.println("ürün eklendi :"+ product.getName());
    }

}
