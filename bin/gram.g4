grammar gram;

start
:
	main_func
;

main_func
:
	func
;

func
:
	classyfunc l_otwarcie p_zamkniecie
;

classyfunc
:
	funcs
;

funcs
:
	(
		'MIN'
		| 'MAX'
		| 'AVG'
		| 'MED'
		| 'SDE'
		| 'VAR'
		| 'CHN'
		| 'GEO'
		| 'HAR'
	)
;

l_otwarcie
:
	(
		l_nawias
		| l_nawias func
		| l_nawias liczba
	)
;

l_nawias
:
	(
		'('
	)
;

p_zamkniecie
:
	(
		p_nawias
		| p_nawias liczba
		| p_nawias func
	)
;

p_nawias
:
	(
		')'
	)
;

liczba
:
	liczba_
	| liczba liczba_
;

liczba_
:
	(
		'0' | '9'
	)
; 


