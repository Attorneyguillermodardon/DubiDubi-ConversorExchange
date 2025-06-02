
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        DecimalFormat formato = new DecimalFormat("#,###.##");



        Scanner currency = new Scanner(System.in);

        while (true) {



            System.out.println("Pon la currency que tienes");
            String codigoMoneda = currency.nextLine();

            if (!codigoMoneda.matches("^[a-zA-Z]{3}$")) {
                System.out.println("Codigo de moneda invalido. Ingrese solo letras (Ej: USD, EUR, JPY, etc.)");
                continue;
            }

            ConsultaMoneda consulta = new ConsultaMoneda();
            Moneda moneda = consulta.buscaMoneda(codigoMoneda);
            //System.out.println(moneda); - Habilita este reenglón si quieres ver todas los otros códigos de moneda

            if (moneda == null || moneda.conversion_rates() == null) {
                System.out.println("Error en la información ingresada. Busque una moneda válida (Ej: USD, EUR, JPY, etc.)");
                continue;
            }

            System.out.println("Pon la currency que necesitas");
            String monedaQuiero = currency.nextLine();
            Double tasaDeCambio = moneda.conversion_rates().get(monedaQuiero);


            if (tasaDeCambio == null) {
                System.out.println("Esta moneda destino no existe. Ingresa una moneda válida (Ej: USD, EUR, JPY, etc.)");
                continue;
            }

            System.out.println("La tasa de cambio es " + tasaDeCambio);

            Double cantidadVaro = null;
            try {
                System.out.println("Pon la cantidad de " + codigoMoneda + " que tienes");
                cantidadVaro = currency.nextDouble();
                currency.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Escriba una cantidad válida y en número");
                currency.nextLine();
                continue;
            }
            Double resultado = tasaDeCambio * cantidadVaro;

            System.out.println(formato.format(cantidadVaro) + " " + codigoMoneda + " Equivalen a " + formato.format(resultado) + " " + monedaQuiero);

            while (true) {

                System.out.println("¿Quieres hacer otra operacion? Escribe Si o No");
                String respuesta = currency.nextLine();

                if (respuesta.equalsIgnoreCase("No")) {
                    System.out.println("Gracias por usar Dubidubi Conversor Exchange");
                    return;
                } else if (respuesta.equalsIgnoreCase("Si")) {
                    break;
                } else {
                    System.out.println("Respuesta inválida. Por favor escriba Si o No");
                }

            }


        }



    }

        }























