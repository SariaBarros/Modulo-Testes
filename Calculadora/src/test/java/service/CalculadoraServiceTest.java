package service;

import model.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;
    @Before
    public void before(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveSomarCorretamente(){
        int a = 4;
        int b = calculadoraService.somar(2, 2);
        Assert.assertEquals(a, b);
    }
    @Test
    public void deveDividirCorretamente(){
        Assert.assertTrue(calculadoraService.dividir(1,1) == 1);
    }
    @Test
    public void deveSubtrairCorretamente(){
        Assert.assertTrue(calculadoraService.subtrair(1,1) == 0);
    }

    @Test
    public void deveMultiplicarCorretamente(){
        Assert.assertTrue(calculadoraService.multiplicar(1,1) == 1);
    }

    @Test
    public void deveCalcularAreaTriangulo(){
        Triangulo triangulo = new Triangulo(2.0, 2.0);
        double area = 2.0;
        Assert.assertEquals(area, calculadoraService.calcularArea(triangulo));
    }


}
