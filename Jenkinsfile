pipeline{

agent any

tools{
maven 'Maven'
}
stages{
stage('Checkout'){
 git branch: 'master',url : 'https://shar4440/MyGuavaApp7.git'
}
stage('Build'){sh 'maven clean package'}
stage('Test') {sh 'mvn test'}
stage('Run-application'){sh 'mvn exec:java -Dexec.mainClass="com.example.App"'}
}

post{
success{
echo "build and deplomeny succeed"}
failure{ echo "build get reported badly"}
}
}
