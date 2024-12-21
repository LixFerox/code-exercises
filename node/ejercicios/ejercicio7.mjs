import http from "node:http"

const server = http.createServer((req, res) =>{
    console.log("Request received")
    res.end("Hola mundo")
})
server.listen(0,()=>{
    console.log(`server listening on port http://localhost:${server.address().port}`)
})