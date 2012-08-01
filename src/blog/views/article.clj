(ns blog.views.article
  (:require [blog.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/archives" []
	(common/default-layout [:p "archives"]))


(defpage "/article/this-is-sparta" []
	(common/default-layout [:p "article"]
		))