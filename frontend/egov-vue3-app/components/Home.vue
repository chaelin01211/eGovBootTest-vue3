<template>
  <div>
    <h1>Home (Test Component): {{ title }}</h1>
    <div>
      <h2>API Sample Test</h2>

      <input type="button" @click="getSample()" value="api call" />
      <div v-if="sampleData.pending == true">
        <p>loading...</p>
      </div>
      <div v-else-if="sampleData.pending == false">
        <input type="button" @click="sampleData?.refresh" value="refresh" />
        <p>{{ sampleData.data }}</p>
        <div>
          <p v-for="item in sampleData.data?.resultList">{{ item }}</p>
        </div>
      </div>
    </div>

    <div>
      <h2>Store Sample Test</h2>
      <input type="button" @click="increment()" value="increment" />
      <p>{{ count }}</p>
      <p>{{ doubleCount }}</p>
    </div>
  </div>
</template>

<script setup>
import { storeToRefs } from "pinia";

// props sample
const props = defineProps({
  title: {
    type: String,
    default: "default title"
  }
});

// api test sample
const sampleState = useSampleApi();
const { getSample } = sampleState;
const { sampleData } = storeToRefs(sampleState);
//--

// store sample
const counterState = useCounterStore();
const { increment } = counterState;
const { count, doubleCount } = storeToRefs(counterState);
//--

// life cycle hook
onBeforeMount(() => {
  // getSample();
});
//--
</script>
<style scoped></style>
