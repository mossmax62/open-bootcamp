package com.max;

public class Main {

    public static void main(String[] args) {
	//Llamar a funcion sumar
        System.out.println(sumarValores(1,1,1));
        Coche coche = new Coche();
        System.out.println("Numero de puertas antes de incrementar : " + coche.numeroDePuertas);
        coche.incrementarPuestas();
        System.out.println("Numero de puertas despues de incrementar : " + coche.numeroDePuertas);

    }

    public static int sumarValores(int a, int b, int c){
        return a+b+c;
    }

    static class Coche{
        int numeroDePuertas = 3;
        public void incrementarPuestas(){
            this.numeroDePuertas++;
        }
    }
}
