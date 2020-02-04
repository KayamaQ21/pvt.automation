/*
    Нововведения в Java 8

    1. Методы интерфейсов по умолчанию
        Можно добавлять неабстрактные реализации методов в интерфейс, используя ключевое слово default.
    2. Лямбда выражения
        Короткий синтаксис, который помогает не тратить время на создание анонимных объектов.
    3. Функциональные интерфейсы
        Можно использовать любые интерфейсы для лямбда-выражений, содержащие ровно один абстрактный метод.
        Для того, чтобы это гарантировать используется аннотация @FunctionalInterface
    4. Ссылки на методы и конструкторы
        Используя ключевое слово :: можно передавать ссылки на методы или конструкторы.
    5. Области действия лямбд
        Доступны переменные внешней области из лямбд-выражений. Можно ссылаться на переменные объявленные как
        final, на экземплярные поля класса и статическим переменные.
    6. Встроенные функциональные интерфейсы
        - Предикаты: функции, принимающие один аргумент и возвращающие значение типа boolean
        - Функции: принимают один аргумент и возвращают некоторый результат
        - Поставщики: предоставляют результат заданного типа. В отличии от функции не принимают аргументов
        - Потребители: операции, которые производятся над одним входным документом
        - Компараторы: сравнение
        - Опциональные значения: контейнер для значения, которое может быть null
        - Потоки: последовательность элементов надо которой можно производить различные операции
            - Filter: принимает предикат, который фильтрует все элементы потока
            - Sorted: промежуточная операция, которая возвращает отсортированное представление потока
            - Map: преобразовывает каждый элемент в другой объект при помощи переданной функции
            - Match: для проверки, удовлетворяет ли поток заданному предикату
            - Count: конечная операция, которая возвращает количество элементов в потоке
            - Reduce: производит свертку элементов потока по заданной функции
            - Параллельные потоки: операции, которые используют несколько потоков процессора
            - Последовательная сортировка
            - Параллельная сортировка
    7. Ассоциативные массивы
    8. API для работы с датами
    9. Clock: предоставляет доступ к текущай дате и времени
    10. Часовые пояса: содержат смещения, которые важны для конвертации дат и времени в местные
    11. LocalTime: время с учетом часового пояса
    12. LocalDate
    13. LocalDateTime
    14. Аннотации
 */