package adrianromanski.data_structures.arrays.dynamic_array;

public class DynamicArray<String> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public String get(int index) {
        return (String)data[index];
    }


    public void set(int index, String value) {
        data[index] = value;
    }


    public void add(String value) {

        if (size == initialCapacity) {
            resize();
            System.out.println("resize() called in add()");
        }
        data[size] = value;
        size++;
    }


    /**
     *  0(n) LINEAR
     */
    public void insert(int index, String value) {
        // Check size
        if(size == initialCapacity) {
            resize();
            System.out.println("resize() called in insert()");
        }
        // Copy up
        System.out.println("BEFORE COPY");
        print();
        int count = 0; // Just for printing
        for(int j = size; j > index; j--) {
            count++;
            System.out.println(count + " loop");
            System.out.println("**************************************");
            System.out.println("BEFORE MOVING ELEMENT");
            printInsert(j);
            data[j] = data[j-1];
            System.out.println("AFTER MOVING ELEMENT");
            printInsert(j);
            System.out.println("**************************************");
        }
        System.out.println("After Copy");
        print();
        // Do the insert
        data[index] = value;
        System.out.println("After Inserting");
        print();
        size++;
    }

    private void printInsert(int j) {
        System.out.println("data[" + j + "] is equal to: " + data[j]);
        System.out.println("data[" + (j - 1) + "] is equal to: " + data[j - 1]);
    }


    /**
     *  0(1) CONSTANT
     */
    public boolean isEmpty() {
        return size == 0;
    }


    public boolean Contains(String value) {
        for(int i = 0; i<= size - 1; i ++) {
            String currentValue = (String)data[i];
            if(currentValue.equals(value)) {
                return true;
            }
        }
        return false;
    }


    /**
     *  0(n) LINEAR
     */
    private void resize() {
        Object[] newData = new Object[initialCapacity * 2];
        for(int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }


    /**
     *  0(1) CONSTANT
     */
    public int size() { return size; }


    /**
     *  0(n) LINEAR
     */
    public void delete(int index) {
        // Copy down
        System.out.println("BEFORE DELETING");
        print();
        int count = 0; // Just for printing
        System.out.println("Index of object do be deleted " + index);
        for (int j = index; j < size - 1; j++) {
            count++;
            System.out.println(count + " loop");
            System.out.println("**************************************");
            System.out.println("BEFORE MOVING ELEMENT");
            printDelete(j);
            data[j] = data[j + 1];
            System.out.println("AFTER MOVING ELEMENT");
            printDelete(j);
            System.out.println("**************************************");
        }
        // Clear last element of array
        data[size - 1] = null;
        size--;
        System.out.println("AFTER DELETING");
        print();
    }

    private void printDelete(int j) {
        System.out.println("data[" + j + "] is equal to: " + data[j + 1]);
        System.out.println("data[" + j + 1 + "] is equal to: " + data[j + 1]);
    }

    public void print() {
        for (int i=0;i <=size;i++) {
            System.out.println("data[" + i + "] = " + data[i]);
        }
    }
}
