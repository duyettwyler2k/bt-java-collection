import java.util.*;

public class ProductManager {
    List<Product> productList = new ArrayList<>();

    //them thong tin san pham
    public void addInfo(Product product) {
        productList.add(product);
    }

    //hien thi thong tin san pham
    public void showInfo() {
        for (Product product : productList) {
            product.showInfoProduct();
        }
    }

    //sua theo id
    public void suaTheoId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id san pham muon sua ");
        int id = scanner.nextInt();
        for (Product product : productList) {
            if (product.getId() == id) {
                product.inputInfo();
            }
        }
    }

    //xoa theo id
    public void xoaTheoId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id san pham muon xoa");
        int id = scanner.nextInt();
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                break;
            }
        }
    }

    //tim kiem theo ten san pham
    public void FindName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten san pham muon hien thi");
        String name = scanner.nextLine();
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                product.showInfoProduct();
            }
        }
    }


    //sap xep theo gia san pham
    public void Sapxep() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getCost() > o2.getCost()) {
                    return 1;
                } else if (o1.getCost()<o2.getCost()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }


}
