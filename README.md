# SICP, Clojure form

This app is just a trivial Leiningen / Clojure reimplementation of some aspects of the SICP book, freely available at [SICP in Clojure](http://sicpinclojure.com/).

## Running

- install Leiningen
- execute `lein repl`
- compile and run main functions as desired. Some clj files don't have -main function, so an explicit evaluation can be used (**LightTable** seems to be best choice around)

For example:

    (compile 'chapter1.c116)
    (chapter1.c116/-main)
