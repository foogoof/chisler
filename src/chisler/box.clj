(in-ns 'chisler.core)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrecord Box [marker space]
  ASpace
  (break [self] (break space))
  (mark [self] (change-mark marker true))
  (unmark [self] (change-mark marker false))
  (marked? [self] @marker)
  (display-char [self] \?))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn box-seq [& space-keywords]
  (map #(chisler.core.Box. (atom false) (make-space %))
       space-keywords))
