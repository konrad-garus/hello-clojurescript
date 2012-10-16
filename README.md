hello-clojurescript
===================

Trivial app demonstrating ClojureScript with jQuery on Ring (with as few dependencies as possible). It uses only Ring, ClojureScript and jayq.

To execute:

1. Clone this repository.

2. Compile ClojureScript to JavaScript by either of:

 * `lein cljsbuild once` - compiles CLJS files once, then exits

 * `lein cljsbuild auto` - compiles the CLJS files, then keeps running and recompiles those files as they are updated

3. Launch the application with `lein run` and access it at http://localhost:3000.
