
public class Tarea {
	String nombre;
	String prioridad;
	
	public Tarea(String name, String priority) {
		
		this.nombre = name;
		this.prioridad = priority;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
	
}
