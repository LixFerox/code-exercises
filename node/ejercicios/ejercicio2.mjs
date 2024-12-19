//Ejercicio que muestra informacion de un archivo 

import fs from "node:fs"

const stats = fs.statSync("./archivo.txt")
console.log("Es un archivo",stats.isFile())
console.log("Es una carpeta",stats.isDirectory())
console.log("Tamaño del archivo",stats.size,"bytes")
console.log("Leyendo el primer archivo...")
const text = fs.readFileSync("./archivo.txt","utf-8")
console.log(text)