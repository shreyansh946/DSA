package DESIGNPAYMENTGATEWAY;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionService {

    public static Map<Integer, List<Transaction>> userVsTransactionList = new HashMap<>();
    InstrumentController instrumentController;
    Processor processor;



}
