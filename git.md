查看当前状态 

```
git status 
```

将本地所有文件提交至暂存区

```
git add .
```

提交并且加注释

```
git commit -m "注释" 
```

添加远程仓库

```
git remote add origin git那边获取的仓库 下面的的是我仓库
git remote add myself git@github.com:Jaminccc/front-end.git
git remote add front git@github.com:front-end-bro/demo.git
```

将文件给推到服务器上 

```
git push -f myself master 自己的库
git push -f front czm 前端集合库
```

更换分支

```
git checkout master
git checkout czm
```

查看远程仓库：$ git remote -v

添加远程仓库：$ git remote add [name] [url]

删除远程仓库：$ git remote rm [name]

删除远程仓库：$ git remote rm origin

修改远程仓库：$ git remote set-url --push [name] [newUrl]

拉取远程仓库：$ git pull [remoteName] [localBranchName]

推送远程仓库：$ git push [remoteName] [localBranchName]

---

预览将要删除的文件

```undefined
git rm -r -n --cached 文件/文件夹名称 

加上 -n 这个参数，执行命令时，是不会删除任何文件，而是展示此命令要删除的文件列表预览。
```

确定无误后删除文件

```undefined
git rm -r --cached 文件/文件夹名称
```

提交到本地并推送到远程服务器

```bash
git commit -m "提交说明"
git push m
git push front czm
```

