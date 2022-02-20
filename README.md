# Laboratorium 1 - kompilacja, uruchamianie, IDE

## 1.1 Kompilacja i uruchomienia Hello World

- Za pomocą swojego ulubionego edytora utwórz plik HelloWorld.java
- zadeklaruj w nim klasę HelloWorld
- Wpisz wewnątrz funkcję
  ```java
  public static void main(String[] args)
  ```
- W funkcji wypisz: tekst `Hello World` – użyj instrukcji `System.out.println("tekst")`

Sprawdź czy działają polecenia:

- `javac` - kompilator
- `java` - maszyna wirtualna

Skompiluj program wywołując:

```
javac HelloWorld.java
```

Co pojawiło się w wyniku kompilacji na dysku?

Uruchom program wywołując:

```
java HelloWorld
```

## 1.2 Klasa należąca do pakietu

- Utwórz podkatalog `lab1`
- Skopiuj tam plik HelloWorld.java
- Dodaj na początku pliku
  ```java
  package lab1;
  ```
- Skompiluj za pomocą `javac`
- Spróbuj uruchomić wywołując:
  1. `java HelloWorld`
  2. `java lab1/HelloWorld`
  3. `java lab1.HelloWorld`
  4. `java -cp .. lab1.HelloWorld`

Które rozwiązanie zadziałało i z jakiej lokalizacji względem pliku HelloWorld.class?

## 1.3 Proste wejście wyjście

**Wyjście** - wypróbuj warianty:

```java
System.out.print("...");
System.out.println("...");
System.out.printf("String %s int %d double %f", ???);
```

**Wejście** - wczytywanie danych z konsoli:

Zaimportuj klasy `Scanner` i `Locale`:

```java
import java.util.Scanner;
import java.util.Locale;
 
public class Main {
    public static void main(String[] args) {
        //...
    }
}
```

Zobacz, jak można wczytać dane:

```java
Scanner scan = new Scanner(System.in);
String s = scan.next();
int i = scan.nextInt();
double d = scan.nextDouble();
System.out.printf("Wczytano %s , %d, %f", s, i, d);
```

Wolisz stosować kropki, jako separator dziesiętny? Zmień locale na `Locale.US`

```java
Scanner scan = new Scanner(System.in).useLocale(Locale.US);
String s = scan.next();
int i = scan.nextInt();
double d = scan.nextDouble();
System.out.printf(Locale.US, "Wczytano %s , %d, %f", s, i, d);
```

`Locale.US` to stała (zmienna statyczna) zdefiniowana wewnątrz klasy `Locale`. Kropka ma takie znaczenie, jak operator zasięgu `::` w C++.

### Wybór IDE

Netbeans :smiley: vs. InteliJ :wink: vs. Eclipse :confused:

- Osobiście najczęściej używam Netbeans (sprawnie obsługuje kodowanie w Java, C/C++, SQL i PHP, usługi sieciowe, JavaScript, itp.). Rozwijane przez Apache (wcześniej Oracle), bezpłatne.
- InteliJ ma podobną efektywność i funkcjonalność. Praktycznie ten sam produkt jest oficjalnym narzędziem budowy aplikacji dla systemu Android. Dostępna wersja community lub pełna (dla studentów bezpłatna)
- Eclipse jest rozpowszechnione, także jako platforma do budowy samodzielnych aplikacji z GUI. Mam jednak wrażenie, że działa wolno i często "zatyka się", zwłaszcza przy uzupełnianiu kodu (*code completion*). Bezpłatne.

## 1.4 Tworzymy pierwszy projekt w IDE

- Utwórz projekt Lab1
- Utwórz w nim klasę `SimpleIO` umieszczoną w pakiecie `lab1`. W zależności od IDE - może być konieczne wpierw utworzenie pakietu, a potem klasy
- Przekopiuj tam kod
- Obserwuj edytor - program jest kompilowany w locie, błędy są zaznaczane, część rutynowych działań mających na celu ich wyeliminowanie można wykonać automatycznie (klikając lub używając kombinacji klawiszy)
- Uruchom (możesz wybrać Run lub Run file)

## 1.5 Druga funkcja main?

twórz klasę o nazwie `Fibo` i utwórz w niej funkcję `main()`

Zaimplementuj tam kod umieszczony w funkcji `main()`, który

- wczytuje liczbę całkowitą n z zakresu 1 - 45 (dla liczb spoza zakresu wychodzi z funkcji `main`)
- deklaruje tablicę (czytaj: deklaruje zmienną `tab` i tworzy tablicę na stercie) `int[] tab = new int[n]`
- wypełnia ją wartościami ciągu Fibbonaciego
- Wypisuje elementy tablicy

Uruchom program za pomocą opcji Run File

## 1.6 Trzecia funkcja main? Problem 610A

- Dodaj do projektu klasę `Problem610A`
- Przeczytaj opis zadania na stronie [http://codeforces.com/problemset/problem/610/A](http://codeforces.com/problemset/problem/610/A)
- Zaimplementuj...
- Sprawdź działanie dla opublikowanych przykładów
- Opcjonalnie: załóż konto i prześlij kod do wykonania w chmurze. Sprawdź, czy przeszedł wszystkie testy?

## 1.7 I jeszcze czwarta. Problem 115A

- Dodaj do projektu klasę `Problem115A`
- Przeczytaj opis zadania na stronie [http://codeforces.com/problemset/problem/115/A](http://codeforces.com/problemset/problem/115/A)
- Podobnie, jak poprzednio zaimplementuj i przetestuj
