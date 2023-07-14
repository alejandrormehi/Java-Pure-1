package fase1;

public class Pokemon {
	String poder ="";
	private String nombre;
	private String color;
	private int nivel;
	private String tipo;
	private int ataque;
	private int defensa;
	private int vida;
	
	public Pokemon(String poder) {
		super();
		this.poder = poder;
	}

	public Pokemon() {
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	
	
	public void atacar(Pokemon oponente) {
		oponente.vida -= this.ataque;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void getInfo() {
		System.out.println("Este Pokemon llamado "+ this.nombre + " Es de color " + this.color
				+ " Además esta a nivel "+ this.nivel + " Y es del tipo " + this.tipo 
				+ " Cuenta con un ataque de: " + this.ataque + " Y para defenderse su armadura es de "
				+ this.defensa + " Y el total de su vida es de: " + this.vida);
	}
}
