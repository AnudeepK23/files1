var http=require('http')

http.createServer((req,res) =>{
    res.writeHead(200,({'Content-Type': 'text'}))
    res.write('<h1>Welcome</h1>');
    res.end();
    
}).listen(3100 ,()=>{
    console.log('server created')
})