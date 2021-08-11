# Java Testing Fundamentals
Features the test theory and examples

### Components of a test
1. "Given". Preconditions - what state should the system be in when the behaviour in question happens?
2. "When". The behaviour - what is being tested? There should be only one behaviour/functionality tested for a unit test.
3. "Then". Postconditions - what changes happened to the state after the behaviour when it ran successfuly?

### Failure vs error in the test suite
| Failure | Error |
|-------- | ----- |
|Tried to check behaviour and test is complete | At any point in the test |
|An assertion failed | A non-assert exception was thrown |
|The production code is probably broken | The test is probably broken |

