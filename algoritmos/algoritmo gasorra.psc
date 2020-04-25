Algoritmo gasorra
	ex=12000
	co=9500
	acpm=8700
	gnv=2400
	gl=0
	vc=0
	tx=""
	Escribir "cantidad de combustible"
	leer gl
	escribir"tipo de combustible"
	leer tx
	si(tx=="extra") entonces
		vc=gl*ex
	sino
		si(tx=="corriente") Entonces
			vc=gl*co
		SiNo
			si(tx=="acpm") entonces
				vc=gl*acpm
			SiNo
				si(tx=="gnv") Entonces
					vc=gl*gnv
				FinSi
			FinSi
		FinSi
	FinSi
	escribir "total a pagar es " , vc

	
	
FinAlgoritmo
