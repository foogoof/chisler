(ns chisler.test.core
  (:use [chisler.core])
  (:use [clojure.test]))

(deftest test-wood
  (is true (marked? (chisler.core.Wood. (atom false))))
  )
