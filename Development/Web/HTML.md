<center><h1> HTML </h1> </center>

- [HTML Intro](#html-intro)
  - [What is HTML?](#what-is-html)
  - [HTML vs HTML 5](#html-vs-html-5)
  - [HTML vs XHTML](#html-vs-xhtml)
    - [What is XHTML?](#what-is-xhtml)
    - [Why XHTML?](#why-xhtml)
  - [Structure of a simple HTML and HTML 5 Document](#structure-of-a-simple-html-and-html-5-document)
- [HTML Elements or Tags](#html-elements-or-tags)
  - [HTML Attributes](#html-attributes)
- [HTML Head Section](#html-head-section)
  - [The `meta` tag](#the-meta-tag)
  - [The `linik` tag](#the-linik-tag)
  - [The `style` tag](#the-style-tag)
  - [The `base` tag](#the-base-tag)
  - [The `script` tag](#the-script-tag)
  - [The `title` tag](#the-title-tag)
- [HTML Headings](#html-headings)
- [HTML Paragraphs](#html-paragraphs)
- [HTML Text Formatting](#html-text-formatting)
- [HTML Quotation and Citation Elements](#html-quotation-and-citation-elements)
- [HTML Comments](#html-comments)
- [HTML Colours](#html-colours)
- [HTML Style and CSS](#html-style-and-css)
- [HTML Links](#html-links)
- [HTML Images](#html-images)
- [HTML Tables](#html-tables)
- [HTML Lists](#html-lists)
- [HTML Block \& Inline](#html-block--inline)
- [HTML Division](#html-division)
- [HTML Class](#html-class)
- [HTML Id](#html-id)
- [HTML iFrame](#html-iframe)
- [HTML JavaScript](#html-javascript)
- [HTML Layout](#html-layout)
- [HTML Responsive](#html-responsive)
- [HTML Computer Code](#html-computer-code)
- [HTML Semantics](#html-semantics)
- [HTML Input](#html-input)
- [HTML Forms](#html-forms)
- [HTML Graphics](#html-graphics)
  - [HTML Canvas](#html-canvas)
  - [HTML SVG](#html-svg)
- [HTML Media](#html-media)
  - [HTML Media](#html-media-1)
  - [HTML Video](#html-video)
  - [HTML Audio](#html-audio)
  - [HTML Plug-ins](#html-plug-ins)
  - [HTML YoutTube](#html-youttube)
- [HTML APIs](#html-apis)
  - [HTML Geolocation](#html-geolocation)
  - [HTML Drag/Drop](#html-dragdrop)
  - [HTML Web Storage](#html-web-storage)
  - [HTML Web Workers](#html-web-workers)
  - [HTML SSE](#html-sse)


# HTML Intro

## What is HTML?

<ul>
  <li>HTML stands for Hyper Text Markup Language</li>
  <li>HTML is the standard markup language for creating Web pages</li>
  <li>HTML describes the structure of a Web page</li>
  <li>HTML consists of a series of elements</li>
  <li>HTML elements tell the browser how to display the content</li>
</ul>
<hr/>

## HTML vs HTML 5
<ol>
  <li>
    Introduction and Development
    <ul>
      <li>
        HTML:
        <ul>
          <li>Introduced in 1991 by Tim Berners-Lee.</li>
          <li>The foundational version of web markup.</li>
          <li>
            Developed over various versions (HTML 2.0, HTML 3.2, HTML 4.01).
          </li>
        </ul>
      </li>
      <li>
        HTML5:
        <ul>
          <li>
            Announced in 2008 by the Web Hypertext Application Technology
            Working Group (WHATWG).
          </li>
          <li>Officially recommended by W3C in 2014.</li>
          <li>
            Built on the foundation of HTML but adds new features and
            capabilities.
          </li>
        </ul>
      </li>
    </ul>
  </li>
  <li>
    Syntax and Structure
    <ul>
      <li>
        HTML:
        <ul>
          <li>Basic structure: Doctype declaration, head, and body.</li>
          <li>Limited in terms of semantic tags and attributes.</li>
        </ul>
      </li>
      <li>
        HTML5:
        <ul>
          <li>
            Simplified and more flexible doctype declaration: &lt;!DOCTYPE
            html&gt;.
          </li>
          <li>
            Enhanced semantic structure with new tags like &lt;header&gt;,
            &lt;footer&gt;, &lt;article&gt;, &lt;section&gt;, and &lt;nav&gt;.
          </li>
          <li>
            Introduced new attributes and forms elements for better data
            handling and input types.
          </li>
        </ul>
      </li>
    </ul>
  </li>
  <li>
    Multimedia Support
    <ul>
      <li>
        HTML:
        <ul>
          <li>Limited support for multimedia.</li>
          <li>
            Required third-party plugins like Flash and Silverlight for audio
            and video.
          </li>
        </ul>
      </li>
      <li>
        HTML5:
        <ul>
          <li>
            Native support for multimedia elements: &lt;audio&gt;,
            &lt;video&gt;.
          </li>
          <li>
            Provides better control and integration of multimedia content.
          </li>
        </ul>
      </li>
    </ul>
  </li>
  <li>
    Graphics and Animations
    <ul>
      <li>
        HTML:
        <ul>
          <li>
            Relied on external plugins and technologies for graphics and
            animations.
          </li>
        </ul>
      </li>
      <li>
        HTML5:
        <ul>
          <li>
            Introduced the &lt;canvas&gt; element for drawing graphics using
            JavaScript.
          </li>
          <li>Integrated support for scalable vector graphics (SVG).</li>
        </ul>
      </li>
    </ul>
  </li>
  <li>
    APIs and Functionality
    <ul>
      <li>
        HTML:
        <ul>
          <li>
            Limited API support; relied on external libraries and plugins.
          </li>
        </ul>
      </li>
      <li>
        HTML5: Provides new APIs and enhanced functionalities:
        <ul>
          <li>Geolocation API for location-based services.</li>
          <li>Drag-and-drop API for better user interactions.</li>
          <li>
            Web Storage API (localStorage and sessionStorage) for client-side
            data storage.
          </li>
          <li>
            Web Workers for background processing without affecting the user
            interface.
          </li>
          <li>WebSockets for real-time communication.</li>
        </ul>
      </li>
    </ul>
  </li>
  <li>
    Browser Compatibility
    <ul>
      <li>
        HTML:
        <ul>
          <li>Supported by all browsers but may lack modern features.</li>
        </ul>
      </li>
      <li>
        HTML5:
        <ul>
          <li>
            Widely supported by modern browsers (Chrome, Firefox, Safari, Edge).
          </li>
          <li>
            Some features might not be fully supported by older browsers,
            requiring polyfills or fallbacks.
          </li>
        </ul>
      </li>
    </ul>
  </li>
  <li>
    Performance and Mobile Support
    <ul>
      <li>
        HTML:
        <ul>
          <li>
            Less optimized for modern web applications and mobile devices.
          </li>
        </ul>
      </li>
      <li>
        HTML5:
        <ul>
          <li>Improved performance and responsiveness.</li>
          <li>
            Better suited for mobile devices with enhanced touch support and
            responsive design features.
          </li>
        </ul>
      </li>
    </ul>
  </li>
  <li>
    SEO and Accessibility
    <ul>
      <li>
        HTML:
        <ul>
          <li>Basic support for SEO and accessibility.</li>
          <li>
            Limited use of semantic tags affects search engine ranking and
            accessibility.
          </li>
        </ul>
      </li>
      <li>
        HTML5:
        <ul>
          <li>Enhanced semantic elements improve SEO.</li>
          <li>
            Better support for accessibility features, making content more
            accessible to screen readers and assistive technologies.
          </li>
        </ul>
      </li>
    </ul>
  </li>
</ol>


<hr/>

## HTML vs XHTML

### What is XHTML?

<ul>
	<li>XHTML stands for EXtensible HyperText Markup Language</li>
	<li>XHTML is a stricter, more XML-based version of HTML</li>
	<li>XHTML is HTML defined as an XML application</li>
	<li>XHTML is supported by all major browsers</li>
</ul>

### Why XHTML?

XML is a markup language where all documents must be marked up correctly (be
"well-formed"). <br/>
XHTML was developed to make HTML more extensible and flexible to work with
other data formats (such as XML). In addition, browsers ignore errors in HTML
pages, and try to display the website even if it has some errors in the
markup. So XHTML comes with a much stricter error handling.

<hr/>

## Structure of a simple HTML and HTML 5 Document

HTML:
```
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <title>Hello, World!</title>
</head>
<body>
    <h1>Hello, World!</h1>
</body>
</html>
```
HTML 5:
```
<!DOCTYPE html>
<html>
<head>
    <title>Hello, World!</title>
</head>
<body>
    <h1>Hello, World!</h1>
</body>
</html>
```

<hr/>

# HTML Elements or Tags

An HTML element is defined by a start tag, some content, and an end tag.

Here is a list of void elements (self-closing tags) in HTML5:
<ul>
	<li><code>&lt;area&gt;</code> - Defines a clickable area within an image map. <a href="https://www.w3schools.com/tags/tag_area.asp" target="_blank">Link</a></li>
	<li><code>&lt;base&gt;</code> - Specifies a base URL for relative URLs in a document.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;br&gt;</code> - Inserts a line break.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;col&gt;</code> - Specifies column properties for an HTML table column group.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;command&gt;</code> (deprecated) - Defines a command that a user can invoke.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;embed&gt;</code> - Embeds external content (such as multimedia) into the document.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;hr&gt;</code> - Creates a thematic break or horizontal line.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;img&gt;</code> - Embeds an image.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;input&gt;</code> - Defines an input control (like text fields, checkboxes, etc.).<a href="" target="_blank">Link</a></li>
	<li><code>&lt;keygen&gt;</code> (deprecated) - Generates a key pair for form submission.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;link&gt;</code> - Defines relationships between the current document and external resources (usually for linking stylesheets).<a href="" target="_blank">Link</a></li>
	<li><code>&lt;meta&gt;</code> - Defines metadata about an HTML document.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;param&gt;</code> - Defines parameters for plugins (like <code>&lt;object&gt;</code>).<a href="" target="_blank">Link</a></li>
	<li><code>&lt;source&gt;</code> - Specifies multiple media resources for elements like <code>&lt;audio&gt;</code> and <code>&lt;video&gt;</code>.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;track&gt;</code> - Provides text tracks for <code>&lt;video&gt;</code> and <code>&lt;audio&gt;</code> elements.<a href="" target="_blank">Link</a></li>
	<li><code>&lt;wbr&gt;</code> - Suggests an optional line break opportunity within text.<a href="" target="_blank">Link</a></li>
</ul>

<hr/>

## HTML Attributes

-	All HTML elements can have attributes
-	Attributes provide additional information about elements
-	Attributes are always specified in the start tag
-	Attributes usually come in name/value pairs like: name="value"

<hr/>

# HTML Head Section
<ul>
    <li>The &lt;head&gt; section of an HTML document is used to define metadata and links to external resources.</li>
    <li>It is not displayed directly on the webpage but provides crucial information for browsers and search engines.</li>
</ul>

## The `meta` tag
<ul>
  <li>The &lt;meta&gt; tag defines metadata about an HTML document.</li>
  <li>Metadata is data (information) about data.</li>
  <li>Metadata is used by browsers (how to display content or reload page), search engines (keywords), and other web services.</li>
</ul>

## The `linik` tag
## The `style` tag
## The `base` tag
## The `script` tag
## The `title` tag


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
