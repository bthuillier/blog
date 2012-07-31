(ns blog.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-js include-css html5]]))

(defpartial navbar []
[:div { :class "navbar navbar-fixed-top" }
				[:div.navbar-inner
		 		 [:div.container-fluid]]]
	)


(defpartial layout [& content]
            (html5
              [:head
               [:title "blog"]
               (include-css "/css/main.css")
               [:meta { :name "viewport" :content "width=device-width, initial-scale=1.0" }]]
              [:body
			   (navbar)
               [:div#main.container-fluid
                [:div.row-fluid
                 [:div.span12 content
               ]]]
               (include-js "/js/jquery.min.js")
               (include-js "/js/bootstrap.min.js")]))

