(defproject helloClojureWorld "1.0.0-SNAPSHOT"
  :description "A Compojure 'Hello World' application"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.0"]]
  :plugins [[lein-ring "0.7.0"]]
  :ring {:handler helloClojureWorld.core/app}
)
