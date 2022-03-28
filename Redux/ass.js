var redux = require('redux')
var createStore = redux.createStore

const ORDER = 'ORDER'
function orderBooks(){
    return{
        type:ORDER,
        info:'First Order'
    }
}

const initialCounter ={
    NumberOfBooks:0,
}

var reducer = (state = initialCounter,action)=>{
    switch(action.type){
        case ORDER:return{
            ...state,
            NumberOfBooks : state.NumberOfBooks + 1
        }
        default:return {...state}

    }
}
var store=createStore(reducer)
console.log('initialstate',store.getState())
const unsubscribe = store.subscribe(()=>{
    console.log('updated state',store.getState())
})

store.dispatch(orderBooks())
store.dispatch(orderBooks())
store.dispatch(orderBooks())
store.dispatch(orderBooks())

