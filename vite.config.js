import { defineConfig } from "vite";

const IS_PROD = process.env.NODE_ENV === "production";

export default defineConfig({
  plugins: [],
  base: IS_PROD ? "/lamini/" : "/",
});
