package test.hcm.com.testapplication;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.logging.Level;

/**
 * 项目名SIM+Coffee-Android客户端
 * Created by ${huchengming} on 2016-10-13.
 */
public class RealClass extends AbstactClass implements InterfaceClassA{

    @Override
    public void A() {
        this.b();
        this.abstractB= "222";
    }

    @Override

    public void interfaceClass() {
        this.abstractB= justA;
        this.abstractB= "222";
    }
    String b = this.abstractB ;

   public void C() throws FileNotFoundException {
       try {
           InputStream inputStream = new FileInputStream(new File("ffff"));
           OutputStream outputStream = new FileOutputStream(new File("q.txt"));
           byte[] buffer = new byte [1024];
           try {
               int lent =0;
               if((lent = inputStream.read(buffer,0,buffer.length))!=-1){
                   outputStream.write(buffer,0,lent);
               };
           } catch (IOException e) {
               e.printStackTrace();
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }

       ByteArrayOutputStream byteArrayOutputStream = null;
       DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File("fff")));
       byte []bufferByte = new byte[1024];
       int size = 1024;
       int lent = 0;
       try {
           while ((lent =dataInputStream.read(bufferByte,0,1024))!=-1){
              byteArrayOutputStream.write(bufferByte,0,lent);
           }
           byteArrayOutputStream.flush();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
