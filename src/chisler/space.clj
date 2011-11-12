(in-ns 'chisler.core)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(deftype Space [broken marked]
  ASpace
  (break [self] (reset! broken true))
  (broken? [self] @broken)
  (mark [self] (reset! marked true))
  (unmark [self] (reset! marked false))
  (marked? [self] @marked)
  (display-char [self] \space))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; EEEEEEEK
(defn make-space [keyword]
  (case keyword
    :space  (chisler.core.Space. (atom false) (atom false))
    :marble (chisler.core.Marble. (atom false) (atom false))))

;; MOOOOORE EEEEEEK
(defn space-seq [coll]
  (map make-space coll))