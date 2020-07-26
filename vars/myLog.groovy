def log_info(String message) {
  echo "INFO: ${message}"
}

def log_warning(String message) {
  echo "WARNING: ${message}"
}

def log_error(String message) {
  echo "ERROR: ${message}"
}

def call(Closure body) {
  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()
  echo "${config.type}"
  echo "Hello from myLog"
//
//  switch (config.type) {
//      case 'info':
//      log_info config.message
//      break
//      case 'warning':
//      log_warning config.message
//      break
//      case 'error':
//      log_error config.message
//      break
//      default:
//        error 'Unhandled type.'
//  }
}
