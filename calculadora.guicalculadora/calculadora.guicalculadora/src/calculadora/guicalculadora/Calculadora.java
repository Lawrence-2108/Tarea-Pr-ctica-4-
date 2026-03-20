
package calculadora.guicalculadora;


public class Calculadora {
    public double sumar(Double valor1, Double valor2){
       return valor1 + valor2;
   }
   
   public double restar(Double valor1, Double valor2){
       return valor1 - valor2;
   }
   
   public double multiplicar(Double valor1, Double valor2){
       return valor1 * valor2;
   }
   
   public double dividir(Double valor1, Double valor2) {
        if (valor2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0.0;
        }
        return valor1 / valor2;
    }
   
   public double fahrenheitACelsius(Double fahrenheit) {
        double resultado = (fahrenheit - 32) * 5 / 9;
    return Math.round(resultado * 100.0) / 100.0;
    }
   
}
