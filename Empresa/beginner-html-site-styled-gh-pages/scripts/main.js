/*const miTitulo = document.querySelector('h1');
miTitulo.textContent = '¡Hola mundo!';
*/

let miHTML = document.querySelector('html');
miHTML.onclick = function(){
//document.querySelector('html').onclick = function() {
    alert('¡Ouch! ¡Deja de pincharme!');
}

//cambiar imagen
let miImage = document.querySelector('img');
miImage.onclick = function(){
    let miSrc = miImage.getAttribute('src');
    if (miSrc === 'images/firefox-icon.png') {
        miImage.setAttribute('src','images/firefox2.png');
    } else{
        miImage.setAttribute('src','images/firefox-icon.png')
    }
}

//boton
let miboton = document.querySelector('button');
let miTitulo = document.querySelector('h1');
function estableceNombreUsuario() {
    let miNombre = prompt('Ingresa su nombre. '); //crea cuadro de dialogo 
    
    /**
     * Este if sirve para que no haya ningun valor nulo
     */
    if (!miNombre) { 
        estableceNombreUsuario();
    } else {
        localStorage.setItem('nombre', miNombre); //crea y almacena un dato.   localStorage sirve para almacenar el nombre
       // miTitulo.textContent = 'Mozilla es genial, ' + miNombre;
       miTitulo.innerHTML = 'Mozilla es genial, ' + miNombre;
    }    
   
}

if (!localStorage.getItem('nombre')) { //comprueba si el elemento 'nombre' existe
    estableceNombreUsuario();
} else {
    let nombreAlmacenado = localStorage.getItem('nombre');
    miTitulo.textContent = 'Mozilla es genial' + nombreAlmacenado;
}

miboton.onclick = function() {
    estableceNombreUsuario();
}