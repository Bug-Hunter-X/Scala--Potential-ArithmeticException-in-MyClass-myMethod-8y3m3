```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (x == 0 || x == y) {
      0 // Handle division by zero or x==0
    } else {
      x / (x - y)
    }
  }
}
```