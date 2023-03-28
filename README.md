# calendar2job

Naptár bejegyzések átalakítása feladat. Alap interfeszek.


Naptár bejegyzések és feladatok közötti konverzió  biztosítása.
N -> M darab. 1 vagy több naptár bejegyzésből lesz egy feladat.


A naptár bejegyzésekhez készült egy osztály. Minden naphoz a következő információk vannak eltárolva:
 - dátum (date)
 - feladat azonosító (jobId)
 - foglaltság (igen/nem) (occupied)
 - megjegyzés (ha feladat van, akkor a feladat neve) (comment)
 - nap sorszáma (dayOfWeek). 1 hétfő, 2 kedd, … szombat 6, vasárnap 7

A feladatokhoz pedig a következők vannak letárolva
 - azonosító (id)
 - név (name)
 - kezdőnap (start)
 - befejezés napja (end)

feltételek
1 feladatot megszakíthat többször is munkaszüneti nap (most hétvége)
1 feladat több napon át is tarthat, ilyenkor több naptárbejegyzés tartozik hozzá
A még “üres” napot az occupied mező false értéke jelenti, ezen a napra még nincs feladat beütemezve, és nem is munkaszüneti nap.
minden napra egy CalendarItem objektum, minden feladatra egy Job objektum

A feladatok csv-ben vannak tárolva.

Készíts egy alkalmazást, ami a paraméterben megadott fileból felolvassa a calendar adatokat, és kiírja képernyőre a job-okat!

Alakítsd át úgy, hogy egy masik csv-be írja ki!
