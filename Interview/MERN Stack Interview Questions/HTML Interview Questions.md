<h1>HTML Interview Questions</h1>

## Index
- [Index](#index)
- [Basic HTML Questions](#basic-html-questions)
	- [1. What is HTML?](#1-what-is-html)
	- [2. What are HTML tags?](#2-what-are-html-tags)
	- [3. What is the difference between HTML and HTML5?](#3-what-is-the-difference-between-html-and-html5)
	- [4. What is a doctype in HTML, and why is it important?](#4-what-is-a-doctype-in-html-and-why-is-it-important)
	- [5. Explain the basic structure of an HTML document.](#5-explain-the-basic-structure-of-an-html-document)
	- [6. What is the `<head>` tag used for in HTML?](#6-what-is-the-head-tag-used-for-in-html)
	- [7. What is the `<body>` tag used for in HTML?](#7-what-is-the-body-tag-used-for-in-html)
	- [8. What is an HTML element?](#8-what-is-an-html-element)
	- [9. What is the purpose of the `<title>` tag in HTML?](#9-what-is-the-purpose-of-the-title-tag-in-html)
	- [10. What is an attribute in HTML? Can you give an example?](#10-what-is-an-attribute-in-html-can-you-give-an-example)
	- [11. What are block-level elements? Can you name a few?](#11-what-are-block-level-elements-can-you-name-a-few)
	- [12. What are inline elements? Can you give examples?](#12-what-are-inline-elements-can-you-give-examples)
	- [13. What is the difference between a div and a span?](#13-what-is-the-difference-between-a-div-and-a-span)
	- [14. What are the semantic elements in HTML5?](#14-what-are-the-semantic-elements-in-html5)
	- [15. What is the difference between HTML tags `<b>` and `<strong>`, `<i>` and `<em>`?](#15-what-is-the-difference-between-html-tags-b-and-strong-i-and-em)
	- [16. How would you add a link to another webpage in HTML?](#16-how-would-you-add-a-link-to-another-webpage-in-html)
	- [17. How can you make a link open in a new tab?](#17-how-can-you-make-a-link-open-in-a-new-tab)
	- [18. How do you create an unordered list in HTML?](#18-how-do-you-create-an-unordered-list-in-html)
	- [19. How do you create an ordered list in HTML?](#19-how-do-you-create-an-ordered-list-in-html)
	- [20. How do you add an image to an HTML page?](#20-how-do-you-add-an-image-to-an-html-page)
	- [21. What is the purpose of the alt attribute in an image tag?](#21-what-is-the-purpose-of-the-alt-attribute-in-an-image-tag)
	- [22. What are void elements in HTML?](#22-what-are-void-elements-in-html)
	- [23. How can you embed a video in an HTML page?](#23-how-can-you-embed-a-video-in-an-html-page)
	- [24. How do you create a table in HTML?](#24-how-do-you-create-a-table-in-html)
	- [25. Explain the difference between `<thead>`, `<tbody>`, and `<tfoot>`.](#25-explain-the-difference-between-thead-tbody-and-tfoot)
	- [26. How do you create a form in HTML?](#26-how-do-you-create-a-form-in-html)
	- [27. What are the different types of input fields in HTML forms?](#27-what-are-the-different-types-of-input-fields-in-html-forms)
	- [28. What is the difference between the action and method attributes in an HTML form?](#28-what-is-the-difference-between-the-action-and-method-attributes-in-an-html-form)
	- [29. How can you specify that a form field is required in HTML5?](#29-how-can-you-specify-that-a-form-field-is-required-in-html5)
	- [30. How can you make a field auto-focus when a page loads?](#30-how-can-you-make-a-field-auto-focus-when-a-page-loads)
	- [31. What are meta tags in HTML, and why are they important?](#31-what-are-meta-tags-in-html-and-why-are-they-important)
	- [32. What is the viewport meta tag, and why is it important for responsive design?](#32-what-is-the-viewport-meta-tag-and-why-is-it-important-for-responsive-design)
	- [33. How do you include a comment in HTML?](#33-how-do-you-include-a-comment-in-html)
	- [34. What is the `<script>` tag used for in HTML?](#34-what-is-the-script-tag-used-for-in-html)
	- [35. What is the difference between `<script>` tag placement in the `<head>` and at the bottom of the `<body>`?](#35-what-is-the-difference-between-script-tag-placement-in-the-head-and-at-the-bottom-of-the-body)
	- [36. How do you include an external CSS file in an HTML document?](#36-how-do-you-include-an-external-css-file-in-an-html-document)
	- [37. How can you include an external JavaScript file in an HTML document?](#37-how-can-you-include-an-external-javascript-file-in-an-html-document)
	- [38. What are HTML entities?](#38-what-are-html-entities)
	- [39. How do you create a hyperlink with an email address (mailto link)?](#39-how-do-you-create-a-hyperlink-with-an-email-address-mailto-link)
	- [40. What is the use of the `<iframe>` tag in HTML?](#40-what-is-the-use-of-the-iframe-tag-in-html)
- [Intermediate HTML Questions](#intermediate-html-questions)
	- [41. What are the new form input types introduced in HTML5?](#41-what-are-the-new-form-input-types-introduced-in-html5)
	- [42. How can you use the `<progress>` tag in HTML5?](#42-how-can-you-use-the-progress-tag-in-html5)
	- [43. What is the `<canvas>` tag in HTML5, and how is it used?](#43-what-is-the-canvas-tag-in-html5-and-how-is-it-used)
	- [44. What is the `<audio>` tag used for in HTML?](#44-what-is-the-audio-tag-used-for-in-html)
	- [45. What is the `<video>` tag used for in HTML?](#45-what-is-the-video-tag-used-for-in-html)
	- [46. How do you specify multiple sources for the `<video>` or `<audio>` element in HTML5?](#46-how-do-you-specify-multiple-sources-for-the-video-or-audio-element-in-html5)
	- [47. How can you make elements draggable in HTML5?](#47-how-can-you-make-elements-draggable-in-html5)
	- [48. What is the `<picture>` element used for in HTML?](#48-what-is-the-picture-element-used-for-in-html)
	- [49. What are data attributes in HTML, and how are they used?](#49-what-are-data-attributes-in-html-and-how-are-they-used)
	- [50. How do you create a drop-down list in HTML?](#50-how-do-you-create-a-drop-down-list-in-html)
	- [51. What is the autocomplete attribute in forms?](#51-what-is-the-autocomplete-attribute-in-forms)
	- [52. How can you create a multi-select drop-down in HTML?](#52-how-can-you-create-a-multi-select-drop-down-in-html)
	- [53. How do you disable an input field in HTML?](#53-how-do-you-disable-an-input-field-in-html)
	- [54. How do you create a placeholder in an input field?](#54-how-do-you-create-a-placeholder-in-an-input-field)
	- [55. What is the purpose of the novalidate attribute in forms?](#55-what-is-the-purpose-of-the-novalidate-attribute-in-forms)
	- [56. How do you add a favicon to an HTML document?](#56-how-do-you-add-a-favicon-to-an-html-document)
	- [57. What is the difference between a relative and an absolute URL?](#57-what-is-the-difference-between-a-relative-and-an-absolute-url)
	- [58. What is the use of the target="\_blank" attribute in a link tag?](#58-what-is-the-use-of-the-target_blank-attribute-in-a-link-tag)
	- [59. How do you create a button in HTML?](#59-how-do-you-create-a-button-in-html)
	- [60. How do you create a file upload field in HTML?](#60-how-do-you-create-a-file-upload-field-in-html)
	- [61. What is the purpose of the `<label>` tag in HTML forms?](#61-what-is-the-purpose-of-the-label-tag-in-html-forms)
	- [62. How can you group options in a select dropdown list?](#62-how-can-you-group-options-in-a-select-dropdown-list)
	- [63. What are the global attributes in HTML?](#63-what-are-the-global-attributes-in-html)
	- [64. What is ARIA, and why is it important in HTML?](#64-what-is-aria-and-why-is-it-important-in-html)
	- [65. How do you make an HTML page accessible for people with disabilities?](#65-how-do-you-make-an-html-page-accessible-for-people-with-disabilities)
	- [66. What is the purpose of the required attribute in HTML forms?](#66-what-is-the-purpose-of-the-required-attribute-in-html-forms)
	- [67. How can you define a custom data attribute in HTML5?](#67-how-can-you-define-a-custom-data-attribute-in-html5)
	- [68. What are microdata, and how are they used in HTML5?](#68-what-are-microdata-and-how-are-they-used-in-html5)
	- [69. How can you include a downloadable file in an HTML page?](#69-how-can-you-include-a-downloadable-file-in-an-html-page)
	- [70. What is a manifest file, and how is it used in HTML5?](#70-what-is-a-manifest-file-and-how-is-it-used-in-html5)
	- [71. What is the difference between readonly and disabled attributes in form elements?](#71-what-is-the-difference-between-readonly-and-disabled-attributes-in-form-elements)
	- [72. How can you specify a pattern for input validation in HTML5?](#72-how-can-you-specify-a-pattern-for-input-validation-in-html5)
	- [73. What are the advantages of using HTML5 over previous versions?](#73-what-are-the-advantages-of-using-html5-over-previous-versions)
	- [74. How do you create a responsive image using the `<img>` tag?](#74-how-do-you-create-a-responsive-image-using-the-img-tag)
- [Advanced HTML Questions](#advanced-html-questions)
	- [75. How do you make a website mobile-friendly using HTML and meta tags?](#75-how-do-you-make-a-website-mobile-friendly-using-html-and-meta-tags)
	- [76. What is the purpose of the async and defer attributes in the `<script>` tag?](#76-what-is-the-purpose-of-the-async-and-defer-attributes-in-the-script-tag)
	- [77. How do you use the `<meta charset="UTF-8">` tag, and why is it important?](#77-how-do-you-use-the-meta-charsetutf-8-tag-and-why-is-it-important)
	- [78. How can you implement lazy loading for images in HTML?](#78-how-can-you-implement-lazy-loading-for-images-in-html)
	- [79. What is the purpose of the `<base>` tag in HTML?](#79-what-is-the-purpose-of-the-base-tag-in-html)
	- [80. How do you create a modal dialog in HTML5?](#80-how-do-you-create-a-modal-dialog-in-html5)
	- [81. What is a web worker in HTML5, and how does it work?](#81-what-is-a-web-worker-in-html5-and-how-does-it-work)
	- [82. How do you use the `<details>` and `<summary>` tags in HTML5?](#82-how-do-you-use-the-details-and-summary-tags-in-html5)
	- [83. What is the purpose of the `<template>` tag in HTML5?](#83-what-is-the-purpose-of-the-template-tag-in-html5)
	- [84. How do you implement server-sent events (SSE) in HTML5?](#84-how-do-you-implement-server-sent-events-sse-in-html5)
	- [85. What is the `<meter>` tag used for in HTML5?](#85-what-is-the-meter-tag-used-for-in-html5)
	- [86. How can you integrate geolocation in an HTML5 application?](#86-how-can-you-integrate-geolocation-in-an-html5-application)
	- [87. How can you use HTML5 to create an offline web application?](#87-how-can-you-use-html5-to-create-an-offline-web-application)
	- [88. How do you implement content security policies (CSP) using meta tags?](#88-how-do-you-implement-content-security-policies-csp-using-meta-tags)
	- [89. What is the purpose of the srcset attribute in an `<img>` tag?](#89-what-is-the-purpose-of-the-srcset-attribute-in-an-img-tag)
	- [90. What is the use of the `<wbr>` tag in HTML?](#90-what-is-the-use-of-the-wbr-tag-in-html)
	- [91. How do you implement a custom error message for form validation in HTML5?](#91-how-do-you-implement-a-custom-error-message-for-form-validation-in-html5)
	- [92. How can you use local storage in an HTML5 application?](#92-how-can-you-use-local-storage-in-an-html5-application)
	- [93. What is the use of the `<noscript>` tag in HTML?](#93-what-is-the-use-of-the-noscript-tag-in-html)
	- [94. How can you use the `<object>` tag in HTML?](#94-how-can-you-use-the-object-tag-in-html)
	- [95. How do you embed SVG images directly in HTML?](#95-how-do-you-embed-svg-images-directly-in-html)
	- [96. What is the Shadow DOM, and how is it used in HTML5?](#96-what-is-the-shadow-dom-and-how-is-it-used-in-html5)
	- [97. What is the difference between HTML, XHTML, and XML?](#97-what-is-the-difference-between-html-xhtml-and-xml)
	- [98. How do you handle cross-origin resource sharing (CORS) in HTML5?](#98-how-do-you-handle-cross-origin-resource-sharing-cors-in-html5)
	- [99. What is the use of the `<track>` tag in HTML5 videos?](#99-what-is-the-use-of-the-track-tag-in-html5-videos)
	- [100. How do you ensure SEO-friendly HTML markup for a webpage?](#100-how-do-you-ensure-seo-friendly-html-markup-for-a-webpage)

## Basic HTML Questions
### 1. What is HTML?
### 2. What are HTML tags?
### 3. What is the difference between HTML and HTML5?
### 4. What is a doctype in HTML, and why is it important?
### 5. Explain the basic structure of an HTML document.
### 6. What is the `<head>` tag used for in HTML?
### 7. What is the `<body>` tag used for in HTML?
### 8. What is an HTML element?
### 9. What is the purpose of the `<title>` tag in HTML?
### 10. What is an attribute in HTML? Can you give an example?
### 11. What are block-level elements? Can you name a few?
### 12. What are inline elements? Can you give examples?
### 13. What is the difference between a div and a span?
### 14. What are the semantic elements in HTML5?
### 15. What is the difference between HTML tags `<b>` and `<strong>`, `<i>` and `<em>`?
### 16. How would you add a link to another webpage in HTML?
### 17. How can you make a link open in a new tab?
### 18. How do you create an unordered list in HTML?
### 19. How do you create an ordered list in HTML?
### 20. How do you add an image to an HTML page?
### 21. What is the purpose of the alt attribute in an image tag?
### 22. What are void elements in HTML?
### 23. How can you embed a video in an HTML page?
### 24. How do you create a table in HTML?
### 25. Explain the difference between `<thead>`, `<tbody>`, and `<tfoot>`.
### 26. How do you create a form in HTML?
### 27. What are the different types of input fields in HTML forms?
### 28. What is the difference between the action and method attributes in an HTML form?
### 29. How can you specify that a form field is required in HTML5?
### 30. How can you make a field auto-focus when a page loads?
### 31. What are meta tags in HTML, and why are they important?
### 32. What is the viewport meta tag, and why is it important for responsive design?
### 33. How do you include a comment in HTML?
### 34. What is the `<script>` tag used for in HTML?
### 35. What is the difference between `<script>` tag placement in the `<head>` and at the bottom of the `<body>`?
### 36. How do you include an external CSS file in an HTML document?
### 37. How can you include an external JavaScript file in an HTML document?
### 38. What are HTML entities?
### 39. How do you create a hyperlink with an email address (mailto link)?
### 40. What is the use of the `<iframe>` tag in HTML?

## Intermediate HTML Questions
### 41. What are the new form input types introduced in HTML5?
### 42. How can you use the `<progress>` tag in HTML5?
### 43. What is the `<canvas>` tag in HTML5, and how is it used?
### 44. What is the `<audio>` tag used for in HTML?
### 45. What is the `<video>` tag used for in HTML?
### 46. How do you specify multiple sources for the `<video>` or `<audio>` element in HTML5?
### 47. How can you make elements draggable in HTML5?
### 48. What is the `<picture>` element used for in HTML?
### 49. What are data attributes in HTML, and how are they used?
### 50. How do you create a drop-down list in HTML?
### 51. What is the autocomplete attribute in forms?
### 52. How can you create a multi-select drop-down in HTML?
### 53. How do you disable an input field in HTML?
### 54. How do you create a placeholder in an input field?
### 55. What is the purpose of the novalidate attribute in forms?
### 56. How do you add a favicon to an HTML document?
### 57. What is the difference between a relative and an absolute URL?
### 58. What is the use of the target="_blank" attribute in a link tag?
### 59. How do you create a button in HTML?
### 60. How do you create a file upload field in HTML?
### 61. What is the purpose of the `<label>` tag in HTML forms?
### 62. How can you group options in a select dropdown list?
### 63. What are the global attributes in HTML?
### 64. What is ARIA, and why is it important in HTML?
### 65. How do you make an HTML page accessible for people with disabilities?
### 66. What is the purpose of the required attribute in HTML forms?
### 67. How can you define a custom data attribute in HTML5?
### 68. What are microdata, and how are they used in HTML5?
### 69. How can you include a downloadable file in an HTML page?
### 70. What is a manifest file, and how is it used in HTML5?
### 71. What is the difference between readonly and disabled attributes in form elements?
### 72. How can you specify a pattern for input validation in HTML5?
### 73. What are the advantages of using HTML5 over previous versions?
### 74. How do you create a responsive image using the `<img>` tag?

## Advanced HTML Questions
### 75. How do you make a website mobile-friendly using HTML and meta tags?
### 76. What is the purpose of the async and defer attributes in the `<script>` tag?
### 77. How do you use the `<meta charset="UTF-8">` tag, and why is it important?
### 78. How can you implement lazy loading for images in HTML?
### 79. What is the purpose of the `<base>` tag in HTML?
### 80. How do you create a modal dialog in HTML5?
### 81. What is a web worker in HTML5, and how does it work?
### 82. How do you use the `<details>` and `<summary>` tags in HTML5?
### 83. What is the purpose of the `<template>` tag in HTML5?
### 84. How do you implement server-sent events (SSE) in HTML5?
### 85. What is the `<meter>` tag used for in HTML5?
### 86. How can you integrate geolocation in an HTML5 application?
### 87. How can you use HTML5 to create an offline web application?
### 88. How do you implement content security policies (CSP) using meta tags?
### 89. What is the purpose of the srcset attribute in an `<img>` tag?
### 90. What is the use of the `<wbr>` tag in HTML?
### 91. How do you implement a custom error message for form validation in HTML5?
### 92. How can you use local storage in an HTML5 application?
### 93. What is the use of the `<noscript>` tag in HTML?
### 94. How can you use the `<object>` tag in HTML?
### 95. How do you embed SVG images directly in HTML?
### 96. What is the Shadow DOM, and how is it used in HTML5?
### 97. What is the difference between HTML, XHTML, and XML?
### 98. How do you handle cross-origin resource sharing (CORS) in HTML5?
### 99. What is the use of the `<track>` tag in HTML5 videos?
### 100. How do you ensure SEO-friendly HTML markup for a webpage?
