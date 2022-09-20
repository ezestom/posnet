package posnet;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Posnet posnet = new Posnet();
        Persona p = new Persona("33333","eze", "lopes","23234323","eze@eze.st");
        TarjetaDeCredito t = new TarjetaDeCredito("brubakn","34232423435",15000, EntidadFinanciera.BIRZA, p);

        System.out.println("Tarjeta antes del pago");
        System.out.println(t);

        System.out.println("ticket tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(t,10000,5);
        System.out.println(ticketGenerado);

        System.out.println("************************");

        ArrayList<Ticket>misTickets = new ArrayList<>();

        misTickets.add(ticketGenerado);

        System.out.println(misTickets);

        System.out.println(misTickets.size());


    }
}
