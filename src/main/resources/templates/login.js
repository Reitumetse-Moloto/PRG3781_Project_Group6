const username = document.getElementById('Uname');
const password = document.getElementById('Pass');
const errorElement = document.getElementById ('error')

login.addEventLisnter('button', (e) =>{
    let messages = []
    if (username.value === '' || username.value == null) {
        messages.push('Name is required')
    }
    if(password.value.length <=6){
        message.push('Password must be longer than x characters')
    }
    if(password.value.length >=20){
        message.push('Password cannot be longer than x characters')
    }
    if(password.value === 'password','1234567'){
        message.push('Password cannot be pssword or 1234')
    }
    if(password.length > 0)
    e.preventDefult();
    errorElement.innertext = message.join(', ')
} )