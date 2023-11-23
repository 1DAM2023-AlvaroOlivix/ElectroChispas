import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Client: Autonomous
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la informacion para el cliente Autonomo");
        Autonomous autonomous = new Autonomous();
        System.out.println("Introduzca el DNI");
        autonomous.setCode(sc.nextLine());
        System.out.println("Introduzca el Nombre");
        autonomous.setName(sc.nextLine());
        System.out.println("Introduzca el Apellido");
        autonomous.setSurname(sc.nextLine());
        System.out.println("Añada un Correo");
        autonomous.setEmail(sc.nextLine());
        System.out.println("Agrege un numero de Telefono");
        autonomous.setPhoneNumber(sc.nextLine());
        System.out.println("Añada su Provincia");
        autonomous.setProvince(sc.nextLine());
        System.out.println("Introduzca la Poblaci´´on a laque pertenece");
        autonomous.setPoblation(sc.nextLine());
        System.out.println("Y su dirreccion Postal");
        autonomous.setAddress(sc.nextLine());

        //Client: Societies
        Societies societies = new Societies();
        societies.setCode("K12093456");
        societies.setCompanyName("Pegamentos SL");
        societies.setAddress("Parrales Discordia");
        societies.setProvince("Murcia");
        societies.setPoblation("Horcasitas");
        societies.setEmail("sl_pegamentos@hotmail.com");
        societies.setPhoneNumber("943205423");

        //Producto : Producto1
        Products products = new Products();
        products.setCodeP("AAAAA1");
        products.setName("Aspiradora Zero-Rayline 2.0");
        products.setBrand("Zero");
        products.setModel("RayLine 2.0");
        products.setPrice("200.00");
        products.setIvaType("10%");


        //Product: Product2
        Products products1 = new Products();
        products1.setCodeP("AAAAA2");
        products1.setName("Fregona Comba-1700");
        products1.setBrand("Comba");
        products1.setModel("Comba-1700");
        products1.setPrice("70.00");
        products1.setIvaType("4%");

        //Service: Service.
        Service service = new Service();
        service.setCodeS("11111A");
        service.setName("Instalación de Placas Solares");
        service.setBrand("EkonomicasSL");
        service.setPrice("1400.00");
        service.setIvaType("21%");
//Service1: Service..
        Service service1 = new Service();
        service1.setCodeS("11111B");
        service1.setName("Reparación de Muro");
        service1.setBrand("DemolitionerBumm");
        service1.setPrice("250");
        service1.setIvaType("0%");


    }
    }
