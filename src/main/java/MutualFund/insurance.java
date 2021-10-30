package MutualFund;

public class insurance {
    int client_id;
    String policy_number;
    int policy_id;

    public int getClient_id() {
        return client_id;
    }
    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getPolicy_number() {
        return policy_number;
    }
    public void setPolicy_number(String policy_number) {
        this.policy_number = policy_number;
    }

    public int getPolicy_id() {
        return policy_id;
    }

    public void setPolicy_id(int policy_id) {
        this.policy_id = policy_id;
    }

    void getdata(){
        System.out.println(getClient_id());
        System.out.println(getPolicy_number());
        System.out.println(getPolicy_id());
    }

    public String toString() {
        final String s = "Clientid:" + this.getClient_id() +
                " Policy Number: " + this.getPolicy_number() +
                " Policy ID: " + this.getPolicy_id();
        return s;
    }
}
