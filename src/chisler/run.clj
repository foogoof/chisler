(in-ns 'chisler.core)

;;  marbles-count group-count

(defn min-length [marble-count group-count]
  (+ marble-count (dec group-count)))

(defrecord Run [length]
  ARun
  (fit [self marble-count group-count]
    (>= length (min-length marble-count group-count)))
  (fit [self marble-count] (fit self marble-count 1)))

