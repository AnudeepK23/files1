
var calc=require ('./calculator.js')

//add
//one -->
// var result=calc(25,80)

//second type
 var result=calc.add(25,80)
console.log(`Addition of 2 numbers is ${result}`)

//sub
var result1=calc.sub(45,85)
console.log(`Subtraction of 2 numbers is ${result1}`)

//mul
var result2=calc.mul(19,8)
console.log(`Multiplication of 2 numbers is ${result2}`)

//div
var result3=calc.div(45,25)
console.log(`Division of 2 numbers is ${result3}`)