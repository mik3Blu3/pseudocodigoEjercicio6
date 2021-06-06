Algoritmo Promedio_edad
	promedioEdadMenor <- 0
	promedioEdadMayor <- 0
	edadMayoraux <- 0
	edadMenoraux <- 0
	i <- 1
	Escribir 'Bienvenido al sistema de promedio de edades comprendidas entre; '
	Escribir 'Menores de 25 años o mayores o iguales a 25 años '
	Escribir 'Ingrese el numero total del grupo de personas que desea sacar el promedio de edades: '
	Leer n
	Mientras i<=n Hacer
		Escribir 'Ingrese la edad de la persona #',i
		Leer edadt
		Si edadt<25 Entonces
			promedioEdadMenor <- promedioEdadMenor+edadt
			edadMenoraux <- edadMenoraux+1
		SiNo
			promedioEdadMayor <- promedioEdadMayor+edadt
			edadMayoraux <- edadMayoraux+1
		FinSi
		i <- i+1
	FinMientras
	promedioMayorReal <- (promedioEdadMayor/edadMayoraux)
	promedioMenorReal <- (promedioEdadMenor/edadMenoraux)
	Escribir 'El promedio de las edades menores de 25 es: ',promedioMenorReal
	Escribir ''
	Escribir 'El promedio de las edades mayores o iguales de 25 es: ',promedioMayorReal
FinAlgoritmo
