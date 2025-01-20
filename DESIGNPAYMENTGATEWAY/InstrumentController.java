package DESIGNPAYMENTGATEWAY;

import java.util.List;

public class InstrumentController {

            InstrumentServiceFactory instrumentServiceFactory;

            public InstrumentController()
            {
                this.instrumentServiceFactory = new InstrumentServiceFactory();
            }

   public InstrumentDTO addInstrument(InstrumentDTO instrument)
            {
                InstrumentService instrumentController = instrumentServiceFactory
                        .getInstrumentService(instrument.instrumentType);

                return instrumentController.addInstrument(instrument);
            }

   public List<InstrumentDTO> getAllInstrument(int UserID)
            {
                InstrumentService bankInstrumentController = instrumentServiceFactory.getInstrumentService(InstrumentType.Bank);
                InstrumentService cardInstrumentController = instrumentServiceFactory.getInstrumentService(InstrumentType.Card);

                List<InstrumentDTO> instrumentDTOList = bankInstrumentController.getInstrumentByUserId(UserID);
                instrumentDTOList.addAll(cardInstrumentController.getInstrumentByUserId(UserID));
                return instrumentDTOList;
            }

     public InstrumentDTO getInstrumentByID(int userId,int instrumentID)
            {
                List<InstrumentDTO> instrumentDTOList = getAllInstrument(userId);
                for(InstrumentDTO instrumentDTO: instrumentDTOList)
                {
                    if(instrumentDTO.getInstrumentID() == instrumentID)
                    {
                        return instrumentDTO;
                    }
                }
                return  null;
            }
}
