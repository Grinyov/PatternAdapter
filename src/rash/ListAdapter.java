package rash;

/**
 * Created by green on 29.07.2015.
 *
 * Класс "Адаптер" от интерфейса AlphaList к интерфейсу BetaList
 *
 * Класс ListAdapter реализует интерфейс BetaList из второго фреймворка
 *
 * Когла кто-то вызывает эт методы, кол класса
 * перевызывает методы переменной list, которая имеет
 * тип AlphaList из первого фреймворка
 *
 * Объект типа AlphaList передается в конструктор ListAdapter
 * в момент создания
 *
 * Метод setSize работает по принципу: если нужно увеличить
 * размер спмска - добавим туда пустых(null) элементов.
 * Если нужно уменьшить - удалим несколько последних
 */
public class ListAdapter implements BetaList {

    private AlphaList list;

    ListAdapter(AlphaList list){
        this.list = list;
    }

    @Override
    public int getValue(int index) {
        return this.list.get(index);
    }

    @Override
    public void setValue(int index, int value) {
        this.list.set(index, value);
    }

    @Override
    public int getSize() {
        return this.list.count();
    }

    @Override
    public void setSize(int newSize) {
        if(newSize > this.list.count())
        {
            while (this.list.count() < newSize)
            {
                this.list.add(Integer.parseInt(null));
            }
        }
        else if(newSize < this.list.count())
        {
            while (this.list.count() > newSize)
            {
                list.remove((list.count() - 1));
            }
        }
    }
}
