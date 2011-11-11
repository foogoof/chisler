(in-ns 'chisler.core)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(deftype Box [marker a-space]
  ASpace
  (break [self] (break a-space) a-space)
  (mark [self] (change-mark marker true))
  (unmark [self] (change-mark marker false))
  (marked? [self] @marker)
  (display-char [self] \?))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn box-seq [& space-keywords]
  (map #(chisler.core.Box. (atom false) (make-space %))
       space-keywords))
