// Implement Two Stacks in a Single Array

public class TwoStacks {
    private int[] arr;
    private int size;
    private int top1, top2;

    public TwoStacks(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;  // Top of stack 1
        top2 = size; // Top of stack 2
    }

    // Push element to stack 1
    public void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Push element to stack 2
    public void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Pop element from stack 1
    public int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    // Pop element from stack 2
    public int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);

        ts.push1(5);
        ts.push1(10);
        ts.push2(15);
        ts.push2(20);

        System.out.println( ts.pop1()); 
        System.out.println(ts.pop2()); 
    }
}

