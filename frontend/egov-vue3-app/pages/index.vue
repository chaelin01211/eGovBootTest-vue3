<template>
  <Home :title="'Home Title'" />
  <button @click="navigateToPage">페이지로 이동</button>
  <!--  아래와 동일하게 작동 -->
  <!--  <button @click="router.push('/sub')">페이지로 이동</button>-->
</template>

<script setup>
const router = useRouter();

const navigateToPage = () => {
  // 페이지 이동 로직 작성
  router.push("/sub"); // 이동할 페이지 경로를 지정합니다.
};
</script>

<style scoped></style>
