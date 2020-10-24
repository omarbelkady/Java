```
Streams move data from one place to another. Streams are categorized into two
input and OutputStream.

InputStream: receives or reads data from a source
OutputStream: sends or writes data to destination

Input and output stream classes are abstract

We can attach Keyboard to DataInputStream similar to keyboard events
in JS
```

### Attaching a Keyboard to datainputStream
```java
DataInputStream cin = new DataInputStream(System.in);
```

### Display Error messages on monitor
```java
System.err
```


### Byte Stream
```
represents data in the form of individual bytes
if a class ends with the word stream, then it 
is understood that it is a byte stream

Byte streams are used to handle chars, images, audios and videos
```

### Text Stream
```
represents data as characters of each 2 bytes
and class name that ends with Reader or Writer are taken as a text
stream. This type of stream stores and receives data in the form
of chars only.

```

### How To Create A File using a Stream
```java
File myfil = new File("c:/Home/MyFile.txt");
String str = "Tell 2526 to learn 27736259";
FileWriter fw = new FileWriter(myfil);
fw.write(str);
fw.close();
myfil.close();
```


### How To Read A File using FileReader
```java
File myfile = new File("c:/Home/MyFile.txt");
BufferedReader mybr = new BufferedReader(new FileReader(myfile));
String pintosllpfanb;
while((pintosllpfanb=mybr.readLine())!=null)
{
	System.out.println(pintosllpfanb);
}
```

