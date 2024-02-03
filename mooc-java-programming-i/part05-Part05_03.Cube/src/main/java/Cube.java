public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int getLength() {
        return this.edgeLength;
    }

    public int volume() {
        return this.getLength() * this.getLength() * this.getLength();
    }

    public String toString() {
        return "The length of the edge is " + this.getLength() + " and the volume is " + this.volume();
    }
    
}
