(ns clojure-grpc-fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [clojure.spec.test.alpha :as spec-test]
            [clojure-grpc-fizzbuzz.service :as service]
            [clojure-grpc-fizzbuzz.client :as client])
  (:import [io.grpc Server ServerBuilder]))

(deftest unit-test
  (testing "serivce/fizzbuzz"
    (are [x y] (= x y)
         "1"        (service/fizzbuzz 1)
         "2"        (service/fizzbuzz 2)
         "Fizz"     (service/fizzbuzz 3)
         "4"        (service/fizzbuzz 4)
         "Buzz"     (service/fizzbuzz 5)
         "Fizz"     (service/fizzbuzz 6)
         "14"       (service/fizzbuzz 14)
         "FizzBuzz" (service/fizzbuzz 15)
         "16"       (service/fizzbuzz 16))))

(deftest generative-test
  (spec-test/instrument `service/fizzbuzz)
  (testing "serivce/fizzbuzz"
    (let [results (spec-test/check `service/fizzbuzz)
          report (spec-test/summarize-results results)]
      (is (= (:total report) (get report :check-passed 0))))))

(deftest integration-test
  (let [port (read-string (or (System/getenv "PORT") "35000"))
        server (-> (ServerBuilder/forPort port)
                   (.addService (service/create-service))
                   (.build)
                   (.start))
        conn (client/create-conn "localhost" port)]
    (testing "client -> server RPC"
      (are [x y] (= x y)
           "1"        (client/fizzbuzz conn 1)
           "Fizz"     (client/fizzbuzz conn 3)
           "Buzz"     (client/fizzbuzz conn 5)
           "FizzBuzz" (client/fizzbuzz conn 15)))))
