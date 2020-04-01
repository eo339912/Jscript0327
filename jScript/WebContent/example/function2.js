var score = 10;
function myFunc(){
    var score = 20;
    console.log("local :" + score)
}
myFunc()
console.log("global :" + score);

function newFunc(){
    console.log("global functoin");
}

function outerFunc(){
    function newFunc(){
        console.log("local functoin");
    }
    newFunc();
}
newFunc();
outerFunc();

(function(){
        console.log("return  Fnc")
})();