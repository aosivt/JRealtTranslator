package su.kww.realttranslator.translators.services.vse42.builders.offer.options;

import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.services.vse42.builders.BuilderVse42Advert;

public class Vse42Rooms {
    private Vse42Rooms(){}

    public static Integer get(ServiceAllJson allJson, Integer cat){
        Integer rooms = allJson.getRoomCount();
        if(rooms == 0) {
//            if(cat == BuilderVse42Advert.CAT_FLAT || cat == BuilderVse42Advert.CAT_NEW)
//            {
//                throw new IterationException(false, "Room count not defined", this.mp.EmptyRoomCount())
//                {
//                    Level = ExceptionLevel.Info
//                };
//            }
            return null;
        }

        return rooms;
    }
}
