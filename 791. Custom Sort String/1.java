class Solution {
    HashMap<Character, Integer> priority = new HashMap<>();
    public String customSortString(String order, String s) {
        int k = 1;
        for (char c: order.toCharArray()) {
            priority.put(c, (priority.getOrDefault(c, 0) == 0 ? k++ : priority.get(c)));
        }
        priority.forEach((x,v) -> System.out.println(x + " : " + v));
        Character[] str = new Character[s.length()];
        for ( int i = 0; i < s.length(); i++)   str[i] = s.charAt(i);
        Arrays.sort(str, (a,b) -> priority.getOrDefault(a, -1) - priority.getOrDefault(b, -1));
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < s.length(); i++)   sb.append(str[i]);
        return sb.toString();
    }
}
