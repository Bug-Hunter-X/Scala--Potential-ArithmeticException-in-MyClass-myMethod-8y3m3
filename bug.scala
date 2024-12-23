```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (x == 0) 0  //this condition leads to error 
    else x / (x - y)
  }
}
```