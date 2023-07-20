import java.io.*;
import java.util.*;

public class Main {

  public static class CustomQueue {
    int[] data;
    int front;
    int rear;
    int size;
    int cap;

    public CustomQueue(int cap) {
      data = new int[cap];
      this.cap = cap;
      front = 0;
      rear = 0;
      size = 0;
    }

    int size() {
        return size;
    }

    void display() {
        int count = 0, idx = front;
        while(count < size)
        {
            System.out.print(data[idx] + " ");
            count++;
            idx = (idx + 1) % cap;
        }
        System.out.println();
    }

    void add(int val) {
        if(size == data.length){
            System.out.println("Queue overflow");
            return;
        }
        
        data[rear] = val;
        rear = (rear + 1) % cap;
        size++;
    }

    int remove() {
        if(size == 0){
            System.out.println("Queue underflow");
            return -1;
        }
        
        
        int val = data[front];
        front = (front + 1) % cap;
        size--;
        return val;
    }

    int peek() {
        if(size == 0){
            System.out.println("Queue underflow");
            return -1;
        }
        
        return data[front];
    }
  }
}