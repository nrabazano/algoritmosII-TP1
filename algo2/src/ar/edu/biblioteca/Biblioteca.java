package ar.edu.biblioteca;
import org.w3c.dom.Node;

import ar.edu.librerias.StringList;
import ar.edu.librerias.XMLProcessor;


public class Biblioteca {
	
	public static XMLProcessor bibliotecaProcesador;
	public static StringList bibliotecaSalida;
	public static Node primero;
	

	public static Node obtenerBiblioteca(String fileXML, String root) {
		
		
		bibliotecaProcesador = new XMLProcessor();
		bibliotecaSalida = new StringList();
		Node primero;
		
		primero = bibliotecaProcesador.root(fileXML, root);
		
//		boolean prim = bibliotecaProcesador.existsNode(primero, "/primero");
//		System.out.print("hayPrimero: " + prim + "\n");
		
		return primero;
		
	}
	
	public static StringList procesarBiblioteca(Node nodo){
		System.out.print("procesar \n");
		StringList salida = new StringList();
		String item = new String();
		//System.out.print("agregar item \n");
		//System.out.print(item);
		//item = bibliotecaProcesador.getNodeData(nodo, "/biblioteca");
		salida = bibliotecaProcesador.getNodeListData(nodo, "/biblioteca");
		System.out.print("item agregado \n");
		
		//salida.add(item);
		
		return salida;
		
	}
	
	
	public static void mostrarSalida(StringList salida){
		
		//System.out.print("mostrar \n");
		//System.out.print(salida.size() + "\n");
		
		for (int id = 0;id < salida.size() ; id++ ){
		
			System.out.print(salida.get(id) + " \n");
		
			
		}
		
	}
	

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Node root;

		root = obtenerBiblioteca("D:\\CTP\\IDE\\workspace2\\algo2\\ejemplo\\entrada_ejemplo.xml", "/primero");

//		boolean hayNodo = bibliotecaProcesador.existsNode(root, "/primero");
//		System.out.print(hayNodo +" \n");
		
		String item = bibliotecaProcesador.getNodeData(root, "/primero");
		//System.out.print(item + " \n");
		bibliotecaSalida.add(item);
//		System.out.print(bibliotecaSalida.size() + " \n");
		mostrarSalida(bibliotecaSalida);
		

	}

}
