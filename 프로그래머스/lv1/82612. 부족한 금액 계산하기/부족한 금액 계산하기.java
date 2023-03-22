class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long change = Long.valueOf(money);

        for (int i=1; i<count+1; i++){
            change -= price *i;
        }

        answer = change<0 ? change*(-1):0;
        return answer;
    }
}