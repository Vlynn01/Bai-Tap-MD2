package $10_DSA_DanhSach.BaiTap.TrienKhaiCacPhuongThucCuaArrayListTheoThuVien_Java_Util_ArrayList;


public class MyList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void ensureCapacity(int minCapacity) {
        if (size >= minCapacity) {
            Object[] newElements = new Object[minCapacity * 2];
            System.arraycopy(elements,0,newElements,0,size);
            elements = newElements;
        }
    }

    public void add(int index, E addElement) {
        size++;
        for (int i = size; i > index ; i--) {
            elements[i] = elements[i -1];
        }
        elements[index] = addElement;
    }
    public void clear(){
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
    public E get(int index){
        return (E) elements[index];
    }
    public  E remote(int index) {
        E result =(E) elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i + 1];
            size--;
        } return result;
    }
    public int size(){
        return size;
    }
    public E[] clone() {
        Object[] newElement = new Object[elements.length];
        System.arraycopy(elements,0,newElement,0,elements.length);
        return (E[]) newElement;
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e){
        if (size >= elements.length ){
            return false;
        }else {
            return true;
        }
    }
    public boolean checkIndex(int index) {
        if (index < 0 && index > elements.length)
            return false;
        return true;
    }
    public void display() {
        for (Object o: elements) {
            if (o!=null) {
                System.out.println(o);
            }
        }
    }
}