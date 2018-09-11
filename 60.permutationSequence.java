class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new LinkedList<>();
        // list of 1 to n
        for (int i = 1; i <= n; i++)
            list.add(i);
        // lookup factorials
        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        for (int i = 1;  i < n + 1; i++) 
            factorial[i] = i * factorial[i-1];
        
        StringBuilder sb = new StringBuilder();
        k = k - 1;
        int i = 1;
        int index = -1;
        while(sb.length() != n) {
            index = k/factorial[n - i];
            sb.append(list.get(index));
            list.remove(index);
            k = k - (factorial[n - i] * index);
            i++;
        }
        return sb.toString();
    }

}
}