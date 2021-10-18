package consola;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.cliente;
import modelo.lote;
import modelo.producto;
import procesamiento.loader;



public class Supermercado{
	/**
	 * Leer el archivo de Productos Menu y obtener su informacion en una lista de objetos ProductoMenu
	 * @param rutaArchivo
	 * @return Lista de objetos ProductoMenu
	 */
	private ArrayList<producto> ejecutarCargarProductos(String rutaArchivo)
	{
		ArrayList<producto> productos = new ArrayList<producto>();
		try
		{
			productos = loader.leerInfoArchivoProducto(rutaArchivo);
			System.out.println("OK Se cargó el archivo " + rutaArchivo + " con información de los productos.");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo " + rutaArchivo + " no se encontró.");
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo " + rutaArchivo);
			System.out.println(e.getMessage());
		}

		return productos;
	}
	
	private ArrayList<lote> ejecutarCargarLotes(String rutaArchivo)
	{
		ArrayList<lote> lotes = new ArrayList<lote>();
		try
		{
			lotes = loader.leerInfoArchivoLotes(rutaArchivo);
			System.out.println("OK Se cargó el archivo " + rutaArchivo + " con información de los productos.");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo " + rutaArchivo + " no se encontró.");
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo " + rutaArchivo);
			System.out.println(e.getMessage());
		}

		return lotes;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio de ejecución de la aplicación");
		
		Supermercado consola = new Supermercado();
		ArrayList<producto> productos = consola.ejecutarCargarProductos("./data/productos.txt");  // el parametro es la ruta del archivo productos.txt dentro del proyecto Eclipse
		for (producto prod : productos)
			System.out.println(prod);
		

		ArrayList<lote> lotes = consola.ejecutarCargarLotes("./data/lotes.txt");  // parametros: ruta del archivo lotes.txt 
			System.out.println(lotes);
			System.out.println("1.Aplicación POS");
			System.out.println("2.Aplicación Inventario");
			Scanner myObj = new Scanner(System.in);
			int opcion = Integer.parseInt(myObj.nextLine());
			if (opcion == 1)
			{
				System.out.println("1.Registar Cliente");
				System.out.println("2.Realizar compra cliente no registrado");
				System.out.println("3.Realizar compra cliente registrado");
				Scanner myObj2 = new Scanner(System.in);
				int opcion2 = Integer.parseInt(myObj2.nextLine());
				if (opcion == 1)
				{

						System.out.println("Ingrese nombre");
						Scanner myObj3 = new Scanner(System.in);
						System.out.println("Ingrese ciudad");
						Scanner myObj4 = new Scanner(System.in);
						System.out.println("Ingrese sexo");
						Scanner myObj5 = new Scanner(System.in);
						System.out.println("Ingrese Estado civil");
						Scanner myObj6 = new Scanner(System.in);
						String dato1 = myObj3.nextLine();
						String dato2 = myObj4.nextLine();
						String dato3 = myObj5.nextLine();
						String dato4 = myObj6.nextLine();
						double puntos = 0;
						cliente Cliente = new cliente(dato1,dato2,dato3,dato4,puntos);

				}
				if (opcion == 2)
				{
					
				}
				if (opcion == 3)
				{
					
				}
			}
	}
}