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
> 
|    字符    |     意义      |    
|:--------:|:-----------:|  
|    \b    |    回退一格     |  
|    \t    |   到下一个表格    |    
|    \n    |     换行      |  
|    \r    |     回车      |  
|    \"    |     双引号     |  
|    \'    |     单引号     |  
|    \\    |     反斜杠     |  

* `this`是成员函数的一个固有的本地变量，它表达了调用
这个函数的那个对象；更多相关以及构造函数、重载在VendingMachine的注释当中