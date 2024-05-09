# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
 - A map of your game's layout (if applicable)
 - `cheatsheet.md`
 - Completed `rubric.md` 
  
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?
    In our initial meeting, we discussed what we wanted the game to be about, and how we want the scoring system to work. Our overall approach was to start very simple, and make it gradually more complicated from there. 

 - What **new thing(s)** did you learn / figure out in completing this project?
    When adding a new feature (a system for collecting tokens) to the game, sometimes it’s easier to make its own separate class especially when you want to make it elaborate, but that is not always necessary. We  were initially trying to make a separate class for the tokens, but realized that the feature we’re trying to add to the game is simple enough that it can be contained within the site class. Also, in the beginning, we had separate variable names for every single answer for all 12 questions. This made the code unnecessarily long. We were able to cut it down to 2. We were able to cut down the number of variables by a lot, partly because all the sites and the questions associated with them were coded in a similar format. When there are 12 sets of code that have a similar structure, there is often a possibility of simplifying the code. 

 - Is there anything that you wish you had **implemented differently**?
    We wish we could have gone to more office hours or TA hours to get help. As much as we wanted to, balancing our project with our other academic work had been challenging. 

 - If you had **unlimited time**, what additional features would you implement?
    There are more prefectures and sites in Japan than the ones we currently have in the game. If given more time, we would add more sites. There also are many lines of trains that connect different parts of Japan. We would also like to connect the cities in a way that aligns with the ways trains connect sites in real life and not just make them a direct path from Tokyo station. 

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
    We initially were going to have some answers to the questions be a string. However, in Jordan’s office hours, he told us that at least to start with, we should keep all the answers to int (hence user input to int). We took his advice and alternated the questions, so that they are fully answerable in integers. For some questions, we set multiple choice answers so that the user could select the answer with an integer. Doing this helped, because it made the structures of code for each of the sites very similar to each other. This allowed us to reuse code for different prefectures, and simplify it in many aspects. (including cutting the number of variables, as described above). 

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
    We came up with numerous ideas of how we should code our program, yet we think that we may have over-thought the implementation of code. In response, we use the methodology of pseudocode to refine our concepts, although we wish we could use this approach better in an earlier stage.  

 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.
    We worked in a group of 2 across separate sections. We got together in the afternoon section of the class, took turns going to office hours, and met in the library outside of that.  
