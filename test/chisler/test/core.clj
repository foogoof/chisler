(ns chisler.test.core
  (:use [chisler.core])
  (:use [clojure.test]))

(deftest test-marble
  (is (marked? (chisler.core.Marble. (atom true))))
  (is (not (marked? (chisler.core.Marble. (atom false)))))
  )
