class Solution {
    // Function to find all possible paths
    public void print(int sr,int sc,int er,int ec, String s,boolean[][] isVisited,ArrayList<String> ans,int[][] maze){
        
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(maze[sr][sc]==0) return;
        if(isVisited[sr][sc]) return;
        if(sr==er && sc==ec){
            ans.add(s);
            return;
        }
        isVisited[sr][sc] = true;
        print(sr+1,sc,er,ec,s+"D",isVisited,ans,maze);
        print(sr,sc-1,er,ec,s+"L",isVisited,ans,maze);
        print(sr,sc+1,er,ec,s+"R",isVisited,ans,maze);
        print(sr-1,sc,er,ec,s+"U",isVisited,ans,maze);
        
        
        isVisited[sr][sc] = false;
    
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        print(0,0,maze.length-1,maze[0].length-1,"",isVisited,ans,maze);
        return ans;
        
    }
}