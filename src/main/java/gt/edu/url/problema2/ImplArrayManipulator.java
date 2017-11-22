package gt.edu.url.problema2;

public class ImplArrayManipulator<E> implements ArrayManipulator<E>{
	int cantidadPer = 0;
	/**
	 * @param Lista de dato generico
	 * @return Cantidad de Permutaciones encontradas
	 */
	@Override
	public int subsets(List<E> set) {
		List<E> prueba;
		prueba = set;
		int cantidadElementos = prueba.size();
		
		if(cantidadElementos == 1) {
			// Print out the found permutation
			for(int i = 0; i < prueba.size(); i++) {
				System.out.print(prueba.get(i));
				cantidadPer ++;
			}
			System.out.println();
		}
		else {	// If a new permutation has not yet been found
			for(int i = 0; i < (cantidadElementos-1); i++) {
				prueba.remove(0);
				subsets(prueba);
				E tmp;
				if(cantidadElementos % 2 == 0) {
					// Swap entry i with entry n-1
					tmp = prueba.get(i);
					prueba.set(i, prueba.get(cantidadElementos - 1));
					prueba.set(cantidadElementos - 1, tmp);
				}
				else {
					// Swap entry 0 with entry n-1
					tmp = set.get(0);
					prueba.set(0, prueba.get(cantidadElementos - 1));
					prueba.set(cantidadElementos - 1, tmp);
				}
			}
			prueba.remove(0);
			subsets(set);
		}
		return cantidadPer;
	}
}
