public class Jagged3DArray{
    public static void main(String[] args) {
        int nums[][][] =  new int[2][4][6]; //jagged array

        // nums[0] = new int[3];
        // nums[1] = new int[4];
        // nums[2] = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                for(int k=0;k<nums[i].length;k++){
                    nums[i][j][k] = (int)(Math.random()*10);
                    System.out.print(nums[i][j][k] + " ");
                }
                
            }
        }
}
}

