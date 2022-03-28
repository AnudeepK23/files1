// var http=require('http')
// var fs=require('fs')

// http.createServer((req,res) =>{
//     res.write('<h1>Hello mama ....</h1>')

//     fs.readFile('file1.js','utf-8',function(err,data){
//         res.write(data)
//         res.end()
//     })

//     // fs.readFile('abc.txt','utf-8',function(err,data){
//     //     res.write(data)
//     //     res.end()
//     // })

// }).listen(4289,(req,res) =>{
//     console.log('running ............')

// })


 var fs=require('fs')

    // fs.readFile('abc.txt','utf-8',function(err,data){
    //     console.log(data);
    // })


    //To create new file
//     fs.writeFile('xyz.txt',"console.log('New file created')",function(err){
// console.log('file creted')
//     })

//To write a content in the existing file
    // fs.appendFile('abc.txt',"('new information came from files')",function(err){
    //     console.log('file rewritten');
    // })

    
//To delete a file

fs.unlink('xyz.txt',(err) =>{
    console.log(err)
})


// writeFile() --> It will check for the file is present or not,
//                  if present it will remove the content and adds the new content, 
//                  if file is not present it will create the file.

//appendFile() --> It will update the content without removing previous content.

//unlinkFile() --> It will delete the file from directory.