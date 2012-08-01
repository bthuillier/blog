(ns blog.views.main
  (:require [blog.views.common :as common]
  			[blog.views.navbar :as navbar])
  (:use [noir.core :only [defpage defpartial]]
        [hiccup.core :only [html]]))

(defpage "/" []
         (common/layout
           navbar/generate-default [:p "Welcome to blog"]))


