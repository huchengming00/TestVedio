package test.hcm.com.testapplication;

import android.os.Parcel;
import android.os.Parcelable;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 项目名SIM+Coffee-Android客户端
 * Created by ${huchengming} on 2017-02-24.
 */

public class TestBeen implements Parcelable {
    private int name;
    private int age;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected TestBeen(Parcel in) {
    }

    public static final Creator<TestBeen> CREATOR = new Creator<TestBeen>() {
        @Override
        public TestBeen createFromParcel(Parcel in) {
            return new TestBeen(in);
        }

        @Override
        public TestBeen[] newArray(int size) {
            return new TestBeen[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public enum Stat{
        HH,
        RR,
        yy
    }


    public void sort(){
        int size = 10;
        ArrayList<String> list = new ArrayList<String>();
        list.size();
        list.add("2");
        list.remove(list.size()-1);
        LinkedList<Integer> listB = new LinkedList<>();
        listB.offer(1);
        listB.poll();
        int []a = {1,2,5,6,2};
        size = a.length;
        for(int i =0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] =a[j+1];
                    a[j-1] = temp;
                }
            }
        }
        int min=0;
        int max = size-1;
        int b=6;
        while (min<=max){
            int middle = min+(max-min)>>1;
            if(b==a[middle]){
                return;
            }else if(b<a[middle]){
                max = middle-1;
            }else{
                min =middle+1;
            }

        }
    }

}
