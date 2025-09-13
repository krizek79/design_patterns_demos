# Singleton
- Typ: Creational Design Pattern
- Účel: Zabezpečiť, aby trieda mala len jednu inštanciu a poskytovať k nej globálny prístupový bod.

## Hlavný princíp
- Trieda má súkromný konštruktor, takže nemôže byť inštanciovaná zvonka.
- Poskytuje statickú metódu (getInstance()), ktorá vracia jedinú inštanciu triedy.
- Singleton môže uchovávať stav alebo poskytovať služby, ktoré majú byť globálne dostupné.

## Kedy použiť
- Potrebuješ len jednu inštanciu triedy (napr. konfigurácia, logger, cache, connection pool).
- Inštancovanie objektu je drahé alebo nechceš mať duplicitné inštancie.
- Potrebuješ globálny prístupový bod k objektu.
- Chceš kontrolovať životnosť a stav objektu centrálne.

## Zložky
- Private constructor – zabraňuje vytváraniu inštancií zvonka.
- Static instance – jediná inštancia triedy.
- Public static getter – poskytuje prístup k inštancii.

## Varianty implementácie
- Lazy-loaded Singleton – jednoduchý, inštancia sa vytvorí pri prvom volaní getInstance().
- Synchronized Singleton – thread-safe verzia, používa synchronized blok pri získaní inštancie.
- Double-checked Locking – efektívny thread-safe Singleton, synchronizácia len pri prvom vytvorení.
- Enum Singleton – moderný a najbezpečnejší, thread-safe a odolný voči reflexii a serializácii.

## Výhody
- Jednoduchý globálny prístup k inštancii.
- Zabezpečuje, že existuje len jedna inštancia triedy.
- Thread-safe varianty sú bezpečné pre multi-threaded aplikácie.
- Enum Singleton je odolný voči serializácii a reflexii.

## Nevýhody
- Lazy-loaded variant bez synchronizácie nie je thread-safe.
- Môže viesť k globálnemu stavu, ktorý komplikuje testovanie.
- Enum Singleton nie je lazy-loaded a nemôže dediť iné triedy.
- Nadmerné používanie môže viesť k tzv. anti-pattern, ak sa používa na všetko len preto, že je jednoduchý prístup.

## Bežné príklady použitia
- Konfigurácia aplikácie (AppConfig).
- Logger alebo log manager.
- Connection pool alebo cache manager.
- Centralizované spracovanie udalostí alebo notifikácií.