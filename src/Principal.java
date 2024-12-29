import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner seleccionMoneda = new Scanner(System.in);
        Scanner montoIngresado = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();

        while (true) {
            System.out.println(""" 
                    \n
                    Seleccione una opción a convertir: 
                    1. Dolar a peso Argentino. 
                    2. Peso Argentino a Dolar. 
                    3. Dolar a Real Brasileño. 
                    4. Real Brasileño a Dolar.
                    5. Dolar a Peso Colombiano.
                    6. Peso Colombiano a Dolar.
                    7. Salir.
                    """);
            try {
                var opcionSeleccionada = Integer.valueOf(seleccionMoneda.nextLine());

                if (opcionSeleccionada == 7) {
                    System.out.println("Gracias por acceder al conversor. A la prochain");
                    break;
                } else if (opcionSeleccionada > 7) {
                    System.out.println("Opción inválida, ingrese una opción de la lista.");
                    continue;
                }
                System.out.println("Ingrese el monto.");
                var amount = Double.valueOf(montoIngresado.nextLine());
                String primerMoneda = "";
                String segundaMoneda = "";

                switch (opcionSeleccionada) {
                    case 1:
                        primerMoneda = "USD";
                        segundaMoneda = "ARS";
                        break;
                    case 2:
                        primerMoneda = "ARS";
                        segundaMoneda = "USD";
                        break;
                    case 3:
                        primerMoneda = "USD";
                        segundaMoneda = "BRL";
                        break;
                    case 4:
                        primerMoneda = "BRL";
                        segundaMoneda = "USD";
                        break;
                    case 5:
                        primerMoneda = "USD";
                        segundaMoneda = "COP";
                        break;
                    case 6:
                        primerMoneda = "COP";
                        segundaMoneda = "USD";
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;

                }
                ConversionResult conversion = consulta.busqueda(primerMoneda, segundaMoneda, amount);
                System.out.println("Resultado: " + amount + " " + primerMoneda + " son " + conversion.conversion_result() + " " + segundaMoneda);

            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }
}
