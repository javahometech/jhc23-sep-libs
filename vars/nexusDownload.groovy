def NEXUS_URUL = "http://13.232.5.119:8081"

def call(version){
  sh """
       curl -u admin:admin -o doctor-online.war -X GET "${NEXUS_URUL}/repository/doctor-online-release/in/javahome/doctor-online/${version}/doctor-online-${version}.war"
  """
}
