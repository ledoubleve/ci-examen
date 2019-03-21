from jenkins/jenkins:lts
 
USER root
RUN apt-get update -qq \
    && apt-get install -qqy apt-transport-https ca-certificates curl gnupg2 software-properties-common 
RUN curl -fsSL https://download.docker.com/linux/debian/gpg | apt-key add -
RUN add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/debian \
   $(lsb_release -cs) \
   stable"
RUN apt-get update  -qq \
    && apt-get install docker-ce=18.06.0~ce~3-0~debian -y
RUN usermod -aG docker jenkins

RUN curl -L "https://github.com/docker/compose/releases/download/1.23.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
RUN chmod +x /usr/local/bin/docker-compose
RUN ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose

RUN apt-get install php7.0 php7.0-fpm -y
RUN wget https://phar.phpunit.de/phpunit-7.phar
RUN chmod +x phpunit-7.phar
RUN sudo mv phpunit-7.phar /usr/local/bin/phpunit
