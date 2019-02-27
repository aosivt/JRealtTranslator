package su.kww.realttranslator.translators.builders.service;


import su.kww.realttranslator.translators.services.afy.AfyTranslatorService;
import su.kww.realttranslator.translators.services.avito.AvitoTranslatorService;
import su.kww.realttranslator.translators.services.beboss.BebossTranslatorService;
import su.kww.realttranslator.translators.services.bestru.BestruTranslatorService;
import su.kww.realttranslator.translators.services.choister.ChoisterTranslatorService;
import su.kww.realttranslator.translators.services.cian.CianTranslatorService;
import su.kww.realttranslator.translators.services.domclick.DomclickTranslatorService;
import su.kww.realttranslator.translators.services.irr.IrrTranslatorService;
import su.kww.realttranslator.translators.services.kemdom.KemdomTranslatorService;
import su.kww.realttranslator.translators.services.mirkvartir.MirkvartirTranslatorService;
import su.kww.realttranslator.translators.services.move.MoveTranslatorService;
import su.kww.realttranslator.translators.services.ngs.NgsTranslatorService;
import su.kww.realttranslator.translators.services.nnbaza.NnbazaTranslatorService;
import su.kww.realttranslator.translators.services.rentzilla.RenzillaTranslatorService;
import su.kww.realttranslator.translators.services.restate.RestateTranslatorService;
import su.kww.realttranslator.translators.services.russianrealty.RussianRealtyTranslatorService;
import su.kww.realttranslator.translators.services.vestum.VestumTranslatorService;
import su.kww.realttranslator.translators.services.vse42.Vse42TranslatorService;
import su.kww.realttranslator.translators.services.wiweb.WiwebTranslatorService;
import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;
import su.kww.realttranslator.translators.services.zaydinaydi.ZaydiNaydiTranslatorService;


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
