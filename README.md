# Pokemon_RealGo
### AR 기반의 실시간 포켓몬 대전 게임
안드로이드 / 앱 / 게임
 
## Period
2022.1.5 ~ 2022.1.11 (몰입캠프 2주차)

## Contributors
#### 김수민 [fosemfhtm](https://github.com/fosemfhtm)
#### 박수빈 [psb0623](https://github.com/psb0623)
#### 정강산 [Sanu7D0](https://github.com/Sanu7D0)
 
## App
Made by kotlin

### Login

- 회원가입 : 회원가입 버튼을 통해 포켓몬 리얼고 계정을 생성할 수 있다.
- 로그인 : 만든 본인의 계정으로 포켓몬 리얼고 게임에 접속하여 게임을 즐길 수 있다.
- 자동로그인 : 한번 로그인하면 정보가 로컬에 자동 저장되어, 로그아웃을 따로 하지 않은 경우에는 다음 접속시 로그인을 거치지 않고 바로 게임을 즐길 수 있다.

### Main

- 트레이너 정보 : DB 서버에 저장된 본인 계정의 이름, 게임머니, 전적, 보유 포켓몬의 숫자를 확인할 수 있다.
- 지닌 포켓몬 : 현재 지니고 있는 4마리의 포켓몬을 확인할 수 있다. 지닌 포켓몬으로 배틀에 참가하게 된다.
- 홈 : 버튼을 통해 지닌 포켓몬을 관리할 수 있는 Home 화면으로 이동할 수 있다.
- 상점 : 뽑기를 통해 새로운 포켓몬을 얻을 수 있는 Shop 화면으로 이동할 수 있다.
- 배틀 : 다른 사람과 대전할 수 있는 Battle 화면으로 이동할 수 있다.

### Home

- 포켓박스 : 자신이 지닌 모든 포켓몬을 확인할 수 있다.
- 포켓몬 상세 정보 : 포켓박스의 포켓몬을 꾹 누르면 포켓몬의 스탯과 같은 상세정보를 확인할 수 있고, 포켓몬을 놓아줄 수도 있다.
- 지닌 포켓몬 : 지닌 포켓몬과 포켓몬의 기술을 확인할 수 있고 지닌 포켓몬을 변경할 수 있다.

### Shop

- 일반 뽑기 : 포켓몬을 뽑을 수 있다.
- 고급 뽑기 : 좋은 포켓몬을 뽑을 수 있다.
- 슈퍼 프리미엄 뽑기 : 아주 좋은 포켓몬을 뽑을 수 있다.

### Battle

- BattleRoom 입장 : 메인에서 배틀 버튼을 누르면 방 번호를 입력할 수 있는 창이 뜬다. 상대방과 같은 방 번호를 입력하면 대전을 시작할 수 있다.
- 포켓몬 실시간 대전 : AR 포켓몬이 화면에 나타나고 포켓몬 대전을 실시간으로 할 수 있게 된다.

## Database server

## Real-time battle server

## Reference / Libraries
- Minimum SDK level 24.
- Kotlin based, Coroutines + Flow for asynchronous.
- ARCore - ARCore SDK for Android.
- SceneForm - Sceneform SDK for Android.
- AR models & Renderer - [Pokedex-AR](https://github.com/skydoves/Pokedex-AR)

## Comments
- 김수민 :  
- 박수빈 : 
- 정강산 :  

## Todo...?
- 상대방과 AR 화면 공유
- 더 많은 포켓몬과 기술 추가
- 체력 게이지 색상 변화
- 카카오 로그인 기능
- 지도 기반 주변 트레이너 탐색 기능
