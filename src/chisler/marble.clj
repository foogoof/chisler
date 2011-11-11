(in-ns 'chisler.core)

(deftype Marble [marker]
  ASpace
  (break [self] (throw+ "ack! splinters!"))
  (mark [self] (change-mark marker true))
  (unmark [self] (change-mark marker false))
  (marked? [self] @marker)
  (display-char [self] \*))
