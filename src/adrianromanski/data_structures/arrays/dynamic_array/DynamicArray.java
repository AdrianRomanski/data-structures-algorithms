package adrianromanski.data_structures.arrays.dynamic_array;

public class DynamicArray<String> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }


    /**
     * O(1) CONSTANT
     */
    public String get(int index) {
        return (String)data[index];
    }


    /**
     * O(1) CONSTANT
     */
    public void set(int index, String value) {
        data[index] = value;
    }


    /**
     *  0(1) CONSTANT
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     *  0(1) CONSTANT
     */
    public int size() {
        return size;
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
        System.out.println("Before Copy");
        print();

        for(int j = size; j > index; j--) {
            data[j] = data[j-1];
        }

        System.out.println("After Copy");
        print();

        // Do the insert
        data[index] = value;
        System.out.println("After Inserting");
        print();
        size++;
    }


    /**
     *  0(n) LINEAR
     */
    public void delete(int index) {
        // Copy down
        System.out.println("BEFORE DELETING");
        print();
        System.out.println("Index of object do be deleted " + index);
        for (int j = index; j < size - 1; j++) {
            data[j] = data[j + 1];
        }
        // Clear last element of array
        data[size - 1] = null;
        size--;
        System.out.println("AFTER DELETING");
        print();
    }

    /**
     *  0(n) LINEAR
     */
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
     *  0(n) LINEAR
     */
    public void print() {
        for (int i=0;i <=size;i++) {
            System.out.println("data[" + i + "] = " + data[i]);
        }
    }


    /**
     *  0(n) LINEAR if need of resize
     *  0(1) CONSTANT if not need of resize
     */
    public void add(String value) {
        if (size == initialCapacity) {
            resize();
            System.out.println("resize() called in add()");
        }
        data[size] = value;
        size++;
    }
}
