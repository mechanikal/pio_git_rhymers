package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int METHOD_ERR = -1;
    private static final int ARR_EMPTY = -1;
    private final int[] numbers = new int[SIZE];

    public static int getSIZE() {
        return SIZE;
    }

    public static int getMethodErr() {
        return METHOD_ERR;
    }

    public static int getArrEmpty() {
        return ARR_EMPTY;
    }

    public int getTotal() {
        return total;
    }

    private int total = ARR_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == ARR_EMPTY;
    }

    protected boolean isFull() {
        return total == SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return METHOD_ERR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return METHOD_ERR;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
