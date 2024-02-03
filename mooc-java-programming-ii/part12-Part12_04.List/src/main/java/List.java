public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        if(this.firstFreeIndex == this.values.length) {
            this.grow();
        }

        this.values[firstFreeIndex] = value;
        this.firstFreeIndex += 1;
    }

    public void remove(Type value) {
        int indexOfValue = this.indedOfValue(value);
        if(indexOfValue < 0) {
            return;
        }
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex -= 1;
    }

    public boolean contains(Type value) {
        return indedOfValue(value) >= 0;
    }

    public Type value(int index) {
        if(index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index" + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }

    public int indedOfValue(Type value) {
        for(int i=0; i < this.firstFreeIndex; i++) {
            if(this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return this.firstFreeIndex;
    }

    private void grow() {
        int newSize = this.values.length + (this.values.length / 2);
        Type[] newValues = (Type[]) new Object[newSize];
        for(int i = 0; i< this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    private void moveToTheLeft(int fromIndex) {
        for(int i = fromIndex; i < this.firstFreeIndex; i++) {
            this.values[i] = this.values[i+1];
        }
    }
    
}
