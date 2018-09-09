

public class PairtyChecker {
    
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            computeParityOp(i);
        }
    }
    
    
    // O(number of set bits)
    public static int computeParity(int x) {
        short parity = 0;
        while (x != 0) {
            parity ^= x & 1;
            x >>>= 1;
        }
        return parity;
    }
    
    //O(number of 1s)
    public static int computeParityOp(int x) {
        int parity = 0;
        while (x != 0) {
            x = (x & (x - 1));
            parity++;
        }
        return parity;
    }
    
    
    /*
     precompute parity in an cache. lets say we r calulating parity of 1 billion longs in java.
     longs are 64 bits. cache will store parity of all possible 65536 16 bit combos. we will use
     bitmasks to extract the parity of first 16 bits then next 16 bits and then next and then last 16 
     bits and XOR all of them together.
     
     Time : O(word size (here 64) / precompute size (here bits)) , 
     for each 64 bit input there are four lookups.     
        
    */
    
    public static int cacheParity(long x) {
        final int MASK_SIZE = 16;
        final int BIT_MASK  = 0xFFFF;
        int parityFirst16  = cache[x >>> (3 * MASK_SIZE) & BIT_MASK];
        int paritySecond16 = cache[x >>> (2 * MASK_SIZE) & BIT_MASK];
        int parityThird16  = cache[x >>> (1 * MASK_SIZE) & BIT_MASK];
        int parityLast16   =  cache[x & BIT_MASK];
        return parityFirst16 ^ paritySeconda6 ^ parityThird16 ^ parityLast16;
    }
}