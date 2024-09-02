package ex1;
import java.util.Iterator;
import java.util.ListIterator;

public class VectorGeneric<T>{
	private T[] vec;		
	private int nElem;	      
	private final static int ALLOC = 50;   
	private int dimVec = ALLOC;     

	@SuppressWarnings("unchecked")
	public VectorGeneric() {
		vec = (T[]) new Object[dimVec];
		nElem = 0;
	}
	
	public boolean addElem(T elem) {
		if (elem == null)
			return false;
		ensureSpace();
		vec[nElem++] = elem;
		return true;
	}

	private void ensureSpace() {
		if (nElem>=dimVec) {
			dimVec += ALLOC;
			@SuppressWarnings("unchecked")
			T[] newArray = (T[]) new Object[dimVec];
			System.arraycopy(vec, 0, newArray, 0, nElem );
			vec = newArray;
		}
	}

	public boolean removeElem(T elem) {
		for (int i = 0; i < nElem; i++) {
			if (vec[i].equals(elem)) {
				if (nElem-i-1 > 0) // not last element
					System.arraycopy(vec, i+1, vec, i, nElem-i-1 );
				vec[--nElem] = null; // libertar último objecto para o GC
				return true;
			}
		}
		return false;
	}

	public int totalElem() {
		return nElem;
	}
	
	public T getElem(int i) {
		return (T) vec[i];
	}

	public Iterator<T> iterator() {
		return (this).new VectorInterator<T>();
	}

	public ListIterator<T> listIterator() {
		return (this).new VectorListIterator();
	}

	public ListIterator<T> listIterator(int index) {
		return (this).new VectorListIterator();
	}

	private class VectorInterator<K> implements Iterator<K> {
		private int indice;
		VectorInterator() {
			indice = 0;
		}

		@Override
		public boolean hasNext() {
			return (indice < nElem);
		}

		@SuppressWarnings("unchecked")
		public K next() {
			if (hasNext())
				return (K) VectorGeneric.this.vec[indice++];
			throw new IndexOutOfBoundsException("only " + nElem + " elements");
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Operação não suportada!");
		}
	}

	private class VectorListIterator implements ListIterator<T> {
		private int indice;
		VectorListIterator(){
			indice = 0;
		}
		@Override
		public boolean hasNext() {
			return (indice < nElem);
		}
		@Override
		public T next() {
			if (hasNext())
				return (T) VectorGeneric.this.vec[indice++];
			throw new IndexOutOfBoundsException("only " + nElem + " elements");
		}
		@Override
		public boolean hasPrevious() {
			return (indice > 0);
		}
		@Override
		public T previous() {
			if (hasPrevious())
				return (T) VectorGeneric.this.vec[indice--];
			throw new IndexOutOfBoundsException("only " + nElem + " elements");
		}
		@Override
		public int nextIndex() {
			return indice;
		}
		@Override
		public int previousIndex() {
			return indice-1;
		}
		@Override
		public void remove() {
			throw new UnsupportedOperationException("Operação não suportada!");
		}
		@Override
		public void set(T e) {
			throw new UnsupportedOperationException("Operação não suportada!");
		}
		@Override
		public void add(T e) {
			throw new UnsupportedOperationException("Operação não suportada!");
		}
	}

}