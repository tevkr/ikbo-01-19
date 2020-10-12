package pckg;

public class Main {

    public static void main(String[] args) {
        //1
        Person p1 = new Person("Яновский");
        System.out.println(p1);
        Person p2 = new Person("Владислав", "Валерьевич", "Яновский");
        System.out.println(p2);
        //2
        try {
            Address a = new Address("Россия, 709, Люберцы, улица Пушкина, дом Колотушкина, корпус 3, квартира 128");
            System.out.println(a);
            a = new Address("Россия; 709; Люберцы; улица Пушкина; дом Колотушкина; корпус 3; квартира 128");
            System.out.println(a);
            a = new Address("Россия. 709. Люберцы. улица Пушкина. дом Колотушкина. корпус 3. квартира 128");
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //3
        String[] strshirts = new String[11];
        strshirts[0] = "S001,Black Polo Shirt,Black,XL";
        strshirts[1] = "S002,Black Polo Shirt,Black,L";
        strshirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        strshirts[3] = "S004,Blue Polo Shirt,Blue,M";
        strshirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        strshirts[5] = "S006,Black T-Shirt,Black,XL";
        strshirts[6] = "S007,White T-Shirt,White,XL";
        strshirts[7] = "S008,White T-Shirt,White,L";
        strshirts[8] = "S009,Green T-Shirt,Green,S";
        strshirts[9] = "S010,Orange T-Shirt,Orange,S";
        strshirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts = new Shirt().stringToShirt(strshirts);
        for (Shirt shirt : shirts)
            System.out.println(shirt);
        //4
        Phone p = new Phone("89102223535");
        System.out.println(p);
    }
}
