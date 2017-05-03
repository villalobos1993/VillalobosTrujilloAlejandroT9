package Modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Excepciones.*;

public class ListaOrdenada<E> extends ArrayList<E> {
	private int maxElements = 100;
	private Comparator<E> comparador;
	private ArrayList<E> lista;

	public ListaOrdenada(Comparator<E> comp) {

		this.comparador = comp;
		this.lista = new ArrayList();
	}

	// sobreescribimos el add de arrylist para si la lista contiene mas
	// elementos de los que debe
	// salte una excepcion y si intentamos introducir un dato null nos no deje.
	public boolean add(E element) {

		if (element != null) {

			if (this.size() < maxElements) {
				return super.add(element);
			} else {
				throw new ListSizeOverflownException("Ha excedido el numero de elementos del array 100.");
			}
		} else {
			throw new ElementNotAllowedException("No puedes introducir un elemento null.");
		}
	}

	// sobreescribimos el addall de arrylist para si la lista contiene mas
	// elementos de los que debe
	// salte una excepcion
	@Override
	public boolean addAll(Collection<? extends E> collection)
			throws ElementNotAllowedException, ListSizeOverflownException {
		if (collection.size() + this.size() <= maxElements) {
			return super.addAll(collection);
		} else {
			throw new ListSizeOverflownException("La cola está llena!");
		}
	}

	// creamos reverse para que muestre la cola ascendentemente
	public void reverse(ArrayList<Integer> cola) {
		if (cola.isEmpty()) {
			throw new ListisEmpty("El Array esta vacio");
		} else {
			Collections.sort(cola);
			for (Integer c : cola) {
			System.out.println(c);
			}
		}
	}
   //creamos min que nos devolvera el elemento mas pequeño del array
	public int min(ArrayList<Integer> cola) {
		if (cola.isEmpty()) {
			throw new ListisEmpty("El Array esta vacio");
		} else {
			int numero = 0;
			numero = Collections.min(cola);
			return numero;
		}

	}
	   //creamos max que nos devolvera el elemento mas grande del array
	public int max(ArrayList<Integer> cola) {
		if (cola.isEmpty()) {
			throw new ListisEmpty("El Array esta vacio");

		} else {
			int numero = 0;
			numero = Collections.max(cola);
			return numero;
		}
	}
}

	
	

