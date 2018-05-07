public class Counter {
    int fieldValue;
    int initValue;

    public Counter(int fieldValue, int initValue) {
        this.fieldValue = 0;
        this.initValue = 0;
    }

    public Counter(int fieldValue) {
        this.fieldValue = fieldValue;
        initValue = fieldValue;
    }


    public void add(int number) {
        this.fieldValue += number;
    }

    public void add() {
        this.fieldValue += 1;
    }

    public int get() {
        return fieldValue;
    }

    public void reset() {
        this.fieldValue = initValue;
    }




}
