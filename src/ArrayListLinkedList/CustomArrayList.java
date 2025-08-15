package ArrayListLinkedList;

public class CustomArrayList {
    private int[] arrayy;
    private int size;




    public CustomArrayList() {
        arrayy = new int[5]; // başlanğıc ölçü
        size = 0;
    }

    // olcunu artirmaq
    private void resize() {
        int[] newArrat = new int[arrayy.length * 2];
        for (int i = 0; i < arrayy.length; i++) {
            newArrat[i] = arrayy[i];
        }
        arrayy = newArrat;
    }

    // Element elave etmel
    public void add(int value) {
        if (size == arrayy.length) {
            resize();
        }
        arrayy[size++] = value;
    }

    // İndex-e gore element goturmek
    public int get(int index) {
        return arrayy[index];
    }

    // İndex-e gore silmel
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            arrayy[i] = arrayy[i + 1];
        }
        size--;
    }


    // Elementlri gostermek
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arrayy[i] + " , ");
        }
        System.out.println();
    }
}
