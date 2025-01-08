import fs from "node:fs/promises"

const path=process.argv[2]
fs.readdir(path)
.then(files=>{
    files.forEach(file=>{
        console.log(file)
    })
})
.catch(err=>{
    console.error("Error al leer el directorio",err)
    return
})