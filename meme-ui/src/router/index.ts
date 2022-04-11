import {createRouter, createWebHistory} from "vue-router";
import NProgress from "nprogress";
import 'nprogress/nprogress.css'

const routes = [
    {
        name: 'home',
        path: '/',
        component: () => import("/src/view/home.vue")
    }, {
        name: 'meme',
            path: '/meme',
        component: () => import("/src/view/meme.vue")
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes: routes
})
router.beforeEach(() => {
    NProgress.start()
})
router.afterEach(() => {
    NProgress.done()
})
export default router
