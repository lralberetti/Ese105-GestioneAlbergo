package gestionealbergo;

import java.util.*;

public class Albergo {
	private String nome;
	private Vector<Camera>camere;
	
	public String getNome() {
		return nome;
	}


	public Vector<Camera> getCamere() {
		return camere;
	}


	public Albergo(String nome) {
		this.nome = nome;
		this.camere = new Vector<Camera>(1,1);
	}
	

	@Override
	public String toString() {
		return "Albergo [nome=" + nome + ", camere=" + camere + "]";
	}
	
}
