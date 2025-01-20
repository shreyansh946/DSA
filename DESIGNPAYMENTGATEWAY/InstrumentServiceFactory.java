package DESIGNPAYMENTGATEWAY;

public class InstrumentServiceFactory {

    public InstrumentService getInstrumentService(InstrumentType instrumentType)
    {
        if(instrumentType == instrumentType.Bank)
        {
            return new BankService();
        }
        else if(instrumentType == InstrumentType.Card)
        {
            return new CardService();
        }

        return null;
    }
}
