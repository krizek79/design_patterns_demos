# Bridge
- Typ: Structural Design Pattern
- Účel: Oddeliť abstrakciu od jej implementácie, aby sa mohli meniť nezávisle na sebe.

## Hlavný princíp
- Definuje dve hierarchie:
- Abstrakcia (napr. Payment) – čo klient používa.
- Implementácia (napr. PaymentGateway) – ako sa to technicky vykoná.
- Abstrakcia obsahuje odkaz na implementáciu (composition).
- Umožňuje kombinovať rôzne typy abstrakcií a implementácií bez explózie tried.

## Kedy použiť
- Triedy majú dve (alebo viac) dimenzie variability, ktoré sa môžu meniť nezávisle.
- Chceš sa vyhnúť kombinatorickému nárastu počtu tried (napr. X druhov platieb × Y typov brán).
- Potrebuješ zachovať flexibilitu pri rozširovaní – môžeš pridať novú abstrakciu alebo novú implementáciu bez zmeny druhej.
- Chceš, aby klient pracoval len s abstrakciou, nezaujíma ho detail implementácie.

## Zložky
- Abstraction – definuje rozhranie pre klienta (napr. Payment).
- RefinedAbstraction – špecifická implementácia abstrakcie (napr. RecurringPayment).
- Implementor – definuje rozhranie pre implementácie (napr. PaymentGateway).
- ConcreteImplementor – konkrétna implementácia (napr. StripeGateway, PayPalGateway).

## Výhody
- Odlúčenie abstrakcie od implementácie → obidve sa dajú rozvíjať nezávisle.
- Predchádza explózii tried pri kombináciách.
- Uľahčuje testovanie (abstrakcia sa dá testovať nezávisle od konkrétnych implementácií).
- Vysoká flexibilita pri rozširovaní – stačí pridať novú abstrakciu alebo implementáciu.

## Nevýhody
- Zvýšená zložitosť návrhu (viac tried a rozhraní).
- Nie vždy je potrebný – pre jednoduché problémy môže byť „overengineering“.

## Bežné príklady použitia
- Platobné systémy: rôzne typy platieb × rôzni poskytovatelia brán.
- GUI frameworky: widgety (abstrakcia) × renderovacie knižnice (implementácia).
- Ukladanie dát: abstrakcia (DataStore) × implementácia (SQL, NoSQL, súbor).
- Ovládače zariadení: abstrakcia (RemoteControl) × implementácia (TV, rádio).