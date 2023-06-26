<template>
  <div>router test page</div>
  <p>전역 상태 유지 - Pinia</p>
  <p>{{ count }}</p>
  <p>{{ doubleCount }}</p>
</template>

<script setup>
const counterState = useCounterStore();
const { count, doubleCount, increment } = counterState;
</script>

<style scoped></style>
