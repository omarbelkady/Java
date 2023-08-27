### Array Algorithms 


#### Floyd's Cycle Detection Algorithm
```java
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

    public class FloydCycleDetection {
        public static boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false; // No cycle if head is null or only one node exists
            }

            ListNode slow = head; // Slow pointer moves one step at a time
            ListNode fast = head; // Fast pointer moves two steps at a time

            while (fast != null && fast.next != null) {
                slow = slow.next; // Move slow pointer one step
                fast = fast.next.next; // Move fast pointer two steps

                if (slow == fast) {
                    return true; // Cycle detected if slow and fast pointers meet
                }
            }

            return false; // No cycle found
        }

        public static void main(String[] args) {
            // Create a linked list with a cycle
            ListNode head = new ListNode(1);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(3);
            ListNode node4 = new ListNode(4);
            ListNode node5 = new ListNode(5);

            head.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node5.next = node2; // Cycle: node5 points back to node2

            System.out.println("Does the linked list have a cycle? " + hasCycle(head));
        }
    }
```

#### Kadane's Algorithm

```java
public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] nums) {
        int maxSum = nums[0]; // Initialize maxSum with the first element of the array
        int currentSum = nums[0]; // Initialize currentSum with the first element of the array

        for (int i = 1; i < nums.length; i++) {
            /**
             Calc the currentSum for the current element by taking 
            the maximum of the current element itself or the sum 
             of the current element and the previous subarray sum
            **/ 
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            /**Update the maxSum with the maximum of the currentSum and the previous maxSum
             * 
             *
             **/
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum; // Return the maximum subarray sum
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArraySum(nums); 
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
```