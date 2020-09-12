package utn.dds.persistencia.futbol.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import utn.dds.persistencia.futbol.persistence.auditoria.Auditable;

@Entity
public class Jugador extends Auditable {
	
	private String nombre;
	private String posicion;
	
	private Date ultimaModificacion;

	public String getNombre() {
		return nombre;
	}

	@ElementCollection
	@Column(name = "description")
	private List<String> lesiones = new ArrayList<>();

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
    
    @Override
    public Date getUltimaModificacion() {
        return ultimaModificacion;
    }
    
    @Override
    public boolean esSospechoso() {
      // TODO
      return false;
    }

}
