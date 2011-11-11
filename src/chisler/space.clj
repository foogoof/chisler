(in-ns 'chisler.core)

(deftype Space []
  ASpace
  (break [self])
  (mark [self])
  (unmark [self])
  (marked? [self] false)
  (display-char [self] \space))
