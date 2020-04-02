package Heap;
class mnh{
	int size,maxsize,heap[];
	mnh(int maxS)
	{
		size=0;
		maxsize=maxS;
		heap=new int[maxS+1];
		heap[0]=Integer.MIN_VALUE;
	}
	int parent(int n)
	{
		return n/2;
	}
	int leftChild(int n)
	{
		return (2*n);
	}
	int rightChild(int n)
	{
		return (2*n)+1;
	}
	boolean isLeaf(int n)
	{
		if(n>=size/2&&n<=size)
			return true;
		return false;
	}
	void swap(int f,int s)
	{
		int temp=heap[f];
		heap[f]=heap[s];
		heap[s]=temp;
	}
	void maxHeapify(int n)
	{
		if(isLeaf(n))
			return;
		if(heap[n]>heap[leftChild(n)]||heap[n]>heap[rightChild(n)])
		{
			if(heap[rightChild(n)]<heap[leftChild(n)])
			{
				swap(n,rightChild(n));
				maxHeapify(rightChild(n));
			}
			else
			{
				swap(n,leftChild(n));
				maxHeapify(leftChild(n));
			}
		}
	}
	void insert(int elem)
	{
		heap[++size]=elem;
		int n=size;
		while(heap[n]<heap[parent(n)])
		{
			swap(n,parent(n));
			n=parent(n);
		}
	}
	void print() {
		for(int i=1;i<=size/2;i++)
		{
			System.out.println("Parent: "+heap[i]+" Children: "+heap[leftChild(i)]+" "+heap[rightChild(i)]);
		}
	}
	
}
public class MinHeap {
   public static void main(String[] args) {
	   mnh minHeap=new mnh(10);
	    minHeap.insert(5); 
       minHeap.insert(3); 
       minHeap.insert(17); 
       minHeap.insert(10); 
       minHeap.insert(84); 
       minHeap.insert(19); 
       minHeap.insert(6); 
       minHeap.insert(22); 
       minHeap.insert(9); 
       
       minHeap.print();
   }
}
