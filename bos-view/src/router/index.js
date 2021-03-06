import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Layout */
import Layout from '@/layout'

/* Router Modules */
import componentsRouter from './modules/components'
import chartsRouter from './modules/charts'
import tableRouter from './modules/table'
import nestedRouter from './modules/nested'

/**
 * Note: sub-menu only appear when route children.length >= 1
 * Detail see: https://panjiachen.github.io/vue-element-admin-site/guide/essentials/router-and-nav.html
 *
 * hidden: true                   if set true, item will not show in the sidebar(default is false)
 * alwaysShow: true               if set true, will always show the root menu
 *                                if not set alwaysShow, when item has more than one children route,
 *                                it will becomes nested mode, otherwise not show the root menu
 * redirect: noRedirect           if set noRedirect will no redirect in the breadcrumb
 * name:'router-name'             the name is used by <keep-alive> (must set!!!)
 * meta : {
    roles: ['admin','editor']    control the page roles (you can set multiple roles)
    title: 'title'               the name show in sidebar and breadcrumb (recommend set)
    icon: 'svg-name'             the icon show in the sidebar
    noCache: true                if set true, the page will no be cached(default is false)
    affix: true                  if set true, the tag will affix in the tags-view
    breadcrumb: false            if set false, the item will hidden in breadcrumb(default is true)
    activeMenu: '/example/list'  if set path, the sidebar will highlight the path you set
  }
 */

/**
 * constantRoutes
 * a base page that does not have permission requirements
 * all roles can be accessed
 */
export const constantRoutes = [
  {
    path: '/redirect',
    component: Layout,
    hidden: true,
    children: [
      {
        path: '/redirect/:path(.*)',
        component: () => import('@/views/redirect/index')
      }
    ]
  },
  {
    path: '/login',
    component: () => import('@/views/login/index'),
    hidden: true
  },
  {
    path: '/auth-redirect',
    component: () => import('@/views/login/auth-redirect'),
    hidden: true
  },
  {
    path: '/404',
    component: () => import('@/views/error-page/404'),
    hidden: true
  },
  {
    path: '/401',
    component: () => import('@/views/error-page/401'),
    hidden: true
  },
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    children: [
      {
        path: 'dashboard',
        component: () => import('@/views/dashboard/index'),
        name: 'Dashboard',
        meta: { title: '主页', icon: 'dashboard', affix: true }
      }
    ]
  }
  /* {
    path: '/sysuser',
    component: Layout,
    children: [
      {
        path: 'user',
        component: () => import('@/views/sys/user'),
        name: 'userTable',
        meta: { title: '用户表', icon: 'dashboard', affix: true }
      }
    ]
  },
  {
    path: '/documentation',
    component: Layout,
    children: [
      {
        path: 'index',
        component: () => import('@/views/documentation/index'),
        name: 'Documentation',
        meta: { title: 'documentation', icon: 'documentation', affix: true }
      }
    ]
  },
  {
    path: '/guide',
    component: Layout,
    redirect: '/guide/index',
    children: [
      {
        path: 'index',
        component: () => import('@/views/guide/index'),
        name: 'Guide',
        meta: { title: 'guide', icon: 'guide', noCache: true }
      }
    ]
  },
  {
    path: '/profile',
    component: Layout,
    redirect: '/profile/index',
    hidden: true,
    children: [
      {
        path: 'index',
        component: () => import('@/views/profile/index'),
        name: 'Profile',
        meta: { title: 'profile', icon: 'user', noCache: true }
      }
    ]
  }*/
]

/**
 * asyncRoutes
 * 需要根据用户角色动态加载的路由
 */
export const asyncRoutes = [
  {
    path: '/permission',
    component: Layout,
    redirect: '/permission/page',
    alwaysShow: true, // 总是显示根菜单
    name: '系统管理',
    meta: {
      title: '系统管理',
      icon: 'chart',
      roles: ['admin', 'editor'] // 您可以在根导航中设置角色
    },
    children: [
      {
        path: 'user',
        component: () => import('@/views/sys/user'),
        name: 'userTable',
        meta: {
          title: '员工管理',
          roles: ['admin'] // 或者只能在sub - nav中设置角色
        }
      },
      {
        path: 'mechanism',
        component: () => import('@/views/sys/mechanism'),
        name: 'Mechanism',
        meta: {
          title: '部门管理'
          // 如果不设置角色，则表示:此页面不需要权限
        }
      },
      {
        path: 'Post',
        component: () => import('@/views/sys/Post'),
        name: 'Post',
        meta: {
          title: '岗位管理',
          roles: ['admin']
        }
      },
      {
        path: 'postPermission',
        component: () => import('@/views/sys/postPermission'),
        name: 'postPermission',
        meta: {
          title: '权限管理',
          roles: ['admin']
        }
      },
      {
        path: 'Log',
        component: () => import('@/views/sys/Log'),
        name: 'Log',
        meta: {
          title: '日志管理',
          roles: ['admin']
        }
      }
    ]
  },

  {
    path: '/icon',
    component: Layout,
    children: [
      {
        path: 'educationPolitics',
        component: () => import('@/views/sys/educationPolitics'),
        name: 'educationPolitics',
        meta: { title: '廉政教育', icon: 'people', noCache: true }
      }
    ]
  },

  /** when your routing map is too long, you can split it into small modules **/
  // componentsRouter,
  // chartsRouter,
  // nestedRouter,
  // tableRouter,

  {
    path: '/example',
    component: Layout,
    redirect: '/example/list',
    name: 'Example',
    meta: {
      title: '责任纪实',
      icon: 'example',
      roles: ['admin', 'editor']
    },
    children: [
      {
        path: 'RdWorkPlan',
        component: () => import('@/views/sys/RdWorkPlan'),
        name: '工作计划',
        meta: { title: '工作计划', roles: ['admin'] }
      },
      {
        path: 'RdWorkDeployment',
        component: () => import('@/views/sys/RdWorkDeployment'),
        name: '工作部署',
        meta: { title: '工作部署', roles: ['admin'] }
      },
      {
        path: 'RdHonestConversation',
        component: () => import('@/views/sys/RdHonestConversation'),
        name: '廉政谈话',
        meta: { title: '廉政谈话', roles: ['admin'] }
      },
      {
        path: 'RdEntityResponsibility',
        component: () => import('@/views/sys/RdEntityResponsibility'),
        name: '主体责任',
        meta: { title: '主体责任', roles: ['admin'] }
      }
    ]
  },

  {
    path: '/error',
    component: Layout,
    redirect: 'noRedirect',
    name: '廉政文化',
    meta: {
      title: '廉政文化',
      icon: '404'
    },
    children: [
      // {
      //   path: '401',
      //   component: () => import('@/views/error-page/401'),
      //   name: 'Page401',
      //   meta: { title: 'page401', noCache: true }
      // },
      // {
      //   path: '404',
      //   component: () => import('@/views/error-page/404'),
      //   name: 'Page404',
      //   meta: { title: 'page404', noCache: true }
      // },
      {
        path: 'RdHonestConversation',
        component: () => import('@/views/sys/RdHonestConversation'),
        name: '资料集锦',
        meta: { title: '资料集锦', roles: ['admin'] }
      },
      {
        path: 'Riskpointwarning',
        component: () => import('@/views/sys/Riskpointwarning'),
        name: '清风文苑',
        meta: { title: '清风文苑', roles: ['admin'] }
      }
    ]
  },
  /* {
    path: '/tab',
    component: Layout,
    children: [
      {
        path: 'index',
        component: () => import('@/views/tab/index'),
        name: 'Tab',
        meta: { title: 'tab', icon: 'tab' }
      }
    ]
  },
*/

  /* {
    path: '/error-log',
    component: Layout,
    children: [
      {
        path: 'log',
        component: () => import('@/views/error-log/index'),
        name: 'ErrorLog',
        meta: { title: 'errorLog', icon: 'bug' }
      }
    ]
  },

  {
    path: '/excel',
    component: Layout,
    redirect: '/excel/export-excel',
    name: 'Excel',
    meta: {
      title: 'excel',
      icon: 'excel'
    },
    children: [
      {
        path: 'export-excel',
        component: () => import('@/views/excel/export-excel'),
        name: 'ExportExcel',
        meta: { title: 'exportExcel' }
      },
      {
        path: 'export-selected-excel',
        component: () => import('@/views/excel/select-excel'),
        name: 'SelectExcel',
        meta: { title: 'selectExcel' }
      },
      {
        path: 'export-merge-header',
        component: () => import('@/views/excel/merge-header'),
        name: 'MergeHeader',
        meta: { title: 'mergeHeader' }
      },
      {
        path: 'upload-excel',
        component: () => import('@/views/excel/upload-excel'),
        name: 'UploadExcel',
        meta: { title: 'uploadExcel' }
      }
    ]
  },

  {
    path: '/zip',
    component: Layout,
    redirect: '/zip/download',
    alwaysShow: true,
    name: 'Zip',
    meta: { title: 'zip', icon: 'zip' },
    children: [
      {
        path: 'download',
        component: () => import('@/views/zip/index'),
        name: 'ExportZip',
        meta: { title: 'exportZip' }
      }
    ]
  },

  {
    path: '/pdf',
    component: Layout,
    redirect: '/pdf/index',
    children: [
      {
        path: 'index',
        component: () => import('@/views/pdf/index'),
        name: 'PDF',
        meta: { title: 'pdf', icon: 'pdf' }
      }
    ]
  },
  {
    path: '/pdf/download',
    component: () => import('@/views/pdf/download'),
    hidden: true
  },

  {
    path: '/theme',
    component: Layout,
    children: [
      {
        path: 'index',
        component: () => import('@/views/theme/index'),
        name: 'Theme',
        meta: { title: 'theme', icon: 'theme' }
      }
    ]
  },

  {
    path: '/clipboard',
    component: Layout,
    children: [
      {
        path: 'index',
        component: () => import('@/views/clipboard/index'),
        name: 'ClipboardDemo',
        meta: { title: 'clipboardDemo', icon: 'clipboard' }
      }
    ]
  },

  {
    path: '/i18n',
    component: Layout,
    children: [
      {
        path: 'index',
        component: () => import('@/views/i18n-demo/index'),
        name: 'I18n',
        meta: { title: 'i18n', icon: 'international' }
      }
    ]
  },

  {
    path: 'external-link',
    component: Layout,
    children: [
      {
        path: 'https://github.com/PanJiaChen/vue-element-admin',
        meta: { title: 'externalLink', icon: 'link' }
      }
    ]
  },*/

  // 404页面必须放置在末尾 !!!
  { path: '*', redirect: '/404', hidden: true }
]

const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter() {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default router
