## 상속 이용할 때
### 기능 조합이 생길 때마다 새로운 클래스를 만들어야 한다.
SimpleDisplay: `hello`

괄호 Display: `(hello)`

별표 Display: `*hello*`

괄호 + 별표 Display: `(*hello*)`

별표 + 괄호 Display: `*(hello)*`

## 데코레이터 이용할 때
### 기본 객체를 만들고 필요한 기능을 감싸서 조합할 수 있다.
SimpleDisplay: `hello`

괄호 Display: `(hello)`

별표 Display: `*hello*`

이후 조합 가능

괄호 + 별표를 하고 싶으면 new 괄호(별표(simple)); -> `(*hello*)`

별표 + 괄호를 하고 싶으면 new 별표(괄호(simple)); -> `*(hello)*`