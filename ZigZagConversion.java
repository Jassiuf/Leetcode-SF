class Solution {
    
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
        List<StringBuffer> list = new ArrayList<>();        
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuffer());
        }
        int row = 0;
        boolean down = false;
        for (int i = 0; i < s.length(); i++) {
            list.get(row).append(s.charAt(i));
            
            if (row == 0 || row == numRows - 1) 
                down = !down;
            
            if (down) 
                row++;
            else 
                row--;
            
        }
        
        StringBuffer res = new StringBuffer();
        for (StringBuffer sb : list) {
            res.append(sb);
        }
        return new String(res);
    }
}