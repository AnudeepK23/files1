var express = require ('express')

var app=express();

app.get('/form',(req,res)=>{
    var name= res.query.name;
    var age = res.query.age;
    res.send(`${name} ${age}`)
    res.end()

}).listen(1234);
























// var http = require('http');

// http.createServer(function (req, res) {
//   res.writeHead(200, {'Content-Type': 'text/html'});
//   res.write(`<form action="submittedform" method="post" enctype="multipart/form-data">`);
//   res.write(' Name : <input type="text" name="enter name"><br><br>');
//   res.write(' Age : <input type="number" name="enter age"><br><br>');
//   res.write('<input type="submit">');
//   res.write('</form>');
//   return res.end();
// }).listen(4286);


// const { response } = require('express');
// const express = require('express')
// const bodyParser = require('body-parser')

// const app = express()

// app.set('view engine', 'pug');
// app.use(bodyParser.urlencoded({extended:true}));

// app.get('/',function(req,res){
//     return response.redirect('/form-with-get');
// });
// app.get('/form-with-get',function(req,res){
//     return response.render('form-with-get');
// });
// app.get('/form-with-post',function(req,res){
//     return response.render('form-with-post');
// });
// app.get('/submit-form-with--get',function(req,res){
//     return response.send('request.query');
// });
// app.get('/submit-form-with-post',function(req,res){
//     return response.send('request.body');
// });
    

// app.listen(1234,(req,res)=>{
//     console.log('connected......')
// })








// var router=express.Router();

// router.get('/',function(req,res,next){
//     res.render('index',{title:'Form Page',condition:true,anyArray:[1,2,3]});
// });

// router.get('/test/:id',function(req,res,next){
//     res.render('test',{output: req.params.id})
// });
// module.exports = router;



// app.use(express.urlencoded({
//   extended: true
// }))

// app.post('/submit-form', (req, res) => {
//     const username = req.body.username
//     res.send(`<form method="POST" action="/submit-form">
//     <input type="text" name="username" />
//     <input type="submit" />
//   </form>`)
//     res.end()
//   })

  