(defproject clojure-grpc-fizzbuzz "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.match "0.3.0-alpha5"]
                 [org.clojure/core.specs.alpha "0.1.24"]
                 [io.grpc/grpc-all "1.9.0"]]
  :plugins [[lein-protoc "0.4.1"]]
  :main ^:skip-aot clojure-grpc-fizzbuzz.core
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[org.clojure/test.check "0.10.0-alpha2"]]}}
  :proto-target-path "src/java"
  :protoc-grpc true)
