class Solution {
    public void rotate(int[][] arr) {
        int m = arr.length;
        for(int i=0; i<m; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
       for(int i=0; i<m; i++){
        int left = 0;
        int rigth = m-1;
        while(left<rigth){
            int temp = arr[i][left];
            arr[i][left] = arr[i][rigth];
            arr[i][rigth] = temp;
            left++;
            rigth--;
        }
       }
        
    }
}