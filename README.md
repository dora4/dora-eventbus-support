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
    implementation 'com.github.dora4:dora-eventbus-support:1.1'
}
```

```kotlin
// 每个Activity添加以下代码
@Subscribe(threadMode = ThreadMode.MAIN)
fun onMessageEvent(msg: MessageEvent) {
}
```
