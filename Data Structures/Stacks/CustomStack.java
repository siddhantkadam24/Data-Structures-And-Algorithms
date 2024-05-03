public class CustomStack {
    private int defaultSize = 5;
    int ptr=-1; //pointer starting from -1 because when we start adding more elements it will then add from 0
    int [] arr;
    CustomStack() //initializing with default array
    {
        arr = new int[defaultSize];
    }
    CustomStack(int userSize)
    {
        arr = new int[userSize]; // initialzing with user defined size
    }

    public boolean isFull() // to check when adding if the array is full or not, if yes increase teh array
    {   
        if(ptr>=arr.length)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty(){ // while removing to check if the array is empty or  not, if yes give message for that....
        if(ptr==-1)
        {
            return true;
        }
        return false;
    }

    public void push(int value) // to add elements, the latest added element will be the top of stack
    {
        ptr++; //incremented the pointer as to add in 0th index
        if(isFull()) //full or not, if yes array size increases
        {
            int [] temp = new int[arr.length*2];
            for(int i=0;i<arr.length;i++)
            {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[ptr]= value; //assigning the current pointer the value which need to be added
    }

    public void pop() // this function removes the top element and also return that element
    {
        if(isEmpty())//to check array is empty or not
        {
            System.out.println("Stack is empty");
        }
        else{
            int removed = arr[ptr--]; //else assign the current top value to removed as to dislpay later which element got removed
            System.out.println(removed);
        }
    }

    public void peek() // return the top most element
    {
        System.out.println(arr[ptr]);
    }
}
