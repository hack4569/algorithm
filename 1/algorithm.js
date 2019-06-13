var test1 = [16,12,13,3,1,20];
var test2 = [30,12,1,10,11,1];
var difArray = [];
var present = [];
function howmuch(arrLength){
    for(var i=0; i<arrLength; i++){
        var dif = test1[i] - test2[i];
        if(dif>=0){
            difArray.push(dif);
            var section = "";
            for(var j=0; j<arrLength; j++){
                j= 2^j;
                var value = Number.parseInt((difArray[i]/j)%2);
                if(value==NaN || value==0){
                    value="";
                }
                else{
                    value="#";
                }
                section += value;
            }
            present.push(section);
        }
        else{
            dif = -dif;
            difArray.push(dif);
            var section = "";
            for(var j=0; j<arrLength; j++){
                j= 2^j;
                var value = Number.parseInt((difArray[i]/j)%2);
                if(value==NaN || value==0){
                    value="";
                }
                else{
                    value="#";
                }
                section += value;
            }
            present.push(section);
        }
    }
}
howmuch(5);
console.log(present);