(ns blog.views.welcome
  (:require [blog.views.common :as common])
  (:use [noir.core :only [defpage defpartial]]
        [hiccup.core :only [html]]))

(defpartial navbar []
	(common/navbar (common/nav-menu [{:url "lol"  :title "test"} {:url "/archives" :title "archives"} {:url "/about" :title "about"}])))

(defpage "/" []
         (common/layout
           navbar [:p "Welcome to blog"]))


