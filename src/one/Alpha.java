package one;

public class Alpha {

	public String nome;

	protected String sobrenome;

	String pai;

	private String mãe;
	
	public String apelido;

	public static void main(String[] args) {
		
		Alpha a = new Alpha();
		a.nome = "Alpha";
		a.sobrenome = "da Silva";
		a.pai = "Jose";
		a.mãe = "Maria";
		a.apelido = "ND";
	}

}


//https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html