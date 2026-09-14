public class SistemaPedidos {

    public static void main(String[] args) {
        SistemaPedidos sistema = new SistemaPedidos();
        sistema.procesarPedido("CLIENTE_VIP", 1500.0, true, "MEXICO");
    }

    public void procesarPedido(String tipoCliente, double montoTotal, boolean esDiaEspecial, String destino) {
        if (montoTotal <= 0) {
            System.out.println("El monto debe ser mayor a cero.");
            return;
        }
        if (tipoCliente == null) {
            System.out.println("tipo de cliente invalido");
            return;
        }

        double descuento = calcularDescuento(tipoCliente, montoTotal, esDiaEspecial);
        if (esDiaEspecial) {
            descuento += montoTotal * 0.05;
        }

        double costoEnvio = calcularCostoEnvio(destino, montoTotal);
        double totalFinal = montoTotal - descuento + costoEnvio;

        if (totalFinal > 0) {
            imprimirResumen(montoTotal, descuento, costoEnvio, totalFinal);
        } else {
            System.out.println("Error en la transacción.");
        }
    }
   
    public double calcularDescuento(String tipoCliente, double montoTotal, boolean esDiaEspecial) {
        double descuento = 0.0; 
        switch (tipoCliente) {
            case "REGULAR":
                descuento = montoTotal > 1000 ? montoTotal * 0.05 : 0.0; 
                break;
            case "VIP":
                if (montoTotal > 2000){
                    descuento = montoTotal * 0.20;
                }
                else if (montoTotal > 1000){
                    descuento  = montoTotal * 0.15;
                } 
                else {
                    descuento = montoTotal * 0.10;
                }
                break;
            case "NUEVO":
                descuento = 50.00;
            default:
                break;
        }
        if(esDiaEspecial)  return descuento + (montoTotal * 0.05); 
        return descuento;
    }
 
    public double calcularCostoEnvio(String destino, double montoTotal){
        
        double costoEnvio = 0.0;       
        switch (destino) {
            case "LOCAL":
                costoEnvio = 50.0;
                break;
            
            case "NACIONAL", "MEXICO":
                if (montoTotal <= 1500){
                    costoEnvio = 150.0;
                }
                break;

            case "INTERNACIONAL": 
                if (montoTotal > 3000){
                    costoEnvio = 100.00;
                }
                else {
                    costoEnvio = 500.0;
                }
                break;
            default:
                break;
            }
        return costoEnvio;
    }


    public void imprimirResumen(double montoTotal, double descuento, double costoEnvio, double totalFinal){
        System.out.println("=== RESUMEN DE COMPRA ===");
        System.out.println("Monto Base: $" + montoTotal);
        System.out.println("Descuento Aplicado: $" + descuento);
        System.out.println("Costo de Envío: $" + costoEnvio);
        System.out.println("Total a Pagar: $" + totalFinal);
        System.out.println("Estado: APROBADO");
   }
}
