//378. Kth Smallest Element in a Sorted Matrix

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
             @Override
             public int compare(Integer o1, Integer o2) {
                 if(o1 < o2) return 1;
                 if(o1 > o2) return -1;
                 return 0;
             }
         };
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k,comparator);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                pq.offer(matrix[i][j]);
                if(pq.size()>k)pq.poll();
            }
        }
        return pq.peek();
    }
}