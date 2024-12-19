import path from "node:path"

console.log(path.join("contenido","subcarpeta","archivo.txt"))
const base= path.basename("contenido/subcarpeta/archivo.txt")
console.log(base)
const baseExt= path.basename("contenido/subcarpeta/archivo.txt", ".txt")
console.log(baseExt)
const extension = path.extname("image.jpg")
console.log(extension)