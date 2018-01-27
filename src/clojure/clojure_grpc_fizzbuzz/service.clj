(ns clojure-grpc-fizzbuzz.service
  (:require [clojure.core.match :refer [match]]
            [clojure.spec.alpha :as spec])
  (:import [clojure_grpc_fizzbuzz.grpc FizzBuzzGrpc$FizzBuzzImplBase
                                       MessageTypes$Request
                                       MessageTypes$Response]))

(defn fizzbuzz ^String [n]
  (match [(mod n 3) (mod n 5)]
    [0 0] "FizzBuzz"
    [0 _] "Fizz"
    [_ 0] "Buzz"
    :else (str n)))

(spec/fdef fizzbuzz
  :args (spec/cat :n (spec/and integer? pos?))
  :ret string?
  :fn #(not (= "" (:ret %))))

(defn create-service []
  (proxy [FizzBuzzGrpc$FizzBuzzImplBase] []
    (fizzBuzz [^MessageTypes$Request request response-observer]
      (let [n (.getN request)
            builder (-> (MessageTypes$Response/newBuilder)
                        (.setMessage (fizzbuzz n)))]
        (.onNext response-observer (.build builder))
        (.onCompleted response-observer)))))
