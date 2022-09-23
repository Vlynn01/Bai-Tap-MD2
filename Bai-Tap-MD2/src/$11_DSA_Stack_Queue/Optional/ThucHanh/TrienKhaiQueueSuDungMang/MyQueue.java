package $11_DSA_Stack_Queue.Optional.ThucHanh.TrienKhaiQueueSuDungMang;

//Tạo lớp MyQueue với các thuộc tính:
public class MyQueue {
    public int capacity;
    public int queueArr[];
    public int head;
    public int tail;
    public int currentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    //Cài đặt phương thức isQueueFull ()
    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    //Cài đặt phương thức isQueueEmpty()
    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    //Cài đặt phương thức enqueue ()
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    //Cài đặt phương thức dequeue ()
    public void dequeue() {
        if (isQueueFull()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

//Cài đặt lớp QueueClient chứa phương thức main để thực thi ứng dụng
public static void main(String[] args) {
    MyQueue queue= new MyQueue(4);
    queue.enqueue(4);
    queue.dequeue();
    queue.enqueue(56);
    queue.enqueue(2);
    queue.enqueue(67);
    queue.dequeue();
    queue.dequeue();
    queue.enqueue(24);
    queue.dequeue();
    queue.enqueue(98);
    queue.enqueue(45);
    queue.enqueue(23);
    queue.enqueue(435);
}
}

