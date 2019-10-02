pipeline{
    agent any
    tools {
        
        maven 'mymaven' 
    }
    stages{
      stage ('build and test'){
            steps{
                
                    sh "mvn clean install -DskipTests"
                
            }
        }   
        
            stage ('Deploying War File')
			  {
             steps{
                  withCredentials([usernamePassword(credentialsId: 'bizeet_tomcat', passwordVariable: 'pass', usernameVariable: 'userId')]) 
				  {
        
                      
                     //sh 'curl -u  $userId:$pass http://ec2-13-235-49-121.ap-south-1.compute.amazonaws.com:8080/manager/text/undeploy?path=/Basic_Archaius'
                     sh  'curl -u  $userId:$pass --upload-file target/basic-config-1.0.0-SNAPSHOT.war http://ec2-13-235-49-121.ap-south-1.compute.amazonaws.com:8080/manager/text/deploy?config=file:/var/lib/tomcat8/basic-config-1.0.0-SNAPSHOT.war\\&path=/Basic_Archaius'
                 }
             }
    
         }
        }
       }
