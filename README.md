QuotationApp

QuotationApp to aplikacja mobilna stworzona w Android Studio, która wyświetla inspirujące cytaty. Aplikacja umożliwia łatwe przewijanie listy cytatów i ich czytanie w przejrzystym interfejsie.
Funkcjonalności

    Wyświetlanie listy cytatów w formacie: cytat i autor.
    Responsywny interfejs z użyciem RecyclerView.
    Przewijanie listy cytatów w pionie.
    Dane o cytatach są wczytywane z pliku tekstowego quotations.txt, przechowywanego lokalnie w folderze assets.


Wymagania

    Android Studio (dowolna wersja kompatybilna z Android SDK 21+).
    Urządzenie lub emulator z systemem Android (wersja 5.0 Lollipop lub wyższa).

    Jak uruchomić projekt

    Sklonuj repozytorium:

    git clone https://github.com/Elenmith/QuotationApp.git

    Otwórz projekt w Android Studio:
        Kliknij File > Open i wskaż folder projektu.
    Uruchom aplikację:
        Podłącz urządzenie lub uruchom emulator Android.
        Kliknij Run w Android Studio (Shift + F10).

Struktura plików

    app/src/main/assets/quotations.txt: Plik tekstowy zawierający listę cytatów w formacie:

    Cytat
    Autor

    Cytat
    Autor

    app/src/main/res/layout/: Layouty XML aplikacji, w tym główny widok (activity_main.xml) i pojedynczy element listy (item_quote.xml).
    app/src/main/java/com/example/quotationapp/:
        MainActivity: Główna klasa aplikacji.
        Quote: Model danych reprezentujący cytat i autora.
        QuoteAdapter: Adapter do obsługi RecyclerView.

Przyszłe ulepszenia

    Możliwość dodawania własnych cytatów przez użytkownika.
    Filtracja i wyszukiwanie cytatów po autorze.
    Integracja z API do pobierania nowych cytatów online.

Autor

Projekt stworzony przez Elenmith. Jeśli masz pomysły na rozwój aplikacji, zapraszam do składania pull requestów!
