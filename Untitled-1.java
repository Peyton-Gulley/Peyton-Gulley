     // Handle form submission
    document.getElementById('submitButton').addEventListener('click', function() {
      var name = document.getElementById('name').value;
      var email = document.getElementById('email').value;
      var message = document.getElementById('message').value;

      // Perform validation (you can add more validation logic here)
      if (name.trim() === '' || email.trim() === '' || message.trim() === '') {
        alert('Please fill in all the fields');
        return;
      }

      // Perform your desired action with the form data (e.g., send an email)
      // Here, we'll simply log the form data to the console
      console.log('Name: ' + name);
      console.log('Email: ' + email);
      console.log('Message: ' + message);

      // Clear the form fields after submission
      document.getElementById('name').value = '';
      document.getElementById('email').value = '';
      document.getElementById('message').value = '';

      // Show a success message
      alert('Your message has been sent!');
    });