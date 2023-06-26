import { defineStore } from "pinia";

export const useSampleApi = defineStore("api", () => {
  const sampleData = ref({});

  async function getSample() {
    sampleData.value.pending = false;
    const { data, pending, refresh } = await useApi("/api/sample.do");
    sampleData.value = { data, pending, refresh };
    console.log(data);
  }

  return { sampleData, getSample };
});
