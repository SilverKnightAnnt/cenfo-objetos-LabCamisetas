package ui;

import java.io.*;
import labodirectoryclothing.*;

/**
 *
 * @author Ángel Marín Trejos
 */
public class LaboDirectoryClothingUI {

   
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static CL myClothStore = new CL();

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        mostrarMenu();
    }

    static void mostrarMenu() throws IOException {

        int opcion;
        opcion = -1;
        do {
            out.println("----Menú principal----");
            out.println("");
            out.println("1. Ingresar cliente.");
            out.println("2. Ingresar camiseta.");
            out.println("3. Crear catálogo.");
            out.println("4. Imprimir catálogo.");
            out.println("5. Crear orden.");
            out.println("6. Imprimir orden.");
            out.println("7. Buscar orden específica.");
            out.println("8. Salir.");
            out.println("");
            out.println("Seleccione una opción: ");
            opcion = Integer.parseInt(in.readLine());
            procesarOpcion(opcion);

        } while (opcion != 8);

    }

    /**
     *
     * @param popcion
     * @throws IOException
     */
    public static void procesarOpcion(int popcion) throws IOException {

        switch (popcion) {
            case 1:
                registrarCliente();
                break;
            case 2:
                registrarCamiseta();
                break;
            case 3:
                registrarCatalogo();
                break;
            case 4:
                listarCatalogo();
                break;
            case 5:
                crearOrden();
                break;
            case 6:
                listarOrden();
                break;
            case 7:
                buscarOrdenUI();
                break;
            case 8:
                System.out.println("Gracias por usar el sistema.");
                break;
            default:
                out.println("La opción ingresada no es correcta.");
                break;
        }
    }

    /**
     *
     * @throws IOException
     */
    public static void registrarCliente() throws IOException {

        String cedula;
        String nombre;
        String apellidos;

        if (validacionClienteUI() == false) {

            out.println("Ingrese la cédula del cliente: ");
            cedula = in.readLine();
            out.println("Ingrese el nombre: ");
            nombre = in.readLine();
            out.println("Ingrese los apellidos: ");
            apellidos = in.readLine();

            myClothStore.agregarCliente(cedula, nombre, apellidos);
        }

    }

    /**
     *
     * @return
     * @throws IOException
     */
    public static boolean validacionClienteUI() throws IOException {

        String cedula;
        boolean encontrado;

        out.println("Ingrese la cédula del cliente para comprobar existencia: ");
        cedula = in.readLine();

        encontrado = myClothStore.validacionCliente(cedula) != false;

        if (encontrado == true) {
            out.println("El cliente con la cédula " + cedula + " ya se encuentra registrado.");
        } else {
            out.println("El cliente no se encuentra en el sistema proceda a registrarlo.");
        }

        return encontrado;

    }

    /**
     *
     * @throws IOException
     */
    public static void registrarCamiseta() throws IOException {

        String id;
        String color;
        String tamanno;
        String descripcion;
        double precio;

        if (validacionCamisetaUI() == false) {

            out.println("Ingrese el id de la camisa: ");
            id = in.readLine();
            out.println("Ingrese el color: ");
            color = in.readLine();
            out.println("Ingrese el tamaño: ");
            tamanno = in.readLine();
            out.println("Ingrese la descripción: ");
            descripcion = in.readLine();
            out.println("Ingrese el precio: ");
            precio = Integer.parseInt(in.readLine());

            myClothStore.agregarCamiseta(id, color, tamanno, descripcion, precio);
        }

    }

    /**
     *
     * @return
     * @throws IOException
     */
    public static boolean validacionCamisetaUI() throws IOException {

        boolean encontrado;
        String id;

        System.out.println("Ingrese el id de la camiseta para comprobar existencia: ");
        id = in.readLine();

        encontrado = myClothStore.validacionCamiseta(id) != false;

        if (encontrado == true) {
            out.println("La camiseta con el ID " + id + " ya se encuentra registrada.");
        } else {
            out.println("La camiseta no se encuentra registrada proceda a ingresarla.");
        }
        return encontrado;

    }

    /**
     *
     * @throws IOException
     */
    public static void registrarCatalogo() throws IOException {

        String mes;
        String anno;

        out.println("Ingrese el mes del catálogo: ");
        mes = in.readLine();
        out.println("Ingrese el año: ");
        anno = in.readLine();

        myClothStore.agregarCatalogo(mes, anno);
    }

    /**
     *
     */
    public static void listarCatalogo() {
        String[][] catalogo = new String[5][5];

        for (int i = 0; i < myClothStore.getListaCatalogo().size(); i++) {
            Catalogo catalogoIngresado;
            catalogoIngresado = myClothStore.getListaCatalogo().get(i);
            out.println(catalogoIngresado.toString());

        }

        for (int fila = 0; fila < myClothStore.getListaCamiseta().size(); fila++) {

            Camiseta miChema = myClothStore.getListaCamiseta().get(fila);

            catalogo[fila][0] = miChema.getId();
            catalogo[fila][1] = miChema.getColor();
            catalogo[fila][2] = miChema.getTamanno();
            catalogo[fila][3] = miChema.getDescripcion();
            catalogo[fila][4] = String.valueOf(miChema.getPrecio());

            for (int colum = 0; colum < catalogo[fila].length; colum++) {
                out.print(catalogo[fila][colum] + "    ");
            }
            out.println();

        }

    }

    /**
     *
     * @throws IOException
     */
    public static void crearOrden() throws IOException {

        String id;
        String tipo;
        String fecha;
        String idCliente;
        String idCamiseta;
        int cantidad;
        String pregunta;

        if (buscarOrdenUI() == false) {

            out.println("Ingrese el id de la orden: ");
            id = in.readLine();
            out.println("Ingrese el tipo(teléfono, fax o correo): ");
            tipo = in.readLine();
            out.println("Ingrese la fecha(dd-mm-aaaa): ");
            fecha = in.readLine();
            out.println("Ingrese la cédula del cliente a quien desea realizar la orden: ");
            idCliente = in.readLine();

            do {
                out.println("Ingrese el id de la camiseta que desea apartar: ");
                idCamiseta = in.readLine();
                out.println("Ingrese la cantidad que desea: ");
                cantidad = Integer.parseInt(in.readLine());
                out.println("¿Desea agregar otra camiseta? (Sí o No) ");
                pregunta = in.readLine();
            } while (!"No".equals(pregunta));

            myClothStore.agregarOrden(id, tipo, fecha, cantidad, idCliente);
        }

    }

    /**
     *
     */
    public static void listarOrden() {

        for (int i = 0; i < myClothStore.getListaOrden().size(); i++) {
            Orden ordenIngresada;
            ordenIngresada = myClothStore.getListaOrden().get(i);
            out.println(ordenIngresada.toString());
        }
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public static boolean buscarOrdenUI() throws IOException {

        String id;
        boolean ordenEncontrada;

        out.println("Ingrese el ID de la orden a buscar: ");
        id = in.readLine();

        ordenEncontrada = (myClothStore.buscarOrden(id) != null);

        if (ordenEncontrada == true) {

            out.println(myClothStore.buscarOrden(id).toString());

        } else {
            out.println("La orden ingresada no se encuentra en el sistema, proceda a registrala.");
        }
        return ordenEncontrada;
    }

}//Fin del programa

