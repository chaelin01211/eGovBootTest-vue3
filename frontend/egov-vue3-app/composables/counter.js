import { defineStore } from "pinia";

export const useCounterStore = defineStore("counter", () => {
  // state
  const count = ref(0);

  // action
  function increment() {
    console.log("test");
    count.value++;
  }

  // getter
  const doubleCount = computed(() => count.value * 2);

  // mutation 없이 state 변경 가능
  // - readonly를 통해 제한 가능
  return { count: readonly(count), increment, doubleCount };
});
