const loginbox = document.querySelector('.loginbox')
const registerLink = document.querySelector('.register-link')
const loginLink = document.querySelector('.login-link')

registerLink.onclick =() => {
    loginbox.classList.add('active');
}

loginLink.onclick =() => {
    loginbox.classList.remove('active');
}
