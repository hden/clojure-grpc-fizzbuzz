(ns clojure-grpc-fizzbuzz.client
  (:import [io.grpc ManagedChannelBuilder]
           [clojure_grpc_fizzbuzz.grpc FizzBuzzGrpc
                                       MessageTypes$Request
                                       MessageTypes$Response]))

(defn create-conn [^String host port]
  (-> (ManagedChannelBuilder/forAddress host port)
      (.usePlaintext true)
      .build
      (FizzBuzzGrpc/newBlockingStub)))

(defn fizzbuzz ^String [conn n]
  (let [request (-> (MessageTypes$Request/newBuilder)
                    (.setN n)
                    .build)]
    (-> (.fizzBuzz conn request)
        (.getMessage))))
