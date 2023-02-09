//Se requiere un programa en Java para convertir
// una cantidad de dinero en otros tipos de monedas
// (al menos a cinco tipos de monedas distintas).
public class Ejercicio {
    double monto, valorDolar = 18.94, valorEuro = 20.29, valorLibra = 22.86, valorFranco = 20.55, valorSol = 4.91;

    public Ejercicio() {
    }

    public Ejercicio(double monto, double valorDolar, double valorEuro, double valorLibra,double valorFranco,double valorBit) {
        this.monto = monto;
        this.valorDolar = valorDolar;
        this.valorEuro = valorEuro;
        this.valorLibra = valorLibra;
        this.valorFranco = valorFranco;
        this. valorSol = valorSol;
    }

    public double conversionDolar() {
        return (this.monto * this.valorDolar);
    }

    public double conversionPeso() {
        return (this.monto / this.valorDolar);
    }

    public double conversionEuro() {
        return (this.monto * valorEuro);
    }

    public double conversionPeso1() {
        return (this.monto / valorEuro);
    }
    public double conversionLibra(){
        return (this.monto * valorLibra);
    }
    public double conversionPeso2(){
        return (this.monto / valorLibra);
    }
    public double conversionFranco(){
        return (this.valorFranco * this.monto);
    }
    public double conversionPeso3(){
        return (this.monto / this.valorFranco);
    }
    public double conversionSol(){
        return (this.monto * this.valorSol);
    }
    public double conversionPeso4(){
        return (this.monto / this.valorSol);
    }

    @Override
    public String toString(){
        return "\n Ingrese la cantidad a convertir:    " + this.monto
                + "\n DOLAR - PESO MEXICANO:     " + conversionDolar()
                + "\n PESO MEXICANO - DOLAR:    " + conversionPeso()
                + "\n EURO - PESO MEXICANO:     "+ conversionEuro()
                + "\n PESO MEXICANO - EURO:     "+ conversionPeso1()
                + "\n LIBRA - PESO MEXICANO:     "+ conversionLibra()
                + "\n PESO MEXICANO - LIBRA:     "+ conversionPeso2()
                + "\n FRANCOS - PESO MEXICANO:     "+ conversionFranco()
                + "\n PESO MEXICANO - FRANCOS:     "+ conversionPeso3()
                + "\n SOL - PESO MEXICANO:     "+ conversionSol()
                + "\n PESO MEXICANO - SOL:     "+ conversionPeso4();
    }
}
