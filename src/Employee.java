public class Employee {
    protected String prefix;
    protected String title;
    protected int age;
    protected String sex;
    
    public void chekStock(){
        System.out.println("chekstock");
    }
    public void sellProduct(){
        System.out.println("sellproduct");
    }
    public void purchaseProduct(){
        System.out.println("purchaseproduct");
    }
     public static void main (String[] args) {
         Employee sodsai = new Employee();
         System.out.println("object = "+ sodsai);
         sodsai.prefix = "Miss";
         sodsai.title = "Sodsai ngadee";
         sodsai.age = 25;
         sodsai.sex = "Women";
         sodsai.chekStock();
         sodsai.sellProduct();
         sodsai.purchaseProduct();
         
         Employee sad = new Employee();
         System.out.println("object = " + sad);
         sad.prefix = "Miss";
         sad.title = "Sesad kyanying";
         sad.age = 22;
         sad.sex = "Men";
         sad.chekStock();
         sad.sellProduct();
         sad.purchaseProduct();
         
         Employee mena = new Employee();
         System.out.println("object = " + mena);
         mena.prefix = "Miss";
         mena.title = "Mena Setrong";
         mena.age = 23;
         mena.sex = "Women";
         mena.chekStock();
         mena.sellProduct();
         mena.purchaseProduct();
     }
     }