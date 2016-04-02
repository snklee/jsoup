[![Build Status](https://travis-ci.org/snklee/jsoup.svg?branch=master)](https://travis-ci.org/snklee/jsoup)
[![Coverage Status](https://coveralls.io/repos/github/snklee/jsoup/badge.png?branch=master)](https://coveralls.io/github/snklee/jsoup?branch=master)

jsoup: Java HTML parser that makes sense of real-world HTML soup.

jsoup is a Java library for working with real-world HTML. It provides a very convenient API for extracting and manipulating data, using the best of DOM, CSS, and jquery-like methods.

jsoup implements the WHATWG HTML5 specification (http://whatwg.org/html), and parses HTML to the same DOM as modern browsers do.

* parse HTML from a URL, file, or string
* find and extract data, using DOM traversal or CSS selectors
* manipulate the HTML elements, attributes, and text
* clean user-submitted content against a safe white-list, to prevent XSS
* output tidy HTML

jsoup is designed to deal with all varieties of HTML found in the wild; from pristine and validating, to invalid tag-soup; jsoup will create a sensible parse tree.

jsoup runs on Java 1.5 and up.

See http://jsoup.org/ for downloads and documentation.
