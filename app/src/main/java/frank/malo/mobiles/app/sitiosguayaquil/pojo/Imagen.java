package frank.malo.mobiles.app.sitiosguayaquil.pojo;

/**
 * Created by Frank on 04/10/2016.
 */

public class Imagen {

    private double Longitud;
    private double Latitud;
    private int resImagen;
    private String nombre;

    public Imagen(double longitud, double latitud, int resImagen, String nombre) {
        Longitud = longitud;
        Latitud = latitud;
        this.resImagen = resImagen;
        this.nombre = nombre;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double longitud) {
        Longitud = longitud;
    }

    public double getLatitud() {
        return Latitud;
    }

    public void setLatitud(double latitud) {
        Latitud = latitud;
    }

    public int getResImagen() {
        return resImagen;
    }

    public void setResImagen(int resImagen) {
        this.resImagen = resImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
