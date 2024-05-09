package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

public static  int TOTAL_NUMBERS = 12;
public static int MAX_CAPACITY = TOTAL_NUMBERS - 1;
public static final int EMPTY = -1;


    private int[] NUMBERS = new int[TOTAL_NUMBERS];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY ;
        }
        
            public boolean isFull() {
                return total == MAX_CAPACITY;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return EMPTY;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return EMPTY;
                        return NUMBERS[total--];
                    }

}
