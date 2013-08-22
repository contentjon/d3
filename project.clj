(defproject contentjon.d3 "0.2.0-SNAPSHOT"
  :description     "A ClojureScript wrapper for D3"
  :url             "https://github.com/contentjon/d3"
  :license         {:name         "EPL"
                    :url          "http://www.eclipse.org/legal/epl-v10.html"
                    :distribution :repo
                    :comments     "Same license as Clojure"}
  :min-lein-version "2.0.0"
  :hooks           [leiningen.cljsbuild]
  :plugins         [[lein-cljsbuild "0.3.2"]]
  :dependencies    [[org.clojure/clojure "1.5.1"]]
  :cljsbuild {
    :builds 
    [{:source-paths ["src"]
     :id "lib"
     :compiler
     {:pretty-print true
      :output-to     "target/d3.cljs.js"
      :optimizations :simple}}]})

