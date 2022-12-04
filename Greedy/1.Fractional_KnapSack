// We have to get max profit from given item with given capacity of total items and we can also take fraction of item.
// Each item has its profit associated to item


// Calculate per unit price
// Pick max units of max profit per unit then second next profit and so on till your capacity is full
// price/weight

import java.util.*;
import java.io.*;

public class Fractional_KnapSack {
    public static class Pair implements Comparable<Pair>{
        double price;
        double weight;
        double perKgPrice;

        public int compareTo(Pair others) {
            // higher perKgPrice --> higher priority
           
            if (others.perKgPrice - this.perKgPrice > 0.0)
                return 1;
            else if (others.perKgPrice - this.perKgPrice == 0.0)
                return 0;
            else 
                return -1;     
        }
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair();
            arr[i].price = scn.nextDouble();
        }
        // Run second loop of get input of weight
        for (int i = 0; i < n; i++) {
            arr[i].weight = scn.nextDouble();
            arr[i].perKgPrice = arr[i].price / arr[i].weight;
        }
         
        // Pair class is created to sort array of pairs
        // By sorting we got highest per unit profit at 0 idx 
        Arrays.sort(arr);

        int capacity = scn.nextInt();
        
        int idx = 0; // to run loop on array
        double maxProfit = 0; // final result will store 
        
        while (idx < n && capacity > 0) {
            double price = arr[idx].price;
            double weight = arr[idx].weight;
            idx++;

            // If capacity is more than highest profit per unit then add price of that item in profit 
            // and decrease weight of that item from capacity 
            if (weight <= capacity) {
                maxProfit += price;
                capacity -= weight;
            } else {
                // else profit mai add kro utne weight ka price jitni capacity baaki hai
                maxProfit += (price / weight) * capacity;
                capacity = 0;
            }

        }
        
        System.out.println(maxProfit);
    }
}

--GFG --
https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    static class Pair implements Comparable<Pair>{
        int price;
        int weight;
        double perKgPrice;
        
        public int compareTo(Pair others) {
            // higher perKgPrice --> higher priority
           
            if (others.perKgPrice - this.perKgPrice > 0.0)
                return 1;
            else if (others.perKgPrice - this.perKgPrice == 0.0)
                return 0;
            else 
                return -1;     
        }
        
    }
    
    double fractionalKnapsack(int capacity, Item itemarr[], int n) 
    {
        Pair[] arr = new Pair[n];
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = new Pair();
            arr[i].price = itemarr[i].value;
            arr[i].weight = itemarr[i].weight;
            arr[i].perKgPrice = ( itemarr[i].value / (double) itemarr[i].weight );
        }
        
        Arrays.sort(arr);
        
        int idx = 0; // to run loop on array
        double maxProfit = 0; // final result will store 
        
        while (idx < n && capacity > 0) {
            double price = arr[idx].price;
            double weight = arr[idx].weight;
            idx++;

            // If capacity is more than highest profit per unit then add price of that item in profit 
            // and decrease weight of that item from capacity 
            if (weight <= capacity) {
                maxProfit += price;
                capacity -= weight;
            } else {
                // else profit mai add kro utne weight ka price jitni capacity baaki hai
                maxProfit += (price / weight) * capacity;
                capacity = 0;
            }
        }
        
        return maxProfit;
    }
}

