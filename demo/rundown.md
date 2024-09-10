# Rundown of the demo

> 
> This document relays the given demo and the specific tasks that are shown 
> with an example of the query we can give to GitHub Copilot.
> 

This demo takes a rather simple algorithm where we need to clean up the code 
and unit-test the provided algorithm. As an extra we will end the demo by optimizing
the algorithm.

1. Step 0: [The features](#some-features)
2. Step 1: [Explain the present code](#explain-the-code)
3. Step 2: [Rename seed variable](#rename-the-seed-variable)
4. Step 3: [Rename class name](#rename-the-algorithm-class)
5. Step 4: [Style refactoring](#refactoring-based-on-style-and-reference-guide)
6. Step 5: [Generating tests](#testing-the-code)
7. Step 6: [Algorithm optimization](#optimize-the-algorithm)

## Some features

1. Code generation (disabled during demo)
2. GitHub Copilot menu
3. New chat
4. Chat history
5. Clean up chats
6. Reference adding
7. Chatting and conversing

## Explain the code

First step is getting a plain explanation on the code that is presented.
Open the GitHub Copilot Chat window and start a new chat.
By selecting the `plus` button, add the class `Algorithm`. 
Then type: `/explain`

## Rename the seed variable

The second step is the first cleanup action. We want a better name for the seed variable.
First, start a new chat with Copilot by selecting the `plus` icon in the upper right corner
of the chat window.

Pres the plus button underneath the chat box and select the class we are going to work on.
Now ask Copilot the following:
`I want a better name for the 'seed' variable. What would be a better suitable name that also easily shows its function within the class. It should contain the word 'value'`

If you like the suggestion, refactor the code. If not, ask again but specify what you would like or didn't like.

## Rename the Algorithm class

In the same chat, let's get a better class name as well.
Class names should explain the main function that the class holds.

With the Algorithm class still selected in the chat,
ask the following:
`I want to change the name of the class to a more descriptive name that explains it's main function.`

Now again, change the code.

## Refactoring based on style and reference guide

Now, let's get the code refactored a bit faster.
In the same chat, with the Algorithm class still selected, press the plus button of the chat box.
And add the StyleAndReferenceDecisions file. This file contains a couple of guidelines for our code.

Now ask:
`/simplify`

This will suggest a lot of simplifications in the code and small name refactors.
But we want more, so first open a new chat window, add the Algorithm and Style Reference document and ask:
`refactor the code and use the reference documentation to make sure our code adheres to our internal guidelines and decisions.`

Refactor the code to replicate the generation.

Now go to the Algorithm class and select/highlight the  entire constructor.
Within the chat ask:
`
I want the selected code to have a better exception message and I want to optimize the check 
for this exception. Keep in mind that the initialValue can not be 0 or 1. 
Negative numbers will be converted to a positive number.
`

Refactor the code if you are happy and go to the next step.

## Testing the code

Now that we have refactored the code and made it more clear what it does.
Let's add some tests.
Create a new chat, select Algorithm and StyleAndReferenceDecisions documents.
Then type:
`Keeping in mind the reference guide, provide the tests we need to test the functionality and all meaningfull boundaries of the class`

Check if all boundaries are tested and add meaningfull extra boundaries.
`Are there other boundaries we should test?`

## Optimize the algorithm

As a last part, we will be refactoring the algorithm to optimize it for larger numbers.
This will be a conversation, so:
1. Ask for possible algorithmes
2. Request what would be best suited for speed with larger numbers
3. Ask help with the refactoring
4. RUN THE TESTS
5. Ask Copilot to help if a test fails, but let's hope they don't

That's it.
Awesome tool, right?