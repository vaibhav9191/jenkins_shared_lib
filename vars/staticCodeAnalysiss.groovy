def call(){
    sh 'mvn cleam package sonar:sonar'
}