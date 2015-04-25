package gestionealbergo;

public class Cliente {
	private String nome;
	private String cognome;
	private String cellulare;
	private String email;
	
	
	
	public Cliente(String nome, String cognome, String cellulare) {
		if(nome.length()==0)
			throw new IllegalArgumentException ("Reinserisci il nome");
		if(nome == null)
			throw new IllegalArgumentException ("Il nome non può essere null");
			this.nome = nome;
		if(cognome.length()==0)
			throw new IllegalArgumentException ("Reinserisci il cognome");
		if(cognome == null)
			throw new IllegalArgumentException ("il cognome non può essere null");
		
			this.cognome = cognome;
		if(cellulare.length()==0)
			throw new IllegalArgumentException ("Inserisci il numero di telefono");
		if(cellulare== null)
			throw new IllegalArgumentException ("Il cellulare non può essere null");
			this.cellulare = cellulare;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if(nome.length()==0)
			throw new IllegalArgumentException ("Reinserisci il nome");
		if(nome == null)
			throw new IllegalArgumentException ("Il nome non può essere null");
			this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		if(cognome.length()==0)
			throw new IllegalArgumentException ("Reinserisci il cognome");
		if(cognome == null)
			throw new IllegalArgumentException ("il cognome non può essere null");
		
			this.cognome = cognome;
	}


	public String getCellulare() {
		return cellulare;
	}


	public void setCellulare(String cellulare) {
		if(cellulare.length()==0)
			throw new IllegalArgumentException ("Inserisci il numero di telefono");
		if(cellulare== null)
			throw new IllegalArgumentException ("Il cellulare non può essere null");
			
			this.cellulare = cellulare;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
}
