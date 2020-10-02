Simple programs on Java
This repository is for beginners who wants to learn in code in java
Here you can finx some quick simple but cool java programs.

For contributor : Please use clean commented code 


![GitHub Hacktoberfest combined status](https://img.shields.io/github/hacktoberfest/2020/msandfor/10-Easy-Steps?style=for-the-badge)
![Open-Source](https://img.shields.io/badge/Open%20Source-Good%20First%20Issue-blue?style=for-the-badge)
![Licence MIT](https://img.shields.io/github/license/msandfor/10-easy-steps?style=for-the-badge)
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-4-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->

<img src="https://github.com/msandfor/10-Easy-Steps/blob/master/assets/HF2020%20Events%201600x400%20Centered.png" alt="banner that says Hacktoberfest">

## Welcome to Java Repository

This is a repository created for the participants who wants to get started with Open Source Contributions through #Hackoberfest .
Go to the issues, pick one of the ones labeled Hacktoberfest and make your pull request.

## Steps to follow :scroll:

### 1. Fork it :fork_and_knife:

You can get your own fork/copy of [Java](https://github.com/sam0hack/Java) by using the <a href="https://github.com/sam0hack/Java/new/master?readme=1#fork-destination-box"><kbd><b>Fork</b></kbd></a> button.

 [![Fork Button](https://help.github.com/assets/images/help/repository/fork_button.jpg)](https://github.com/sam0hack/Java)

### 2. Clone it :busts_in_silhouette:

You need to clone (download) it to local machine using

```sh
$ git clone https://github.com/Your_Username/Java.git
```

> This makes a local copy of repository in your machine.

Once you have cloned the `Java` repository in Github, move to that folder first using change directory command on linux and Mac.

```sh
# This will change directory to a folder Java
$ cd Java
```

Move to this folder for all other commands.

### 3. Set it up :arrow_up:

Run the following commands to see that *your local copy* has a reference to *your forked remote repository* in Github :octocat:

```sh
$ git remote -v
origin  https://github.com/Your_Username/Java.git (fetch)
origin  https://github.com/Your_Username/Java.git (push)
```

Now, lets add a reference to the original [Java](https://github.com/sam0hack/Java) repository using

```sh
$ git remote add upstream https://github.com/sam0hack/Java.git
```

> This adds a new remote named ***upstream***.

See the changes using

```sh
$ git remote -v
origin    https://github.com/Your_Username/Java.git (fetch)
origin    https://github.com/Your_Username/Java.git (push)
upstream  https://github.com/jainaman224/Java.git (fetch)
upstream  https://github.com/jainaman224/Java.git (push)
```

### 4. Sync it :recycle:

Always keep your local copy of repository updated with the original repository.
Before making any changes and/or in an appropriate interval, run the following commands *carefully* to update your local repository.

```sh
# Fetch all remote repositories and delete any deleted remote branches
$ git fetch --all --prune

# Switch to `master` branch
$ git checkout master

# Reset local `master` branch to match `upstream` repository's `master` branch
$ git reset --hard upstream/master

# Push changes to your forked  repo
$ git push origin master
```

### 5. Ready Steady Go... :turtle: :rabbit2:

Once you have completed these steps, you are ready to start contributing by checking our `Help Wanted` Issues and creating [pull requests](https://github.com/sam0hack/Java/pulls).

### 6. Create a new branch :bangbang:

Whenever you are going to make contribution. Please create seperate branch using command and keep your `master` branch clean (i.e. synced with remote branch).

```sh
# It will create a new branch with name Branch_Name and switch to branch Folder_Name
$ git checkout -b Folder_Name
```

Create a seperate branch for contibution and try to use same name of branch as of folder.

To switch to desired branch

```sh
# To switch from one folder to other
$ git checkout Folder_Name
```

To add the changes to the branch. Use

```sh
# To add all files to branch Folder_Name
$ git add .
```

Type in a message relevant for the code reveiwer using

```sh
# This message get associated with all files you have changed
$ git commit -m 'relevant message'
```

Now, Push your awesome work to your remote repository using

```sh
# To push your work to your remote repository
$ git push -u origin Folder_Name
```

Finally, go to your repository in browser and click on `compare and pull requests`.
Then add a title and description to your pull request that explains your precious effort.


<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-3-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->




## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://github.com/Roshanpaswan"><img src="https://avatars2.githubusercontent.com/u/72060461?v=4" width="100px;" alt=""/><br /><sub><b>Roshan Paswan</b></sub></a><br /><a href="https://github.com/sam0hack/Java/commits?author=Roshanpaswan" title="Code">💻</a> <a href="https://github.com/sam0hack/Java/commits?author=Roshanpaswan" title="Tests">⚠️</a></td>
    <td align="center"><a href="https://shreyakapoor-portfolio.netlify.com"><img src="https://avatars1.githubusercontent.com/u/31164665?v=4" width="100px;" alt=""/><br /><sub><b>shreya kapoor</b></sub></a><br /><a href="#infra-shreyakapoor08" title="Infrastructure (Hosting, Build-Tools, etc)">🚇</a> <a href="https://github.com/sam0hack/Java/commits?author=shreyakapoor08" title="Tests">⚠️</a></td>
    <td align="center"><a href="https://github.com/Mudrika09"><img src="https://avatars0.githubusercontent.com/u/48450992?v=4" width="100px;" alt=""/><br /><sub><b>Mudrika09</b></sub></a><br /><a href="#infra-Mudrika09" title="Infrastructure (Hosting, Build-Tools, etc)">🚇</a> <a href="https://github.com/sam0hack/Java/commits?author=Mudrika09" title="Tests">⚠️</a> <a href="https://github.com/sam0hack/Java/commits?author=Mudrika09" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/SATAKSHI08"><img src="https://avatars2.githubusercontent.com/u/56965113?v=4" width="100px;" alt=""/><br /><sub><b>zn08</b></sub></a><br /><a href="https://github.com/sam0hack/Java/commits?author=SATAKSHI08" title="Tests">⚠️</a> <a href="https://github.com/sam0hack/Java/commits?author=SATAKSHI08" title="Code">💻</a></td>
  </tr>
</table>

<!-- markdownlint-enable -->
<!-- prettier-ignore-end -->
<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!

