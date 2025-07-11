class MedianFinder {

    PriorityQueue<Integer> min=new PriorityQueue<>();
PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());


    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(max.size()==0) max.add(num);
        else {
            if(num<max.peek()) max.add(num);
            else min.add(num);
            
        }

        if(max.size()==min.size()+2){
            int n=max.remove();
            min.add(n);
        }
        if(max.size()+2==min.size()){
            int n=min.remove();
            max.add(n);
        }
        
    }
    
    public double findMedian() {
        if(min.size()==max.size()) return (max.peek()+min.peek())/2.0;
        else if(min.size()>max.size()) return min.peek();
        else return max.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
