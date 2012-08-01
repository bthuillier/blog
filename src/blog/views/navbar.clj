(ns blog.views.navbar
	(:use [noir.core :only [defpartial]]))

(def menu-items [{:url "/" :title "home"} {:url "/archives" :title "archives"} {:url "/status" :title "status" } {:url "/about" :title "about"}])

(defpartial menu-item [{:keys [url title]}]
;item for the navbar menu
  [:li [:a {:href url} title]])


(defpartial menu [items]
;generate the menu for the navbar 
  [:ul.nav
    (map menu-item items)])


(defpartial generate [& content]
;generate a navbar
[:div { :class "navbar navbar-fixed-top" }
				[:div.navbar-inner
		 		 [:div.container-fluid content]]]
	)

(defpartial generate-default []
;default navbar
  (generate (menu menu-items)))
