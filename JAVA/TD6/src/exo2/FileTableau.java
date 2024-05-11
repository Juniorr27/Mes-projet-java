package exo2;

import java.util.LinkedList;

public class FileTableau implements File {
	private LinkedList<Object> file;
	
	public FileTableau() {
		super();
		file = new LinkedList<>();
	}
	@Override
	public boolean estVide() {
		return file.isEmpty();
	}
	@Override
	 public void entrer(Object o) {
		 file.addLast(o);
	 }
	@Override
	 public Object sortir() {
		if (estVide()) {
            throw new IllegalStateException("La file est vide");
        }
		 return file.removeFirst();
	 }
}
