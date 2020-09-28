class BuildDynamicQueue{

    public static class CustomQueue{
        int[] data;
        int front;
        int size;

        CustomQueue(int cap){
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size(){
            return size;
        }

        void display(){
            if(size == 0){
                System.out.println("Queue Underflow");
            }else{
                for(int i=0; i<size; i++){
                    int idx = (front + i)%data.length;
                    System.out.print(data[idx] + " ");
                }System.out.println();
            }
        }

        void add(int val){
            if(size == data.length-1){
                int[] ndata = new int[2*data.length];
                for(int i=0; i<size; i++){
                    int idx = (front + i)%data.length;
                    ndata[i] = data[idx];
                }

                data = ndata;
                int pos = (front + size)%data.length;
                data[pos] = val;
                size++;
            }else{
                int pos = (front+size)%data.length;
                data[pos] = val;
                size++;
            }
        }

        int remove(){
            if(size == 0){
                System.out.println("Queue Underflow");
                return -1;
            }else{
                int val = data[front];
                front = (front+1)%data.length;
                size--;
                return val;
            }
        }

        int peek(){
            if(size == 0){
                System.out.println("Queue Underflow");
                return -1;
            }else{
                return data[front];
            }
        }
    }

    public static void main(String[] args){
        CustomQueue q = new CustomQueue(4);

         // add
        q.add(10);
        q.add(20);
        q.add(30);

        // display
        q.display();

        //remove
        System.out.println(q.remove());
        q.display();

        // top
        System.out.println(q.peek());

        // size
        System.out.println(q.size());  
    }
}