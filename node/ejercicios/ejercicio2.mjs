import http from "node:http"

const port="3000"

const server=http.createServer((req, res) =>{
    res.statusCode=200
    res.setHeader("Content-Type", "text/plain")
    res.write(`Hello Word \n`)
    res.write(`My first Server web \n`)
    res.write(`Server is running at port ${port} `)
    res.end()
})

server.listen(port, () =>{
    console.log(`Server is running at port ${port}`)
})