function openContactForm() {
    document.getElementById("contactPopup").style.display = "block";
  }

  function closeContactForm() {
    document.getElementById("contactPopup").style.display = "none";
  }

  function submitForm() {
    var statusElement = document.querySelector(".submitStatus");
      statusElement.innerText = "Submitted";

      setTimeout(function() {
        statusElement.innerText = "";
      }, 5000);

      document.getElementById("contactForm").reset();
  }