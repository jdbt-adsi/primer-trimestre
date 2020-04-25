Algoritmo sin_titulo
	n=0
	men=0
	may=0
	Para i<-1 Hasta 5 
		escribir "ingrese un numero",i
		leer n
		si(i==1)Entonces
			may=n
			men=n
		FinSi
		si(n>may)Entonces
			may=n
			
		SiNo
			si(n<men)Entonces
				men=n
			FinSi
		FinSi
	Fin Para
	escribir "el numero mayor es: ",may
	escribir"el numero menor es: ",men

FinAlgoritmo
