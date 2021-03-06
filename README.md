# Отчет о тестировании приложения: Автотесты с JUnit Jupiter and Maven
## Краткое описание
10.09.2020 было проведено было проведено функциональное тестирование приложения: Автотесты с JUnit Jupiter and Maven.

На тестирование затрачено: 3 часа

В результате тестирования выявлены следующие дефекты:

* [Сумма покупки не может быть отрицательной или нулевой](https://github.com/Rusdos/Netology-Java5.1/issues/1#issue-697895162)

## Описание процесса тестирования
В процессе тестирования использовались следующие артефакты:

[Тест кейсы для приложения Автотесты с JUnit Jupiter and Maven](https://github.com/Rusdos/Netology-Java5.1/blob/master/TestCases.md)

#### Предусловия 
Установить IntelliJ IDEA согласно 
[Руководство по установке IntelliJ IDEA](https://github.com/netology-code/javaqa-homeworks/blob/master/intro/idea.md)

#### Шаги
1. запустить IntelliJ IDEA
1. в IntelliJ IDEA открыть папку с проектом
1. в папке src открыть класс Main
1. нажать Ctrl+Shift+F10

В качестве тестовых данных использовались данные :

- сумма = 100060, зарегистрирован = true;
- сумма = 100060, зарегистрирован = false;
- сумма = 100000049, зарегистрирован = true;
- сумма = 50000022, зарегистрирован = false;
- сумма = 0, зарегистрирован = true;
- сумма = -10000049, зарегистрирован = true;


Тестирование производилось в следующем окружении:

- ОС Windows 10 x64
- IntelliJ IDEA 2020.2.1 (Community Edition)
Build #IC-202.6948.69, built on August 25, 2020
Runtime version: 11.0.8+10-b944.31 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
Windows 10 10.0
GC: ParNew, ConcurrentMarkSweep
Memory: 858M
Cores: 8
Non-Bundled Plugins: org.nik.presentation-assistant, MavenRunHelper, izhangzhihao.rainbow.brackets
