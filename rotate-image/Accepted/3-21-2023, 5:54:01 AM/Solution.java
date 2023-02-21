// https://leetcode.com/problems/rotate-image

class Solution {
    public void rotate(int[][] matrix) {
     int mat[][] = new int[matrix.length][matrix[0].length];
     int col = matrix[0].length-1;
     for(int i =0;i<matrix.length;i++)
     {  int row=0;
         for(int j =0;j<matrix[0].length;j++)
         {
           mat[row][col]=matrix[i][j];
           row++;
         }
         col--;
     }   

     for(int i =0;i<mat.length;i++)
     {
         for(int j =0;j<mat[0].length;j++)
         {
             matrix[i][j]=mat[i][j];
         }
     }
    }
}