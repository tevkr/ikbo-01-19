package pckg;

public class Phone {
    private String formattedPhone;
    public Phone(String phone)
    {
        formattedPhone = format(phone);
    }
    public String format(String Phone)
    {
        String number;
        String code;
        number = Phone.substring(Phone.length()-10,Phone.length()-7)
                + "-" + Phone.substring(Phone.length()-7,Phone.length()-4)
            + "-" + Phone.substring(Phone.length()-4,Phone.length());
        code = Phone.substring(0,Phone.length()-10);
        if (code.charAt(0) == '8')
            code = "+7";
        return code + number;
    }
    @Override
    public String toString() {
        return formattedPhone;
    }
}
