var express = require('express')

var app=express()

//for this method use
//http://localhost:3456/
app.get('/',(req,res) =>{
    res.send('<h1 style="color:blue; text-align:center">Hai Anudeep </h1>')
})

//for this method use
//http://localhost:3456/name
app.get('/name',(req,res) =>{
    res.send('<h1 style="color:green; text-align:center">Hai Anudeep </h1>')
})

//for this method use in browser
//http://localhost:3456/name/4
app.get('/name/:id',(req,res) =>{
    var id=req.params.id;


var name;
    if(id==1){
        name="Anudeep"
    }
    else if(id==2){
        name="Reddy"
    }

    else if(id==3){
        name="Ram"
    }

    else if(id==4){
        name="Charan"
    }

    else{
        name="God"
    }
    res.send(`<h1 style="color:Pink; text-align:center">Hai ${name} your id is ${id} </h1>`)
})
  
//for this method use in browser
// http://localhost:3456/names?id=5
app.get('/names',(req,res)=>{
    var id=req.query.id;

var name;
    if(id==1){
        name="Anudeep"
    }
    else if(id==2){
        name="Reddy"
    }

    else if(id==3){
        name="Ram"
    }

    else if(id==4){
        name="Charan"
    }

    else{
        name="God"
    }
    res.send(`<h1 style="color:Pink; text-align:center">Using query pattern ${name} your id is ${id} </h1>`)
})

app.listen(3456,(req,res) =>{
    console.log('server created')
})