package DESIGNPAYMENTGATEWAY;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankService extends InstrumentService {

    @Override
    public InstrumentDTO addInstrument(InstrumentDTO instrumentDTO) {
        BankInstrument bankInstrument = new BankInstrument();
        bankInstrument.instrumentID = new Random().nextInt(100 - 10) + 10;
        bankInstrument.BankAccountNumber = instrumentDTO.bankAccountNumber;
        bankInstrument.ifscCode = instrumentDTO.ifsc;
        bankInstrument.userID = instrumentDTO.userID;
        bankInstrument.instrumentType = instrumentDTO.instrumentType;
        List<Instrument> userInstrumentList = userVsInstrument.get(bankInstrument.userID);
        if (userInstrumentList == null) {
            userInstrumentList = new ArrayList<>();
            userVsInstrument.put(bankInstrument.userID, userInstrumentList);
        }
        userInstrumentList.add(bankInstrument);
        return mapBankInstrumentToInstrumentDTO(bankInstrument);
    }

    @Override
    public List<InstrumentDTO> getInstrumentByUserId(int userID) {
        List<Instrument> userInstruments = userVsInstrument.get(userID);
        List<InstrumentDTO> userInstrumentsFetched = new ArrayList<>();
        for (Instrument instrument : userInstruments) {
            if (instrument.getInstrumentType() == InstrumentType.Bank) {
                userInstrumentsFetched.add(mapBankInstrumentToInstrumentDTO((BankInstrument) instrument));
            }
        }
        return userInstrumentsFetched;
    }


    public InstrumentDTO mapBankInstrumentToInstrumentDTO(BankInstrument bankInstrument) {
        InstrumentDTO instrumentDOOBJ = new InstrumentDTO();
        instrumentDOOBJ.instrumentType = bankInstrument.instrumentType;
        instrumentDOOBJ.instrumentID = bankInstrument.instrumentID;
        instrumentDOOBJ.bankAccountNumber = bankInstrument.BankAccountNumber;
        instrumentDOOBJ.ifsc = bankInstrument.ifscCode;
        instrumentDOOBJ.userID = bankInstrument.userID;
        return instrumentDOOBJ;
    }

}
