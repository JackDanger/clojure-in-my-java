(ns pkg.with-clojure.App)

(gen-class
   :name pkg.with-clojure.App
   :methods [[hello [] void]])

(defn -hello []
  println("Howdy from Clojure"))
