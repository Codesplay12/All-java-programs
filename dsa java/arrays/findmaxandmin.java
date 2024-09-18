public class findmaxandmin {
    public static void main(String[] args) {
        int[][]a = {{1,2,3},{4,0,6},{10,8,9}};
        int max = a[0][0];
        int min = a[0][0];

        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                if(max<a[i][j])
                {
                    max = a[i][j];
                }
                else if(min>a[i][j])
                {
                    min = a[i][j];
                }

                
            }
        }
        System.out.println(max + " " + min);
    }
}
