import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import biangengdengji from '@/views/modules/biangengdengji/list'
    import gongzuorenyuan from '@/views/modules/gongzuorenyuan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import budongchandengji from '@/views/modules/budongchandengji/list'
    import zuyongjilu from '@/views/modules/zuyongjilu/list'
    import budongchanleixing from '@/views/modules/budongchanleixing/list'
    import guihaijilu from '@/views/modules/guihaijilu/list'
    import budongchanzulin from '@/views/modules/budongchanzulin/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告资讯',
        component: news
      }
      ,{
	path: '/biangengdengji',
        name: '变更登记',
        component: biangengdengji
      }
      ,{
	path: '/gongzuorenyuan',
        name: '工作人员',
        component: gongzuorenyuan
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/budongchandengji',
        name: '不动产登记',
        component: budongchandengji
      }
      ,{
	path: '/zuyongjilu',
        name: '租用记录',
        component: zuyongjilu
      }
      ,{
	path: '/budongchanleixing',
        name: '不动产类型',
        component: budongchanleixing
      }
      ,{
	path: '/guihaijilu',
        name: '归还记录',
        component: guihaijilu
      }
      ,{
	path: '/budongchanzulin',
        name: '不动产租赁',
        component: budongchanzulin
      }
      ,{
	path: '/newstype',
        name: '公告资讯分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
