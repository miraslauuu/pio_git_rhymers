package edu.kis.vh.nursery;

private class defaultCountingOutRhymer {

private static  int TOTAL_NUMBERS = 12;
private static int MAX_CAPACITY = TOTAL_NUMBERS - 1;
private static final int EMPTY = -1;


    private final int[] NUMBERS = new int[TOTAL_NUMBERS];

    private int total = -1;

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

                    public int getTotal() {
                        return total;
                    }

}
