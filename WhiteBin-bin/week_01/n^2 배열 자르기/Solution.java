class Solution {
    public int[] solution(int n, long left, long right) {
        
        int size = (int)(right - left + 1);
        int[] arr = new int[size];
        
        int idx = 0;
        
        for (long i = left; i <= right; i++) {
            int row = (int)(i / n);
            int column = (int)(i % n);
            
            arr[idx++] = Math.max(row, column) + 1;
        }
        
        return arr;
    }
}