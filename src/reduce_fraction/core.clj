(ns reduce-fraction.core)

(defn- common-divisor-pred
  [x y]
  #(zero? (+ (mod x %) (mod y %))))

(def ^:private possible-divisors
  (comp #(range 2 %) inc min))

(defn- common-divisor
  [x y]
  (first 
    (filter 
	  (common-divisor-pred x y) 
	  (possible-divisors x y))))

(defn reduce-fraction
  [[num den]]
  (if-let [div (common-divisor num den)]
    (recur [(/ num div) (/ den div)])
	[num den]))
