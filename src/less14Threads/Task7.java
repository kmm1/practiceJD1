package less14Threads;

// написать программу моделирующую кассы в магазине.
//существует несколько касс работающих одновременно. каждый покупатель отдельный трэд.
//общее кол-во покупателей может быть больше чем кол-во касс,
// но одновременно не может обрабатываться больше покупателей чем имеется рабочих касс.
//У каждого покупателя есть набор товаров которые должны быть выведены в процессе обслуживания.
/*Полагаю, что идея в том, что в каждом потоке должна быть очередь (т.е. очередь к каждой кассе),
а также общий пул людей в магазине. И нужно равномерно заполнять эту очередь.
Например, сделаем какую-то общую переменную - люди в магазине, и будем её увеличивать
через какие-то промежутки времени (люди приходят в магазин).
В то же время будем её уменьшать, когда человек закончил покупки и идет на кассу,
кассу выбираем, исходя из размера очереди, где меньше - туда и идем.
 */

public class Task7 {
}
