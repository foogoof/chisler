(in-ns 'chisler.core)

(defprotocol ASpace
  (break [_] "break the space")
  (mark [_] "mark the space")
  (unmark [_] "unmark the space")
  (marked? [_] "is the space marked?")
  (display-char [_] "returns one character to display at the REPL"))

(defprotocol ARun
  (fit [_ marble-count] [_ marble-count group-count])
  (print [_ spaces]))
