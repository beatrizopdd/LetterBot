let site = document.URL;
console.log(site);

var botao;
botao = document.getElementsByClassName("menuBotao");
botao[0].onclick = mostraMenu;

function mostraMenu() {
	console.log("foi");
}