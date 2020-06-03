package adrianromanski.data_structures.big_o_notation;

public class BigO {

    public void foo(int[] array) {

        // O(n)
        for(int i = 0; i < array.length; i++) {
            // ...
        }

        // O(n)
        for(int i = 0; i < array.length; i++) {
            // ...
        }
    }

    public void bar(int[] array1, int[] array2) {

        //  O(n*m)
        for(int i = 0; i < array1.length; i++) {
            // ...
            for(int j = 0; j < array2.length; j++) {
                // ...
            }
        }
    }

    public void baz(int[] array) {

        // O(n^2)
        for (int i = 0; i < array.length; i++) {
            // ...
            for(int j = 0; j < array.length; j++) {
                // ..
                if(array[i] < array[j]) {
                    // Launch
                }
            }
        }
    }

    public void beep(int[] array) {

        // O(n^2)
        for (int i = 0; i < array.length; i++) {
            // ...
            for (int j = 0; j < array.length; j++) {
                //..
                // That one is O(1)
                for (int k = 0; k < 9999999; k++) {
                    // Jump
                }
            }
        }
    }
}
