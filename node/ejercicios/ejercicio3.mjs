//Ejercicio que muestra informacion de un archivo

import fs from "node:fs"

fs.readFile("./archivo.txt","utf-8", (err, text) =>{
    console.log(text)
})