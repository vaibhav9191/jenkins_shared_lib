def call(){
    sh 'mvn clean package sonar:sonar'
     //sh 'mvn clean package sonar:sonar'
    
}