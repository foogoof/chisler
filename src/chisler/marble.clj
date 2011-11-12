(in-ns 'chisler.core)

(deftype Marble [marker broken]
  ASpace
  (break [self] (reset! broken true) (throw+ "whoops!"))
  (broken? [self] @broken)
  (mark [self] (reset! marker true))
  (unmark [self] (reset! marker false))
  (marked? [self] @marker)
  (display-char [self] \*))
