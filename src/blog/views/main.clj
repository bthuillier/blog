(ns blog.views.main
  (:require [blog.views.common :as common]
  			[blog.views.navbar :as navbar])
  (:use [noir.core :only [defpage defpartial]]
        [hiccup.core :only [html]]))

(defpage "/" []
  (common/default-layout [:p "Welcome to blog"]))

(defpage "/status" []
  (common/default-layout [:p "Welcome to blog"]))

(defpage "/about" []
  (common/default-layout [:p "Welcome to blog"]))



