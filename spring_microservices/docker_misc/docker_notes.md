# Docker notes
source:
* [code_with_mosh](https://www.youtube.com/watch?v=pTFZFxd4hOI&t=2708s&ab_channel=ProgrammingwithMosh)

### Why Docker
*  My app will be run anywhere, where docker is installed. We don't need to manually install any package. 
*  All the dependencies will be downloaded automatically in an isolated environment called container by the instructions of Dockerfile.
* The beauty of this isolated environment is that it allows multiple application uses different versions. Like an app requires tensorflow 1 and another app requires tensorflow version 2.4.5. Now docker will install separately for different app.
* Another benefit of is, suppose we want to remove all the dependencies of an app. So it can do that without affecting others.

### Container vs VM

We can compare it like virtual environment of python vs virtual box of windows

|                      Container                      |                   VM                   |
|:---------------------------------------------------:|:--------------------------------------:|
| Don't need another OS. It's like venv, lightweight. |    Heavyweight. Needs dedicated OS.    |
|  Doesn't need any other physical hardware to run.   | need separate physical hardware to run |

**VMM or Hypervisor** >> A tool so that we can run two virtual machine in the same physical machine. Also known as Virtual Machine Monitor.




### Docker in Action
Some basic commands
* ```docker build -t image_tag Dockerfile_directory```
* ```docker image ls``` >> list image  or ``` docker images```
* ```docker run image_name``` >> dockerfile run command

Now we need to push to dockerhub and then for testing we need to pull down the app we created

**pushing docker-image to dockerhub:**
* ```docker login```
* ```docker tag <image_id> <username>/<repository_name>:<tag>``` ==> repository name means under which repository my docker image will be stayed.
* ```docker push <username>/<repository_name>:<tag>```

like for example: 
```
docker login
docker tag user-service-docker:latest safat99/pso-user-service:latest
docker push safat99/pso-user-service:latest
```