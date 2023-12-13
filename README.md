# Що робить програма?
Програма створена для перевірки слів на наявність паліндромома, якщо це слово читається зліва на право та з права на ліво однаково то програма підверджує, що це палінлром. Якщо слово не проходить перевірку на паліндром, програма напише про це.
# Опис роботи:
### Клас `PalindromeChecker`
Клас `PalindromeChecker` містить метод `isPalindrome`, який перевіряє, чи введене слово є паліндромом.

**Метод:**
- `isPalindrome(testWord)`: Перевіряє, чи слово є паліндромом.
  **Приклад**
  `String testWord = "eye";
        boolean isPalindromic = isPalindrome(testWord);
        System.out.println("Is the word a palindrome? " + isPalindromic);`
# Тести

### Клас `PalindromeCheckerTest`
`PalindromeCheckerTest` призначений для тестування класу `PalindromeChecker`.

**Методи тесту:**
1. `testIsPalindrome()`: Тестує метод `isPalindrome` на різних вхідних даних для перевірки його правильності.
