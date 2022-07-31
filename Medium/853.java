class Solution {
    public static class Vehicle {
        int position;
        int speed;
        double arrival;
        public Vehicle(int target, int position, int speed) {
            this.position = position;
            this.speed = speed;
            this.arrival = (target - position) / (double)speed;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        Vehicle[] arr = new Vehicle[len];
        for(int i = 0; i < len; ++i)   {
            arr[i] = new Vehicle(target, position[i], speed[i]);
        }
        Arrays.sort(arr, (a, b) -> Double.compare(a.position, b.position));
        double curr = 0;
        int res = 0;
        for(int i = len - 1; i >= 0; --i)    {
            if(arr[i].arrival > curr)   {
                curr = arr[i].arrival;
                res++;
            }
        }
        return res;
    }
}