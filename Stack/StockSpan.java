class Pair{
    int price;
    int idx;

    Pair(int price, int idx){
        this.price = price;
        this.idx = idx;
    }
}

class StockSpanner {
    private Stack<Pair> st;
    private int currentIndex;
    public StockSpanner() {
        st = new Stack<>();
        currentIndex = 0;
    }
    
    public int next(int price) {
        int result = 0;
        while(st.size() > 0 && st.peek().price <= price){
            st.pop();
        }

        if(st.size() == 0){
            result = currentIndex + 1;
        }else{
            result = currentIndex - st.peek().idx;
        }

        st.push(new Pair(price, currentIndex));
        currentIndex++;

        return result;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */