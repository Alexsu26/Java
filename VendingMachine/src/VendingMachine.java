public class VendingMachine {
    int price = 80;
    int balance;          //成员变量默认初始化0
    int total = f();     //访问构造函数前，先创建成员变量，再访问
    //构造函数，因此这里f()没有作用，始终会被构造函数初始化为0

    VendingMachine()    //构造函数，名字与类相同，没有返回类型
    {
        total = 0;
    }

    VendingMachine(int price)    //重载
    {                            //一个类里面，同名但参数表不同的函数
        this.price = price;     //之间为重载关系
    }


    int f() {
        return 0;
    }

    void setPrice(int price) {
        this.price = price;     //不能直接price = price
    }

    void showPrompt() {
        System.out.println("Welcome");
    }

    void insertMoney(int amount) {
        balance = balance + amount;
    }

    void showBalance() {
        System.out.println(this.balance);
    }

    void getFood() {
        if (balance >= price) {
            System.out.println("Here you are");
            balance = balance - price;
            total = total + price;
        }
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();

        VendingMachine vm1 = new VendingMachine(100);
        vm1.insertMoney(80);
        vm1.showBalance();
        vm.showBalance();
    }
}
