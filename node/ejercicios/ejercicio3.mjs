setTimeout(() =>{
    global.console.log("La variable Global contiene todo")
}, 1000)

const init = setInterval(() =>{
    console.log(`En el intervalo ${init}`)
    clearInterval(init)
}, 1000)