public class StackOfIntegers{
    private int[] elements;
    private int size = 0;

    public StackOfIntegers()
    {
        this.elements = new int[16];
    }
    public StackOfIntegers(int capacity)
    {
        this.elements = new int[capacity];
    }

    public boolean empty()
    {
        if (this.size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int peek()
    {
        return this.elements[this.size];
    }

    public void push(int value)
    {
        this.elements[this.size] = value;
        this.size++;
    }


    public int pop()
    {
        this.size--;
        return this.elements[this.size];
    }

    public int getSize()
    {
        return this.size;
    }
}