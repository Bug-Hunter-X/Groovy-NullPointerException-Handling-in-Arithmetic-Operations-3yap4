```groovy
def myMethod(a, b) {
  return (a ?: 0) + (b ?: 0)
}

println myMethod(null, 5) // Outputs 5
println myMethod(5, null) // Outputs 5
println myMethod(null, null) // Outputs 0
println myMethod(5, 5) // Outputs 10
```