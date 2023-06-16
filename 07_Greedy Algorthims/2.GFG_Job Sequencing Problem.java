// Greedy
//Medium
// One job will take 1 unit of time - given
// Each job has its deadline we need to give max profit from jobs

// Order of picking jobs will be decreasing order of profit -- step 1 highest profit job pick
// Picked job should be placed as last as possible -- step 2 try to place that job as last as possible


/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
class Solution {
    

    public static class MyComparator implements Comparator<Job> {
        public int compare(Job obj1, Job obj2) {
            // If profit is not equal
            if (obj1.profit != obj2.profit) {
                // highest profit or decreasing order of profit -- highest priority
                return obj2.profit - obj1.profit;
            }
            
            // if profit is equal then will pick job which has more deadine -- high priority and try to place as last as possible
            return obj2.deadline - obj1.deadline;
        }
    }
        
        //Function to find the maximum profit and the number of jobs done.
        int[] JobScheduling(Job arr[], int n)
        {
            Arrays.sort(arr, new MyComparator());
            
            // We need maxdeadline to get the size of slots
            int maxDeadline = 0 ;
            for(int i = 0 ; i<n ; i++)
            {
                maxDeadline = Math.max(arr[i].deadline,maxDeadline);
            }
            boolean[] slots = new boolean[maxDeadline]; // slots is kind of visited or booked slot
            
            
            int maxProfit = 0; // final result
            int jobsAllocated = 0 ; // final result
            for(int i = 0 ; i<n ; i++)
            {
                // can we place ith job
                // checking from ith job deadline to 0 where we can place this job
                for(int j = arr[i].deadline-1; j>=0 ; j--)
                {
                    // if slot is available
                    if(slots[j] == false)
                    {
                        slots[j] = true; // place the job 
                        jobsAllocated++; // job is now allocated
                        maxProfit += arr[i].profit; // add profit of current job
                        break; // break the loop for that job
                    }
                }
            }
            
            return new int[]{jobsAllocated, maxProfit}; 
        }
    }