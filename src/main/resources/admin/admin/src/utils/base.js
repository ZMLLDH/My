const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootuom342it/",
            name: "springbootuom342it",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "基于Vue的不动产登记系统"
        } 
    }
}
export default base
