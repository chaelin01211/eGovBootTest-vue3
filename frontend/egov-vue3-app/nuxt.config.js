// https://nuxt.com/docs/api/configuration/nuxt-config

export default {
  devtools: { enabled: true },
  target: "server",
  runtimeConfig: {
    public: {
      baseURL: process.env.BASE_URL || "http://localhost:8080/"
    }
  },
  modules: [
    [
      "@pinia/nuxt",
      {
        autoImports: ["defineStore", "acceptHMRUpdate"]
      }
    ]
  ],
  imports: {
    dirs: ["stores"] // auto-import directory 추가
  }
};
