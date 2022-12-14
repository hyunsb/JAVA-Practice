# 미션 - 숫자야구 기능목록

## 입력

```jsx
1. 서로 다른 3자리의 수 (숫자 0은 입력할 수 없음)
```
```jsx
2. 게임이 끝난 경우 재시작 / 종료를 구분하는 수 (1, 2)
```
---

## 기능
1. 컴퓨터는 1에서 9까지의 서로다른 임의의 수 3개를 선택하여 저장한다. (0 제외)
   - `camp.nextstep.edu.missionutils`에서 제공하는 `Randoms` 및 `Console` API를 사용하여 구현해야 한다. 
   - Random 값 추출은 `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInRange()`를 활용한다.

2. "숫자를 입력하세요" 문구를 출력한다.
3. 3자리 수를 입력받는다.
   - 사용자가 잘못된 값을 입력할 경우`IllegalArgumentException`을 발생시킨 후 애플리케이션을 종료한다.
   - 입력 값이 3자리가 아닌 경우
   - 입력 값의 범위가 1-9가 아닌 경우
   - 입력 값 중 중복된 숫자가 존재하는 경우
4. 입력 값에 따른 힌트를 비교하여 출력한다.
   - `스트라이크` : 같은 숫자가 같은 자리에 존재하는 경우
   - `볼` : 같은 숫자가 다른 자리에 존재하는 경우
   - `낫싱` : 같은 숫자가 존재하지 않는 경우
5. 모든 숫자를 맞추었을 때 게임을 종료한다.
6. 게임이 종료되었을 때 게임을 다시 진행할 지 종료할 지 입력받는다.
   - 1 : 게임 재시작
   - 2 : 게임 종료