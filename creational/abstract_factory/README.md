# Abstract Factory
- Typ: Creational Design Pattern
- Účel: Poskytuje rozhranie na vytváranie celých rodín príbuzných objektov bez toho, aby bol klient závislý od ich konkrétnych implementácií.

## Hlavný princíp
- Definuje abstraktnú továreň, ktorá vie vyrábať viacero súvisiacich produktov naraz.
- Každá konkrétna továreň implementuje toto rozhranie a poskytuje svoju vlastnú sadu produktov, ktoré spolu logicky súvisia.
- Klient používa iba abstraktné rozhranie továrne, takže nevie (a nemusí vedieť), ktoré konkrétne produkty sú vytvorené.
- Umožňuje udržiavať konzistenciu medzi objektmi, ktoré musia spolupracovať (napr. GUI prvky jedného štýlu).

## Kedy použiť
- Potrebuješ vytvárať celé rodiny súvisiacich objektov, ktoré sa používajú spoločne (napr. Windows GUI + Mac GUI).
- Chceš, aby klientský kód zostal nezávislý od konkrétnych tried produktov.
- Je potrebná konzistentnosť medzi objektmi, ktoré spolu fungujú (napr. driver pre transport + samotný transport).
- Očakáva sa, že v budúcnosti budeš pridávať nové rodiny produktov (napr. nový transportný spôsob).

## Zložky
- AbstractFactory – definuje metódy na vytváranie rodiny produktov.
- ConcreteFactory – implementuje metódy a vyrába konkrétne rodiny produktov.
- AbstractProduct – rozhranie alebo abstraktná trieda pre každý typ produktu.
- ConcreteProduct – konkrétna implementácia produktu patriaceho k určitej rodine.
- Client – používa iba abstraktné rozhrania, nikdy nevytvára produkty priamo.

## Výhody
- Zabezpečuje konzistenciu medzi produktmi patriacimi do jednej rodiny.
- Klient je úplne nezávislý od konkrétnych implementácií.
- Umožňuje jednoduché pridanie nových rodín produktov (len sa vytvorí nová továrenská implementácia).
- Dodržiava Open/Closed Principle – systém sa rozširuje bez úpravy existujúceho kódu.

## Nevýhody
- Zavádza veľa tried a rozhraní → vyššia komplexnosť.
- Ak treba pridať nový produkt do existujúcej rodiny, je nutné zmeniť všetky továrne (menej flexibilné než Factory Method).

## Bežné príklady použitia
- GUI frameworky – widgety (tlačidlá, okná, menu) podľa operačného systému alebo témy.
- Databázové knižnice – connection + statement + result set podľa konkrétnej DB.
- Logistika – transport + zodpovedná osoba (Truck + Driver, Ship + Captain).
- Cross-platform vývoj – knižnice, ktoré musia poskytovať konzistentnú implementáciu pre rôzne platformy.