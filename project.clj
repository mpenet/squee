(defproject cc.qbits/squee "0.0.1"
  :description "A fresh JDBC library"
  :url "http://github.com/ghadishayban/squee"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:dev {:plugins [[codox "0.8.12"]]
                   :codox {:include [squee.jdbc squee.datasources squee.impl.protocols]
                           :src-dir-uri "http://github.com/mpenet/squee/blob/master/"
                           :src-linenum-anchor-prefix "L"}}})
