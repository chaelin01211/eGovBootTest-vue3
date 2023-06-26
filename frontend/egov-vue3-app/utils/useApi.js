// wrap useFetch with configuration needed to talk to our API
export const useApi = (path, options = {}) => {
  const config = useRuntimeConfig();

  // modify options as needed
  options.baseURL = config.public.baseURL;
  console.log("gogo");
  return useFetch(path, options);
};
