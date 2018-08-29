class Solution {
    
    public List<String> letterCombinations(String digits) {
        
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return list;
        }
        String[] dict = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(digits, 0, dict, "", list);
        return list;
    }
    
    public void helper(String digits, int i, String[] dict, String resSoFar, List<String> list) {
        // base case
        if (i == digits.length()) 
            list.add(resSoFar);
        else {
            char c = digits.charAt(i);
            String mapping = dict[c - '0'];
            //choose
            for (char ch: mapping.toCharArray()  ) {
                helper(digits, i + 1, dict, resSoFar + ch, list);
            }
        }
    }
}