

def call(version){
  def NEXUS_URUL = "http://172.31.42.1:8081"
  sh """
       curl -u admin:admin -o doctor-online.war -X GET "${NEXUS_URUL}/repository/doctor-online-release/in/javahome/doctor-online/${version}/doctor-online-${version}.war"
  """
}
