/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sertr
 */
public class PruebaIntumento {  // Corrected class name for spelling
    public static void main(String[] args) {
        
        Guitarra guitarra1 = new Guitarra(123, "La mejor", "Madera", 200.3f, 4, "pelos de mono");
        
        System.out.println("Clave: " + guitarra1.getClave());
        System.out.println("Marca: " + guitarra1.getMarca());
        System.out.println("Tipo: " + guitarra1.getTipo());
        System.out.println("Precio: " + guitarra1.getPrecio());
        System.out.println("Número de Cuerdas: " + guitarra1.getNumDeCuerdas());
        System.out.println("Material de Cuerdas: " + guitarra1.getMatDeCuerdas());
        System.out.println("*******************************************************");
        
        Saxofon saxofon1 = new Saxofon(2,"WALLIN","Oro",456.78f,"Oro","Plastico");
        
        System.out.println("Clave: " + saxofon1.getClave());
        System.out.println("Marca: " + saxofon1.getMarca());
        System.out.println("Tipo: " + saxofon1.getTipo());
        System.out.println("Precio: " + saxofon1.getPrecio());
        System.out.println("Número de Cuerdas: " + saxofon1.getMatDelCuerpo());
        System.out.println("Material de Cuerdas: " + saxofon1.getMatDeLaBoquilla());
        System.out.println("*******************************************************");
        saxofon1.setPrecio(678.23f);
        
        System.out.println("Clave: " + saxofon1.getClave());
        System.out.println("Marca: " + saxofon1.getMarca());
        System.out.println("Tipo: " + saxofon1.getTipo());
        System.out.println("Precio: " + saxofon1.getPrecio());
        System.out.println("Número de Cuerdas: " + saxofon1.getMatDelCuerpo());
        System.out.println("Material de Cuerdas: " + saxofon1.getMatDeLaBoquilla());
        System.out.println("*******************************************************");
        
        Guitarra guitarras[]= new Guitarra[3];
        
        Guitarra g1 = new Guitarra(1, "La peor", "Vidrio", 400.3f, 9, "pelos de gato");
        Guitarra g2 = new Guitarra(2, "La menor peor", "tela", 1.3f, 3, "pelos de rata");
        Guitarra g3 = new Guitarra(3, "Laloquera", "metal", 777.77f, 7, "tendones de bebe");
        //no me funen por lo del bebe
        guitarras[0] =g1;
        guitarras[1] =g2;
        guitarras[2] =g3;
        
        for (int i = 0; i < guitarras.length; i++) {
            System.out.println("Clave: " + guitarras[i].getClave() );
            System.out.println("Marca: " + guitarras[i].getMarca());
            System.out.println("Tipo: " + guitarras[i].getTipo());
            System.out.println("Precio: " + guitarras[i].getPrecio());
            System.out.println("Número de Cuerdas: " + guitarras[i].getNumDeCuerdas());
            System.out.println("Material de Cuerdas: " + guitarras[i].getMatDeCuerdas());
            System.out.println("*******************************************************");
        }
        System.out.println("Programa finalizado");
        System.out.println("Programador: MEVA");
    }
}

