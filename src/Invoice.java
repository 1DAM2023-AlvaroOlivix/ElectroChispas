import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private String code;
    private String invoiceDate;
    private String taskBase;
    private String total;
    private Customer customer;
    private ArrayList<Sells> sellsList=new ArrayList<>();
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public void setTaskBase(String taskBase) {
        this.taskBase = taskBase;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public ArrayList<Sells> getSellsList() {
        return sellsList;
    }

    public void setSellsList(ArrayList<Sells> sellsList) {
        this.sellsList = sellsList;
    }
    public void addSells(Sells sells){
        sellsList.add(sells);
    }
    public Sells getSells(int position){
        return sellsList.get(position);
    }

}
