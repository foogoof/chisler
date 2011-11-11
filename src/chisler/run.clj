(in-ns 'chisler.core)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn min-length [marble-count group-count]
  (+ marble-count (dec group-count)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrecord Run [length]
  ARun
  (fit [self marble-count group-count]
    (>= length (min-length marble-count group-count)))

  (fit [self marble-count] (fit self marble-count 1))

  (print [self spaces]
    (let [midst (interpose " | " (map display-char spaces))
          line (str "| " (apply str midst) " |")
          edge (apply str (repeat (count line) "-"))]
      #_(str edge \newline line \newline edge \newline)
      line
      )))
