### Graphs Implementation


<br />

##### DFS
```java
import java.util.*;
class Main{
    public final int depthfirsts(int node, int result){
            /*PRE ORDER
             *
             * result.push(node,value);
             * */
        
            if(node.left) {
                depthfirsts(node.left, result);
            }
            

            result.push(node,value);
            

            if(node.right){
                depthfirsts(node.right);
            }
            
            /*POST ORDER
             * 
             * result.push(node,value);
             * */
            return result;
    }
}
```