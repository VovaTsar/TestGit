/**
 * @author Tsaruk Vova
 * Клас PriceVisitor який реалізує інтерфейс Visitor
 */
public class PriceVisitor implements Visitor {
    /**
     * price загальна ціна, кошторис
     */
    public int price;
    /**
     * Конструктор який встановлює кошторис на нуль
     */
    public PriceVisitor() {
        price = 0;
    }
    /**
     * Метод сумує ціну всіх кабелів
     * @param cableElement - елемент типу CableElement
     */
    @Override
    public void visit(CableElement cableElement) {
        System.out.println("Відвідування кабеля");
        price += cableElement.priceCable;
    }
    /**
     * Метод сумує ціну всіх серверів
     * @param serverElement - елемент типу ServerElement
     */
    @Override
    public void visit(ServerElement serverElement) {
        System.out.println("Відвідування сервера");
        price += serverElement.priceServer;
    }
    /**
     * Метод сумує ціну всіх робочих станцій
     * @param workstationElement - елемент типу WorkstationElement
     */
    @Override
    public void visit(WorkstationElement workstationElement) {
        System.out.println("Відвідування робочої станції");
        price += workstationElement.priceWorkstation;
    }

    /**
     * Вивід на консоль ціну кошторису структури
     */
    @Override
    public String toString() {
        return "Price of all structure price = " + price;
    }
}