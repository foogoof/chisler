(in-ns 'chisler.core)

(defprotocol ASpace
  (break [_] "break the space")
  (broken? [_] "has the space been broken?")
  (mark [_] "mark the space")
  (unmark [_] "unmark the space")
  (marked? [_] "is the space marked?")
  (display-char [_] "returns one character to display at the REPL"))

(defprotocol ARun
  (fit [_ marble-count] [_ marble-count group-count])
  (solved? [_ spaces])
  (print [_ spaces]))
