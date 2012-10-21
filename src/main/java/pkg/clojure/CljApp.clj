(ns pkg.clojure.CljApp
  (:gen-class
   :name pkg.clojure.CljApp
   :methods [[hello [] void]]))


(defn -hello [self]
  (println "Howdy from Clojure"))
