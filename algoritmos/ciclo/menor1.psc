Algoritmo menor1
	men=0
	n=0
	escribir"ingrese un numero"
	leer n
	men=n
	Para i<-1 Hasta 4 
		escribir"ingrese numero",i
		leer n
		si(n<men)Entonces
			men=n
			escribir "el numero menor hasta el momento es: ",men
		FinSi
	Fin Para
	escribir "el numero menor es:",men
	
FinAlgoritmo
