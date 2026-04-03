class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.valueOf(String.valueOf(str.charAt(str.length() - 1 - i)));
        }
        
        return arr;
    }
}