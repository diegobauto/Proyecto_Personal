# Omega Sidebar Responsive Navigation
[English]
Omega is a nice responsive sidebar in pure javascript.  
[French] 
Omega est une jolie sidebar responsive en pure javascript.

#### Demonstration
[French documentation & Démonstration](https://src.yann-cario.fr/demo/omega-sidebar-responsive)


# Use  
Omega Sidebar is very easy to use. Start by loading the CSS and Javascript files.  

CSS  
```html
<link rel="stylesheet" href="path/to/omega.css">
```
JS  
```html
<script src="path/to/omega.js"></script>
```

#### HTML code
Then copy the HTML code from the menu and the sidebar. (of course, to modify according to your project).
HTML  
```html
<div id="omega">
<a href="#" id="logo">Sitename</a>
<div id="omega-content">

<nav>
<ul>
<li><a href="#">Home</a></li>
<li><a href="#">Page 1</a></li>
<li><a href="#">Page 2</a></li>
<li><a href="#">Contact</a></li>
</ul>
</nav>

<div class="omega-links">
<a href="#" class="button">Link</a>
<a href="#" class="button button-outline ">Link 2</a>
</div>
</div>

<button id="omega-button">&#9776;</button>
<div id="omega-sidebar">
<div id="omega-sidebar-header"></div>
<div id="omega-sidebar-body"></div>
</div>
<div id="omega-overlay"></div>

</div>
```

The animation of the sidebar is in the omega-sidebar ID of the omega.css file. You can change it as you see fit.
```css
#omega-sidebar{
...
transition: transform .2s ease-in-out;
}
```

The sidebar menu icons use the [FontAwasome](https://fontawesome.com/) library with their associated Unicodes
```css
#omega-sidebar-body nav ul li:first-child:before {
    content: "\f015";
    font-family: "Font Awesome 5 Free";
    font-weight: 900;
}
```

Each icon uses the selector: nth-child according to the order of appearance of the links of the menu.
```css
#omega-sidebar-body nav ul li:nth-child(2):before {
    content: "\f15c";
}
```
## Updates
#### 1.0
- N/C