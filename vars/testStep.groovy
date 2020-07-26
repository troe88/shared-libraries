def success(String message) {
  echo "INFO: ${message}"
}

def failure(String message) {
  echo "WARNING: ${message}"
}

def call(Map config) {     
     switch (config.type) {
          case 'success':
               success config.message
               break
          case 'failure':
               failure config.message
               break
          default:
               echo 'Unhandled type - ${config.type}.'
     }
}
