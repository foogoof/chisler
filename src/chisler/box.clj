(in-ns 'chisler.core)

(deftype Box [marker a-space]
  ASpace
  (break [self] (break a-space) a-space)
  (mark [self] (change-mark marker true))
  (unmark [self] (change-mark marker false))
  (marked? [self] @marker))
