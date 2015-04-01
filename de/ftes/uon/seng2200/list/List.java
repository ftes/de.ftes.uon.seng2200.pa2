package de.ftes.uon.seng2200.list;


/**
 * List interface supporting a variety of insertion and deletion methods.
 * @author Fredrik Teschke
 *
 */
public interface List<T> extends Iterable<T> {

	/**
	 * Insert element at beginning of list.
	 */
	public abstract void prepend(T o);

	/**
	 * Insert element at end of list.
	 */
	public abstract void append(T o);

	/**
	 * Insert element {@toInsert} in front of element {@code before}.
	 * @return {@code false} if {@code before} was not found in list, and
	 *         {@code toInsert} could therefore not be inserted
	 */
	public abstract boolean insertBefore(T toInsert, T before);

	/**
	 * Return and remove object from head of list.
	 */
	public abstract T pop() throws ListEmptyException;

	public abstract T get(int i) throws IndexOutOfBoundsException;

	/**
	 * @return the element at the i'th position counted from the end (index {@link #size() size} - 1 - i)
	 */
	public abstract T getReversed(int i) throws IndexOutOfBoundsException;

	/**
	 * @return the number of elements in the list
	 */
	public abstract int size();

}