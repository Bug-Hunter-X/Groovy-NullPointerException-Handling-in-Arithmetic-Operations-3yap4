```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0
  }
  return a + b
}

println myMethod(null, 5) // Outputs 0
println myMethod(5, null) // Outputs 0
println myMethod(null, null) // Outputs 0
println myMethod(5, 5) // Outputs 10
```