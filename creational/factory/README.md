# Factory method
- Typ: Creational Design Pattern
- Účel: Oddeliť tvorbu objektov od ich použitia.

## Hlavný princíp
- Definuje abstraktnu továrenskú metódu (createProduct()), ktorú implementujú konkrétne továrne (creators).
- Klient nevytvára objekt priamo (new ConcreteProduct()), používa len abstraktné rozhranie (Product).
- Umožňuje pridávať nové typy produktov bez zásahu do klientského kódu.
- Často sa kombinuje so šablónovou metódou (template method), kde abstraktný creator poskytuje vyššiu úroveň operácií.

## Kedy použiť
- Kód potrebuje nezávislosť od konkrétnych implementácií.
- Existuje viac variantov produktu, ktoré sa môžu meniť podľa kontextu (typ platformy, konfigurácia, vstup od používateľa).
- Chceš centralizovať logiku vytvárania objektov na jednom mieste.
- Očakáva sa, že sa často pridávajú nové typy produktov bez úpravy klientského kódu.
- Potrebná je možnosť rozšírenia bez zmeny existujúcej funkcionality (Open/Closed Principle).

## Zložky
- Product – abstrakcia, ktorú používateľ využíva.
- ConcreteProduct – konkrétna implementácia produktu.
- Creator – abstraktná trieda alebo interface s factory metódou.
- ConcreteCreator – implementácia creator-u, ktorá vytvára konkrétny produkt.

## Výhody
- Oddelenie klienta od konkrétnej implementácie.
- Jednoduché pridanie nových produktov.
- Zlepšuje testovateľnosť a modularitu.

## Nevýhody
- Zvýšená komplexnosť – viac tried.
- Pre veľmi jednoduché objekty môže byť overkill.

## Bežné príklady použitia
- GUI frameworky – tlačidlá, okná podľa OS (WindowsButton, MacButton).
- Logistika – rôzne spôsoby doručenia (Truck, Ship, Plane).
- Parsovanie súborov – rôzne formáty (PdfParser, WordParser).
- Pripojenie k databázam – podľa typu DB (MySqlConnection, PostgresConnection).