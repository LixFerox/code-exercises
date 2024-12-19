//Ejercicio que muestra la informacion del sistema operativo

import os from 'node:os'

console.log('Información del sistema operativo:')
console.log("Nombre del Sistema Operativo", os.release())
console.log("Versión del Sistema Operativo", os.version())
console.log("Arquitectura",os.arch())
console.log("CPUs",os.cpus())
console.log("Memoria libre", os.freemem()/ 1024 / 1024)
console.log("Memoria total", os.totalmem()/ 1024 / 1024)
console.log("Uptime",os.uptime() /60 /60)