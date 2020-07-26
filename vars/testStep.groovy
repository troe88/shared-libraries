String postfix = "postfix"

def success(String message) {
  echo "SUCCESS: ${message} with ${postfix}"
}

def failure(String message) {
  echo "FAILURE: ${message} with ${postfix}"
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
