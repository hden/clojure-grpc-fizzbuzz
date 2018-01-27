(ns clojure-grpc-fizzbuzz.core
  (:gen-class)
  (:require [clojure-grpc-fizzbuzz.service :as service])
  (:import [io.grpc Server ServerBuilder]))

(defn -main [& args]
  (-> (read-string (or (System/getenv "PORT") "35000"))
      (ServerBuilder/forPort)
      (.addService (service/create-service))
      (.build)
      (.start)
      (.awaitTermination)))
