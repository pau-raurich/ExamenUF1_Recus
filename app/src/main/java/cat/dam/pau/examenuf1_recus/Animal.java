package cat.dam.pau.examenuf1_recus;


import android.graphics.Bitmap;

public class Animal {

    private Bitmap imatge;
    private int puntuacio;


    public Animal(Bitmap imatge, int puntuacio) {
        this.imatge = imatge;
        this.puntuacio = puntuacio;
    }


    public Bitmap getImatge() {
        return imatge;
    }

    public void setImatge(Bitmap imatge) {
        this.imatge = imatge;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }
}
