const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmrtcd3/",
            name: "ssmrtcd3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmrtcd3/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "网上购物系统"
        } 
    }
}
export default base
