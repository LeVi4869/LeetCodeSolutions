class Solution {
    public int slidingPuzzle(int[][] board) {
        String target = "123450";
        String start = "";
        for(int i = 0; i < board.length; ++i){
            for(int j = 0; j < board[0].length; ++j){
                start = start + Integer.toString(board[i][j]);
            }
        }
        int[][] dirs = new int[][] { { 1, 3 }, { 0, 2, 4 },
                { 1, 5 }, { 0, 4 }, { 1, 3, 5 }, { 2, 4 } };
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        visited.add(start);
        queue.offer(start);
        int res = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; ++i){
                String curr = queue.poll();
                if(curr.equals(target)){
                    return res;
                }
                int idx = curr.indexOf('0');
                for(int dir : dirs[idx]){
                    String nextPuzzle = swap(curr, idx, dir);
                    if(visited.contains(nextPuzzle)){
                        continue;
                    }
                    visited.add(nextPuzzle);
                    queue.offer(nextPuzzle);
                }
            }
            ++res;
        }
        return -1;
    }
    private String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
}