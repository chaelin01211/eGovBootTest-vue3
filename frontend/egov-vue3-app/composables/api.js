export const useSampleApi = () => {
  async function getSample() {
    const { data, pending, refresh } = await useApi("/api/sample.do");
    return { data, pending, refresh };
  }

  return { getSample };
};
