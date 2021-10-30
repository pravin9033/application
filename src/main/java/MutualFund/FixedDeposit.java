package MutualFund;

public class FixedDeposit {
    int client_id;
    int amount_invested;
    String maturity_date;

    public int getClient_id() {
        return client_id;
    }

    public int getAmount_invested() {
        return amount_invested;
    }

    public String getDate() {
        return maturity_date;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setAmount_invested(int amount_invested) {
        this.amount_invested = amount_invested;
    }

    public void setDate(String date) {
        this.maturity_date = date;
    }

    void getdata(){
        System.out.println(getClient_id());
        System.out.println(getAmount_invested());
        System.out.println(getDate());
    }
    public String toString() {
        final String s = "Clientid:" + this.getClient_id() +
                " Amount invested: " + this.getAmount_invested() +
                " Maturity date: " + this.getDate();
        return s;
    }
}
