import java.util.ArrayList;

/**
 * Класс, представляющий Кошачий мир, где можно добавлять и удалять котов.
 */
public class CatWorld {
    private ArrayList<String> catList;

    /**
     * Конструктор класса CatWorld.
     */
    public CatWorld() {
        catList = new ArrayList<>();
    }

    /**
     * Метод для добавления кота в Кошачий мир.
     *
     * @param catName Имя кота, которое нужно добавить.
     */
    public void addCat(String catName) {
        catList.add(catName);
    }

    /**
     * Метод для удаления кота из Кошачего мира.
     *
     * @param catName Имя кота, которое нужно удалить.
     */
    public void removeCat(String catName) {
        catList.remove(catName);
    }

    /**
     * Метод для получения списка всех котов в Кошачем мире.
     *
     * @return Список всех котов в Кошачем мире.
     */
    public ArrayList<String> getAllCats() {
        return catList;
    }

    public static void main(String[] args) {
        CatWorld catWorld = new CatWorld();

        catWorld.addCat("Мурзик");
        catWorld.addCat("Барсик");
        catWorld.addCat("Вася");
        catWorld.addCat("Паша");
        catWorld.addCat("Кузя");
        catWorld.addCat("Буся");

        System.out.println("Список котов в Кошачем мире: " + catWorld.getAllCats());

        catWorld.removeCat("Барсик");

        System.out.println("Список котов после удаления Барсика: " + catWorld.getAllCats());
    }
}