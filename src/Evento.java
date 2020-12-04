
public class Evento {
	String fecha;
	String nombre;
	String lugar;
	String prioridad;
	
	public Evento(String date, String name, String place, String priority) {
		this.fecha = date;
		this.nombre = name;
		this.lugar = place;
		this.prioridad = priority;
		}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
}
