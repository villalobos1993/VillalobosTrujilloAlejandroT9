package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Modelo.ListaOrdenada;

public class Main {
 public static ListaOrdenada<?> l;

	public static void main(String[] args) {
		l = new ListaOrdenada<Integer>((Integer a, Integer b) -> a - b);
		ArrayList<Integer> cola = new ListaOrdenada<Integer>((Integer a, Integer b) -> a - b);

	}

}
