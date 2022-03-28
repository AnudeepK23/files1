var redux = require('redux')
var createStore = redux.createStore
const ORDER = 'ORDER'

function orderFood(){
    return{
        type:ORDER,
        info:'First Redux Order'
    }
}

const initialState ={
    NumberOfDishes:20
}

var reducer=(state=initialState,action)=>{
    switch(action.type){
        case ORDER:return{
            ...state,
            NumberOfDishes: state.NumberOfDishes - 1
        }
        default:return state
    }


}
var store=createStore(reducer)
console.log('initialstate',store.getState())
const unsubscribe = store.subscribe(() =>{
    console.log('updated state',store.getState())
})
store.dispatch(orderFood())
store.dispatch(orderFood())
store.dispatch(orderFood())
unsubscribe()
