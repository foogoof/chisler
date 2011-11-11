(in-ns 'chisler.core)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(deftype Space []
  ASpace
  (break [self])
  (mark [self])
  (unmark [self])
  (marked? [self] false)
  (display-char [self] \space))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; EEEEEEEK
(defn make-space [keyword]
  (case keyword
    :space  (chisler.core.Space.)
    :marble (chisler.core.Marble. (atom false))))
