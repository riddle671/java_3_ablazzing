package homework.homework1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Homework1 {
        public static void main(String[] args) {
            ex1();
            ex2();
            ex3();
            ex4();
        }

        public static void ex1() {
            //Дана строка
            String name = "     ПЕтРов Олег Иванович     ";
            //Необходимо
            //1. убрать лишние пробелы,
            //2. перевести текст в верхний регистр
            //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
            // Если содержит "ов " то печатаем на экран: Уважаемый {name}
            // В иных случаях печатаем на экран: Неизвестное лицо {name}
            String nameReplace = name.trim().toUpperCase();
            if (nameReplace.contains("ОВА")) {
                System.out.println("Уважаемая " + nameReplace);
            } else if (nameReplace.contains("ОВ")) {
                System.out.println("Уважаемый " + nameReplace);
            } else {
                System.out.println(nameReplace);
                System.out.println("Неизвестное лицо " + nameReplace);
            }
        }

        public static void ex2() {
            //У нас есть машина. В данной машине есть есть перечень проверок, перед запуском
            //Количество топлива
            double fuel = 10;
            //Проверка двигателя
            boolean isEngineWork = true;
            //Проверка отсутствия ошибок (false - ошибок нет)
            boolean hasErrors = false;
            //Датчики давления шин
            boolean isWheelWork1 = true;
            boolean isWheelWork2 = true;
            boolean isWheelWork3 = true;
            boolean isWheelWork4 = true;

            //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
            // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
            //В ином случае, машина не должна запускаться
            if (
                    fuel >= 10
                            && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                            && (!hasErrors)
                            && isEngineWork
            ) {
                System.out.println("Машина работает");
            } else {
                System.out.println("Машина не работает");
            }
        }

        public static void ex3() {
            //Работа на самостоятельное изучение методов.
            //Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке
            //Распечатать полученный индекс
            String simply = "this is simply. This is my favorite song.";
            String simplyReplace = (simply.toLowerCase().replaceAll("this is", "those are"));
            int value = simplyReplace.indexOf('o');
            System.out.println(value);
        }

        public static void ex4() {
            //Компания Рога и Копыта производит мясные продукты.
            //Перечень производимых товаров :
            //Колбаса - стоимость 800 руб,
            //себестоимость при производстве меньше 1000 кг - 412руб,
            //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
            //себестоимость при производстве от 2000кг - 404 руб

            //Ветчина - стоимость 350 руб
            //себестоимость при производстве - 275 руб

            //Шейка - стоимость 500 руб
            //себестоимость при производстве меньше 500кг - 311 руб
            //себестоимость при производстве больше или равно 500кг - 299 руб

            //Финансовые показатели
            //Доход компании считается как умножение стоимости на количество проданных кг
            //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
            //Прибыль до налогов считается как: доход - расход
            //Налоги считаются так:
            // прибыль до налогов больше 2_000_000, облагается ставкой 13%
            // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
            // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
            //пример расчета налогов для прибыли до налогов 2_500_000:
            //1_000_000 - налог 80_000 - по ставке 8%
            //1_000_000 - налог 100_000 - по ставке 10%
            //500_000 - 65_000 - по ставке 13%
            //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
            //Прибыль после налогов: прибыль до налогов - налог.

            //Необходимо создать универсальную систему расчетов прибыли после налогов,
            //Т.е на вход подаются данные по количеству произведенных продуктов
            // и печатается прибыль после налогов компании
            //Узнать прибыль после налогов, при продаже:
            //Колбасы 2000кг
            //Ветчины 8511кг
            //Шейки 6988кг

            int quantitySausage = 6000;
            int quantityHam = 9511;
            int quantityScrag = 9988;
            int valueSausage = 800;
            int costpriceSausage = 0;
            int valueHam = 350;
            int costpriceHam = 275;
            int valueScrag = 500;
            int costpriceScrag = 0;
            // Себестоимость колбасы
            if (quantitySausage <= 1000) {
                costpriceSausage = 412;
            } else if (quantitySausage > 1000 && quantitySausage < 2000) {
                costpriceSausage = 408;
            } else if (quantitySausage >= 2000) {
                costpriceSausage = 404;
            }
            // Себестоимость шейки
            if (quantityScrag < 500) {
                costpriceScrag = 311;
            } else if (quantityScrag >= 500) {
                costpriceScrag = 299;
            }
            // Доход
            int incomeSausage = valueSausage * quantitySausage;
            int incomeHam = valueHam * quantityHam;
            int incomeScrag = valueScrag * quantityScrag;
            int totalIncome = incomeSausage + incomeHam + incomeScrag;
            // Расход
            int consumptionSausage = costpriceSausage * quantitySausage + 1_000_000;
            int consumptionHam = costpriceHam * quantityHam + 1_000_000;
            int consumptionScrag = costpriceScrag * quantityScrag + 1_000_000;
            int totalConsumption = consumptionSausage + consumptionHam + consumptionScrag;
            // Прибыль
            int profit = totalIncome - totalConsumption;
            // Налоги
            BigDecimal beforeTaxes = new BigDecimal(profit);
            BigDecimal tax;
            if (beforeTaxes.compareTo(new BigDecimal(1_000_000)) < 0) {
                tax = beforeTaxes.multiply(new BigDecimal(0.08));
            } else if (beforeTaxes.compareTo(new BigDecimal(2_000_000)) < 0) {
                BigDecimal taxBeforeMillionInclude = new BigDecimal(1_000_000)
                        .multiply(new BigDecimal(0.08));
                tax = beforeTaxes.subtract(new BigDecimal(1_000_001))
                        .multiply(new BigDecimal(0.1))
                        .add(taxBeforeMillionInclude);
            } else {
                BigDecimal taxBeforeMillionInclude = new BigDecimal(1_000_000)
                        .multiply(new BigDecimal(0.08));
                BigDecimal taxBeforeMillionOneAndTwoMillionInclude = new BigDecimal(999_999)
                        .multiply(new BigDecimal(0.1));
                tax = beforeTaxes.subtract(new BigDecimal(2_000_000))
                        .multiply(new BigDecimal(0.13))
                        .add(taxBeforeMillionInclude)
                        .add(taxBeforeMillionOneAndTwoMillionInclude);
            }
            // Прибыль после налогов
            int netProfit = profit - tax.intValue();
            if (profit > 0){
                System.out.println("Прибыль после налогов: " + netProfit + " рублей" );
            } else
                System.out.println("Прибыли нет");






        }
    }
