// Пожалуйста, не меняй код ниже. Он необходим для правильной настройки позиционирования элементов :)
let team1 = document.querySelector('.team1')
let team2 = document.querySelector('.team2')
let team3 = document.querySelector('.team3')
let height = Math.max(parseInt(getComputedStyle(team1).getPropertyValue('height')), parseInt(getComputedStyle(team2).getPropertyValue('height')), parseInt(getComputedStyle(team3).getPropertyValue('height')))
team1.style.height = `${height}px`
team2.style.height = `${height}px`
team3.style.height = `${height}px`

// Функция, которую нужно вызвать при клике на стрелку
function scrollDown() {
    window.scrollTo({top: window.innerHeight, behavior: 'smooth' });
}

// Исправь ошибки, допущенные при обработке события
let button = document.querySelector('.arrow-next')
button.addEventListener("click", scrollDown)
