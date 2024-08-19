# ĆWICZENIE Z KODOWANIA
 
## Instrukcje: 
 
Proszę podać implementację Tablicy Wyników Mistrzostw Świata w Piłce Nożnej na Żywo jako prostą bibliotekę lub aplikację frontendową:  
1.	Prosimy o zapoznanie się z poniższymi wskazówkami.  
2.	Postępuj zgodnie z wytycznymi, aby zrealizować zadanie zgodnie z wymaganiami opisanymi w dalszej części tego dokumentu.  
 
## Wytyczne: 
 
✅ Postaw na prostotę. Postępuj zgodnie z wymaganiami i spróbuj wdrożyć najprostsze rozwiązanie, jakie możesz wymyślić, które działa. Nie zapomnij o przypadkach brzegowych!  
✅ Użyj rozwiązania magazynu w pamięci (na przykład po prostu użyj kolekcji do przechowywania informacji, które mogą być potrzebne).  
✅ Nie oczekujemy, że rozwiązanie będzie interfejsem API REST, aplikacją wiersza polecenia, usługą internetową lub mikrousługą. Wystarczy prosta implementacja biblioteki (lub aplikacji frontendowej).  
✅ Postaw na jakość. Korzystaj z Test-Driven Development (TDD), zwracaj uwagę na projektowanie obiektowe, Czysty Kod i przestrzeganie zasad SOLID.   
✅ Podejście. Zakoduj rozwiązanie zgodnie ze swoimi standardami. Udostępnij swoje rozwiązanie za pomocą linku do repozytorium z kodem (np. github, gitlab, bitbucket), ponieważ chcielibyśmy zobaczyć twoje postępy (ważna jest historia commitów)  
✅ Dodaj plik README.md, w którym obok dokumentacji projektowej możesz zanotować wszelkie założenia lub rzeczy, o których chciałbyś nam wspomnieć na temat swojego rozwiązania.  
 
Jeśli implementacja jest w języku frontendowym, to musi być zgodna ze wszystkimi powyższymi wytycznymi i dodatkowo należy zastosować się do poniższych sugestii:  
- Jeśli rozwiązanie jest napisane w określonym frameworku lub bibliotece interfejsu użytkownika, sugerujemy napisanie najprostszego komponentu / komponentów, które będą służyć opisanej funkcjonalności. Nie trać czasu na to, aby wyglądał dobrze.  
- Jeśli jest napisany w czystym JavaScript lub typescript, sugerujemy implementację rozwiązania jako prostej biblioteki (bez graficznego interfejsu użytkownika)  
 
## Wymagania dotyczące zadania: 
 
Pracujesz w firmie zajmującej się danymi sportowymi i chcielibyśmy, abyś opracował nową bibliotekę tablic wyników Mistrzostw Świata w piłce nożnej na żywo (lub aplikację frontendową), która pokazuje wszystkie trwające mecze i ich wyniki.  
Tablica wyników obsługuje następujące operacje:  
1. Rozpocznij nową grę, zakładając początkowy wynik `0 – 0` i dodając go do tablicy wyników.  
   Powinno to uchwycić następujące parametry: 
   a. Drużyna gospodarzy 
   b. Drużyna gości 
2.	Zaktualizuj wynik. Powinien on otrzymać dwie bezwzględne punkty: wynik drużyny gospodarzy i wynik drużyny gości.  
3.	Ukończ grę, która jest w toku. Spowoduje to usunięcie meczu z tablicy wyników. 
4.	Uzyskaj podsumowanie trwających gier uporządkowanych według ich łącznego wyniku. Mecze z tym samym łącznym wynikiem zostaną zwrócone w kolejności według ostatnio rozpoczętego meczu na tablicy wyników.  
 
Na przykład, jeśli następujące mecze są rozpoczynane w określonej kolejności, a ich wyniki są odpowiednio aktualizowane: 

    a.	Meksyk 0 - Kanada 5 
    b.	Hiszpania 10 - Brazylia 2 
    c.	Niemcy 2 - Francja 2 
    d.	Urugwaj 6 - Włochy 6 
    e.	Argentyna 3 - Australia 1 
 
Podsumowanie powinno wyglądać następująco: 

    1.	Urugwaj 6 - Włochy 6 
    2.	Hiszpania 10 - Brazylia 2 
    3.	Meksyk 0 - Kanada 5 
    4.	Argentyna 3 - Australia 1 
    5.	Niemcy 2 - Francja 2 
 
Powodzenia! 
