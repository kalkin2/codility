public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        int result = 0;
        String binaryNumber = Integer.toBinaryString(N);
        char bNumArray[] = binaryNumber.toCharArray();
        int tempNum = 0;
        for(int i=0 ; i<bNumArray.length; i++){
            if(bNumArray[i] == '0'){
                tempNum++;
            }else{
                if(tempNum > result){
                    result = tempNum;
                }
                tempNum = 0;
            }

        }
        return result;
    }
}
