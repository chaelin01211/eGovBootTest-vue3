# eGovBootTest
전자정부프레임워크와 Vue3로 구성한 Sample Project

---
## Server
- 전자정부프레임워크 
  - 4.1.0 (최신버전)
  - Spring Boot
      - 버전: **2.7.0** 지원
- JAVA
    - 1.8

## Frontend
* Vue: 3.x
  * Vue 2 support will end on **Dec 31, 2023**.
  * Composition API
* 라이브러리
  * Nuxt 3.5.3
    * Auto Imports,  ```pages/``` 기반 routing 지원
    * ```
      |- assets       // 정적 리소스 파일 (이미지, CSS 등)
      |- components   // Vue 컴포넌트 파일
      |- composables  // Composition API 로직을 구성하는 파일 그룹화 -> Auto Import
      |- stores       // 상태 관리(store) 파일을 저장
      |- layouts      // 페이지 레이아웃 파일
      |- middleware   // 미들웨어 파일
      |- pages        // 라우팅되는 페이지 파일
      |- plugins      // Vue 플러그인 파일을 저장
      |- public       // 정적 파일 (Vue2의 /static 경로와 동일)
      |- utils        // 유틸리티 함수나 도우미 함수들을 저장 -> Auto Import
      ```
      > composables 경로와 utils 경로의 auto import 스캔 방식 동일. -> composables 경로 제거 고려.
    * ```/stores```경로는 ```nuxt.config.js```에서 설정 추가를 통해 auto import 기능 추가
  * Pinia
    * 상태 관리
    * Vue3 공식