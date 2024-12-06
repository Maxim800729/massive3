import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1) Найдите и выведите количество положительных и отрицательных чисел в массив
        int[] arr = {11, -1, 22, -55, 99, 31, -7, 27};
        int positivecount = 0;
        int negativecount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positivecount++;
            } else if (arr[i] < 0) {
                negativecount++;
            }
        }
        System.out.println("Kolichestvo positive count" + positivecount);
        System.out.println("Kolichestvo negative count" + negativecount);

//        2) Подсчет нулей: Создайте массив из 20 чисел, заполните его случайными числами , и подсчитайте, сколько в нем нулей.
        int[] arr1 = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
        }
        int zerocount = 0;
        for (int num : arr1) {
            if (num == 0) {
                zerocount++;
            }
        }
        System.out.println("Massive");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Kolichestvo 0   :" + zerocount);


//        3) Поиск элементов, равных индексу: Найдите все элементы массива, значения которых равны их индексам.
        int[] arr2 = {0, 1, 23, 2, 54, 45};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == i) {
                System.out.println("Element : " + arr2[i] + "  raven indexu  :" + i);
            }
        }


//        4) Удаление элементов: Создайте массив из 15 чисел, замените все отрицательные числа на нули.
        // Инициализация массива
        int[] arr3 = {-1, -3, -4, 66, 45, -8, -10, 44, 6, 88, 9, 99, 22, 6, 33};

        // Вывод начального массива
        System.out.println("Массив перед заменой:");
        for (int num : arr3) {
            System.out.print(num + ", ");
        }
        System.out.println();

        // Замена отрицательных элементов на 0
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 0) {
                System.out.println("Элемент " + arr3[i] + " заменяется на 0");
                arr3[i] = 0;
            }
        }

        // Вывод массива после замены
        System.out.println("Массив после замены:");
        for (int num : arr3) {
            System.out.print(num + ", ");
        }
        System.out.println();

//        6) Подсчет элементов, больших предыдущих: Определите количество элементов массива, которые больше предыдущего элемента.
        int[] arr5 = {-1, -3, 4, 66, 45, -8, -10, 44, 6, 88, 9, 99, 22, 6, 33};
        int count = 0;
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] > arr5[i - 1]) {
                count++;
            }
        }
        System.out.println("Kol.elementov > predidushih = " + count);

        System.out.println();
//        7) Произведение элементов: Найдите произведение всех элементов массива, кроме нулевых.
        int[] arr6 = {5, -8, 0, 3};
        long product = 1;
        for (int num : arr6) {
            if (num != 0) {
                product *= num;
            }
        }
        System.out.println("произведение всех элементов массива, кроме нулевых." + product);

        System.out.println();
//        8) Сравнение крайних элементов:
//        Определите, больше ли сумма первых пяти элементов массива,
//        чем сумма последних пяти.
        int[] arr7 = {-1, -3, 4, 66, 45, -8, -10, 44, 6, 88, 9, 99, 22, 6, 33};
        int summfirstfive = 0;
        for (int i = 0; i < 5; i++) {
            summfirstfive += arr7[i];
        }
        int summlastfive = 0;
        for (int i = arr7.length - 5; i < arr7.length; i++) {
            summlastfive += arr7[i];
        }
        System.out.println("сумма первых пяти элементов массива :" + summfirstfive);
        System.out.println("сумма последних пяти элементов массива :" + summlastfive);

        if (summfirstfive>summlastfive) {
            System.out.println("сумма первых пяти элементов массива > сумм последних пяти элементов массива");
        } else if (summfirstfive<summlastfive) {
            System.out.println("сумма первых пяти элементов массива < сумм последних пяти элементов массива");
        }
        else {
            System.out.println(";сумма первых пяти элементов массива = сумм последних пяти элементов массива");
        }
        System.out.println();
//        9) Поиск двух наименьших элементов: Найдите два наименьших элемента в массиве из 10 чисел.
        int[] arr8 = {-1, -3, -4, 66, 45, -8, -10, 44, 6, 4};
        // Проверка, что массив не пустой
        if (arr8.length < 2) {
            System.out.println("Массив должен содержать минимум два элемента.");
            return;
        }

        // Инициализация двух минимальных значений первыми элементами массива
        int min1 = arr8[0];
        int min2 = arr8[1];

        // Убедимся, что min1 меньше min2
        if (min1 > min2) {
            int temp = min1;
            min1 = min2;
            min2 = temp;
        }

        // Поиск двух минимальных элементов
        for (int i = 2; i < arr8.length; i++) {
            if (arr8[i] < min1) {
                min2 = min1; // Обновляем второй минимум
                min1 = arr8[i]; // Обновляем первый минимум
            } else if (arr8[i] < min2) {
                min2 = arr8[i]; // Обновляем только второй минимум
            }
        }

        // Вывод результатов
        System.out.println("Первый наименьший элемент: " + min1);
        System.out.println("Второй наименьший элемент: " + min2);
        System.out.println();

//        10) Проверка на упорядоченность: Определите, отсортирован ли массив по возрастанию.
        int[] arr9 = {-1, -3, -4, 66, 45, -8, -10, 44, 6, 4};
        // Флаг для проверки упорядоченности
        boolean isSorted = true;

        // Проверка массива на упорядоченность
        for (int i = 0; i < arr9.length - 1; i++) {
            if (arr9[i] > arr9[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Вывод результата
        if (isSorted) {
            System.out.println("Массив отсортирован по возрастанию.");
        } else {
            System.out.println("Массив НЕ отсортирован по возрастанию.");
        }
//        11) Проверка на упорядоченность: Определите, отсортирован ли массив по убыванию
        // Инициализация массива
        int[] arr10 = {-1, -3, -4, 66, 45, -8, -10, 44, 6, 4};

        // Флаг для проверки упорядоченности
        boolean isSortedDescending = true;

        // Проверка массива на упорядоченность по убыванию
        for (int i = 0; i < arr10.length - 1; i++) {
            if (arr10[i] < arr10[i + 1]) {
                isSortedDescending = false;
                break;
            }
        }

        // Вывод результата
        if (isSortedDescending) {
            System.out.println("Массив отсортирован по убыванию.");
        } else {
            System.out.println("Массив НЕ отсортирован по убыванию.");
        }

//        12) Частота элементов: Подсчитайте, сколько раз каждое число встречается в массиве.
        int[] arr11 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        // Массив для учета уже обработанных элементов
        boolean[] checked = new boolean[arr11.length];

        System.out.println("Частота элементов:");

        // Внешний цикл для прохода по каждому элементу массива
        for (int i = 0; i < arr11.length; i++) {
            if (!checked[i]) { // Если элемент еще не обработан
                int count2 = 1; // Начинаем подсчет с 1
                // Внутренний цикл для сравнения с остальными элементами
                for (int j = i + 1; j < arr11.length; j++) {
                    if (arr11[i] == arr11[j]) {
                        count2++; // Увеличиваем счетчик, если элементы совпадают
                        checked[j] = true; // Отмечаем элемент как обработанный
                    }
                }
                // Вывод результата для текущего элемента
                System.out.println("Число " + arr11[i] + " встречается " + count2 + " раз(а).");
            }
        }

//        13) Инвертирование знаков: Замените все положительные числа в массиве на отрицательные, и наоборот.
        // Инициализация массива
        int[] arr12 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        System.out.println("Массив до инверсии знаков:");
        for (int num : arr12) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Инвертирование знаков
        for (int i = 0; i < arr12.length; i++) {
            arr12[i] = arr12[i] * -1; // Умножаем каждый элемент на -1
        }

        System.out.println("Массив после инверсии знаков:");
        for (int num : arr12) {
            System.out.print(num + " ");
        }

//        14) Замена элементов на чётные индексы: Замените все элементы на чётных индексах на их квадрат.
        // Инициализация массива
        int[] arr13 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        System.out.println("Массив до изменения:");
        for (int num : arr13) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Замена элементов на чётных индексах на их квадрат
        for (int i = 0; i < arr13.length; i += 2) { // Чётные индексы: 0, 2, 4, ...
            arr13[i] = arr13[i] * arr13[i];
        }

        System.out.println("Массив после изменения:");
        for (int num : arr13) {
            System.out.print(num + " ");
        }

System.out.println();
//        15) Сумма элементов на чётных индексах: Найдите сумму элементов, расположенных на чётных индексах массива.
        // Инициализация массива
        int[] arr14 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        int sum = 0; // Переменная для хранения суммы элементов

        // Подсчёт суммы элементов на чётных индексах
        for (int i = 0; i < arr14.length; i += 2) { // Чётные индексы: 0, 2, 4, ...
            sum += arr14[i];
        }

        // Вывод результата
        System.out.println("Сумма элементов на чётных индексах: " + sum);

//        16) Замена минимального элемента на 100: Замените минимальный элемент из массива.
        // Инициализация массива
        int[] arr15 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        // Поиск минимального элемента и его индекса
        int minIndex = 0; // Индекс минимального элемента
        for (int i = 1; i < arr15.length; i++) {
            if (arr15[i] < arr15[minIndex]) {
                minIndex = i;
            }
        }

        // Замена минимального элемента на 100
        System.out.println("Минимальный элемент: " + arr15[minIndex]);
        arr15[minIndex] = 100;

        // Вывод массива после замены
        System.out.println("Массив после замены минимального элемента на 100:");
        for (int num : arr15) {
            System.out.print(num + " ");
        }


//        17) Обратный порядок массива: Распечатайте массив наоборот
        // Инициализация массива
        int[] arr16 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        System.out.println("Массив в обратном порядке:");

        // Печать массива в обратном порядке
        for (int i = arr16.length - 1; i >= 0; i--) {
            System.out.print(arr16[i] + " ");
        }

//        18) Замена элементов на индекс: Замените все элементы массива на их индекс.
        // Инициализация массива
        int[] arr17 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        System.out.println("Массив до изменения:");
        for (int num : arr17) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Замена элементов массива на их индексы
        for (int i = 0; i < arr17.length; i++) {
            arr17[i] = i; // Заменяем элемент на его индекс
        }

        System.out.println("Массив после замены элементов на их индексы:");
        for (int num : arr17) {
            System.out.print(num + " ");
        }
System.out.println();
//        19) Сумма положительных элементов: Найдите сумму всех положительных элементов массива.
        // Инициализация массива
        int[] arr18 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        int sum1 = 0; // Переменная для хранения суммы положительных элементов

        // Подсчёт суммы положительных элементов
        for (int num : arr18) {
            if (num > 0) { // Проверяем, является ли элемент положительным
                sum1 += num;
            }
        }

        // Вывод результата
        System.out.println("Сумма положительных элементов: " + sum1);

//        20) Поиск последнего отрицательного элемента:
//        Найдите последний отрицательный элемент в массиве и замените его на 0.
        // Инициализация массива
        int[] arr19 = {-1, 3, -4, 66, 45, -8, -10, 44, 66, 4};

        // Поиск последнего отрицательного элемента
        for (int i = arr19.length - 1; i >= 0; i--) {
            if (arr19[i] < 0) { // Если элемент отрицательный
                System.out.println("Последний отрицательный элемент: " + arr19[i] + " на индексе " + i);
                arr19[i] = 0; // Замена на 0
                break; // Прерываем цикл после замены
            }
        }

        // Вывод массива после замены
        System.out.println("Массив после замены последнего отрицательного элемента на 0:");
        for (int num : arr19) {
            System.out.print(num + " ");
        }
        System.out.println();
//        21) Удвоение элементов на нечётных индексах: Умножьте все элементы на нечётных индексах на 2.
        int[] arr20 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        System.out.println("Массив до удвоения элементов на нечётных индексах:");
        for (int num : arr20) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Удвоение элементов на нечётных индексах
        for (int i = 1; i < arr20.length; i += 2) { // Нечётные индексы: 1, 3, 5, ...
            arr20[i] *= 2; // Умножаем элемент на 2
        }

        System.out.println("Массив после удвоения элементов на нечётных индексах:");
        for (int num : arr20) {
            System.out.print(num + " ");
        }
//        22) Замена максимального элемента на минимальный:
//        Найдите максимальный элемент массива и замените его на минимальный.
        // Инициализация массива
        int[] arr21 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        // Поиск максимального и минимального элемента и их индексов
        int maxIndex1 = 0;
        int minIndex1 = 0;

        for (int i = 1; i < arr21.length; i++) {
            if (arr21[i] > arr21[maxIndex1]) {
                maxIndex1 = i;
            }
            if (arr21[i] < arr21[minIndex1]) {
                minIndex1 = i;
            }
        }

        // Вывод найденных элементов
        System.out.println("Максимальный элемент: " + arr21[maxIndex1] + " на индексе " + maxIndex1);
        System.out.println("Минимальный элемент: " + arr21[minIndex1] + " на индексе " + minIndex1);

        // Замена максимального элемента на минимальный
        arr21[maxIndex1] = arr21[minIndex1];

        // Вывод массива после замены
        System.out.println("Массив после замены максимального элемента на минимальный:");
        for (int num : arr21) {
            System.out.print(num + " ");
        }
System.out.println();
//        23) Замена элементов, делящихся на 2 и 3:
//        Замените в массива все элементы, которые делятся на 2 и на 3 на число 100.
        // Инициализация массива
        int[] arr22 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        System.out.println("Массив до замены:");
        for (int num : arr22) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Замена элементов, делящихся на 2 и на 3
        for (int i = 0; i < arr22.length; i++) {
            if (arr22[i] % 2 == 0 && arr22[i] % 3 == 0) { // Проверяем делимость на 2 и на 3
                arr22[i] = 100;
            }
        }

        System.out.println("Массив после замены элементов, делящихся на 2 и на 3:");
        for (int num : arr22) {
            System.out.print(num + " ");
        }
System.out.println();
//        24) Количество элементов, больших среднего арифметического:
//        Подсчитайте количество элементов, которые больше среднего арифметического массива.
        // Инициализация массива
        int[] arr23 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        // Шаг 1: Нахождение среднего арифметического
        double sum2 = 0;
        for (int num : arr23) {
            sum2 += num;
        }
        double average = sum2 / arr23.length;

        // Шаг 2: Подсчёт количества элементов, больших среднего арифметического
        int count3 = 0;
        for (int num : arr23) {
            if (num > average) {
                count3++;
            }
        }

        // Вывод результатов
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Количество элементов, больших среднего арифметического: " + count3);

//        25) Нахождение индекса максимального элемента:
//        Найдите индекс максимального элемента в массиве.
        // Инициализация массива
        int[] arr24 = {-1, -3, -4, 66, 45, -8, -10, 44, 66, 4};

        // Переменная для хранения индекса максимального элемента
        int maxIndex = 0;

        // Поиск максимального элемента и его индекса
        for (int i = 1; i < arr24.length; i++) {
            if (arr24[i] > arr24[maxIndex]) {
                maxIndex = i;
            }
        }

        // Вывод результата
        System.out.println("Максимальный элемент: " + arr24[maxIndex]);
        System.out.println("Индекс максимального элемента: " + maxIndex);


    }}