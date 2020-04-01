function CheckWeight(name, height, weight){
    this.myName = name;
    this.myHeight = height;
    this.myWeight = weight;
    this.minWeight;
    this.maxWeight;
}

CheckWeight.prototype.getInfo = function(){
    var str = "";
    str += "이름은 " + this.myName + ", ";
    str += "키는 " + this.myHeight + ", ";
    str += "몸무게는 " + this.myWeight;
    return str;
}
CheckWeight.prototype.getResult = function(){
    this.minWeight = (this.myHeight - 100) * 0.9 - 5;
    this.maxWeight = (this.myHeight - 100) * 0.9 + 5;

    if(this.myWeight >= this.minWeight && this.myWeight <= this.maxWeight){
        return "정상 체중"
    }else if(this.myWeight < this.minWeight){
        return "체중 미달"
    }else{
        return "체중 과다"
    }
}


var person = new CheckWeight("Hong", 170, 65);
var person2 = new CheckWeight("Hwang", 171, 80);
console.log(person);
console.log(person2);
console.log(person.getInfo());
console.log(person.getResult());

for(f in person){
   // console.log(f, person[f]);
}

//console.log(person);