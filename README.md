# ReactNative For GrowingIO

fork自主仓库，用于为ReactNative适配GrowingIO的无埋点采集. 为了方便集成RNTester

#### 运行环境
- Android Studio and NDK r10e(必须是r10e这个版本)


#### RNTester使用
- 使用Android Studio打开此项目, 自动导入
- 更改local.properties中的NDK地址为r10e的本地目录
- 编译运行app,
- adb reverse tcp:8081 tcp:8081
- cd 到项目根目录， 执行./scripts/package.sh即可
