(ns blog.views.common
  (:require [blog.views.navbar :as navbar])
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-js include-css html5]]))

(defpartial layout [nav content]
            (html5
              [:head
               [:title "blog"]
               (include-css "/css/main.css")
               [:meta { :name "viewport" :content "width=device-width, initial-scale=1.0" }]]
              [:body
			         (nav)
               [:div#main.container-fluid
                [:div.row-fluid
                 [:div.span12 content
               ]]]
               (include-js "/js/jquery.min.js")
               (include-js "/js/bootstrap.min.js")]))

(defpartial default-layout [ & content]
  (layout navbar/generate-default content))

(defpartial article []
  layout )

