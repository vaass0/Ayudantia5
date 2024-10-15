import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mostrarMenuPrincipal(scanner);
        scanner.close();
    }

    public static void mostrarMenuPrincipal(Scanner scanner) {
        Biblioteca biblioteca = new Biblioteca("biblioteca","avenida siempre viva 123");
        Usuario usuario = new Usuario("user","12345");
        Collection<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        int opcion;
        do {
            System.out.println("\n=== Sistema de Gestión de Biblioteca ===");
            System.out.println("1. Gestión de Libros");
            System.out.println("2. Préstamos de Libros");
            System.out.println("3. Gestión de Multas");
            System.out.println("4. Gestión de Empleados");
            System.out.println("5. Categorías de Libros");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuGestionLibros(scanner, biblioteca);
                    break;
                case 2:
                    menuPrestamosLibros(scanner,biblioteca,usuarios);
                    break;
                case 3:
                    menuGestionMultas(scanner,usuarios);
                    break;
                case 4:
                    menuGestionEmpleados(scanner,biblioteca);
                    break;
                case 5:
                    menuCategoriasLibros(scanner,biblioteca);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);
    }

    public static void menuGestionLibros(Scanner scanner, Biblioteca biblioteca) {
        int opcionLibros;
        do {
            System.out.println("\n=== Gestión de Libros ===");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Eliminar Libro");
            System.out.println("3. Buscar Libro");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Selecciona una opción: ");
            opcionLibros = scanner.nextInt();

            switch (opcionLibros) {
                case 1:
                    if(biblioteca.agregarLibro(crearLibro(scanner))){
                        System.out.println("Se agrego el libro de manera correcta...");
                    }
                    else{
                        System.out.println("No se pudo agregar el libro correctamente...");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese isbn a eliminar: ");
                    String isbn = scanner.nextLine();
                    if(biblioteca.eliminarLibro(isbn)){
                        System.out.println("El libro se elimino correctamente...");
                    }else{
                        System.out.println("No se pudo eliminar el libro...");
                    }
                    break;
                case 3:
                    if(biblioteca.mostrarLibro(scanner))
                        System.out.println("Se mostraron todos los libros...");
                    else{
                        System.out.println("No hay libros para mostrar...");
                    }
                    break;
                case 4:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcionLibros != 4);
    }

    public static void menuPrestamosLibros(Scanner scanner, Biblioteca biblioteca, Collection<Usuario> usuarios) {
        int opcionPrestamos;
        do {
            System.out.println("\n=== Préstamos de Libros ===");
            System.out.println("1. Realizar Préstamo");
            System.out.println("2. Registrar Devolución");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Selecciona una opción: ");
            opcionPrestamos = scanner.nextInt();

            switch (opcionPrestamos) {
                case 1:
                    System.out.println("Realizando préstamo...");
                    break;
                case 2:
                    System.out.println("Registrando devolución...");
                    break;
                case 3:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcionPrestamos != 3);
    }

    public static void menuGestionMultas(Scanner scanner,Collection<Usuario> usuarios) {
        int opcionMultas;
        do {
            System.out.println("\n=== Gestión de Multas ===");
            System.out.println("1. Generar Multa");
            System.out.println("2. Pagar Multa");
            System.out.println("3. Eliminar Multa");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Selecciona una opción: ");
            opcionMultas = scanner.nextInt();

            switch (opcionMultas) {
                case 1:
                    System.out.println("Generando multa...");
                    break;
                case 2:
                    System.out.println("Pagando multa...");
                    break;
                case 3:
                    System.out.println("Eliminando multa...");
                    break;
                case 4:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcionMultas != 4);
    }

    public static void menuGestionEmpleados(Scanner scanner,Biblioteca biblioteca) {
        int opcionEmpleados;
        do {
            System.out.println("\n=== Gestión de Empleados ===");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Modificar Cargo Empleado");
            System.out.println("3. Eliminar Empleado");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Selecciona una opción: ");
            opcionEmpleados = scanner.nextInt();

            switch (opcionEmpleados) {
                case 1:
                    if(biblioteca.agregarEmpleado(crearEmpleado(scanner))){
                        System.out.println("Se agrego el empleado de manera correcta...");
                    }
                    else{
                        System.out.println("No se pudo agregar el empleado correctamente...");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese identificador: ");
                    String identificador = scanner.nextLine();
                    System.out.println("Ingrese nuevo cargo: ");
                    String cargo = scanner.nextLine();
                    Empleado empleado = biblioteca.modificarEmpleado(cargo,identificador);
                    if(cargo.equals(empleado.getCargo())){
                        System.out.println("Se cambio correctamente el cargo...");
                    }
                    else{
                        System.out.println("no se pudo cambiar correctamente el cargo...");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese identificador: ");
                    String identificador1 = scanner.nextLine();
                    if(biblioteca.eliminarEmpleado(identificador1)){
                        System.out.println("se ha eliminado el empleado correctamente...");
                    }
                    break;
                case 4:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcionEmpleados != 4);
    }

    public static void menuCategoriasLibros(Scanner scanner, Biblioteca biblioteca) {
        int opcionCategorias;
        do {
            System.out.println("\n=== Categorías de Libros ===");
            System.out.println("1. Agregar Categoría");
            System.out.println("2. Modificar Categoría");
            System.out.println("3. Eliminar Categoría");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Selecciona una opción: ");
            opcionCategorias = scanner.nextInt();

            switch (opcionCategorias) {
                case 1:
                    if(biblioteca.agregarCategoria(crearCategoria(scanner))){
                        System.out.println("Se agrego la categoria de manera correcta...");
                    }
                    else{
                        System.out.println("No se pudo agregar la categoria correctamente...");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese nombre categoria: ");
                    String nombre1 = scanner.nextLine();
                    System.out.println("1.Agregar Libro");
                    System.out.println("2.Eliminar Libro");
                    int op = scanner.nextInt();
                    switch (op) {
                        case 1:
                            Libro libro = new Libro("asd","asdf","asd21312",2023);
                            System.out.println("Ingrese isbn de libro:");
                            String isbn = scanner.nextLine();
                            for(Libro libro1: biblioteca.libros ){
                                if(libro1.getIsbn().equals(isbn)){
                                    libro = libro1;
                                    break;
                                }
                            }
                            for(Categoria categoria: biblioteca.categorias){
                                if(categoria.getNombre().equals(nombre1)){
                                    categoria.agregarLibro(libro);
                                }
                            }
                        case 2:
                            System.out.println("Ingrese isbn de libro:");
                            String isbn1 = scanner.nextLine();
                            for(Categoria categoria: biblioteca.categorias){
                                if(categoria.getNombre().equals(nombre1)){
                                    categoria.eliminarLibro(isbn1);
                                }
                            }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese categoria a eliminar: ");
                    String nombre = scanner.nextLine();
                    if(biblioteca.eliminarCategoria(nombre)){
                        System.out.println("La categoria se elimino correctamente...");
                    }else{
                        System.out.println("No se pudo eliminar la categoria...");
                    }
                    break;
                case 4:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcionCategorias != 4);
    }
    public static Libro crearLibro(Scanner scanner){
        System.out.print("Ingrese titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.println();
        System.out.print("Ingrese autor del libro: ");
        String autor = scanner.nextLine();
        System.out.println();
        System.out.print("Ingrese isbn: ");
        String isbn = scanner.nextLine();
        System.out.println();
        System.out.print("Ingrese año de publicacion: ");
        int publicacion = scanner.nextInt();
        Libro libro = new Libro(titulo,autor,isbn,publicacion);
        return libro;
    }
    public static Empleado crearEmpleado(Scanner scanner){
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.println();
        System.out.print("Ingrese identificador : ");
        String identificador = scanner.nextLine();
        System.out.println();
        System.out.print("Ingrese cargo: ");
        String cargo = scanner.nextLine();
        Empleado empleado = new Empleado(nombre,identificador,cargo);
        return empleado;
    }
    public static Categoria crearCategoria(Scanner scanner){
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.println();
        System.out.print("Ingrese descripcion : ");
        String descripcion = scanner.nextLine();
        System.out.println();
        Categoria categoria = new Categoria(nombre,descripcion);
        return categoria;
    }
}

