1.定义执行器的名称,可以是项目名称,唯一     xxl.job.executor.appname=xxl-job-study
2.客户端作为执行器,注册到控制台admin中   xxl.job.admin.addresses=http://127.0.0.1:8081/xxl-job-admin
3.添加任务，在指定的类上添加@JobHandler(value="simpleJobHandler")   并继承IJobHandler接口
3.在admin后台配置执行器名称xxl-job-study 和任务名称simpleJobHandler
