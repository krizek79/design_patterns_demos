# Builder
- Typ: Creational Design Pattern
- Účel: Oddeliť tvorbu komplexných objektov od ich reprezentácie, umožniť ich skladanie krok po kroku.

## Hlavný princíp
- Umožňuje vytvárať zložité objekty postupne, namiesto obrovského konštruktora s desiatkami parametrov.
- Objekt sa skladá cez builder, ktorý poskytuje metódy na nastavenie jednotlivých vlastností.
- Samotné vytvorenie objektu sa ukončuje volaním build().
- Možný je aj Director, ktorý definuje konkrétne sekvencie krokov pre typické konfigurácie.

## Kedy použiť
- Objekt má veľa parametrov, pričom niektoré sú nepovinné alebo majú default hodnoty.
- Potrebuješ jasne oddeliť proces tvorby od výslednej reprezentácie.
- Chceš zabrániť tzv. telescoping constructors problem (10 rôznych konštruktorov s kombináciami parametrov).
- Potrebná je čitateľná syntax pri tvorbe objektov (method chaining).
- Existuje viac variantov toho istého objektu (napr. rôzne konfigurácie počítača, domu, auta).

## Zložky
- Product – výsledný objekt (napr. House, Computer, Order).
- Builder – definuje metódy na nastavenie jednotlivých častí.
- ConcreteBuilder – implementuje Builder a skladá konkrétny produkt.
- Director (voliteľný) – vie pripraviť konkrétne štandardné konfigurácie volaním krokov Buildera.
- Client – používa Builder na vytvorenie objektu.

## Výhody
- Čitateľné a flexibilné vytváranie komplexných objektov.
- Umožňuje validáciu a povinné kroky pred zostavením.
- Jednoduchšie udržiavateľné ako dlhé konštruktory.
- Podporuje viacero reprezentácií toho istého objektu.

## Nevýhody
- Viac tried, viac boilerplate (pokiaľ nepoužiješ generátor ako Lombok).
- Pri veľmi jednoduchých objektoch je overkill.
- Director môže pridávať zbytočnú komplexitu, ak nie je potrebný.

## Bežné príklady použitia
- Domény s konfiguráciami – tvorba objednávok, reportov, kontraktov.
- Konfigurácia objektov v Springu – napr. pri skladaní requestov na externé služby.
- Testovanie – keď potrebuješ rýchlo vytvárať entity s rôznymi kombináciami parametrov.
- GUI a hry – stavba komplexných objektov s mnohými vlastnosťami (menu, level, dom, auto).