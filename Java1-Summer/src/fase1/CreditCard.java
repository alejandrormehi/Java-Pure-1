package fase1;

import java.time.LocalDate;

public class CreditCard {

	private String entidadBancaria;
	private String numeroTarjeta;
	private LocalDate fechaCaducidad;
	private String nombreTitular;
	private String apellidoTitular;
	private boolean estado;
	private int saldo;
	
	
	
	//GETTER Y SETTERS AUTOMATICOS
	public String getEntidadBancaria() {
		return entidadBancaria;
	}
	public void setEntidadBancaria(String entidadBancaria) {
		this.entidadBancaria = entidadBancaria;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
		System.out.println("El numero de tarjeta es: "+numeroTarjeta);
	}
	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
		System.out.println("Nombre del titular: "+nombreTitular);
	}
	public String getApellidoTitular() {
		return apellidoTitular;
	}
	public void setApellidoTitular(String apellidoTitular) {
		this.apellidoTitular = apellidoTitular;
		System.out.println("Apellido del titular: "+apellidoTitular);

	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
		if(saldo>=1) {
			estado = true;
		}else {
			estado=false;
		}
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = 1000;
		System.out.println("El saldo actual es: "+saldo);
		
	}
	
}
