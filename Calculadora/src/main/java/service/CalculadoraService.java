package service;

import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {

    public int somar(int a, int b){
        return a + b;
    }
    public int subtrair(int a, int b){
        return a - b;
    }
    public int dividir(int a, int b){
        return a / b;
    }
    public int multiplicar(int a, int b){
        return a * b;
    }
    public double calcularArea(Triangulo triangulo) {
        return (triangulo.getBase() * triangulo.getAltura())/2.0;
    }
    public double calcularArea(Quadrado quadrado) {
        return quadrado.getLado()* quadrado.getLado();
    }
}
