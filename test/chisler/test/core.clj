(ns chisler.test.core
  (:use [chisler.core])
  (:use [clojure.test])
  (:use [slingshot.slingshot :only [throw+]]))

(def marble (make-space :marble))
(def space (make-space :space))
(def forrest (chisler.core.Run. 3))
(def marble-space-marble (space-seq [:marble :space :marble]))

(deftest test-break
  #_(is (not (thrown? slingshot.Stone (break space))))
  (is (thrown? slingshot.Stone (break marble))))

(deftest test-min-length
  (is (= 1 (chisler.core/min-length 1 1)))
  (is (= 2 (chisler.core/min-length 2 1)))
  (is (= 3 (chisler.core/min-length 2 2)))
  (is (= 4 (chisler.core/min-length 3 2)))
  (is (= 5 (chisler.core/min-length 3 3))))

(deftest test-run
  (is (fit forrest 1))
  (is (fit forrest 2))
  (is (fit forrest 3))
  (is (not (fit forrest 4)))
  (is (fit forrest 2 1))
  (is (fit forrest 2 2))
  (is (fit forrest 3 1))
  (is (not (fit forrest 3 2))))

(deftest test-solved
  (is (solved? forrest [marble]))
  (is (not (solved? forrest [space])))
  (is (not (solved? forrest marble-space-marble))))