# 用来存放java代码

--------------------

测试远程仓库情况

--------------------

测试idea的同步情况

--------------------

测试gb12上的同步情况

---------------------
## 一些问题

* 强制类型转换，一般用 *(Elemtype)* 进行，但只针对
后一位，在下例中(*来自Lesson_GuessNum_rand*)
```java
    int number = (int)(Math.random() * 100 + 1);
    int number = (int)Math.random() * 100 + 1;
```
> 其中第一行为正确代码，先将random的数算出来在转化为`int`型;   
> 而第二行在`Math.random()`前加了`(int)`导致结果只能为0，
    从而整个式子只能为1；

* idea常用的操作：
> `Shift + Enter`新建下一行  
> `Ctrl + Alt + Enter`新建上一行  
> `Alt + Shift + 方向键`上下移动当前行  

* 对于多重循环，若要从最里面退出所有循环，可以在最外层循环前加上
标号`label`来标示，退出时用`break label`或 `continue label`
```java
    OUT:        //label
    for()
    {
        for()
        {
            break OUT;
        }
    }
```

* 定义数组变量：
```java
// <类型>[] <名字> = new <类型>[个数] 元素个数可以是变量
int[] num = new int[100];

//直接初始化
int [] scores = {1,23,4,54,2,432,4,234,12};
```
* **for-each**  循环：
```java
    int[] data = {};
    for(int k : data)
        if( k == x )
            found = true;
```
> `for(int k : data)`相当于把每个data[i]赋值给k，每轮循环
k都取data[i]的值，但是不能对k进行修改，不能读取下标

* 二维数组
```java
//定义一个二维数组
int[][] num = new int[len][len];

//初始化二维数组
int[][] num = {{},{},{}};   //用逗号分隔行
```

* 逃逸字符
> 以`\ \`开头  

|     字符      |     意义      |
|:-----------:|:-----------:|
|     \b      |    回退一格     |  
|     \t      |   到下一个表格    |    
|     \n      |     换行      |  
|     \r      |     回车      |  
|     \"      |     双引号     |  
|     \'      |     单引号     |  
|     \\      |     反斜杠     |

* `this`是成员函数的一个固有的本地变量，它表达了调用
这个函数的那个对象；更多相关以及构造函数、重载在VendingMachine的注释当中

* 写成：
```java
    public String toString(){ }
```
的成员函数，都可以将对象输出为`[, , , ]`格式，例如`notebook.NoteBook`文件

* 声明对象初始化的时候，初始化的顺序为：父类定义初始化 ->  父类构造函数 *(显式super(参数)，隐式super())* ->
 子类定义初始化 -> 子类构造函数

* 子类继承了可以说父类的所有东西：

| 父类成员访问属性  |      在父类中的含义      | 在子类中的含义                                      |
|-----------|:-----------------:|:---------------------------------------------|
| public    |      对所有人开放       | 对所有人开放                                       |
| protected | 只有包内其它类、自己和子类可以访问 | 只有包内其它类、自己和子类可以访问                            |
| 缺省        |    只有包内其它类可以访问    | 如果子类与父类在同一个包内：只有包内其它类可以访问 否则：相当于private，不能访问 |
| private   |     只有自己可以访问      | 不能访问                                         |
> 父类的private的成员在子类里仍然是存在的，只是子类中不能直接访问。
不可以在子类中重新定义继承得到的成员的访问属性。
> 如果重新定义一个在父类中已经存在的成员变量，那么是在定义一个与父类的成员变量完全无关的变量，
> 在子类中可以访问这个定义在子类中的变量，在父类的方法中访问父类的那个。尽管它们同名但是互不影响。

* 类定义了类型，子类定义了子类型，子类的对象可以当作父类的
对象来使用 *(赋值给父类变量、传递给父类函数、放进存放父类对象的容器)*
> Java中保存对象类型的变量是多态变量。

> “多态”这个术语 *(字面意思是许多形态)* 是指一个变量可以保存不同类型 *(即其声明的类型或任何子类型)* 的对象。

* 造型 *(cast)*： 一个类型的对象赋值给另一个类型的变量
> 子类的对象可以赋值给父类的变量(向上造型)，反过来不行    
> 但是如果父类变量实际管理的就是子类的对象时，可以通过`(类型)`来完成造型，  
> 但是这是将其当作子类对象来看待，而不是强制类型转换那样强行改造
```java
    Vechicle v;
    Car c = new Car();
    v = c;              //v实际管理的是Car类型的对象
    
    Car d;
    d = (Car)v;         //不能直接d=v
```  
> 不能直接用对象给对象赋值  

* `@Override`的作用
> 告诉编译器，下面的函数要覆盖父类的函数，
> 而这两个函数必须有完全相同的函数签名 *(函数名和参数表)*

* 抽象`abstract`  
> 抽象函数——表达概念而无法实现具体代码的函数   
> 抽象类——表达概念而无法构造实体的类  

> 带有抽象函数的类一定是抽象类，抽象类不能制造对象但可以定义变量，  
> 这个变量只能接受继承抽象类的非抽象类的对象抽象类的子类，  
> 必须要把抽象类的每个抽象函数具体实现

* 接口`interface`  
> 接口是纯抽象类，任何出现`class`的地方都可以取代为`interface`  

> 所有的成员函数都是抽象函数

> 所有的成员变量都是`public static final`

> 接口实现用`implements`  
> 类可以实现多个接口  
> 接口可以继承接口，但不能继承类  
> 接口不能实现接口

* 内部类  
> 定义在别的类内部、函数内部的类  
> 能够直接访问外部的全部资源 *(包括任何私有成员，外部是函数时，只能访问那个函数里面的final变量)*

* 匿名类
> new对象时给出的类的定义的形式  
> 可以继承某类，也可以实现某个接口

* MVC
> 数据、表现和控制三者分离，各负其责  
> M = Model        (模型) 保存和维护数据，提供接口让外部修改数据，通知表现需要刷新  
> V = View         (表现) 从模型获得数据，根据数据画出表现  
> C = Control      (控制) 从用户得到输入，根据输入调整数据
```mermaid
graph LR
    B[Model] -- Pic --> A[View]
    C[Control] -- modify --> B
    B -- notify --> A
    
```

* 捕捉异常  
```java
    try{
    //可能产生异常的代码
    } catch(Type id1) {
    //处理Type1异常的代码
    } catch(Type id2) {
    //处理Type2异常的代码
    }      
```

```mermaid
graph TD
    A[exception] --> B{in try?};
    B -- YES --> C{match catch?};
    B -- NO --> D{in function?};
    C -- YES --> E[continue];
    C -- NO --> F[exit to the outermost braces];
    D -- YES --> G[return to the caller];
    D -- NO --> F;
    G -.-> B;
    F -.-> B;
```

* 异常处理
> `String getMessage()` : 返回异常的信息  
> `String toString` : 将信息转换为字符串  
> `void printStackTrace()` : 打印出出现异常的堆栈  
```java
//再度抛出    
    catch(Exception e ) {
        System.err.println("An exception was thrown");
        throw e;
    }   
```

* 异常声明   
> 如果函数可能抛出异常，就必须在函数头部加以声明   
```java
    void f() throws TooBig, TooSmall, DivZero{}
    void f() {}
```
> 可以声明并不会真的抛出的异常   
> 抛出的异常可以是任何继承了Throwable类的对象  
> Exception类继承了Throwable   
> throw new Exception();  
> throw new Exception("HELP");

* catch匹配异常  
> 抛出子类异常会被捕捉父类异常的catch给捉到    
> 所有异常都继承自Exception，用`catch(Exception e)`可以匹配任何异常   
> 像`ArrayIndexOutOfBoundsException`的异常是系统异常，不需要声明，但如果没有适当的机制来捕捉，就会导致
> 程序终止

* 异常声明遇到继承关系  
> 当覆盖一个函数时，子类不能声明抛出比父类的版本更多的异常 *(子类对象可能向上造型)*  
> 在子类的构造函数中，必须声明父类可以抛出的全部异常，并且可以超过父类的异常 *(子类构造函数会先调用父类构造函数)*

* 输入输出  
> 二进制数据采用InputStream/OutputStream  
> 文本数据采用Reader/Writer  

* 流式文本处理  
> 一般`PrintWriter`处理的是 *Unicode*编码，  
> 但是实际可能遇到 *Ascll*或 *utf-8* 的编码，因此通常采用以下方法
```java
PrintWriter out = new PrintWriter(
        new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("文件名"))));
out.println(某个数据);
``` 
> 文本读入一般用  
```java
BufferedReader in = new BufferedReader(
        new InputStreamReader(
                new FileInputStream("文件名")));
String line;
while( (line=in.readLine()) != null ){
    System.out.println(line);
}
```

* 数据的读入  
```mermaid
graph TD
A{is binary?} -- Yes --> B[InputStream]
A -- No --> C{is txt?}
C -- Yes --> D[Reader]
C -- No --> E[Scanner]
```