Ejercicio integrador 

📚 Una empresa de envíos necesita un programa para gestionar el envío de paquetes. Cada paquete tiene un peso y un destino.
Los paquetes se pueden enviar por tierra o por aire, y en cada caso se aplican diferentes tarifas. 
Además la empresa ofrece servicios adicionales como seguro de envío y entrega en el mismo día. 
Los paquetes que van por tierra tienen adicionalmente la distancia de envío y tipo de vehículo. 
Los paquetes por aire especifican la aerolínea en la que se transporta y la clase de envío (normal o express).
La empresa nos mencionó por arriba ya cuando el café se estaba enfriando que en un futuro muy lejano además de paquetes y envíos ofrecerá almacenamiento,
recolección y seguimiento avanzado. Todos estos nuevos servicios tendrán un costo adicional 
basado en propiedades propias de cada uno. 

Se pide:

👉 Diseño de clases siguiendo las pautas del paradigma en cuanto a herencia, clases abstractas y polimorfismo
👉 Constructores vacíos y completos.
👉 Método toString y equals
👉 Método calcularTarifaEnvio que los tipos de paquetes deben implementar.

Paquete tierra
👉 El peso del paquete * 25$. Si es “camión” el tipo de vehículo +10%. Si la distancia es superior a los 100km, por cada kilómetro adicional, +5%

Paquete aire
👉 El peso del paquete * 30$. Si la aerolínea es AA, sumaría un 50% de impuestos. Y si es express, +1000$ fijos. 
Método calcularCostoAdicional para los servicios adicionales. Si tiene seguro el costo es un adicional de 1500$ para los paquetes que viajan por tierra y 2500$ 
para los paquetes que viajan por aire. Si dispone de entrega en el mismo día +25% para tierra y 50% para los paquetes que viajan por avión. 

Método calcularTotalPaquete que nos informe el precio final del paquete. 
Agregar y listar todos los paquetes de envío. 
Informar la cantidad total de paquetes

