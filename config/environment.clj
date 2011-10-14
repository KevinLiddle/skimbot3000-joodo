(use 'joodo.env)

(def environment {
  :joodo.core.namespace "skimbot3000.core"
  ; environment settings go here
  })

(swap! *env* merge environment)