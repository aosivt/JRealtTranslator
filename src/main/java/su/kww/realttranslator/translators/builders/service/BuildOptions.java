package su.kww.realttranslator.translators.builders.service;


import su.kww.realttranslator.translators.builders.service.TranslatorService;
import su.kww.realttranslator.translators.service.afy.AfyTranslatorService;
import su.kww.realttranslator.translators.service.avito.AvitoTranslatorService;
import su.kww.realttranslator.translators.service.beboss.BebossTranslatorService;
import su.kww.realttranslator.translators.service.bestru.BestruTranslatorService;
import su.kww.realttranslator.translators.service.choister.ChoisterTranslatorService;
import su.kww.realttranslator.translators.service.cian.CianTranslatorService;
import su.kww.realttranslator.translators.service.domclick.DomclickTranslatorService;
import su.kww.realttranslator.translators.service.irr.IrrTranslatorService;
import su.kww.realttranslator.translators.service.kemdom.KemdomTranslatorService;
import su.kww.realttranslator.translators.service.mirkvartir.MirkvartirTranslatorService;
import su.kww.realttranslator.translators.service.move.MoveTranslatorService;
import su.kww.realttranslator.translators.service.ngs.NgsTranslatorService;
import su.kww.realttranslator.translators.service.nnbaza.NnbazaTranslatorService;
import su.kww.realttranslator.translators.service.rentzilla.RenzillaTranslatorService;
import su.kww.realttranslator.translators.service.restate.RestateTranslatorService;
import su.kww.realttranslator.translators.service.russianrealty.RussianRealtyTranslatorService;
import su.kww.realttranslator.translators.service.vestum.VestumTranslatorService;
import su.kww.realttranslator.translators.service.vse42.Vse42TranslatorService;
import su.kww.realttranslator.translators.service.wiweb.WiwebTranslatorService;
import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;
import su.kww.realttranslator.translators.service.zaydinaydi.ZaydiNaydiTranslatorService;


public enum BuildOptions {
    YANDEX{
        @Override
        public TranslatorService getTranslatorService() {
            return new YandexTranslatorService();
        }
    },
    AVITO{
        @Override
        public TranslatorService getTranslatorService() {
            return new AvitoTranslatorService();
        }
    },
    IRR{
        @Override
        public TranslatorService getTranslatorService() {
            return new IrrTranslatorService();
        }
    },
    NGS{
        @Override
        public TranslatorService getTranslatorService() {
            return new NgsTranslatorService();
        }
    },
    VSE42{
        @Override
        public TranslatorService getTranslatorService() {
            return new Vse42TranslatorService();
        }
    },
    MIRKVARTIR{
        @Override
        public TranslatorService getTranslatorService() {
            return new MirkvartirTranslatorService();
        }
    },
    NNBAZA{
        @Override
        public TranslatorService getTranslatorService() {
            return new NnbazaTranslatorService();
        }
    },
    AFY{
        @Override
        public TranslatorService getTranslatorService() {
            return new AfyTranslatorService();
        }
    },
    CHOISTER{
        @Override
        public TranslatorService getTranslatorService() {
            return new ChoisterTranslatorService();
        }
    },
    BEBOSS{
        @Override
        public TranslatorService getTranslatorService() {
            return new BebossTranslatorService();
        }
    },
    KEMDOM{
        @Override
        public TranslatorService getTranslatorService() {
            return new KemdomTranslatorService();
        }
    },
    RESTATE{
        @Override
        public TranslatorService getTranslatorService() {
            return new RestateTranslatorService();
        }
    },
    RUSSIAN_REALTY{
        @Override
        public TranslatorService getTranslatorService() {
            return new RussianRealtyTranslatorService();
        }
    },
    DOMCLICK{
        @Override
        public TranslatorService getTranslatorService() {
            return new DomclickTranslatorService();
        }
    },
    CIAN{
        @Override
        public TranslatorService getTranslatorService() {
            return new CianTranslatorService();
        }
    },
    RENTZILLA{
        @Override
        public TranslatorService getTranslatorService() {
            return new RenzillaTranslatorService();
        }
    },
    BESTRU{
        @Override
        public TranslatorService getTranslatorService() {
            return new BestruTranslatorService();
        }
    },
    WIWEB{
        @Override
        public TranslatorService getTranslatorService() {
            return new WiwebTranslatorService();
        }
    },
    ZAYDINAYDI{
        @Override
        public TranslatorService getTranslatorService() {
            return new ZaydiNaydiTranslatorService();
        }
    },
    MOVE{
        @Override
        public TranslatorService getTranslatorService() {
            return new MoveTranslatorService();
        }
    },
    VESTUM{
        @Override
        public TranslatorService getTranslatorService() {
            return new VestumTranslatorService();
        }
    };
    public abstract TranslatorService getTranslatorService();
}
