import java.util.*;

public class NumberOfIsl{
    public int numberOfIslands(char [][] islandgrid){
        int count = 0;
        //I must loop through the 2d array
        for(int i=0; i<islandgrid.length;i++) //looping through each row in the 2d array
        {
            for(int k=0; k<islandgrid[i].length;k++)//looping through each column
            {
                if(islandgrid[i][k] == '1')
                {
                    count +=1;
                    bFSCalling(islandgrid,i,k);
                }
            }
        }
        return count;
    }
    public void bFSCalling(char [][] gridisl, int x, int y){
        if(x<0 || x>=gridisl.length || y<0 || y>=gridisl[x].length || gridisl[x][y] == '0' )
            return;
        gridisl[x][y] = '0';
        //recursive calls
        bFSCalling(gridisl, x+1, y);//up
        bFSCalling(gridisl, x-1, y);//down
        bFSCalling(gridisl, x, y-1);//left
        bFSCalling(gridisl, x, y+1);//right
    }
}