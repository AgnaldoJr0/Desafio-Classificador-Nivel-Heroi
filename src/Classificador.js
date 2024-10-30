let nomeHeroi = "Juramir";
let xpHeroi = 9003;
let classificador

switch (true) {
    case xpHeroi < 1000:
        classificador = "Ferro" 
        break;
    case xpHeroi >= 1001 && xpHeroi <= 2000:
        classificador = "Bronze";
        break;
    case xpHeroi >= 2001 && xpHeroi <= 5000:
        classificador = "Prata";
        break;
    case xpHeroi >= 5001 && xpHeroi <= 7000:
        classificador = "Ouro";
        break;
    case xpHeroi >= 7001 && xpHeroi <= 8000:
        classificador = "Platina";
        break;
    case xpHeroi >= 8001 && xpHeroi <= 9000:
        classificador = "Ascendente";
        break;
    case xpHeroi >= 9001 && xpHeroi <= 10000:
        classificador = "Imortal";
        break;
    case xpHeroi >= 10001:
        classificador = "Radiante";
        break;
    default:
        console.log("Heroi ainda não iniciou á sua jornada")
}

console.log("O Herói de nome " + nomeHeroi + " está no nível de" + classificador);