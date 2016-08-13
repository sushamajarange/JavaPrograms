# JavaPrograms
Some Java Programs


Notes:

1. Open terminal
2. goto home folder $cd ~
3. git clone https://github.com/sushamajarange/JavaPrograms
I'll show as below:

---------------------------------------------------------------------------
~/Sushama$ git clone https://github.com/sushamajarange/JavaPrograms
Cloning into 'JavaPrograms'...
remote: Counting objects: 3, done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), done.
Checking connectivity... done.
---------------------------------------------------------------------------


4. git status
it'll show as below:
---------------------------------------------------------------------------
~/Sushama/JavaPrograms$ git status
On branch master
Your branch is up-to-date with 'origin/master'.

nothing to commit, working directory clean
---------------------------------------------------------------------------


############################################################################################################
Now, as below it'll show How to add new folder and program in git.

A. from file exporer goto Home folder, then JavaPrograms folder, create folder named "ExampleProgram"

-----------------------
~/Sushama/JavaPrograms$ ls
ExampleProgram  README.md 
------------------------

B. from file explorer Now create a file ExampleProgram.java in ExampleProgram folder.
public class ExampleProgram {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

}

C. Now, you want to send this program to server, do below things
C.1. goto terminal, cd ~/Sushama/JavaPrograms/ExampleProgram/
C.2. git add ExampleProgram.java
C.3. now check if ExampleProgram.java is added using git status, see file name in green.

-----------------------------------------------------------------------------
~/Sushama/JavaPrograms/ExampleProgram$ git status 
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

	new file:   ExampleProgram.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)

-----------------------------------------------------------------------------------

C.4. Now you commit file to ready for sending it to server
--------------------------------------------------------------------------
~/Sushama/JavaPrograms/ExampleProgram$ git commit -m "Added ExampleProgram.java program"
[master 73f6d54] Added ExampleProgram.java program
 1 file changed, 8 insertions(+)
 create mode 100644 ExampleProgram/ExampleProgram.java
--------------------------------------------------------------------------------


C.5. Now check the log, you'll see your message you put in commit, in log
-------------------------------------------------------------------------------
~/Sushama/JavaPrograms/ExampleProgram$ git log
commit 73f6d54d064e44bda462590d7b0d473125e2489c
Author: Vishnu Patekar <vishnupatekar0510@gmail.com>
Date:   Tue Dec 22 11:21:05 2015 +0800

    Added ExampleProgram.java program
-------------------------------------------------------------------------------


C.6. Now you're ready to send your program to github.com server. After "git push" command in folder ~/Sushama/JavaPrograms
enter your github username and password. 
--------------------------------------------------------------------
:~/Sushama/JavaPrograms$ git push
warning: push.default is unset; its implicit value is changing in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the current behavior after the default changes, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

In Git 2.0, Git will default to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': sushamajarange
Password for 'https://sushamajarange@github.com': 
Counting objects: 9, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (5/5), done.
Writing objects: 100% (7/7), 1.04 KiB | 0 bytes/s, done.
Total 7 (delta 0), reused 0 (delta 0)
To https://github.com/sushamajarange/JavaPrograms
   6fdf438..73f6d54  master -> master
--------------------------------------------------------------------


C7. Now, from web browser goto https://github.com/sushamajarange/JavaPrograms
You'll see your ExampleProgram folder and ExampleProgram.Java File, similar you can do for Program1 folder and Program1.java program.

git add filename
git commit
git push
Enjoy!! :)


-------------------------------------------------------------------
Now, you want to get latest code from repository githum.com server to your local directory.

git pull

---------------------------------------------------------------------
to rename file or folder on git use:
git mv OldFileName NewFileName


