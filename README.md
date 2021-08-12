# Java Testing Fundamentals
Features the test theory and examples

### Components of a test
1. "Given". Preconditions - what state should the system be in when the behaviour in question happens?
2. "When". The behaviour - what is being tested? There should be only one behaviour/functionality tested for a unit test.
3. "Then". Postconditions - what changes happened to the state after the behaviour when it ran successfuly?
In unit testing the behaviour matters, not the implementation. Should not depend on any other any other functionality. Also, should avoid the code duplication as testing needs to follow DRY principle too. Try to use the variable constants, so if requirements change it would be easier to refactor the tests. 

### Failure vs error in the test suite
| Failure | Error |
| :--------: | :-----: |
|Tried to check behaviour and test is complete | At any point in the test |
|An assertion failed | A non-assert exception was thrown |
|The production code is probably broken | The test is probably broken |

### Annotations
+ @BeforeEach - runs before each test, use only instance state
+ @AfterEach - runs after each test, use only instance state
+ @AfterAll - runs after all and also should use static fields.
+ @BeforeAll - runs at the begining and should use static fields

### Hamcrest Matcher
Matcher is a simple and general blob of logic used in assertions. Hamcrest matchers simplifies a test code and writes more useful asserts for more complicated assertions. In particular useful for Map checking. Matcher is compositional and combines with other matchers.

