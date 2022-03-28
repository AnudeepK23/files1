//first type
// function add(a,b){
//     return a+b;
// }

//one
//  module.exports = add;
 //or
 //module.exports.add = add;
//or
//exports.add = add;


//second type
exports.add=function add(a,b){
    return a+b;
}

exports.sub=function sub(a,b){
    return a-b;
}

exports.mul=function mul(a,b){
    return a*b;
}
exports.div=function div(a,b){
    return a/b;
}