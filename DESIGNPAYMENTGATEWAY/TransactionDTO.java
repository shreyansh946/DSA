package DESIGNPAYMENTGATEWAY;

public class TransactionDTO {

    int TxnID;
    int senderID;
    int receiveID;
    int debitInstrumentId;
    int CreditInstrumentId;
    int amount;
    TransactionStatus status;

    public int getTxnID() {
        return TxnID;
    }

    public void setTxnID(int txnID) {
        TxnID = txnID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public int getCreditInstrumentId() {
        return CreditInstrumentId;
    }

    public void setCreditInstrumentId(int creditInstrumentId) {
        CreditInstrumentId = creditInstrumentId;
    }

    public int getDebitInstrumentId() {
        return debitInstrumentId;
    }

    public void setDebitInstrumentId(int debitInstrumentId) {
        this.debitInstrumentId = debitInstrumentId;
    }

    public int getReceiveID() {
        return receiveID;
    }

    public void setReceiveID(int receiveID) {
        this.receiveID = receiveID;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }


}
