public class Product {

    public Product(int id,String name,String description,double price,int stockAmount,String renk){
        System.out.println("yapıcı blok çalıştı.");
        //overloading aşırı yükleme
        this.id=id;
        this.renk=renk;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stockAmount=stockAmount;
    }

    public Product(){};
    //attribute |(veyaa) field
    //public halka açık
    //private özel demek tanımlandığı blokta geçerli
    int id;
    String name;
    String description;
    double price;
    int stockAmount;
    String renk;
    String kod;

    //getter       _ ile olan lar field
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
        //this bu  class demek
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }


}
