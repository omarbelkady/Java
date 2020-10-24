## Network Programming

Write Programs that execute across multiple devices or computers in which all the devices are connected to each other using a network. There are three requirements to establish a network 
- Hardware: computers, cables, modems, hubs and much more
- Software: programs created that will talk between the server and the clients
- Protocol: This is the representation used to establish a connection which aides in sending and receiving data in the appropriate format. A Protocol also is used to send information from point A to point B on the network.

### TCP/IP Protocol
A set of rules that every  computer on the network must follow. TCP stands for Transmission Control Protocol and IP stands for Internet Protocol which are the standard protocol models used on any network.
TCP/IP Model has five layers:
- Application Layer
- TCP Layer
- IP Layer
- Data Link Layer
- Physical Layer

#### Application layer
```
this is the topmost layer within the TCP/IP Model that directly interracts with an application or data.
This layer receives data from the application and formats the data and then sends
the data to the next layer in the form of continuous stream of bytes.
```

#### TCP layer
```
This layer receives data from the Application Layer and will divide the data into 
smaller segments which we refer to these segments as packets. A packet will
store a group of bytes of data. The packets are then sent to the next layer in line
which is the IP Layer 
```

#### IP layer
```
This layer inserts big packets into envelopes called frames. Every frame has a packet.
Within this packet the following is stored:

- IP Address of the Destination Computer
- IP Address of the Source Computer
- additional information is stored in regards to error detection and correction
The three frames are then sent to the next layer in line which is the Data Link Layer
```

#### Data Link layer
```
This layer receives frames from the IP Layer. This layer then dispatches them to
the designated computer on the network.
```

#### Physical layer
```
This layer is used to physically send data on the network by using the appropriate hardware. 
```

#### IP Address
```
Your id on the network split into four sections every section can have a number from
0-255.
```

#### DNS= Domain Naming System
```
maps your ip address to human-readable names 252.047.25.552
```

#### FTP= File Transfer Protocol
```
this is used to upload and download files from and to the server
```

#### HTTP = Hypertext Transfer Protocol
```
this is used to transfer web pages from one computer to the other on the internet.
This is the most widely used protocol on the internet
```

#### SMTP = Simple Mail Transfer Protocol
```
this is used send mails on the network
```


#### Socket
```
this is the communication mechanism between two computers using the TCP Protocol.
A client creates a socket on its end of the communication spectrum and tries to connect
his socket to a server. When a connection is made, the server creates a socket object 
on its end of the communication.
```

#### POP= Post Office Protocol
```
this is used receive mails into mailboxes
```

#### UDP= User Datagram Protocol
```
this is used to transfer data in a connection-less manner and unreliable manner.
This does not check how many bits are sent or recieved at the other side during 
transmission of data. Bit loss can be experienced. UDP is primarily used to send
images, audio and video files.
```

#### How to get the ip address
```
if I use the java.net package and use the getByName() method of the InetAddress class
I pass in the Host Name and Server as arguments and it returns the IP Address of the server.
```

#### How to create a server in Java that sends data
```java
Serversocket myserversock = new ServerSocket(8080);
Socket mysocket = myserversock.accept();
OutputStream object = mysocket.getOutputStream();//attaching the output stream to the server socket using getOutputStream method

PrintStream printstr = new PrintStream(object); //this print stream object is used to send data to the client
printstr.println(str);
//Now I must close all connection
myserversock.close();//closing the server socket
mysocket.close();//closing the socket
printstr.close();//closing the print stream
```

#### How to create a client in Java that recieves data
```java
//creating a socket in the client side
//If my computer is not in the network I can must run the client and server 
//in the same system. 
Socket mysock = new Socket("192.168.1.121", 8080);
InputStream myobj = mysock.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(myobj));//to read data from the socket into the client 
Str = br.readLine();//To read data from the buffer
br.close();//close the buffer reader connections
mysock.close();//close the socket connection 
/*
 To receive data from the server it is better to use bufferedReader as inputStream
 To send data from the client I use the DataOutputStrema
*/
```

#### Two way communication
```java
InputStream myobj = mysock.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(myobj));
OutputStream myobj = mysock.getOutputStream();
DataOutputStream doutst = new DataOuputStream(myobj);
doutst.writeBytes();//used to send strings in the form of groups of bytes
```## Network Programming

Write Programs that execute across multiple devices or computers in which all the devices are connected to each other using a network. There are three requirements to establish a network 
- Hardware: computers, cables, modems, hubs and much more
- Software: programs created that will talk between the server and the clients
- Protocol: This is the representation used to establish a connection which aides in sending and receiving data in the appropriate format. A Protocol also is used to send information from point A to point B on the network.

### TCP/IP Protocol
A set of rules that every  computer on the network must follow. TCP stands for Transmission Control Protocol and IP stands for Internet Protocol which are the standard protocol models used on any network.
TCP/IP Model has five layers:
- Application Layer
- TCP Layer
- IP Layer
- Data Link Layer
- Physical Layer

#### Application layer
```
this is the topmost layer within the TCP/IP Model that directly interracts with an application or data.
This layer receives data from the application and formats the data and then sends
the data to the next layer in the form of continuous stream of bytes.
```

#### TCP layer
```
This layer receives data from the Application Layer and will divide the data into 
smaller segments which we refer to these segments as packets. A packet will
store a group of bytes of data. The packets are then sent to the next layer in line
which is the IP Layer 
```

#### IP layer
```
This layer inserts big packets into envelopes called frames. Every frame has a packet.
Within this packet the following is stored:

- IP Address of the Destination Computer
- IP Address of the Source Computer
- additional information is stored in regards to error detection and correction
The three frames are then sent to the next layer in line which is the Data Link Layer
```

#### Data Link layer
```
This layer receives frames from the IP Layer. This layer then dispatches them to
the designated computer on the network.
```

#### Physical layer
```
This layer is used to physically send data on the network by using the appropriate hardware. 
```

#### IP Address
```
Your id on the network split into four sections every section can have a number from
0-255.
```

#### DNS= Domain Naming System
```
maps your ip address to human-readable names 252.047.25.552
```

#### FTP= File Transfer Protocol
```
this is used to upload and download files from and to the server
```

#### HTTP = Hypertext Transfer Protocol
```
this is used to transfer web pages from one computer to the other on the internet.
This is the most widely used protocol on the internet
```

#### SMTP = Simple Mail Transfer Protocol
```
this is used send mails on the network
```


#### Socket
```
this is the communication mechanism between two computers using the TCP Protocol.
A client creates a socket on its end of the communication spectrum and tries to connect
his socket to a server. When a connection is made, the server creates a socket object 
on its end of the communication.
```

#### POP= Post Office Protocol
```
this is used receive mails into mailboxes
```

#### UDP= User Datagram Protocol
```
this is used to transfer data in a connection-less manner and unreliable manner.
This does not check how many bits are sent or recieved at the other side during 
transmission of data. Bit loss can be experienced. UDP is primarily used to send
images, audio and video files.
```

#### How to get the ip address
```
if I use the java.net package and use the getByName() method of the InetAddress class
I pass in the Host Name and Server as arguments and it returns the IP Address of the server.
```

#### How to create a server in Java that sends data
```java
Serversocket myserversock = new ServerSocket(8080);
Socket mysocket = myserversock.accept();
OutputStream object = mysocket.getOutputStream();//attaching the output stream to the server socket using getOutputStream method

PrintStream printstr = new PrintStream(object); //this print stream object is used to send data to the client
printstr.println(str);
//Now I must close all connection
myserversock.close();//closing the server socket
mysocket.close();//closing the socket
printstr.close();//closing the print stream
```

#### How to create a client in Java that recieves data
```java
//creating a socket in the client side
//If my computer is not in the network I can must run the client and server 
//in the same system. 
Socket mysock = new Socket("192.168.1.121", 8080);
InputStream myobj = mysock.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(myobj));//to read data from the socket into the client 
Str = br.readLine();//To read data from the buffer
br.close();//close the buffer reader connections
mysock.close();//close the socket connection 
/*
 To receive data from the server it is better to use bufferedReader as inputStream
 To send data from the client I use the DataOutputStrema
*/
```

#### Two way communication
```java
InputStream myobj = mysock.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(myobj));
OutputStream myobj = mysock.getOutputStream();
DataOutputStream doutst = new DataOuputStream(myobj);
doutst.writeBytes();//used to send strings in the form of groups of bytes
```## Network Programming

Write Programs that execute across multiple devices or computers in which all the devices are connected to each other using a network. There are three requirements to establish a network 
- Hardware: computers, cables, modems, hubs and much more
- Software: programs created that will talk between the server and the clients
- Protocol: This is the representation used to establish a connection which aides in sending and receiving data in the appropriate format. A Protocol also is used to send information from point A to point B on the network.

### TCP/IP Protocol
A set of rules that every  computer on the network must follow. TCP stands for Transmission Control Protocol and IP stands for Internet Protocol which are the standard protocol models used on any network.
TCP/IP Model has five layers:
- Application Layer
- TCP Layer
- IP Layer
- Data Link Layer
- Physical Layer

#### Application layer
```
this is the topmost layer within the TCP/IP Model that directly interracts with an application or data.
This layer receives data from the application and formats the data and then sends
the data to the next layer in the form of continuous stream of bytes.
```

#### TCP layer
```
This layer receives data from the Application Layer and will divide the data into 
smaller segments which we refer to these segments as packets. A packet will
store a group of bytes of data. The packets are then sent to the next layer in line
which is the IP Layer 
```

#### IP layer
```
This layer inserts big packets into envelopes called frames. Every frame has a packet.
Within this packet the following is stored:

- IP Address of the Destination Computer
- IP Address of the Source Computer
- additional information is stored in regards to error detection and correction
The three frames are then sent to the next layer in line which is the Data Link Layer
```

#### Data Link layer
```
This layer receives frames from the IP Layer. This layer then dispatches them to
the designated computer on the network.
```

#### Physical layer
```
This layer is used to physically send data on the network by using the appropriate hardware. 
```

#### IP Address
```
Your id on the network split into four sections every section can have a number from
0-255.
```

#### DNS= Domain Naming System
```
maps your ip address to human-readable names 252.047.25.552
```

#### FTP= File Transfer Protocol
```
this is used to upload and download files from and to the server
```

#### HTTP = Hypertext Transfer Protocol
```
this is used to transfer web pages from one computer to the other on the internet.
This is the most widely used protocol on the internet
```

#### SMTP = Simple Mail Transfer Protocol
```
this is used send mails on the network
```


#### Socket
```
this is the communication mechanism between two computers using the TCP Protocol.
A client creates a socket on its end of the communication spectrum and tries to connect
his socket to a server. When a connection is made, the server creates a socket object 
on its end of the communication.
```

#### POP= Post Office Protocol
```
this is used receive mails into mailboxes
```

#### UDP= User Datagram Protocol
```
this is used to transfer data in a connection-less manner and unreliable manner.
This does not check how many bits are sent or recieved at the other side during 
transmission of data. Bit loss can be experienced. UDP is primarily used to send
images, audio and video files.
```

#### How to get the ip address
```
if I use the java.net package and use the getByName() method of the InetAddress class
I pass in the Host Name and Server as arguments and it returns the IP Address of the server.
```

#### How to create a server in Java that sends data
```java
Serversocket myserversock = new ServerSocket(8080);
Socket mysocket = myserversock.accept();
OutputStream object = mysocket.getOutputStream();//attaching the output stream to the server socket using getOutputStream method

PrintStream printstr = new PrintStream(object); //this print stream object is used to send data to the client
printstr.println(str);
//Now I must close all connection
myserversock.close();//closing the server socket
mysocket.close();//closing the socket
printstr.close();//closing the print stream
```

#### How to create a client in Java that recieves data
```java
//creating a socket in the client side
//If my computer is not in the network I can must run the client and server 
//in the same system. 
Socket mysock = new Socket("192.168.1.121", 8080);
InputStream myobj = mysock.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(myobj));//to read data from the socket into the client 
Str = br.readLine();//To read data from the buffer
br.close();//close the buffer reader connections
mysock.close();//close the socket connection 
/*
 To receive data from the server it is better to use bufferedReader as inputStream
 To send data from the client I use the DataOutputStrema
*/
```

#### Two way communication
```java
InputStream myobj = mysock.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(myobj));
OutputStream myobj = mysock.getOutputStream();
DataOutputStream doutst = new DataOuputStream(myobj);
doutst.writeBytes();//used to send strings in the form of groups of bytes
```## Network Programming

Write Programs that execute across multiple devices or computers in which all the devices are connected to each other using a network. There are three requirements to establish a network 
- Hardware: computers, cables, modems, hubs and much more
- Software: programs created that will talk between the server and the clients
- Protocol: This is the representation used to establish a connection which aides in sending and receiving data in the appropriate format. A Protocol also is used to send information from point A to point B on the network.

### TCP/IP Protocol
A set of rules that every  computer on the network must follow. TCP stands for Transmission Control Protocol and IP stands for Internet Protocol which are the standard protocol models used on any network.
TCP/IP Model has five layers:
- Application Layer
- TCP Layer
- IP Layer
- Data Link Layer
- Physical Layer

#### Application layer
```
this is the topmost layer within the TCP/IP Model that directly interracts with an application or data.
This layer receives data from the application and formats the data and then sends
the data to the next layer in the form of continuous stream of bytes.
```

#### TCP layer
```
This layer receives data from the Application Layer and will divide the data into 
smaller segments which we refer to these segments as packets. A packet will
store a group of bytes of data. The packets are then sent to the next layer in line
which is the IP Layer 
```

#### IP layer
```
This layer inserts big packets into envelopes called frames. Every frame has a packet.
Within this packet the following is stored:

- IP Address of the Destination Computer
- IP Address of the Source Computer
- additional information is stored in regards to error detection and correction
The three frames are then sent to the next layer in line which is the Data Link Layer
```

#### Data Link layer
```
This layer receives frames from the IP Layer. This layer then dispatches them to
the designated computer on the network.
```

#### Physical layer
```
This layer is used to physically send data on the network by using the appropriate hardware. 
```

#### IP Address
```
Your id on the network split into four sections every section can have a number from
0-255.
```

#### DNS= Domain Naming System
```
maps your ip address to human-readable names 252.047.25.552
```

#### FTP= File Transfer Protocol
```
this is used to upload and download files from and to the server
```

#### HTTP = Hypertext Transfer Protocol
```
this is used to transfer web pages from one computer to the other on the internet.
This is the most widely used protocol on the internet
```

#### SMTP = Simple Mail Transfer Protocol
```
this is used send mails on the network
```


#### Socket
```
this is the communication mechanism between two computers using the TCP Protocol.
A client creates a socket on its end of the communication spectrum and tries to connect
his socket to a server. When a connection is made, the server creates a socket object 
on its end of the communication.
```

#### POP= Post Office Protocol
```
this is used receive mails into mailboxes
```

#### UDP= User Datagram Protocol
```
this is used to transfer data in a connection-less manner and unreliable manner.
This does not check how many bits are sent or recieved at the other side during 
transmission of data. Bit loss can be experienced. UDP is primarily used to send
images, audio and video files.
```

#### How to get the ip address
```
if I use the java.net package and use the getByName() method of the InetAddress class
I pass in the Host Name and Server as arguments and it returns the IP Address of the server.
```

#### How to create a server in Java that sends data
```java
Serversocket myserversock = new ServerSocket(8080);
Socket mysocket = myserversock.accept();
OutputStream object = mysocket.getOutputStream();//attaching the output stream to the server socket using getOutputStream method

PrintStream printstr = new PrintStream(object); //this print stream object is used to send data to the client
printstr.println(str);
//Now I must close all connection
myserversock.close();//closing the server socket
mysocket.close();//closing the socket
printstr.close();//closing the print stream
```

#### How to create a client in Java that recieves data
```java
//creating a socket in the client side
//If my computer is not in the network I can must run the client and server 
//in the same system. 
Socket mysock = new Socket("192.168.1.121", 8080);
InputStream myobj = mysock.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(myobj));//to read data from the socket into the client 
Str = br.readLine();//To read data from the buffer
br.close();//close the buffer reader connections
mysock.close();//close the socket connection 
/*
 To receive data from the server it is better to use bufferedReader as inputStream
 To send data from the client I use the DataOutputStrema
*/
```

#### Two way communication
```java
InputStream myobj = mysock.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(myobj));
OutputStream myobj = mysock.getOutputStream();
DataOutputStream doutst = new DataOuputStream(myobj);
doutst.writeBytes();//used to send strings in the form of groups of bytes
```


## Network Programming

Write Programs that execute across multiple devices or computers in which all the devices are connected to each other using a network. There are three requirements to establish a network 
- Hardware: computers, cables, modems, hubs and much more
- Software: programs created that will talk between the server and the clients
- Protocol: This is the representation used to establish a connection which aides in sending and receiving data in the appropriate format. A Protocol also is used to send information from point A to point B on the network.




### TCP/IP Protocol
```
A set of rules that every  computer on the network must follow. TCP stands for Transmission Control Protocol and IP stands for Internet Protocol which are the standard protocol models used on any network.
TCP/IP Model has five layers:
- Application Layer
- TCP Layer
- IP Layer
- Data Link Layer
- Physical Layer
```

#### Application layer
```
this is the topmost layer within the TCP/IP Model that directly interracts with an application or data.
This layer receives data from the application and formats the data and then sends
the data to the next layer in the form of continuous stream of bytes.
```

#### TCP layer
```
This layer receives data from the Application Layer and will divide the data into 
smaller segments which we refer to these segments as packets. A packet will
store a group of bytes of data. The packets are then sent to the next layer in line
which is the IP Layer 
```

#### IP layer
```
This layer inserts big packets into envelopes called frames. Every frame has a packet.
Within this packet the following is stored:

- IP Address of the Destination Computer
- IP Address of the Source Computer
- additional information is stored in regards to error detection and correction
The three frames are then sent to the next layer in line which is the Data Link Layer
```

#### Data Link layer
```
This layer receives frames from the IP Layer. This layer then dispatches them to
the designated computer on the network.
```

#### Physical layer
```
This layer is used to physically send data on the network by using the appropriate hardware. 
```

#### IP Address
```
Your id on the network split into four sections every section can have a number from
0-255.
```

#### DNS= Domain Naming System
```
maps your ip address to human-readable names 252.047.25.552
```

#### FTP= File Transfer Protocol
```
this is used to upload and download files from and to the server
```

#### HTTP = Hypertext Transfer Protocol
```
this is used to transfer web pages from one computer to the other on the internet.
This is the most widely used protocol on the internet
```

#### SMTP = Simple Mail Transfer Protocol
```
this is used send mails on the network
```


#### Socket
```
this is the communication mechanism between two computers using the TCP Protocol.
A client creates a socket on its end of the communication spectrum and tries to connect
his socket to a server. When a connection is made, the server creates a socket object 
on its end of the communication.
```

#### POP= Post Office Protocol
```
this is used receive mails into mailboxes
```

#### UDP= User Datagram Protocol
```
this is used to transfer data in a connection-less manner and unreliable manner.
This does not check how many bits are sent or recieved at the other side during 
transmission of data. Bit loss can be experienced. UDP is primarily used to send
images, audio and video files.
```

#### How to get the ip address
```
if I use the java.net package and use the getByName() method of the InetAddress class
I pass in the Host Name and Server as arguments and it returns the IP Address of the server.
```

#### How to create a server in Java that sends data
```java
Serversocket myserversock = new ServerSocket(8080);
Socket mysocket = myserversock.accept();
OutputStream object = mysocket.getOutputStream();//attaching the output stream to the server socket using getOutputStream method

PrintStream printstr = new PrintStream(object); //this print stream object is used to send data to the client
printstr.println(str);
//Now I must close all connection
myserversock.close();//closing the server socket
mysocket.close();//closing the socket
printstr.close();//closing the print stream
```

#### How to create a client in Java that recieves data
```java
//creating a socket in the client side
//If my computer is not in the network I can must run the client and server 
//in the same system. 
Socket mysock = new Socket("192.168.1.121", 8080);
InputStream myobj = mysock.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(myobj));//to read data from the socket into the client 
Str = br.readLine();//To read data from the buffer
br.close();//close the buffer reader connections
mysock.close();//close the socket connection 
/*
 To receive data from the server it is better to use bufferedReader as inputStream
 To send data from the client I use the DataOutputStrema
*/
```

#### Two way communication
```java
InputStream myobj = mysock.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(myobj));
OutputStream myobj = mysock.getOutputStream();
DataOutputStream doutst = new DataOuputStream(myobj);
doutst.writeBytes();//used to send strings in the form of groups of bytes
```