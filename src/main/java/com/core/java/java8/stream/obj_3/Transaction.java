package com.core.java.java8.stream.obj_3;

public class Transaction{

    String status;
    Integer id;
    String txName;

    public Transaction(){}

    public Transaction(String status, Integer id, String txName) {
        this.status = status;
        this.id = id;
        this.txName = txName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTxName() {
        return txName;
    }

    public void setTxName(String txName) {
        this.txName = txName;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "status='" + status + '\'' +
                ", id=" + id +
                ", txName='" + txName + '\'' +
                '}';
    }
}