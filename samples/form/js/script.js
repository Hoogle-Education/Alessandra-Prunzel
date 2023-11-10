const buttonSubmit = document.querySelector('#buttonSubmit')

buttonSubmit.addEventListener('click', validate)

const validate = (event) => {
  event.preventDefault() // TODO remove after
  const emailField = document.getElementById('email') 

  console.log(isEmailValid(emailField.value))

}

// falsy values = '', undefined, null, 0
function isEmailValid(email) {
  if(!email) return false

  // teste@gmail.com = ['teste', 'gmail.com']
  const data = email.split('@')
  if(data.length != 2) return false
  if(!data[0] || !data[1]) return false
  
  // gmail.com = ['gmail', 'com']
  const sufix = data[1].split('.')
  if(data.length != 2) return false
  if(!sufix[0] || !sufix[1]) return false

  return true
}