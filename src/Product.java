import java.util.Scanner;

public class Product {
    private String name;
    private int id;
    private int cost;

    public Product() {
    }

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
        this.cost=cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void inputInfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        this.name=scanner.nextLine();
        System.out.println("Nhap id san pham");
        this.id=scanner.nextInt();
        System.out.println("Nhap gia san pham");
        this.cost=scanner.nextInt();
    }
    public void showInfoProduct(){
        System.out.printf("San pham : %s ,Id : %s, Gia la: %s",name,id,cost);
    }


}
