(ns helloClojureWorld.core
  (:use [compojure.core                 :only [defroutes GET POST]]
	[ring.middleware.params         :only [wrap-params]]
        [ring.middleware.keyword-params :only [wrap-keyword-params]])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]))

(defroutes routes
  (GET "/" [] "<h1>Hello World Wide Web!</h1>")
  (POST "/" req (println "request body:" (slurp (:body req))))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app (-> #'routes wrap-keyword-params wrap-params))