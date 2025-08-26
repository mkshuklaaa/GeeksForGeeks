class Solution {
    public void helper(int[][] maze, ArrayList<String> ans, String res, int sr, int ec, boolean[][] visited) {
        int m = maze.length , n = maze[0].length;

        if (sr < 0 || ec < 0 || sr >= m || ec >= n || visited[sr][ec] || maze[sr][ec] == 0) return;

        if (sr == m-1 && ec == n-1) {
            ans.add(res);
            return;
        }

        visited[sr][ec] = true;

        helper(maze, ans, res + "D", sr+1, ec, visited);
        helper(maze, ans, res + "L", sr, ec-1, visited);
        helper(maze, ans, res + "R", sr, ec+1, visited);
        helper(maze, ans, res + "U", sr-1, ec, visited);

        visited[sr][ec] = false;
    }

    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        if (maze[0][0] == 1)
            helper(maze, ans, "", 0, 0, visited);

        return ans;
    }
}

