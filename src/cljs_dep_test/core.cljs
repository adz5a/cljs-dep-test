(ns cljs-dep-test.core
  (:require [reagent.core :as reagent :refer [atom]]
            [cljsjs.common :as com :refer [greet css]]
            [cljsjs.message :refer [yolo]]))

(enable-console-print!)

(println "This text is printed from src/cljs-dep-test/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(def red-class (css (clj->js {:color "red"})))


(defn hello-world []
  [:div
   [:h1 (:text @app-state)]
   [:h3 {:className red-class} (yolo)]])

(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
