# Adapter Pattern
- Typ: Structural Design Pattern
- Účel: Umožniť spoluprácu tried s nekompatibilnými rozhraniami.

## Hlavný princíp
- Klient očakáva Target rozhranie.
- Existujúca trieda (Adaptee) má iné rozhranie.
- Adapter prekladá volania klienta na formát, ktorému rozumie Adaptee.
- Klient nemusí vedieť, že používa adaptér.

## Kedy použiť
- Potrebuješ použiť existujúci kód alebo knižnicu, ktorá má odlišné rozhranie.
- Chceš prepojiť starý kód s novým bez zásahu do zdrojového kódu.
- Potrebuješ zjednotiť rôzne API pod jednotné rozhranie.
- Chceš, aby bol klient kód nezávislý od konkrétnych implementácií.

## Zložky
- Target – rozhranie, ktoré klient očakáva.
- Adaptee – existujúca trieda s iným rozhraním.
- Adapter – implementuje Target, interne používa Adaptee.
- Client – používa iba Target, bez znalosti o Adaptee.

## Výhody
- Opätovné použitie existujúceho kódu bez jeho úprav.
- Izolácia klienta od zmien vo formáte/adaptee.
- Umožňuje kombinovať staré a nové komponenty.

## Nevýhody
- Zavádza dodatočnú vrstvu (môže mierne zvýšiť zložitosť).
- Pri veľkom počte adaptovaných tried môže pribudnúť množstvo adapterov.

## Bežné príklady použitia
- GUI frameworky – adaptácia rôznych widgetov medzi platformami.
- Integrácia knižníc – napr. zabalenie legacy kódu do moderného rozhrania.
- Externé API – preklad medzi rôznymi formátmi dát (XML ↔ JSON).
- IO streamy v Jave – InputStreamReader je adapter medzi InputStream a Reader.