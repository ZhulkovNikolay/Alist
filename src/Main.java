public class Main {

    public static void main(String[] args) {


        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);

        //System.out.println("список всех текущих элементов: \n");

        System.out.println("размер нашего списка: " + myArrayList.size());
        System.out.println("взяли 3 элемент: " + myArrayList.get(3));
        myArrayList.remove(3);
        System.out.println("размер списка после удаления 3 элемента: " + myArrayList.size());

    }
}
