//toogle class active untuk coffee menu
const navbarNav = document.querySelector('.navbar-nav');

//ketika coffee menu di klik
document.querySelector('#coffee-menu').onclick = () =>{
    navbarNav.classList.toggle('active');
};

// Toogle class active untuk search form menu
const searchForm = document.querySelector('.search-form');
const searchBox = document.querySelector('#search-box');

document.querySelector('#search-button').onclick = (e) => {
    searchForm.classList.toggle('active');
    searchBox.focus();
    e.preventDefault();
}

//Toggle class active untuk shopping cart 
const shoppingForm = document.querySelector('.shopping-cart')

//Ketika shopping cart di klik
document.querySelector('#shopping-cart-button').onclick = (e) => {
    shoppingForm.classList.toggle('active');
    e.preventDefault();
}


//klik di luar element
const hm = document.querySelector('#coffee-menu');
const sb = document.querySelector('#search-button');
const sc = document.querySelector('#shopping-cart-button')

document.addEventListener('click', function(e){
    if (!hm.contains(e.target) && !navbarNav.contains(e.target)){
        navbarNav.classList.remove('active');
    }
    if (!sb.contains(e.target) && !searchForm.contains(e.target)){
        searchForm.classList.remove('active');
    }
    if (!sc.contains(e.target) && !shoppingForm.contains(e.target)){
        shoppingForm.classList.remove('active');
    }
})

//modal box
const itemDetailModal = document.querySelector ('#item-detail-modal');
const itemDetailButtons = document.querySelectorAll ('.item-detail-button')

itemDetailButtons.forEach((btn) => {
    btn.onclick = (e) => {
        itemDetailModal.style.display = 'flex';
        e.preventDefault();
    };
})



//klik tombol close modal
document.querySelector('.modal .close-icon').onclick = (e) => {
    itemDetailModal.style.display = 'none';
    e.preventDefault();
};

//klik di luar modal
window.onclick = (e) => {
    if (e.target == itemDetailModal ) {
        itemDetailModal.style.display = 'none';
    }

}

