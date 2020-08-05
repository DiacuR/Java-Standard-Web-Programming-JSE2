package Clase02.Programa01;

import javax.swing.plaf.synth.Region;

public class PlanTelefonico {
	
	private int gb;
	private int minutos;
	private int sms;
	private String nombre;
	
	//Constructores
	
	//ctrl + espacio + enter : Genera constructor por defecto
	public PlanTelefonico() {
		this.gb = 1;
		this.minutos = 100;
		this.sms = 1000;
		this.nombre = "Plan Base";
	}
	
	//ctrl + shift + s: Da varias opciones como crear constructor parametrizado, getters, setters ...
	public PlanTelefonico(int gb, int minutos, int sms, String nombre) {
		super();
		this.gb = gb;
		this.minutos = minutos;
		this.sms = sms;
		this.nombre = nombre;
	}

	// Getters y Setters
	
	public int getGb() {
		return gb;
	}

	public void setGb(int gb) {
		this.gb = gb;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSms() {
		return sms;
	}

	public void setSms(int sms) {
		this.sms = sms;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "PlanTelefonico [gb=" + gb + ", minutos=" + minutos + ", sms=" + sms + ", nombre=" + nombre + "]";
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
		this.gb = (Integer) null;
		this.minutos = (Integer) null;
		this.sms = (Integer) null;
		this.nombre = null;
	}
	
	
}
