import {createApp} from 'vue'
import App from './App.vue'
import router from "./router";
// @ts-ignore
import VMdEditor from '/src/markdown/index.ts'

createApp(App)
    .use(router)
    .use(VMdEditor)
    .mount('#app')
