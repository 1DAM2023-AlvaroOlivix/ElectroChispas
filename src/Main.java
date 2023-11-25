import java.util.Date;
import java.util.Scanner;

public class Main {

    private static Products service;

    public static void main(String[] args) {
        //Client 1: Autonomous
        Autonomous autonomous = new Autonomous();
        autonomous.setCode("2299484820G");
        autonomous.setName("Mario");
        autonomous.setSurname("Robert");
        autonomous.setEmail("alvasd@gmail.com");
        autonomous.setPhoneNumber("123894321");
        autonomous.setProvince("Avila");
        autonomous.setPoblation("Avila");
        autonomous.setAddress("Calle La patrona");
        //System.out.println("................................................");


        //Client 2: Societies
        Societies societies = new Societies();
        societies.setCode("A09834209");
        societies.setCompanyName("EurecaAS");
        societies.setEmail("redfkgd@gmail.com");
        societies.setPhoneNumber("900200201");
        societies.setProvince("Avila");
        societies.setPoblation("Avila");
        societies.setAddress("Refugio De Chilla");

        //Producto : Producto1
        Products products = new Products();
        products.setCode("01");
        products.setName("Zero-RayL2");
        products.setModel("Zero");
        products.setBrand("RayLine 2.0");
        products.setPrice("200.00");
        products.setIva("10%");

//Producto : Producto 2
        Products products1 = new Products();
        products1.setCode("02");
        products1.setName("Birk");
        products1.setBrand("Outprite");
        products1.setModel("Light");
        products1.setPrice("120.00");
        products1.setIva("21%");
        //Product: Product2


        //Service: Service.
        Service service = new Service();
        service.setCode("0-1");
        service.setName("Intalación Placas Solares");
        service.setPrice("2000.00");
        service.setIva("4%");
        service.setHoursWorked("25h");

//Service1: Service
        Service service1 = new Service();
        service1.setCode("0-2");
        service1.setName("Reparación Municipal");
        service1.setPrice("200.00");
        service1.setIva("4%");
        service1.setHoursWorked("25h");
        //Invoice

        Invoice invoice=new Invoice();
        invoice.setCode("I1");
        invoice.setInvoiceDate("23-10-2023");
        invoice.setCustomer(autonomous);
        invoice.setTaskBase("270€");
        invoice.setTotal("2256€");
        invoice.addSells(products);
        invoice.addSells(service1);

        //Invoice 2
        Invoice invoice1=new Invoice();
        invoice1.setCode("I2");
        invoice1.setInvoiceDate("02-05-2023");
        invoice1.setCustomer(societies);
        invoice1.setTaskBase("80€");
        invoice1.setTotal("1100€");
        invoice1.addSells(products1);
        invoice1.addSells(service1);

        invoiceprint(invoice);
        invoiceprint(invoice1);

    }

    public static void invoiceprint(Invoice invoice) {
        System.out.println("--------------FACTURA----------------\n" +
                "Codigo : " + invoice.getCode() + "     |     Nombre : " + invoice.getInvoiceDate() + "\n"+
                "--------------------");
        System.out.println(       "Cliente : " + invoice.getCustomer().getCode() + "\n" + "Nombre : " + invoice.getCustomer().getName() + "\n" +
                "Direccion : " + invoice.getCustomer().getAddress() + "    |    Poblacion : " + invoice.getCustomer().getPoblation() + "\n");
        for (Sells sells : invoice.getSellsList()) {
            System.out.println(" Codigo : " + sells.getCode() + "   |   Nombre : " + sells.getName() + "    |    Tipo de Iva : " + sells.getIva()+ "\n");
        }
    }
}

