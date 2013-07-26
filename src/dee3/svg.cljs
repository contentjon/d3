(ns dee3.svg)

(defn diagonal []
  (js/d3.svg.diagonal))

(defn radial []
  (js/d3.svg.diagonal.radial))

(defn projection [diagonal f]
  (.projection diagonal f))

(defn project [f]
  (-> (diagonal) (projection f)))
