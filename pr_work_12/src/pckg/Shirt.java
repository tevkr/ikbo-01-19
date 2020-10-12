package pckg;

public class Shirt {
    private String id, model, color, size;

    public Shirt(String id, String model, String color, String size) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.size = size;
    }

    public Shirt() {

    }

    public Shirt[] stringToShirt(String[] str)
    {
        Shirt[] shirts = new Shirt[str.length];
        for (int i = 0;i<str.length;i++)
        {
            String[] shirt = str[i].split(",");
            shirts[i] = new Shirt(shirt[0], shirt[1], shirt[2], shirt[3]);
        }
        return shirts;
    }

    @Override
    public String toString() {
        return "Shirt:" +
                "\nid='" + id + '\'' +
                "\nmodel='" + model + '\'' +
                "\ncolor='" + color + '\'' +
                "\nsize='" + size + '\'' +
                '\n';
    }
}
