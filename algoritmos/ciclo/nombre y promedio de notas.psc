Algoritmo promedio_ciclo
	m=0
	c=0
	e=0
	name=""
	pro=0
	cp=0
	np=0
	nm=0
	na=""
	nn=""
	mm=0
	Para i<-1 Hasta 3
		escribir"ingrese nombre"
		leer name
		escribir "ingrese las notas en orden"
		leer m,c,e
		pro=(m+c+e)/3
		escribir name, " su nota final es: ",pro
		cp=cp+pro
		si(pro>nm)entonces
			nm=pro
			na=name
		SiNo
			si(pro<nm)Entonces
				mm=pro
				nn=name
			FinSi
		FinSi
	Fin Para
	np=cp/3
	escribir"####################################"
	escribir" promedio grupal es: ",np
	escribir na," es la nota mayor del grupo: ",nm
	escribir nn, " es la peor nota del grupo: ",mm
FinAlgoritmo
