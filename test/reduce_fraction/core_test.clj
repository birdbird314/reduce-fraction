(ns reduce-fraction.core-test
  (:require [clojure.test :refer :all]
            [reduce-fraction.core :refer :all]))

(deftest reduce-fraction-test
  
  (testing "Should not reduce already reduced number"
    (is (= (reduce-fraction [1 1]) [1 1])))

  (testing "Should reduce fraction with prime GCD"
    (is (= (reduce-fraction [4 6]) [2 3])))

  (testing "Should reduce fraction with non-prime GCD"
    (is (= (reduce-fraction [6 12]) [1 2]))))
