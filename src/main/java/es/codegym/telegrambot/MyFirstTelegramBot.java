package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {

    public static final String NAME = "MedusaBot0101_bot";
    public static final String TOKEN = "6800774293:AAFXsCbQAcEB7zF2zznOgRqppU4UoMfd7UU";

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
        // TODO: escribiremos la funcionalidad principal del bot aquí

        if (getMessageText().equals("/start")) {
            sendTextMessageAsync("Bienvenida _programadora_🤩🤩🤩");
        }

        if (getMessageText().contains("Hola")){
            sendTextMessageAsync("Hola, ¿Como te llamas?");
        }

        if (getMessageText().contains("Me llamo")){
            sendTextMessageAsync("Encantada de conocerte😊😊😊, soy *Medusa*🐍🐍🐍");
        }
    }




    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}