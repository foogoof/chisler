(in-ns 'chisler.core)

(deftype Wood [marker]
  ASpace
  (break [self] (throw+ "ack! splinters!"))
  (mark [self] (change-mark marker true))
  (unmark [self] (change-mark marker false))
  (marked? [self] @marker))
