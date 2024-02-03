public class TripleTacoBox implements TacoBox{
    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    public void eat() {
        if(this.tacosRemaining() - 1 >= 0) {
            this.tacos -= 1;
        }
    }
    
    public int tacosRemaining() {
        return this.tacos;
    }
}
