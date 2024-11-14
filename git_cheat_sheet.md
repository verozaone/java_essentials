Copy code

# Git Commands Cheat Sheet

To start a new Git repository, use:

```bash
git init

git status  # Shows changes not yet committed

git add <filename>  # Stages a specific file for commit

git add .  # Stages all changed files in the current directory

git commit -m "Your commit message here"  # Records the staged changes in the repository

git push  # Sends committed changes to the remote repository

git push origin <branch-name>  # Pushes to a specific branch on the remote

git pull  # Updates your branch with changes from the remote repository

git log  # Displays a list of past commits in the current branch

# Example workflow
git add .  # Adds all modified files to staging
git commit -m "Add new feature"  # Commits with a descriptive message
git push origin main  # Pushes commits to the main branch

```
