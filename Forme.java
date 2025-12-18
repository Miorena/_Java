// keyword 'abstract' used to define an abstract class
public abstract class Forme {
    // attributs
    protected String color;

    // constructeur
    public Forme(String color) {
        this.color = color;
    }

    // concrete method (implemented method)
    public String getColor() {
        return color;
    }

    // abstract method (unimplemented method)
    public abstract double calcArea();
}
