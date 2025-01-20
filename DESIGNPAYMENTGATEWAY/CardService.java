package DESIGNPAYMENTGATEWAY;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService extends InstrumentService{
    @Override
    public InstrumentDTO addInstrument(InstrumentDTO instrumentDTO) {
        CardInstrument cardInstrument =new CardInstrument();
        cardInstrument.instrumentID = new Random().nextInt(100-10)+10;
        cardInstrument.cardNumber = instrumentDTO.cardNumber;
        cardInstrument.cvvNumber = instrumentDTO.cvv;
        cardInstrument.instrumentType = InstrumentType.Card;
        cardInstrument.userID = instrumentDTO.userID;
        List<Instrument> UserInstrumentsList = userVsInstrument.get(cardInstrument.userID);
        if(UserInstrumentsList == null)
        {
            UserInstrumentsList = new ArrayList<>();
            userVsInstrument.put(cardInstrument.userID,UserInstrumentsList);
        }
        UserInstrumentsList.add(cardInstrument);
        return mapBankInstrumentToInstrumentDTO((CardInstrument) cardInstrument);
    }

    @Override
    public List<InstrumentDTO> getInstrumentByUserId(int userID) {
        List<Instrument> userInstruments = userVsInstrument.get(userID);
        List<InstrumentDTO> userInstrumentsFetched = new ArrayList<>();
        for(Instrument instrument : userInstruments)
        {
            if (instrument.getInstrumentType() == InstrumentType.Card)
                    userInstrumentsFetched.add(mapBankInstrumentToInstrumentDTO((CardInstrument ) instrument));
        }
        return userInstrumentsFetched;
    }


    public InstrumentDTO mapBankInstrumentToInstrumentDTO(CardInstrument cardInstrument)
    {
        InstrumentDTO instrumentDTO = new InstrumentDTO();
        instrumentDTO.instrumentType =cardInstrument.instrumentType;
        instrumentDTO.instrumentID = cardInstrument.instrumentID;
        instrumentDTO.cardNumber = cardInstrument.cardNumber;
        instrumentDTO.cvv = cardInstrument.cvvNumber;
        instrumentDTO.userID = cardInstrument.userID;
        return instrumentDTO;
    }

}
