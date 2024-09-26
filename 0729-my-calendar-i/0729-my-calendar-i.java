class MyCalendar {
    TreeMap<Integer,Integer> calc;
    public MyCalendar() {
        calc = new TreeMap();

    }
    
    public boolean book(int start, int end) {
        Integer prev = calc.floorKey(start);
        Integer next = calc.ceilingKey(start);
        if((prev==null||calc.get(prev)<=start) && (next==null||end<=next)){
            calc.put(start,end);
            return true;
        }
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */