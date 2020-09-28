package pckg;

import javax.print.DocFlavor;

public class Client {
    private String FIO;
    private String INN;

    Client(String FIO, String INN) throws BadINNException {
        this.FIO = FIO;
        if (!INN.matches("[0-9]+"))
            throw new BadINNException("Присутствуют буквы");
        else if (INN.length() != 12)
            throw new BadINNException("Цифр не 12");
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }
}
