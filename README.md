mes
===

Maven Multiple Modules + Hessian + Spring (to build an mes demo project)

预想的架构模式是 MES父包, 内部包含:(wdxxl-parent/wdxxl-pp/wdxxl-qm/wdxxl-web/wdxxl-webReport/wdxxl-zUnitTest)
wdxxl-parent: Maven 分模块父包
wdxxl-pp: 业务功能包
wdxxl-qm: 业务功能包
......
wdxxl-web: Hessian服务的web包
wdxxl-webReport: fineReport关联用包 用于报表页面发送服务
wdxxl-zUnitTest: Hessian RPC的UnitTest类 集合包

TODO...
