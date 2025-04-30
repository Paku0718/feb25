// // script.js

// // Toggle mobile navigation menu
// const burger = document.getElementById('burger');
// const navLinks = document.getElementById('navLinks');

// burger.addEventListener('click', () => {
//     navLinks.classList.toggle('active');
//     // Animate burger icon (toggle into X)
//     burger.classList.toggle('toggle');
// });

document.addEventListener('DOMContentLoaded', function() {
    // Mobile menu toggle
    const burger = document.getElementById('burger');
    const navLinks = document.getElementById('navLinks');
    
    burger.addEventListener('click', function() {
        navLinks.classList.toggle('active');
        burger.classList.toggle('toggle');
    });
    
    // Close mobile menu when clicking outside
    document.addEventListener('click', function(event) {
        if (!event.target.closest('#navLinks') && !event.target.closest('#burger')) {
            if (navLinks.classList.contains('active')) {
                navLinks.classList.remove('active');
                burger.classList.remove('toggle');
            }
        }
    });
    
    // Add smooth scrolling for anchor links
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function(e) {
            const href = this.getAttribute('href');
            
            if(href !== "#") {
                e.preventDefault();
                
                document.querySelector(href).scrollIntoView({
                    behavior: 'smooth'
                });
            }
        });
    });
});