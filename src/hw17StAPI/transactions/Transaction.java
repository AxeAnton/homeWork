package hw17StAPI.transactions;


public class Transaction {
    private String uuid;
    private long sum;
    private  Account account;

    public Transaction(String uuid, long sum, Account account) {
        this.uuid = uuid;
        this.sum = sum;
        this.account = account;
    }

    public Transaction(String uuid, int sum,Account account1) {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public  Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


}
