package Excepciones;

public class ListSizeOverflownException extends RuntimeException {

	
	public ListSizeOverflownException(String msg) {
		System.out.println(("[TU SUPEREXCEPTION]: " + msg));
	}
}
