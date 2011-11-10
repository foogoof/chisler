(in-ns 'chisler.core)

(defn change-mark [marker new-value]
  (swap! marker (fn [_] new-value)))
