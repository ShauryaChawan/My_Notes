<h1>CSS Interview Questions</h1>

## Index
- [Index](#index)
- [Basic CSS Questions](#basic-css-questions)
	- [1. What is CSS, and why is it used?](#1-what-is-css-and-why-is-it-used)
	- [2. What is the difference between an inline, internal, and external CSS?](#2-what-is-the-difference-between-an-inline-internal-and-external-css)
	- [3. How do you include external CSS in an HTML document?](#3-how-do-you-include-external-css-in-an-html-document)
	- [4. What is the CSS color property used for?](#4-what-is-the-css-color-property-used-for)
	- [5. What are CSS selectors, and how do they work?](#5-what-are-css-selectors-and-how-do-they-work)
	- [6. What is the difference between class and ID selectors in CSS?](#6-what-is-the-difference-between-class-and-id-selectors-in-css)
	- [7. How do you group multiple selectors in CSS?](#7-how-do-you-group-multiple-selectors-in-css)
	- [8. What are the different ways to apply CSS to a webpage?](#8-what-are-the-different-ways-to-apply-css-to-a-webpage)
	- [9. How can you comment in CSS?](#9-how-can-you-comment-in-css)
	- [10. What is the box model in CSS?](#10-what-is-the-box-model-in-css)
	- [11. Explain the difference between padding and margin in the box model.](#11-explain-the-difference-between-padding-and-margin-in-the-box-model)
	- [12. What is the difference between border-box and content-box?](#12-what-is-the-difference-between-border-box-and-content-box)
	- [13. How do you center an element horizontally using CSS?](#13-how-do-you-center-an-element-horizontally-using-css)
	- [14. What is the display property in CSS, and what are its values?](#14-what-is-the-display-property-in-css-and-what-are-its-values)
	- [15. What is the difference between block, inline, and inline-block display values?](#15-what-is-the-difference-between-block-inline-and-inline-block-display-values)
	- [16. How do you hide an element in CSS?](#16-how-do-you-hide-an-element-in-css)
	- [17. What is the position property, and what are its values?](#17-what-is-the-position-property-and-what-are-its-values)
	- [18. What is the difference between absolute, relative, and fixed positioning?](#18-what-is-the-difference-between-absolute-relative-and-fixed-positioning)
	- [19. How does the z-index property work in CSS?](#19-how-does-the-z-index-property-work-in-css)
	- [20. How do you make an element float in CSS?](#20-how-do-you-make-an-element-float-in-css)
	- [21. What is the clear property used for in CSS?](#21-what-is-the-clear-property-used-for-in-css)
	- [22. What is the overflow property in CSS?](#22-what-is-the-overflow-property-in-css)
	- [23. How do you change the text color of an element using CSS?](#23-how-do-you-change-the-text-color-of-an-element-using-css)
	- [24. How do you change the background color of an element?](#24-how-do-you-change-the-background-color-of-an-element)
	- [25. What is the background-image property, and how can you use it?](#25-what-is-the-background-image-property-and-how-can-you-use-it)
	- [26. How do you make the background image cover the entire area of an element?](#26-how-do-you-make-the-background-image-cover-the-entire-area-of-an-element)
	- [27. How can you create a border around an element in CSS?](#27-how-can-you-create-a-border-around-an-element-in-css)
	- [28. How do you make a rounded corner for a box using CSS?](#28-how-do-you-make-a-rounded-corner-for-a-box-using-css)
	- [29. What is the box-shadow property, and how do you use it?](#29-what-is-the-box-shadow-property-and-how-do-you-use-it)
	- [30. How do you change the font size of an element in CSS?](#30-how-do-you-change-the-font-size-of-an-element-in-css)
	- [31. How can you change the font of text using CSS?](#31-how-can-you-change-the-font-of-text-using-css)
	- [32. What are web-safe fonts?](#32-what-are-web-safe-fonts)
	- [33. What is the font-family property in CSS?](#33-what-is-the-font-family-property-in-css)
	- [34. How do you make text bold using CSS?](#34-how-do-you-make-text-bold-using-css)
	- [35. What is the text-align property used for?](#35-what-is-the-text-align-property-used-for)
	- [36. How can you make text italic using CSS?](#36-how-can-you-make-text-italic-using-css)
	- [37. What is the line-height property used for in CSS?](#37-what-is-the-line-height-property-used-for-in-css)
	- [38. What is the text-transform property, and how is it used?](#38-what-is-the-text-transform-property-and-how-is-it-used)
	- [39. What is the letter-spacing property, and how can it be used?](#39-what-is-the-letter-spacing-property-and-how-can-it-be-used)
	- [40. What is the word-spacing property?](#40-what-is-the-word-spacing-property)
	- [41. How do you create a responsive layout using CSS?](#41-how-do-you-create-a-responsive-layout-using-css)
	- [42. What are media queries in CSS, and how do they work?](#42-what-are-media-queries-in-css-and-how-do-they-work)
	- [43. What is the purpose of the min-width and max-width properties?](#43-what-is-the-purpose-of-the-min-width-and-max-width-properties)
	- [44. How do you use the min-height and max-height properties?](#44-how-do-you-use-the-min-height-and-max-height-properties)
	- [45. How can you create a simple CSS animation?](#45-how-can-you-create-a-simple-css-animation)
	- [46. What is the difference between CSS transitions and animations?](#46-what-is-the-difference-between-css-transitions-and-animations)
	- [47. What is the @keyframes rule in CSS?](#47-what-is-the-keyframes-rule-in-css)
	- [48. How do you change the opacity of an element in CSS?](#48-how-do-you-change-the-opacity-of-an-element-in-css)
	- [49. What is the visibility property in CSS?](#49-what-is-the-visibility-property-in-css)
	- [50. What are pseudo-classes in CSS? Can you give examples?](#50-what-are-pseudo-classes-in-css-can-you-give-examples)
	- [51. What are pseudo-elements in CSS? Can you give examples?](#51-what-are-pseudo-elements-in-css-can-you-give-examples)
	- [52. What is the hover pseudo-class in CSS?](#52-what-is-the-hover-pseudo-class-in-css)
	- [53. What is the difference between the nth-child and nth-of-type pseudo-classes?](#53-what-is-the-difference-between-the-nth-child-and-nth-of-type-pseudo-classes)
	- [54. How do you style links in different states (visited, hover, active) using CSS?](#54-how-do-you-style-links-in-different-states-visited-hover-active-using-css)
	- [55. What is the transition property, and how is it used?](#55-what-is-the-transition-property-and-how-is-it-used)
	- [56. How can you apply a transition effect when hovering over an element?](#56-how-can-you-apply-a-transition-effect-when-hovering-over-an-element)
	- [57. What are vendor prefixes, and why are they used in CSS?](#57-what-are-vendor-prefixes-and-why-are-they-used-in-css)
	- [58. What is the calc() function in CSS, and how can it be used?](#58-what-is-the-calc-function-in-css-and-how-can-it-be-used)
	- [59. What is the inherit keyword in CSS?](#59-what-is-the-inherit-keyword-in-css)
	- [60. What is the initial keyword in CSS?](#60-what-is-the-initial-keyword-in-css)
	- [61. What is the !important rule, and when should it be used?](#61-what-is-the-important-rule-and-when-should-it-be-used)
	- [62. What is specificity in CSS, and how is it calculated?](#62-what-is-specificity-in-css-and-how-is-it-calculated)
	- [63. How can you override CSS styles using specificity?](#63-how-can-you-override-css-styles-using-specificity)
	- [64. What is the CSS cascade, and how does it work?](#64-what-is-the-css-cascade-and-how-does-it-work)
	- [65. How can you make text overflow with ellipsis in CSS?](#65-how-can-you-make-text-overflow-with-ellipsis-in-css)
	- [66. What is the difference between inline CSS and embedded (internal) CSS?](#66-what-is-the-difference-between-inline-css-and-embedded-internal-css)
	- [67. What is the difference between visibility: hidden and display: none?](#67-what-is-the-difference-between-visibility-hidden-and-display-none)
- [Intermediate CSS Questions](#intermediate-css-questions)
	- [68. What is Flexbox in CSS?](#68-what-is-flexbox-in-css)
	- [69. How do you center elements using Flexbox?](#69-how-do-you-center-elements-using-flexbox)
	- [70. What is the justify-content property in Flexbox?](#70-what-is-the-justify-content-property-in-flexbox)
	- [71. What is the align-items property in Flexbox?](#71-what-is-the-align-items-property-in-flexbox)
	- [72. What is the flex-wrap property, and how does it work?](#72-what-is-the-flex-wrap-property-and-how-does-it-work)
	- [73. How do you create a responsive grid layout using Flexbox?](#73-how-do-you-create-a-responsive-grid-layout-using-flexbox)
	- [74. What is CSS Grid Layout?](#74-what-is-css-grid-layout)
	- [75. What is the difference between Flexbox and CSS Grid?](#75-what-is-the-difference-between-flexbox-and-css-grid)
	- [76. How do you define columns and rows in CSS Grid?](#76-how-do-you-define-columns-and-rows-in-css-grid)
	- [77. What is the grid-template-columns and grid-template-rows property?](#77-what-is-the-grid-template-columns-and-grid-template-rows-property)
	- [78. How do you make a grid item span multiple columns or rows?](#78-how-do-you-make-a-grid-item-span-multiple-columns-or-rows)
	- [79. What is the grid-gap property, and how is it used?](#79-what-is-the-grid-gap-property-and-how-is-it-used)
	- [80. How do you align grid items in a CSS Grid layout?](#80-how-do-you-align-grid-items-in-a-css-grid-layout)
	- [81. How can you use media queries to create responsive designs with CSS Grid?](#81-how-can-you-use-media-queries-to-create-responsive-designs-with-css-grid)
	- [82. What is the difference between auto and fr in CSS Grid?](#82-what-is-the-difference-between-auto-and-fr-in-css-grid)
	- [83. What is the repeat() function in CSS Grid?](#83-what-is-the-repeat-function-in-css-grid)
	- [84. What is the minmax() function in CSS Grid?](#84-what-is-the-minmax-function-in-css-grid)
	- [85. How do you make a sticky header or footer using CSS?](#85-how-do-you-make-a-sticky-header-or-footer-using-css)
	- [86. What is the position: sticky property, and how does it work?](#86-what-is-the-position-sticky-property-and-how-does-it-work)
	- [87. What is the clip-path property, and how is it used?](#87-what-is-the-clip-path-property-and-how-is-it-used)
	- [88. How can you create custom shapes with CSS using clip-path?](#88-how-can-you-create-custom-shapes-with-css-using-clip-path)
	- [89. What is the backdrop-filter property in CSS?](#89-what-is-the-backdrop-filter-property-in-css)
	- [90. How can you create glassmorphism effects using CSS?](#90-how-can-you-create-glassmorphism-effects-using-css)
	- [91. What is the filter property in CSS, and how is it used?](#91-what-is-the-filter-property-in-css-and-how-is-it-used)
	- [92. What is the difference between position: relative and position: absolute?](#92-what-is-the-difference-between-position-relative-and-position-absolute)
	- [93. How do CSS counters work, and how can they be used?](#93-how-do-css-counters-work-and-how-can-they-be-used)
	- [94. What are CSS variables (custom properties), and how are they used?](#94-what-are-css-variables-custom-properties-and-how-are-they-used)
	- [95. How do you create a dark mode switch using CSS variables?](#95-how-do-you-create-a-dark-mode-switch-using-css-variables)
	- [96. What are CSS gradients, and how do you create linear and radial gradients?](#96-what-are-css-gradients-and-how-do-you-create-linear-and-radial-gradients)
	- [97. What is the background-clip property in CSS?](#97-what-is-the-background-clip-property-in-css)
	- [98. What is the object-fit property, and how does it work with images?](#98-what-is-the-object-fit-property-and-how-does-it-work-with-images)
	- [99. How can you create a responsive image gallery using CSS Grid or Flexbox?](#99-how-can-you-create-a-responsive-image-gallery-using-css-grid-or-flexbox)
	- [100. What is the :root pseudo-class in CSS, and how is it used with CSS variables?](#100-what-is-the-root-pseudo-class-in-css-and-how-is-it-used-with-css-variables)


## Basic CSS Questions

### 1. What is CSS, and why is it used?
### 2. What is the difference between an inline, internal, and external CSS?
### 3. How do you include external CSS in an HTML document?
### 4. What is the CSS color property used for?
### 5. What are CSS selectors, and how do they work?
### 6. What is the difference between class and ID selectors in CSS?
### 7. How do you group multiple selectors in CSS?
### 8. What are the different ways to apply CSS to a webpage?
### 9. How can you comment in CSS?
### 10. What is the box model in CSS?
### 11. Explain the difference between padding and margin in the box model.
### 12. What is the difference between border-box and content-box?
### 13. How do you center an element horizontally using CSS?
### 14. What is the display property in CSS, and what are its values?
### 15. What is the difference between block, inline, and inline-block display values?
### 16. How do you hide an element in CSS?
### 17. What is the position property, and what are its values?
### 18. What is the difference between absolute, relative, and fixed positioning?
### 19. How does the z-index property work in CSS?
### 20. How do you make an element float in CSS?
### 21. What is the clear property used for in CSS?
### 22. What is the overflow property in CSS?
### 23. How do you change the text color of an element using CSS?
### 24. How do you change the background color of an element?
### 25. What is the background-image property, and how can you use it?
### 26. How do you make the background image cover the entire area of an element?
### 27. How can you create a border around an element in CSS?
### 28. How do you make a rounded corner for a box using CSS?
### 29. What is the box-shadow property, and how do you use it?
### 30. How do you change the font size of an element in CSS?
### 31. How can you change the font of text using CSS?
### 32. What are web-safe fonts?
### 33. What is the font-family property in CSS?
### 34. How do you make text bold using CSS?
### 35. What is the text-align property used for?
### 36. How can you make text italic using CSS?
### 37. What is the line-height property used for in CSS?
### 38. What is the text-transform property, and how is it used?
### 39. What is the letter-spacing property, and how can it be used?
### 40. What is the word-spacing property?
### 41. How do you create a responsive layout using CSS?
### 42. What are media queries in CSS, and how do they work?
### 43. What is the purpose of the min-width and max-width properties?
### 44. How do you use the min-height and max-height properties?
### 45. How can you create a simple CSS animation?
### 46. What is the difference between CSS transitions and animations?
### 47. What is the @keyframes rule in CSS?
### 48. How do you change the opacity of an element in CSS?
### 49. What is the visibility property in CSS?
### 50. What are pseudo-classes in CSS? Can you give examples?
### 51. What are pseudo-elements in CSS? Can you give examples?
### 52. What is the hover pseudo-class in CSS?
### 53. What is the difference between the nth-child and nth-of-type pseudo-classes?
### 54. How do you style links in different states (visited, hover, active) using CSS?
### 55. What is the transition property, and how is it used?
### 56. How can you apply a transition effect when hovering over an element?
### 57. What are vendor prefixes, and why are they used in CSS?
### 58. What is the calc() function in CSS, and how can it be used?
### 59. What is the inherit keyword in CSS?
### 60. What is the initial keyword in CSS?
### 61. What is the !important rule, and when should it be used?
### 62. What is specificity in CSS, and how is it calculated?
### 63. How can you override CSS styles using specificity?
### 64. What is the CSS cascade, and how does it work?
### 65. How can you make text overflow with ellipsis in CSS?
### 66. What is the difference between inline CSS and embedded (internal) CSS?
### 67. What is the difference between visibility: hidden and display: none?

## Intermediate CSS Questions

### 68. What is Flexbox in CSS?
### 69. How do you center elements using Flexbox?
### 70. What is the justify-content property in Flexbox?
### 71. What is the align-items property in Flexbox?
### 72. What is the flex-wrap property, and how does it work?
### 73. How do you create a responsive grid layout using Flexbox?
### 74. What is CSS Grid Layout?
### 75. What is the difference between Flexbox and CSS Grid?
### 76. How do you define columns and rows in CSS Grid?
### 77. What is the grid-template-columns and grid-template-rows property?
### 78. How do you make a grid item span multiple columns or rows?
### 79. What is the grid-gap property, and how is it used?
### 80. How do you align grid items in a CSS Grid layout?
### 81. How can you use media queries to create responsive designs with CSS Grid?
### 82. What is the difference between auto and fr in CSS Grid?
### 83. What is the repeat() function in CSS Grid?
### 84. What is the minmax() function in CSS Grid?
### 85. How do you make a sticky header or footer using CSS?
### 86. What is the position: sticky property, and how does it work?
### 87. What is the clip-path property, and how is it used?
### 88. How can you create custom shapes with CSS using clip-path?
### 89. What is the backdrop-filter property in CSS?
### 90. How can you create glassmorphism effects using CSS?
### 91. What is the filter property in CSS, and how is it used?
### 92. What is the difference between position: relative and position: absolute?
### 93. How do CSS counters work, and how can they be used?
### 94. What are CSS variables (custom properties), and how are they used?
### 95. How do you create a dark mode switch using CSS variables?
### 96. What are CSS gradients, and how do you create linear and radial gradients?
### 97. What is the background-clip property in CSS?
### 98. What is the object-fit property, and how does it work with images?
### 99. How can you create a responsive image gallery using CSS Grid or Flexbox?
### 100. What is the :root pseudo-class in CSS, and how is it used with CSS variables?
