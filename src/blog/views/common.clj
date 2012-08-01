(ns blog.views.common
  (:require [blog.views.navbar :as navbar])
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-js include-css html5]]))

(defn include-javascripts[libs]
  (map include-js libs))

(defn include-stylesheets[libs]
  (map include-css libs))

(def base-javascripts["/js/jquery.min.js" "/js/bootstrap.min.js"])
(def base-stylesheets["/css/main.css"])

(defpartial layout [nav content]
            (html5
              [:head
               [:title "blog"]
               (include-stylesheets base-stylesheets)
               [:meta { :name "viewport" :content "width=device-width, initial-scale=1.0" }]]
              [:body
			         (nav)
               [:div#main.container-fluid
                [:div.row-fluid
                 [:div.span12 content
               ]]]
               (include-javascripts base-javascripts)]))



(defpartial default-layout [ & content]
  (layout navbar/generate-default content))

(defpartial article []
  layout )

