Write a class called `MyComplex` which models the complex numbers a + bi. 

It contains:
1. Two private double variables `real` and `img`.
2. A default constructor to create a complex number at 0 + 0i.
3. A constructor which takes two double a and b and initializes this complex number to a + bi.
4. Setters and Getters(accessors and mutators) for private variables `real` and `img`.
5. `toString()` that returns “(a + bi”) form of the complex number. If b is negative, we want the string to be "a -bi".
6. `isReal()` and `isImaginary()` that returns whether this complex number is real or imaginary, respectively. For example, 4 is real while 5i is imaginary but 4 + 5i is neither and 0 is both.
7. `void add(MyComplex c)`: Add complex number c to this complex number. Hint: (a+bi)+(c+di)=(a+c)+(b+d)i
8. `void multiply(MyComplex c)`: Multiply c to this complex number. Hint: (a+bi)*(c+di)=(ac-bd)+(ad+bc)i
9. `void conjugate()` changes this complex number into its conjugate. Hint: The conjugate of a + bi is a -bi.
10. `double magnitude()` returns the magnitude or length of this complex number. Hint: The magnitude of a+bi is Math.sqrt(a*a+b*b). For example, the magnitude of 3+4i is 5. 

MyComplex should also contain the following static methods:
1. `MyComplex addNew(MyComplex a, MyComplexb)` returns a complex number that is the sum of a and b.
2. `MyComplex multiplyNew(MyComplexa, MyComplexb)` returns the complex number that is the product a*b.