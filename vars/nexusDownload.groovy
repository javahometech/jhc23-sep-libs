

def call(version,outputFile,repoName,groupId,artifactId, extension){
  def NEXUS_URUL = "http://172.31.42.1:8081"
  groupId = groupId.replaceAll(".","/")
  sh """
    curl -u admin:admin -o ${outputFile} -X GET "${NEXUS_URUL}/repository/${repoName}/${groupId}/${artifactId}/${version}/doctor-online-${version}.${extension}"
  """
}

//  curl -u admin:admin -o ${outputfile} -X GET "${NEXUS_URUL}/repository/doctor-online-release/in/javahome/doctor-online/${version}/doctor-online-${version}.war"
