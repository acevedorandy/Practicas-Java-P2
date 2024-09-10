package SegundoEnunciado;

public class Main {

	 public static void main(String[] args) {
		 
	     Shape[] shapes = new Shape[3];
	     shapes[0] = new Rectangulo(8, 10); // Rectángulo
	     shapes[1] = new Triangulo(6, 9);  // Triángulo
	     shapes[2] = new Circulo(6);       // Círculo

	     // Crear otra matriz para almacenar las áreas calculadas
	     
	     double[] areas = new double[shapes.length];

	     // Calcular el área de cada figura
	     
	     for (int i = 0; i < shapes.length; i++) {
	         areas[i] = shapes[i].CalcularSuperficie();
	     }

	     for (int i = 0; i < areas.length; i++) {
	         System.out.println("Área de la forma " + (i + 1) + ": " + areas[i]);
	     }
	 }
	}
