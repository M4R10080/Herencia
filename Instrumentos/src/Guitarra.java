/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sertr
 */
public class Guitarra extends Intrumento {
    private int numDeCuerdas;
    private String matDeCuerdas;
    
    public Guitarra(int clave, String marca, String tipo, float precio,int numDeCuerdas,String matDeCuerdas ){
        super(clave, marca, tipo, precio);
        this.numDeCuerdas = numDeCuerdas;
        this.matDeCuerdas =matDeCuerdas;
    }

    public int getNumDeCuerdas() {
        return numDeCuerdas;
    }

    public void setNumDeCuerdas(int numDeCuerdas) {
        this.numDeCuerdas = numDeCuerdas;
    }

    public String getMatDeCuerdas() {
        return matDeCuerdas;
    }

    public void setMatDeCuerdas(String matDeCuerdas) {
        this.matDeCuerdas = matDeCuerdas;
    }
    
}
