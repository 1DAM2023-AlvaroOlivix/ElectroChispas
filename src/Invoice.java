import java.lang.reflect.Array;
import java.util.ArrayList;

public class Invoice {
    private String code;
    private String invoiceDate;
    private String taskBase;
    private String total;
    private Customer customer;
    private ArrayList<Products> products;
    private ArrayList<Service> services;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Products> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Products> products) {
        this.products = products;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getTaskBase() {
        return taskBase;
    }

    public void setTaskBase(String taskBase) {this.taskBase = taskBase;}

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
