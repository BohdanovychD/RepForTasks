package homework.lesson_4.task_2;

public class ArrayListRealization<T> {
    private final int ARRAY_SIZE = 32;
    private Object[] array = new Object[ARRAY_SIZE];
    private int firstElement = 0;

    public void add(T item) {
        array[firstElement++] = item;
    }

    public T get(int index) {
        return (T) (array[index]);
    }
}
