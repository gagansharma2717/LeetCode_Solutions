class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)
        {
            return image;
        }
        
        floodFillHelper(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
    
    public void floodFillHelper(int[][] image, int sr, int sc, int newColor,int oldColor){
        
//         Base Case
        if(sr < 0 || sc < 0 || sr >= image.length || sc>= image[0].length || image[sr][sc] != oldColor)
        {
            return;
        }
        
//         Added new color
        image[sr][sc] = newColor;
        
//         Calls in 4 Directions
        floodFillHelper(image,sr+1,sc,newColor,oldColor);
        floodFillHelper(image,sr-1,sc,newColor,oldColor);
        floodFillHelper(image,sr,sc+1,newColor,oldColor);
        floodFillHelper(image,sr,sc-1,newColor,oldColor);
        
        
    }
}