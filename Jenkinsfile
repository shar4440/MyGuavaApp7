pipeline{

agent any

tools{
maven 'Maven'
}
stages{
stage('Checkout'){
 steps{ git branch: 'master',url : 'https://shar4440/MyGuavaApp7.git'}

}
stage('Build'){
 steps{sh 'maven clean package'}
}
stage('Test') {steps{sh 'mvn test'}}
stage('Run-Application'){steps{sh 'mvn exec:java -Dexec.mainClass="com.example.App"'}}
}

post{
success{
echo "build and deplomeny succeed"}
failure{ echo "build get reported badly"}
}
}
