var EventEmitter = require('events')
const { emit } = require('process')

var emitter = new EventEmitter()

// emitter.on('call a listener',()=>{
//     console.log('Listener is called ......!1')
// })

// emitter.on('call a listener',()=>{
//     console.log('Listener is called ......!2')
// })

// emitter.on('listener is calling for you',()=>{
//     console.log(' Received by Listener ......!3')
   
// })

// emitter.on('call a listener',()=>{
//     console.log('Listener is called ......!4')
// })

// emitter.emit('call a listener')
// emitter.emit('listener is calling for you')

function spraywater()
{
    console.log('water is sprayed.....')

}

function extinguisher()
{
    console.log('Fire is extinguished')
}


emitter.on("fire",spraywater)

emitter.addListener("spray",extinguisher)

emitter.emit("fire")

emitter.emit("spray")

//using settimeout function

setTimeout(()=>{
    emitter.emit("spray")
},5000)

//using setInterval function
setInterval(() => {
    emitter.emit("fire")
}, 3000,5000);