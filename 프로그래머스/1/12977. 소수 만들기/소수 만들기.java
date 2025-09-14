class Solution {
    public int solution(int[] nums) {
         int count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j=i+1; j< nums.length;j++ ){
                for(int k=j+1; k<nums.length; k++){
                    int n = nums[i]+nums[j]+nums[k];

                    if(n<2) continue;   //0,1은 소수가 아님
                    int limit = (int)Math.sqrt(n);  //제곱근
                    boolean isPrime = true;
                    for(int m=2; m <= limit; m++){  //제곱근 만큼 반복문
                        if(n%m == 0){               //나눴을때 떨어지면 소수아님
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime) count++;
                }
            }
        }
        return count;
    }
}