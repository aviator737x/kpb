fun main(args: Array<String>) {
    val pyMod = PyModule("/Users/user/Desktop/c-api/src/python.py")
    pyMod.initScript()
    //вызов функции вне класса
    pyMod.call("function", "Hello, World!")
    //создание объекта
    pyMod.makeObj("A", "", "a")
    //вызов фунции на объекте
    pyMod.callObjFunc("func", "Hello, World!","a")
}
