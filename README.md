This is my first android application made using android studio.
I made 4 activities in my application- splash_activity, mainActivity, signIn_activity and signUp_activity.
I did make use of Intent class to make transitions between different activities.
I also did use Handler class to set up my starting screen and for a 2500ms delay timer.
This program is basically like a account based app where you have option to either logIn or signUp where you could choose your desired button.
When you click on any button, you would receive confirmation about the button you pressed.
On clicking on logIn, you would be redirected to a new activity where you would receive a view to log In your credentials.
If you click on register, you would be directed to anothor activity where you would see an form to fill,where you would be asked to input your name,contact number,email ID and password.
When you click on register,you would be taked to the logIn activity where you could log In with your credentials and use the application.

NOTE- Since this is my first application, I only tried activity transitions and used a splash window and some delay timer.This application doesn't has any backend code written so pressing on any button would do nothing but change pages from mainActivity to LogIn and Register and Register to LogIn.
