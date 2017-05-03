package Excepciones;

public class ListisEmpty extends RuntimeException{

	public ListisEmpty(String msg) {
		System.out.println(("[TU SUPEREXCEPTION]: " + msg));
	}
}
