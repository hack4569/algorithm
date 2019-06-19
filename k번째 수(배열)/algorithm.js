function solution(array, commands) {
    var answer = [];
    for(var z=0; z<commands.length; z++){
        var i = commands[z][0]-1;
        var j = commands[z][1];
        var k = commands[z][2]-1;

        slicedArray = array.slice(i,j);
        // 오름차순
        function ascending(a, b){
            if(a<b){
                return -1;
            }
            if(a>b){
                return 1;
            }
                return 0;
        }
        // 내림차순
        function decending(a,b){
            if(a<b){
                return 1;
            }
            if(a>b){
                return -1;
            }
                return 0;
        }
        slicedArray.sort(decending);
        answer.push(slicedArray[k]);
    }
    return answer;
}
solution([1, 5, 2, 6, 3, 7, 4],[[2, 5, 3], [4, 4, 1], [1, 7, 3]]);