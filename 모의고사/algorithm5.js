function solution(answers) {
    var answer = [];
    var pattern = [
        [1, 2, 3, 4, 5, 1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5] 
    ]
    var arr = [0,0,0];
    
    for(var j=0; j<answers.length; j++){
        pattern[0][j%10] === answers[j] ? arr[0]++ : "" ;
        pattern[1][j%16] === answers[j] ? arr[1]++ : "" ;
        pattern[2][j%20] === answers[j] ? arr[2]++ : "" ;
    }
    
    for(var i=0; i<arr.length; i++){
        if(arr[i]===Math.max(...arr)){
            answer.push(i+1)
        }
    }
    answer.sort((a,b)=>a-b)
    return answer
}