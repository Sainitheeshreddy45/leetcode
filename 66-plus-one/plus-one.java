class Solution {
    public int[] plusOne(int[] digits) {
        int counter = 0;
        for(int i=digits.length-1;i>=0;i--) {
            int val =  (i==digits.length-1)?1:counter;
            int sum = digits[i] + val;
            digits[i] = sum < 9? sum: sum%10;
            counter = sum/10;
        }
        if(counter >0) {
            return IntStream.concat(IntStream.of(counter), Arrays.stream(digits)).toArray();
        }
        return digits;
    }
}