package algorithm;

//My Answer
public class Stack1 {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        int k;
        for(int i=heights.length-1; i>=0; i-- ){
            if(i==0){
                k=0;
            }else{
                k=i-1;
            }
            for(int j=k; j>=0; j--){
                if(heights[i]<heights[j]){
                    answer[i]=j+1;
                    break;
                }else{
                    if(j==0 && heights[i]>=heights[j]){
                        answer[i]=0;
                    }
                }
            }
        }
        return answer;
    }
}

//Other Answer
class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i=0; i<heights.length; i++){
            for (int j=i+1; j<heights.length; j++){
                if (heights[i] > heights[j]){
                    answer[j]=i+1;
                }
            }
        }


        return answer;
    }
}
