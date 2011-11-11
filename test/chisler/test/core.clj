(ns chisler.test.core
  (:use [chisler.core])
  (:use [clojure.test])
  (:use [slingshot.slingshot :only [throw+]]))

(def marble (chisler.core.Marble. (atom false)))
(def space (chisler.core.Space.))
(def marble-in-a-box (chisler.core.Box. (atom false) marble))
(def nothing-in-a-box (chisler.core.Box. (atom false) space))
(def forrest (chisler.core.Run. 3))

(deftest test-box
  (is (instance? chisler.core.Space (break nothing-in-a-box)))
  (is (thrown? slingshot.Stone (break marble-in-a-box))))

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