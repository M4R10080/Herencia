/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sertr
 */
public class Saxofon extends Intrumento{
    private String matDelCuerpo;
    private String matDeLaBoquilla;

    public Saxofon(int clave, String marca, String tipo, float precio,String matDelCuerpo,String matDeLaBoquilla) {
        super(clave, marca, tipo, precio);
        this.matDelCuerpo = matDelCuerpo;
        this.matDeLaBoquilla = matDeLaBoquilla;
    }
    
    

    public String getMatDelCuerpo() {
        return matDelCuerpo;
    }

    public void setMatDelCuerpo(String matDelCuerpo) {
        this.matDelCuerpo = matDelCuerpo;
    }

    public String getMatDeLaBoquilla() {
        return matDeLaBoquilla;
    }

    public void setMatDeLaBoquilla(String matDeLaBoquilla) {
        this.matDeLaBoquilla = matDeLaBoquilla;
    }

    
    
}
