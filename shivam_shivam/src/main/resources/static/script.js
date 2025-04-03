'use strict';



const addEventOnElem = function (elem, type, callback) {
  if (!elem) return; // Prevent errors if elem is null
  
  if (NodeList.prototype.isPrototypeOf(elem)) {
    elem.forEach(el => el.addEventListener(type, callback));
  } else {
    elem.addEventListener(type, callback);
  }
};

/**
 * Navbar Toggle
 */
const navbar = document.querySelector("[data-navbar]");
const navbarLinks = document.querySelectorAll("[data-nav-link]");
const navbarToggler = document.querySelector("[data-nav-toggler]");

const toggleNav = () => {
  navbar?.classList.toggle("active");
  navbarToggler?.classList.toggle("active");
};

const closeNav = () => {
  navbar?.classList.remove("active");
  navbarToggler?.classList.remove("active");
};

addEventOnElem(navbarToggler, "click", toggleNav);
addEventOnElem(navbarLinks, "click", closeNav);

/**
 * Header Active on Scroll (Debounced for Performance)
 */
const header = document.querySelector("[data-header]");
const backTopBtn = document.querySelector("[data-back-top-btn]");

const handleScroll = () => {
  const isActive = window.scrollY >= 100;
  header?.classList.toggle("active", isActive);
  backTopBtn?.classList.toggle("active", isActive);
};

// Debounce scroll event to improve performance
let scrollTimeout;
window.addEventListener("scroll", () => {
  clearTimeout(scrollTimeout);
  scrollTimeout = setTimeout(handleScroll, 100);
});
