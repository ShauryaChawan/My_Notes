<center><h1> HTML </h1> </center>

- [1. HTML Intro](./HTML/1.%20HTML-Intro.md)
- [2. HTML Elements](./HTML/2.%20HTML-Elements.md)

# HTML Head Section
<ul>
    <li>The &lt;head&gt; section of an HTML document is used to define metadata and links to external resources.</li>
    <li>It is not displayed directly on the webpage but provides crucial information for browsers and search engines.</li>
</ul>

## The `meta` tag
[Link](https://www.w3schools.com/tags/att_meta_name.asp)
<ul>
  <li>The &lt;meta&gt; tag defines metadata about an HTML document.</li>
  <li>Metadata is data (information) about data.</li>
  <li>Metadata is used by browsers (how to display content or reload page), search engines (keywords), and other web services.</li>
</ul>

```
<head>
  <meta charset="UTF-8">
  <meta name="description" content="A brief description of the page">
  <meta name="keywords" content="HTML, CSS, JavaScript">
  <meta name="author" content="Author Name">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="generator" content="FrontPage 4.0">
  <meta http-equiv="content-security-policy" content="default-src 'self'">
  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <meta http-equiv="default-style" content="the document's preferred stylesheet">
  <meta http-equiv="refresh" content="300">
</head>
```
Attributes of <meta> tag:
-	`charset`: Specifies the character encoding for the HTML document
    - Value: character_set
-	`content`: Specifies the value associated with the `http-equiv` or `name` attribute
    - Value: text 
- `name`: Specifies a name for the metadata
    - `application-name`: Specifies the name of the Web application that the page represents
    - `author`: Specifies the name of the author of the document.
    - `description`: Specifies a description of the page. Search engines can pick up this description to show with the results of searches.
    - `generator`: Specifies one of the software packages used to generate the document (not used on hand-authored pages).
    - `keywords`: Specifies a comma-separated list of keywords - relevant to the page (Informs search engines what the page is about).
    - `viewport`: Controls the viewport (the user's visible area of a web page).
- `http-equiv`: Provides an HTTP header for the information/value of the content attribute
    - `content-security-policy`: Specifies a content policy for the document.
    - `content-type`: Specifies the character encoding for the document.
    - `default-style`: Specified the preferred style sheet to use.
    - `refresh`: Defines a time interval for the document to refresh itself.


## The `link` tag

[Link](https://www.w3schools.com/tags/tag_link.asp)

-	The `<link>` tag defines the relationship between the current document and an external resource.
-	It is most often used to link to external style sheets or to add a favicon to website.
-	It is an empty element and contains only attributes.

```
<head>
  <link rel="stylesheet" href="styles.css">
  <link href="tag_link.asp" rel="parent" rev="subsection" hreflang="en">
  <link rel="stylesheet" type="text/css" href="theme.css">
  <link rel="stylesheet" type="text/css" href="print.css" media="print">
  <link rel="icon" href="demo_icon.gif" type="image/gif" sizes="16x16">
</head>
```

Attributes of <link> tag:

- `crossorigin`: Specifies how the element handles cross-origin requests
    - Value: 
        - `anonymous`
        - `use-credentials`
- `href`: Specifies the location of the linked document
    - Value: URL
- `hreflang`: Specifies the language of the text in the linked document
    - Value: language_code
- `media`: Specifies on what device the linked document will be displayed
    - Value: 	media_query
- `referrerpolicy`: Specifies which referrer to use when fetching the resource
    - Value: 
        - `no-referrer`: No referrer information will be sent along with a request.
        - `no-referrer-when-downgrade`: (Default). The referrer header will not be sent to origins without HTTPS
        - `origin`: Send only scheme, host, and port to the request client
        - `origin-when-cross-origin`:  For cross-origin requests: Send only scheme, host, and port. For same-origin requests: Also include the path
        - `same-origin`: For same-origin requests: Referrer info will be sent. For cross-origin requests: No referrer info will be sent
        - `strict-origin`: Only send referrer info if the security level is the same (e.g. HTTPS to HTTPS). Do not send to a less secure destination (e.g. HTTPS to HTTP)
        - `strict-origin-when-cross-origin`: Send full path when performing a same-origin request. Send only origin when the security level stays the same (e.g. HTTPS to HTTPS). Send no header to a less secure destination (HTTPS to HTTP)
        - `unsafe-url`: Send origin, path and query string (but not fragment, password, or username). This value is considered unsafe
    - Example:

```
<iframe src="https://w3schools.com/" referrerpolicy="no-referrer"></iframe>
```

<hr>

## The `style` tag

[Link](https://www.w3schools.com/tags/tag_style.asp)

The `<style>` tag is used to define style information (CSS) for a document.

Attributes:
- `media`: Specifies what media/device the media resource is optimized for
    - Value: media_query
- `type`: Specifies the media type of the `<style>` tag
    - Value: text/css

Example: 
```
<head>
  <style>
    h1 {color:red;}
    p {color:blue;}
  </style>
</head>
```
```
<head>
  <style media="print">
    h1 {color:#000000;}
    p {color:#000000;}
    body {background-color:#FFFFFF;}
  </style>
</head>
```
```
<head>
  <style type="text/css">
    h1 {color:red;}
    p {color:blue;}
  </style>
</head>
```

<hr/>

## The `base` tag

[Link](https://www.w3schools.com/tags/tag_base.asp)

- The `<base>` tag specifies the base URL and/or target for all relative URLs in a document.
- It must have either an href or a target attribute present, or both.
- There can only be one single `<base>` element in a document

Attributes:
- `href`: Specifies the base URL for all relative URLs in the page
    - Value: URL
- `target`: Specifies the default target for all hyperlinks and forms in the page
    - Value: 
        - `_blank`
        - `_parent`
        - `_self`
        - `_top`

Example:
```
<head>
  <base href="https://www.w3schools.com/" target="_blank">
</head>
```

<hr/>

## The `script` tag

[Link](https://www.w3schools.com/tags/tag_script.asp)

- The `<script>` tag is used to embed a client-side script (JavaScript).
- The `<script>` element either contains scripting statements, or it points to an external script file through the `src` attribute.

Example: 
```
<head>
  <script>
    document.getElementById("demo").innerHTML = "Hello JavaScript!";
  </script>
</head>
```

Attributes:
- `async`: Specifies that the script is downloaded in parallel to parsing the page, and executed as soon as it is available (before parsing completes) (only for external scripts)
    - Value: `async`
  
- `crossorigin`: Sets the mode of the request to an HTTP CORS Request
    - Value:
        - `anonymous`
        - `use-credentials`
- `defer`: 	Specifies that the script is downloaded in parallel to parsing the page, and executed after the page has finished parsing (only for external scripts)
    - Value: `defer`
- `integrity`: Allows a browser to check the fetched script to ensure that the code is never loaded if the source has been manipulated
    - Value: filehash
- `nomodule`: Specifies that the script should not be executed in browsers supporting ES2015 modules
    - Value:
        - `True`
        - `False`
- `referrerpolicy`: Specifies which referrer to use when fetching the resource
    - Value: 
        - `no-referrer`: No referrer information will be sent along with a request.
        - `no-referrer-when-downgrade`: (Default). The referrer header will not be sent to origins without HTTPS
        - `origin`: Send only scheme, host, and port to the request client
        - `origin-when-cross-origin`:  For cross-origin requests: Send only scheme, host, and port. For same-origin requests: Also include the path
        - `same-origin`: For same-origin requests: Referrer info will be sent. For cross-origin requests: No referrer info will be sent
        - `strict-origin`: Only send referrer info if the security level is the same (e.g. HTTPS to HTTPS). Do not send to a less secure destination (e.g. HTTPS to HTTP)
        - `strict-origin-when-cross-origin`: Send full path when performing a same-origin request. Send only origin when the security level stays the same (e.g. HTTPS to HTTPS). Send no header to a less secure destination (HTTPS to HTTP)
        - `unsafe-url`: Send origin, path and query string (but not fragment, password, or username). This value is considered unsafe
- `src`: Specifies the URL of an external script file
    - Value: URL
- `type`: Specifies the media type of the script
    - Value: scripttype
<hr/>

## The `title` tag

- The `<title>` tag defines the title of the document. 
- The title must be text-only, and it is shown in the browser's title bar or in the page's tab.
- It is required in HTML documents!
- The contents of a page title is very important for search engine optimization (SEO)
- The page title is used by search engine algorithms to decide the order when listing pages in search results.
- The <title> element:
    - defines a title in the browser toolbar
    - provides a title for the page when it is added to favorites
    - displays a title for the page in search-engine results
    - 
<hr/>



# HTML Headings
# HTML Paragraphs
# HTML Text Formatting
# HTML Quotation and Citation Elements
# HTML Comments
# HTML Colours
# HTML Style and CSS
# HTML Links
# HTML Images
# HTML Tables
# HTML Lists
# HTML Block & Inline
# HTML Division
# HTML Class
# HTML Id
# HTML iFrame
# HTML JavaScript
# HTML Layout
# HTML Responsive
# HTML Computer Code
# HTML Semantics
# HTML Input
# HTML Forms
# HTML Graphics
## HTML Canvas
## HTML SVG

# HTML Media
## HTML Media
## HTML Video
## HTML Audio
## HTML Plug-ins
## HTML YoutTube

# HTML APIs
## HTML Geolocation
## HTML Drag/Drop
## HTML Web Storage
## HTML Web Workers
## HTML SSE
