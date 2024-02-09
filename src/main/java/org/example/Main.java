
//6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello dear teacher!");
        //1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        //2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
        Category CategoryMilk = new Category();
        Category CategorySweets = new Category();
        Category CategoryWater = new Category();
        //3)Создать класс Basket, содержащий массив купленных товаров.
        //4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
        //5)Вывести на консоль каталог продуктов. (все продукты магазина)
        Product ProductOne = new Product();
        System.out.println("Продукт: " + ProductOne.name +
                "\n Цена - " + ProductOne.price +
                "\n Рейтинг: " + ProductOne.rating);
        //6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
        User UserOne = new User();
        System.out.println("Пользователь: " + UserOne.login +
                " с корзиной товаров:" + UserOne.UserBasket);
        }

    }