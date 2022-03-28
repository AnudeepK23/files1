var http=require('http')

http.createServer((req,res) =>{
    res.writeHead(200,({'Content-Type': 'text'}))
    res.write('<h1>Welcome</h1>');
    res.end();
    
}).listen(3100 ,()=>{
    console.log('server created')
})

// console.log('Good');

//node js is run time environment for js
//model system in the node js
//express is a framework in order achieve fast and minimal propjects
//express js is faster
//asynchronous functions can be written

//mean ----> mongo db express