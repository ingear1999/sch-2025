## 1일차 정리
##1.cmder 다운오드 및 설정
- cmder 사이트 다운로드 진행
- 압축해재 : c:.dev 설치

##2. Git& GitHub 설치 및 연동
 - Git 다운로드 및 설치
- 환경변수 추가 확인
-GitHub 레패지토리 생성 : sch-2025
-토근 발행

##3. Git 명령어 
 - 사용자 확인 및 설정: git config --global user.name " 사용자명"
- 이메일 확인 및 설정(잔디): git config --global user.email "GitHub 로그인 이메일주소"
-GitHub Repository CLone(복제) : git clone https://토근번호@GitHub.com/github계정/레파지명.git
- stage > add : git add"파일명 혹은 전체(.)"
-Local Repository > add : git commit -m "커밋메시지"//작업날짜 및 시간, 작업명,작업자 이메일.
-GitHub Remote Repository push : git push origin main

##4. JDK 다운로드 및 설치
-jdk 17 이상 설치: community 버전 설치
-기본 풀더에 설치 > java-version

## 5. intellJ 다운로드 및 설치
- 30일 무료 버전 : community 번전 설치 
-community 버건은 springboot initializer 모듈이 없음 > start.spring.io 사이트에서 dpingboot 푸로제트 생성

##6. 스프링부트 프로제트 생성 및 실행
-start.spring.io 사이트에서 spingboot 프젝트 생성
-intellJ > open > 프로젝트 import
실행: 프로젝트> src >  main > java > SpringbootAppliaction 클라스의 main 매소드 실행: 녹색 버튼

##7. 스프링 구조: mvc 패턴
<img src="image/mvc.png" width="600">

