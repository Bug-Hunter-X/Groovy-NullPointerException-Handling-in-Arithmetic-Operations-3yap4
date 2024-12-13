# Groovy NullPointerException Handling in Arithmetic Operations

This repository demonstrates a subtle bug in Groovy related to how null values are handled in arithmetic operations.  Groovy's dynamic typing allows null values to pass through without explicit type checking, leading to unexpected results or silent failures.

The `bug.groovy` file contains a function that attempts to add two numbers, but doesn't properly handle cases where one or both inputs are null.  This can lead to unexpected behavior, especially in larger applications where null values might propagate through many functions.

The `bugSolution.groovy` file provides a solution that addresses the issue using the Elvis operator(?:) for null checks, providing more robust error handling.

## How to reproduce

1. Clone the repository.
2. Run `groovy bug.groovy` to observe the unexpected behavior.
3. Run `groovy bugSolution.groovy` to see the corrected output.
