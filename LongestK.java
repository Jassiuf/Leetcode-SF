
public class Main {
    public static void main(String[] args) {
        String[] words = "Lorembbbbbbbbbbb ipsumaaaaaaaaaaa dolorffffffffff sitccccccccccccc ametddddddd, consectetur adipiscing elit. Sed nisl velit, tristique nec dolor in, imperdiet dictum nisi. In eleifend et elit a pulvinar. Aenean molestie tortor quis arcu iaculis, at congue velit facilisis. Proin at lectus nisl. Fusce porta velit porttitor nibh sagittis tempus. Aliquam erat volutpat. Ut elementum, turpis laoreet tincidunt tincidunt, lectus orci pretium dolor, a semper leo neque quis orci".split(" ");
        
        List<String> l = new ArrayList<String>();
        for (String w : words) {
            l.add(w);
        }
        
        l = longestK(5,l);        
        
        for (String w : l) {
            System.out.println(w);
        }
    }
    
    public static List<String> longestK(int k, List<String> list) {
        PriorityQueue<String> pq = new PriorityQueue<>(
        k , (s1,s2) -> Integer.compare(s1.length(), s2.length())
        );
        
        for(String s : list) {
            pq.add(s);
            if(pq.size() > k) {
                pq.remove();
            } 
        }        
        return new ArrayList<>(pq);
        
    }
    
}