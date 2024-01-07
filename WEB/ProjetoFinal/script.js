function openContactForm() {
    document.getElementById("contactPopup").style.display = "block";
  }

  function closeContactForm() {
    document.getElementById("contactPopup").style.display = "none";
  }

  function submitForm() {
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var message = document.getElementById('message').value;
    var statusElement = document.querySelector(".submitStatus");

    if (name !== '' && email !== '' && message !== '') {
      statusElement.innerText = "Submitted";

      setTimeout(function() {
        statusElement.innerText = "";
      }, 5000);

      document.getElementById("contactForm").reset();
  }
}