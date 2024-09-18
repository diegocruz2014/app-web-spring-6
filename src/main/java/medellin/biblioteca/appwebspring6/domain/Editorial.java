package medellin.biblioteca.appwebspring6.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreEditorial;
    private String direccionEditorial;
    private String ciudadEditorial;
    private String departamentoEditorial;
    private String codigoPostalEditorial;

    // Generar Getters and Setters para todas las propiedades
    // Atributos de Editorial
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getDireccionEditorial() {
        return direccionEditorial;
    }

    public void setDireccionEditorial(String direccionEditorial) {
        this.direccionEditorial = direccionEditorial;
    }

    public String getCiudadEditorial() {
        return ciudadEditorial;
    }

    public void setCiudadEditorial(String ciudadEditorial) {
        this.ciudadEditorial = ciudadEditorial;
    }

    public String getDepartamentoEditorial() {
        return departamentoEditorial;
    }

    public void setDepartamentoEditorial(String departamentoEditorial) {
        this.departamentoEditorial = departamentoEditorial;
    }

    public String getCodigoPostalEditorial() {
        return codigoPostalEditorial;
    }

    public void setCodigoPostalEditorial(String codigoPostalEditorial) {
        this.codigoPostalEditorial = codigoPostalEditorial;
    }

    // Generar toString() haciendo uso de Intellig IDEA (Control + Insert), tal como se
    // llevó a cabo con Autor y Libro
    @Override
    public String toString() {
        return "Editorial{" +
                "id=" + id +
                ", nombreEditorial='" + nombreEditorial + '\'' +
                ", direccionEditorial='" + direccionEditorial + '\'' +
                ", ciudadEditorial='" + ciudadEditorial + '\'' +
                ", departamentoEditorial='" + departamentoEditorial + '\'' +
                ", codigoPostalEditorial='" + codigoPostalEditorial + '\'' +
                '}';
    }

    // Generar equals() y hashCode() solamente para ID con Alt + Insert, utilizar la misma
    // configuración de la primera pantalla tal como se llevó a cabo con Autor y con Libro.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Editorial editorial = (Editorial) o;
        return getId().equals(editorial.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
