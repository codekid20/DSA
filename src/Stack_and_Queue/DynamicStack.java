package Stack_and_Queue;

public class DynamicStack extends customStack{

    public DynamicStack() {
        super(); // it will call customStack()
    }

    public DynamicStack(int size) {
        super(size); // it will call customStack(int size)
    }

    @Override
    public boolean push(int item) {
        // this takes care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // here array is not full
        // insert item
        return super.push(item);
    }
}
