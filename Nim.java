package DiaCuatro;

public class Nim {


    private int cantidad;

    public Nim(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void quitarContadores(int cantidad) {
        this.cantidad -= cantidad;
    }
}







