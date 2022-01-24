def newgit(repo)
{
  git "${repo}"
}
def newmaven()
{
  sh 'mvn package'
}
def newdeploy(ip,appname)
{
  sh "scp /home/ubuntu/.jenkins/workspace/declarativepipeline1/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def runselinium(path)
{
  sh "java -jar $path/testing.jar"
}
