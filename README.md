# Paint-Application

Application opens , User has the following features which he/she can use

1.User can create a New File and it has support for drawing 3 shapes Rectangle,Circle and Line and Color them, also user can choose to delete an earlier drawn shape using the erase function.

The drawing functionality i have hardcoded it such that it always draws a these 3 shapes with some fixed color, but that can be easiliy changed so that based on user's wish he/she can draw any of the 3 shapes any number of times and can color them and delete an earlier drawn shape.

2.After user has finished drawing in the paint board , user is prompted to Save the file .
If User decides to save the file: then User is prompted to specify the id with which he/she wants to save the file.
If the specified filename does not allready exist then file is successfully saved in this format "file"+id+".ser" format . for e.g file2.ser
if File name allready exists then user is displayed the message that the File allready exists please save ur file with a different name.

For this Saving Functionality : I have used the Java Serializable interface to Save my Paint Object (i.e the board in which user has drawn) in a file as a ".ser" file in the working directory.

3.User is next asked whether they want to Open an Existing file - and if the file is existing in the working directory then it opens up successfully as a object of Paint and then user can draw more in this file or delete earlier created drawing.

And if file which user is trying to open does not exist - User will get a messgae - File does not exist.

The file Opening functionality i have implemented using Java Deserializa function of Serializable interface only.

The application keeps on running continuosly untill user decides to Quit the Application by pressing the key "Q" in keyboard.
