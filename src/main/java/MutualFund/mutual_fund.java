package MutualFund;

public class mutual_fund {
    int client_id;
    int parent_id;
    double balance_unit;

    public int getClient_id() {
        return client_id;
    }
    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getParent_id() {
        return parent_id;
    }
    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public double getBalance_unit() {
        return balance_unit;
    }

    public void setBalance_unit(double balance_unit) {
        this.balance_unit = balance_unit;
    }

    void getdata(){
        System.out.println(getClient_id());
        System.out.println(getParent_id());
        System.out.println(getBalance_unit());
    }
    public String toString() {
        final String s = "Clientid:" + this.getClient_id() +
                " ParentId: " + this.getParent_id() +
                " Balance units: " + this.getBalance_unit();
        return s;
    }



}
