import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
       /* if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());*/
        String comand = update.getMessage().getText();
        if (comand.equalsIgnoreCase("run")) {
            String message = "run/  Cazzo";
            SendMessage   response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }// if
    //}

    @Override
    public String getBotUsername() {
        return "Carlos25Bot";
    }

    @Override
    public String getBotToken() {

        return "5359259088:AAFVzSvcTBhOTbfiOxkTqbaz2guxTLMUTps";
    }

}
