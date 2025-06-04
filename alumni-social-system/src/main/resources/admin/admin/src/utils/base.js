const base = {
    get() {
        return {
            url : "http://localhost:8080/social/",
            name: "social",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/social/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校友社交系统"
        } 
    }
}
export default base
