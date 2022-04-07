class MedianFinder {
    ArrayList<Integer> list;

    /** initialize your data structure here. */
    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void insert(int num, int bot, int top) {
        while (bot < top) {
            int mid = bot + (top - bot) / 2;
            if (list.get(mid) > num) {
                top = mid;
            } else {
                bot = mid + 1;
            }
        }
        list.add(bot, num);
    }

    public void addNum(int num) {
        insert(num, 0, list.size());
    }

    public double findMedian() {
        int len = list.size();
        return len % 2 == 0 ? (double) (list.get(len / 2 - 1) + list.get(len / 2)) / 2 : list.get((len - 1) / 2);
    }
}