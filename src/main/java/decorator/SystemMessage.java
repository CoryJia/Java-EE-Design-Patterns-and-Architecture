package decorator;

import decorator.thridpartylogger.LogMessage;

@ComplexMessage
public class SystemMessage implements LogMessage {

    private String message;

    @Override
    public void printMessage() {
        System.out.println(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
