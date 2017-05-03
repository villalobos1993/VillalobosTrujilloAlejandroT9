package Test;

import org.junit.Before;
import org.junit.Test;

import Modelo.*;
import Excepciones.*;

public class ListaTest {
	private ListaOrdenada<Integer> l;

	/**
	 * Test add
	 */
	@Test
	public void AddSuccess() {
		assert (l.add(99));
		assert (l.add(100));
	}

	/**
	 * Test add Fallo
	 */
	@Test
	public void AddFail() {
		for (int i = 0; i < 100; i++) {
			l.add(i);
		}
		try {
			l.add(100);
		} catch (ListSizeOverflownException e) {
			assert (l.size() == 100);
			assert (!l.contains(100));
		}
	}

	/**
	 * Test reverse fallo
	 */
	@Test
	public void reverseFail() {
		l.reverse(l);
	}

	/**
	 * Test min fallo
	 */
	@Test
	public void minFail() {
		l.min(l);
	}

	/**
	 * Test max fallo
	 */
	@Test
	public void maxFail() {
		l.max(l);
	}

	/**
	 * Test max
	 */
	@Test
	public void maxSuccess() {
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(33);
		System.out.println(l.max(l));
	}

	/**
	 * Test min
	 */
	@Test
	public void minSuccess() {
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(33);
		System.out.println(l.min(l));
	}
    
	@Test 
	public void reverseSuccess(){
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(33);
		l.reverse(l);
	}
	@Before
	public void Setup() {
		l = new ListaOrdenada<Integer>((Integer a, Integer b) -> a - b);
	}
}
