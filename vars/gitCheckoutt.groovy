def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }

// def call(){

//      git branch: 'main', url: 'https://github.com/vaibhav9191/mrdevops_java_app.git'
// }