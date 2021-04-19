import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Product product = new Product();
                    product.inputInfo();
                    productManager.addInfo(product);
                    break;

                }
                case 2:{
                    productManager.showInfo();
                    productManager.Sapxep();
                    break;
                }
                case 3:{
                    productManager.suaTheoId();
                    break;
                }
                case 4:{
                    productManager.xoaTheoId();
                    break;
                }
                case 5:{
                    productManager.FindName();
                    break;
                }
            }
        } while (choice!=0);
    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn : ");
        System.out.println("1. Nhập thông tin san pham");
        System.out.println("2. Hiển thị thông tin san pham");
        System.out.println("3. Sua san pham theo id");
        System.out.println("4. Xoa san pham theo id");
        System.out.println("5. Tim kiem san pham theo ten");


    }
}
