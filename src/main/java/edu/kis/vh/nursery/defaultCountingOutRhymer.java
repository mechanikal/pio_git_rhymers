package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    protected static final int SIZE = 12;
    private static final int METHOD_ERR = -1;
    private static final int ARR_EMPTY = -1;
    private final int[] numbers = new int[SIZE];

    protected int total = ARR_EMPTY;

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

}
