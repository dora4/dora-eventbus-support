dora-eventbus-support
![Release](https://jitpack.io/v/dora4/dora-eventbus-support.svg)
--------------------------------

#### gradle依赖配置

```groovy
// 添加以下代码到项目根目录下的build.gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
// 添加以下代码到app模块的build.gradle
dependencies {
    def latest_version = '1.0'
    api 'com.github.dora4:dora-eventbus-support:$latest_version'
}
```
