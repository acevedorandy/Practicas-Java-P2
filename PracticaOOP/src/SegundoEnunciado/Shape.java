package SegundoEnunciado;

//Clase abstracta Shape
abstract class Shape {
    protected double ancho;
    protected double alto;

    // Constructor
    public Shape(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método abstracto para calcular el área
    public abstract double CalcularSuperficie();
}

//Clase Rectangulo que implementa Shape
class Rectangulo extends Shape {

    public Rectangulo(double ancho, double alto) {
        super(ancho, alto);
    }

    @Override
    public double CalcularSuperficie() {
        return ancho * alto; // Área de un rectángulo
    }
}

//Clase Triangulo que implementa Shape
class Triangulo extends Shape {

    public Triangulo(double ancho, double alto) {
        super(ancho, alto);
    }

    
    public double CalcularSuperficie() {
        return (ancho * alto) / 2; // Área de un triángulo
    }
}

//Clase Circulo que implementa Shape
class Circulo extends Shape {

    public Circulo(double radio) {
        super(radio, radio); // Alto y ancho son iguales al radio
    }

    
    public double CalcularSuperficie() {
        return Math.PI * ancho * ancho; // Área de un círculo (π*r²)
    }
}
