package engine;

public enum Sound {
    BOING("../ressources/sons/boing.wav"),
    FUNNYSLIP("../ressources/sons/funnySlip.wav"),
    METALCLANG("../ressources/sons/metalClang2.wav"),
    POUET("../ressources/sons/pouet.wav"),
    FAIL("../ressources/sons/gameover.wav"),
    ESSAIE("../ressources/sons/EssaieEncore(Loic).wav"),
    WIN1("../ressources/sons/incredible.wav"),
    WIN2("../ressources/sons/cool.wav"),
    WIN3("../ressources/sons/unbelievable.wav"),
    CHOIXDIF("../ressources/sons/ChoixDifficulte(Damien).wav"),
    COUNTDOWN321("../ressources/sons/countdown321.wav"),
    SCORES("../ressources/sons/scores.wav"),
    
    LANCEMENT("../ressources/sons/LancementDuJeu(Damien).wav"),
    AIDEMEMORY("../ressources/sons/RegleDuJeuMemory(Damien).wav"),

    AIDEMOSQUITO("../ressources/sons/RegleDuJeuMosquitoDamien.wav"),

    AIDEACCUEIL("../ressources/sons/AideAccueil(Damien).wav"),
    MESSAGEACCUEIL("../ressources/sons/MessageAccueil(Damien).wav");

    public String getUrl() {
        return url;
    }

    private String url;

    Sound(String url) {
        this.url = url;
    }
}
