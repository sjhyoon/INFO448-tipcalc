# INFO448-tipcalc

# Stories

As a user, when I launch the application, I should see a text edit (labeled "Amount") allowing me to enter the service charge, and a pushbutton labeled "Tip". The "Tip" pushbutton should be disabled.

As a user, when I enter data into the service charge textedit, only numbers should be allowed.

As a user, when I enter data into the service charge textedit, it should read like a USD currency amount ("$15.23"); two decimal places, and prefixed by "$".

As a user, when I enter data into the service charge textedit, it should enable the "Tip" pushbutton.

As a user, when I push the "Tip" pushbutton, it should calculate the tip (15% of the value in the service charge textedit) and display that value in a Toast message. The value displayed should be displayed as USD currency ("$15.23"): two decimal places, prefixed by "$".

# Grading

repo should be called 'tipcalc'

repo should contain all necessary build artifacts

include a directory called "screenshots" w/screenshot of app running on emulator

5 pts, 1 per story

# Extra Credit (2 pts)

add a spinner or some other control to choose the tip amount: 10%, 15%, 18% or 20%, and calculate accordingly (1 pt)

make sure that only two decimal points ever appear, and that the math is always correct (1 pt)
