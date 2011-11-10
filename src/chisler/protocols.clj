(in-ns 'chisler.core)

(defprotocol ASpace
  (break [_] "break the space")
  (mark [_] "mark the space")
  (unmark [_] "unmark the space")
  (marked? [_] "is the space marked?"))
