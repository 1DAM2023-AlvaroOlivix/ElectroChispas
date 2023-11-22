public class Main {
    public static void main(String[] args) {
       //Client: Autonomous
        Autonomous autonomous = new Autonomous();
        autonomous.setCode("00001");
        autonomous.setDni("70837021b");
        autonomous.setName("Perry");
        autonomous.setSurname("Bordalas");
        autonomous.setEmail("awesome@gmail.com");
        autonomous.setPhoneNumber("700235432");
        autonomous.setProvince("Zaragoza");
        autonomous.setPoblation("Barrio Pinto");
        autonomous.setAddress("Calle Venicio del Toro");

        //Client: Societies
        Societies societies =new Societies();
        societies.setCode("00002");
        societies.setCif("K10434530");
        societies.setName("Pegamentos SL");
        societies.setAddress("Parrales Discordia");
        societies.setProvince("Murcia");
        societies.setPoblation("Horcasitas");
        societies.setEmail("sl_pegamentos@hotmail.com");
        societies.setPhoneNumber("943205423");

        invoice(societies);
        invoice(autonomous);
    }
    public static void invoice(Customer customer){
        System.out.println(" Código :" + customer.getCode());
    }

}