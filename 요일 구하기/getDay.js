// 문제

// LEESANGHAK
function solution(a, b) {
    var answer = '';
    var day = ['SUN','MON','TUE','WED','THU','FRI','SAT'];
    var lastDay = [31,28,31,30,31,30,31,31,30,31,30,31];
    if(a>0 || a<13){
        b = b-1;
        if(b>6 || b<lastDay[a]){
            b = b%7;
        }
        answer = day[b];
        return answer;
    }
}
solution(1,30);

// otherUser
// Date.getDay는 일~토 == 0~6
function solution(a, b) {
    return ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'][new Date(2016, a - 1, b).getDay()];
}

// if 년 년의 특성 - 윤년인지 아닌지를 유추할 수 있음
    // common - getYear()는 *현지*를 토대로 *READ*
    // common - getUTCYear()는 *UTC*를 토대로 *READ*
    // common - set // *CREATE*
// if 월 월의 특성 - 해당 월의 lastDay를 유추할 수 있음
// if 일 일의 특성 - 해당 년월일의 요일을 유추할 수 있음

// 시간을 *숫자*로 *변환*
// Date.parse('Thu, 01 Jan 1970 00:00:00'); //-32400000는 *setTimeout으로 사용*한다.

// json으로 변환
var event = new Date('August 19, 1975 23:15:30 UTC');

var jsonDate = event.toJSON();

console.log(jsonDate);
// expected output: 1975-08-19T23:15:30.000Z

console.log(new Date(jsonDate).toUTCString());
// expected output: Tue, 19 Aug 1975 23:15:30 GMT
