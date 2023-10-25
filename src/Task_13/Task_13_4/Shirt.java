package Task_13.Task_13_4;

class Shirt {
    private final String id;
    private final String description;
    private final String color;
    private final String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nDescription: " + description + "\nColor: " + color + "\nSize: " + size + "\n";
    }
}







