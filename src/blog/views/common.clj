(ns blog.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "blog"]
               (include-css "/css/bootstrap.min.css")
               (include-css "/css/bootstrap-responsive.min.css")
               [:meta { :name "viewport" :content "width=device-width, initial-scale=1.0" }]]
              [:body
               [:div.container-fluid
                content]]))