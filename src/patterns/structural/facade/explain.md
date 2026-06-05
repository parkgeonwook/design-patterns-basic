## 퍼사드를 이용하지 않을 때
### 여러 객체를 직접 사용해야 한다.

전등 켜기: `light.on()`

에어컨 켜기: `airConditioner.on()`

음악 재생: `musicPlayer.on()`

저녁 모드를 실행하려면

`light.on();`

`airConditioner.on();`

`musicPlayer.on();`

이렇게 하나씩 직접 호출해야 한다.

## 퍼사드를 이용할 때
### 여러 기능을 하나의 메서드로 묶어서 사용할 수 있다.

저녁 모드 실행:

`smartHomeFacade.startEveningMode();`

이 한 줄만 호출하면 내부에서 알아서 처리된다.

- `light.on()`
- `airConditioner.on()`
- `musicPlayer.on()`

즉, 내부 동작은 숨기고 바깥에서는 간단하게 사용할 수 있다.

함수 인터페이스 같이 내부 동작 방식 모르고 사용하는 것처럼. 퍼사드는 복잡한 여러 객체/기능을 묶어서 대신 다뤄주는 창구