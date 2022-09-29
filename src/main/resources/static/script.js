let mineEpisoder = [];

$(function() {
    hentEpisodene();
    $(".alleSpill").hide();

});

function visSpill(mittSpill) {
    $(".alleSpill").hide();
    let valget = "#" + mittSpill +"";
    console.log(valget)
    $(valget).show();
}

function hentEpisodene() {
    $.get("/hentEpisoder", function(episoder) {
        console.log(episoder);
        mineEpisoder = episoder;
        $("#episodeListe").html(episoder);
        lagEpisodeDropdown(episoder);})
}

function lagEpisodeDropdown(episoder) {
    let ut = "<select class='dropdown' style='width:200px' name='episoder' id='valgtEpisode' onchange='visEpisode(valgtEpisode.value)'><option value='' selected disabled hidden>Velg Episode</option>";
    for (const episode of episoder) {
        ut += "<option value='" + episode.nummer + "'> Episode nr " + episode.nummer + " - " + episode.tittel + "</option>";
    }
    $("#episodeDropdown").html(ut);
}

function visEpisode(nr) {
    console.log(mineEpisoder);
    let ut = ""
    for (const episode of mineEpisoder) {
        if(episode.nummer == nr) {
            console.log(episode.nummer)
            console.log(nr)
            ut += "<h3>Episode nr " + episode.nummer + "</h3>" + "<h4>Tittel:</h4>" + episode.tittel + "<br>" +
                "<h4>Beskrivelse:</h4>" + episode.beskrivelse + "<br>" + episode.url + "<strong>Utgitt: </strong>" + episode.dato;
        }
    }
    $("#episoden").html(ut);
}

