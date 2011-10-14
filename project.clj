(defproject skimbot3000 "0.0.1"
  :description "A website deployable to AppEngine"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [joodo "0.6.0-SNAPSHOT"]]
  :dev-dependencies [[speclj "1.4.0"]]
  :test-path "spec/"
  :java-source-path "src/"
  :repl-init-script "config/development/repl_init.clj"
  :joodo-core-namespace skimbot3000.core)