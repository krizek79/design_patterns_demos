# Prototype
- Typ: Creational Design Pattern
- Účel: Vytvárať nové objekty klonovaním existujúcich prototypov namiesto ich inštanciovania cez new.

## Hlavný princíp
- Objekt si vie vytvoriť vlastnú kópiu pomocou metódy clone().
- Klient nemusí vedieť, ako sa objekt vytvára, stačí mu existujúci prototyp.
- Podporuje rýchle vytváranie zložitých objektov (s veľkým počtom atribútov alebo konfigurácií).
- Umožňuje klonovať objekty bez väzby na ich konkrétne triedy.

## Kedy použiť
- Vytváranie objektov je drahé (napr. zložitá konfigurácia, databázový query, veľa atribútov).
- Potrebuješ vytvárať objekty s veľmi podobným nastavením, ale malými rozdielmi.
- Nevieš presný typ objektu, ktorý chceš vytvoriť, ale máš už existujúci príklad (prototyp).
- Chceš zachovať flexibilitu a nezávislosť od konkrétnej triedy (Open/Closed Principle).

## Zložky
- Prototype – rozhranie alebo abstraktná trieda s metódou clone().
- ConcretePrototype – trieda implementujúca rozhranie a logiku klonovania (shallow alebo deep copy).
- Client – používa prototypy na vytváranie nových objektov.

## Výhody
- Rýchle vytváranie komplexných objektov.
- Flexibilné – klient nepotrebuje vedieť, aká konkrétna trieda sa používa.
- Jednoduché pridávanie nových typov objektov – stačí implementovať clone().
- Znižuje duplicitu kódu pri inicializácii objektov.

## Nevýhody
- Implementácia deep copy môže byť zložitá (najmä pri vnorených objektoch).
- Vyžaduje disciplínu – ak sa zmení objekt, treba upraviť aj logiku jeho klonovania.
- Riziko problémov pri klonovaní objektov s väzbami na vonkajšie zdroje (napr. file handler, socket).

## Bežné príklady použitia
- Grafické editory – klonovanie tvarov alebo objektov (Shape, Circle, Rectangle).
- Dokumenty – vytváranie kópií šablón s predvyplnenými údajmi.
- Hry – klonovanie postáv, nepriateľov alebo zbraní s podobnou konfiguráciou.
- Spring Bean definície – konfiguračné prototypy, ktoré sa replikujú pri každom použití.