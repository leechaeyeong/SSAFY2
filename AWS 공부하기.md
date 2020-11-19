## AWS 공부하기

* PEM 키 받기 

EC2 private key == pem 키

```
openSSL로 public(.pub) 과 private(.pem) 키를 파일로 생성

aws cli 명령과 같이 쓸 수 있는 public key material 생성

openSSL 형식으로 id_rsa.pub에 넣을 수 있는 ssh 키 생성

console에 정상적으로 key가 import 되는지 비교해 볼 수 있는 fingerprint 생성
```

aws에서 가상 서버에 접근하려면 private key와 public key로 구성된 key pair가 필요.

public key : 가상서버에 삽입

private key : 개인이 소유

ssh프로토콜 사용해서 리눅스 서버에 접근. 

로그인 시 키 페어 이용하여 인증.



* 키페어 생성하기 == awspwd :ballot_box_with_check: lcy112112 사용

* EC2 == Elastic compute cloud

가상 서버 제공하는 서비스

가상 서버 : CPU, 메모리, 네트워크 인터페이스 및 스토리지

물리적 서버 : 호스트 서버

게스트 : 호스트 서버 위에 실행되는 가상 서버

하이퍼바이저 : 게스트를 서로 분리. 하드웨어에 대한 요청을 스케줄링함

* 인스턴스

가상 컴퓨터 한대 == 인스턴스

생성 완료

:white_check_mark: https://deftkang.tistory.com/58 참고

* windows에서 리눅스 인스턴스에 연결하기

ssh 포트를 이용해야한다 - git bash에서 가능

ssh -i C:/Users/multicampus/Documents/pem/awspwd.pem ubuntu@ec2-3-138-136-250.us-east-2.compute.amazonaws.com





* EC2 웹서버 구축 

sudo apt-get update

sudo apt-get install apache2



sudo apt-get update

sudo apt-get upgrade

sudo apt-get install nginx



* EC2 웹서버 접속

퍼블릭 dns나 퍼블릭 ip 입력하면 default 화면으로 감

18.221.199.64 : public ip주소로 접속가능

ec2-3-138-136-250.us-east-2.compute.amazonaws.com : public DNS

:white_check_mark: https://mine-it-record.tistory.com/116 : 참고

* 퍼블릭 dns 바꾸기

:no_entry_sign: https://linkhub.tistory.com/128 : 참고



## aws 일반 배포

* apache | nginx

웹서버 소프트웨어, 오픈소스 웹서버 

> apache

멀티 프로세싱 방식으로 지원

> nginx

이벤트 기반 처리 방식. 캐싱사용해서 정적인 웹에 좋음



* WAS가 뭐야?

웹 프로그램 실핼할 수 있는 기초적인 환경을 제공

웹 어플리케이션 서비스 

(WebLogic, WebShpere, tomcat, Jeus, JBoss)



* proxy 서버 왜쓰는거임?

요청을 중계하는 프로그램

## docker 배포

## 젠킨스 배포



* SSD가 뭐지?

* ssh 가 뭐야? 

ssh로 접속

ssh 프로토콜 : 리눅스 서버에 접근하기 위함. 

ssh 키도 있음?

* cli 가 뭐야?
* rsa 가 뭐야?

공개키 시스템. 암호화 및 전자서명 알고리즘

* openSSL 이 뭐야?
* SSL 은 뭐지? secure sockets layer

서버인증, 클라이언트 인증, 데이타 암호화 기능 제공

인터넷을 통해 클라이언트와 서버가 통신할 때 통신 내용을 안전하게 보호하는 방법

공개키 암호화 : public key + priavate key 알고리즘

ssl 인증서 생성 : key 파일 생성 -> 인증요청서 csr 생성

![image-20201014122834265](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20201014122834265.png)

* KEY pair?

키페어는 public key랑 private key를 말하는 듯



-------------------------------------



가상머신 위에 os

도커는 컨테이너 

도커가 컨테이너에 비해 가볍다 / 도커 이미지

커스트마이징 

도커 위에 해보고 build 

그냥 awd 위에 해보기 build

젠킨스써서 해보고

무중단 배포

https://velog.io/@pinot/AWS-Ubuntu%EB%A1%9C-nginx-reverse-proxy-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0 : 참고자료 (아직 안읽음)

-----------------------

도커위에 우분투를 올린상태

vi 해서 수정하기

블록챌린 



echo "AAA" > A

echo "" >> : 기존에 추가

cat > A -> ctrl+d 

cat 파일1 > 파일2 : 

ls > 파일

ls -al

sh 

코드의 

-rwx : 421

d는 폴더 x 가 없으면 들어갈 수 없음

chmod 222 Test2 , 666

root 그룹 게스트

chmod -x 

touch 파일명  :  파일 생성



ttd??

jar 파일 + 도커파일 > aws에 올라가야함

scp로 두개의 파일 보내기



scp -i C:/Users/multicampus/Documents/pem/J3A102T.pem -r C:/Users/multicampus/Desktop/git/blockchain_sub3/s03p23a102/frontend/dist ubuntu@j3a102.p.ssafy.io:~/dist

  

wget http://mirror.navercorp.com/apache/maven/maven-3/3.5.4/binaries/apache-maven-3.5.4-bin.tar.gz

wget http://maven.apache.org/download.cgi

tar xvf apache-maven-3.5.4-bin.tar.gz
apache-maven-3.5.4-bin.tar.gz 

tar xvf apache-maven-3.6.3-bin.tar.gz

sudo mv apache-maven-3.5.4 /opt

출처: https://bluexmas.tistory.com/832 [파란크리스마스]
출처: https://bluexmas.tistory.com/832 [파란크리스마스]

export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
export PATH=JAVA 
H
	
 OME/bin:PATH
export CLASS_PATH=JAVA 
H
	
 OME/lib:CLASS_PATH

export M2_HOME=/opt/maven
export PATH=PATH:M2_HOME/bin

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]