import java.util.*;

public class SeñorMicho {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Product p1 = new Product("P101", "Jabón", 19.50, 10);
        Product p2 = new Product("P102", "papel", 48.00, 15);
        Product p3 = new Product("P103", "cloro", 16.50, 8);
        Product p4 = new Product("P104", "fabuloso", 20.00, 2);
        Product p5 = new Product("P105", "Jalea", 9.90, 19);

        List<Product> products = new ArrayList<>();

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        Catalog catalogo = new Catalog(products);

        System.out.println("TIENDA SEÑOR MICHO\n");

        System.out.print("Ingresa tu nombre: ");
        String name = sc.nextLine();
        System.out.print("Ingresa tu correo electrónico: ");
        String email = sc.nextLine();

        User user = new User(name, email);
        Cart cart = new Cart(user);


        System.out.println("\nBienvenido/a " + user.getName() + " ¿Qué deseas hacer? \n");


        int choice = 0;

        do{
            printMenu();
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("\nArticulos disponibles\n");
                System.out.printf("%-8s%-15s%-8s%-10s","ID","Producto","Precio","Stock");
                System.out.println("\n________________________________________________________________");
                catalogo.showProducts();
                System.out.print("\n\nIngresa el ID del producto de tu interes: ");
                Scanner sc = new Scanner(System.in);
                String id = sc.nextLine();
                System.out.print("Ingrsa la cantidad de productos de tu interés: ");
                int qty = sc.nextInt();

            } else if (choice == 2) {
                //showCartItems ();
            } else if (choice == 3) {
                catalogo.showProducts();
                String product = null;
                System.out.println("Ingresa el ID del producto que desas agreagar");
                Scanner sc = new Scanner(System.in);
                product = sc.nextLine();
                for (int x = 0; x < catalogo.products.size();x++){
                    Product p = catalogo.products.get(x);
                    if (p.getId().equals(product)){
                        cart.addProduct(p);
                    }
                }

            } else if (choice == 4) {
                //PayAndFinish();
            } else if (choice == 5) {
                //exit();
            } else {
                System.out.println("Opción invalida, intenta de nuevo");
            }


        }while (choice <=5);

        int option = sc.nextInt();



    }
    public static void printMenu(){
        System.out.println("1) Mostrar articulos de la tienda");
        System.out.println("2) Mostrar articulos en el carrito de compras");
        System.out.println("3) Editar articulos del carrito de compras");
        System.out.println("4) Pagar y finalizar");
        System.out.println("5) Salir");
        System.out.print("\nDigite una opción: ");
    }

}
