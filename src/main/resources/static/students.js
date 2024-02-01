function writeBelow(){
    var nameField = document.getElementById("name");
    var infoLabel = document.getElementById("info");
    console.log(nameField.value);
    infoLabel.innerHTML = nameField.value;
}
function setId(id){
    var yesBtn= document.getElementById("btnDeleteYes");
    var href = yesBtn.href;
    href = href.replace("{id}", id);
    yesBtn.href = href;
}