age = int(input("What is your age?"))
if age < 18:
  print("You are a child grow up")
else:
  print("You are an adult go to work")
brains = bool(input("Are you smart?"))
if not brains:
  print("Go to work")
else:
  print("Go to school")
lazy = int(input("How lazy are you from 1-10?"))
if lazy <= 4:
  print("You are going to be a millionaire")
elif lazy <= 7:
  print("You are going to be a bum")
else:
  print("You are going to be homeless")
