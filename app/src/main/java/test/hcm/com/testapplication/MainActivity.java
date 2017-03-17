package test.hcm.com.testapplication;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.shshare.jijiehao.app.aidl.MyData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import butterknife.BindBitmap;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends FragmentActivity implements BlankFragment.OnFragmentInteractionListener {
    TextView textView;
    MyData myData;
    //    int []a = {2,4,6,7,8,9,3,1,5,7};
    String stringb = new String("xxx");
    int[] arry = {3, 2};
    static LinkedList<Integer> mBlockingQueue = new LinkedList<Integer>();
    static final int MaxSize = 10;
    @BindView(R.id.test_text)
    TextView testText;
    @BindView(R.id.test_thread)
    Button testThread;
    @BindView(R.id.vvvvvv)
    FrameLayout vvvvvv;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.image_view)@BindBitmap(R.drawable.ic_launcher)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                try {
                    textView.setText(myData.getData("eeeee") + "");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
        textView = (TextView) findViewById(R.id.test_text);
        Button testButton = (Button) findViewById(R.id.test_thread);
        System.out.println("主线程onCreate  CurrentThread = " + Thread.currentThread().getName());
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mThread.start();
                Intent mintent = new Intent(MyData.class.getName());
                bindService(mintent, msServiceConnection, Context.BIND_AUTO_CREATE);
            }
        });
        textTheard();
        Log.i("HCM", "------------------onCreate-----------------");
        Integer a = 50;
        Integer b = 50;
        Log.i("HCM", (a == b) + "*******************************1");
        a = 500;
        b = 500;
        Log.i("HCM", (a == b) + "*******************************2");
        a = 50;
        b = 50;
        Log.i("HCM", (a == b) + "*******************************3");
        Log.i("Fragment", "onCreate_Activity");
        BlankFragment mfragment = new BlankFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.vvvvvv, mfragment);
        ft.commit();
        Random r = new Random();
        LinkedHashMap<String, String> list = new LinkedHashMap<String, String>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");

        AsyncTask asyncTask = new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] params) {
                return null;
            }
        };

        BlockingQueue<String> m = new LinkedBlockingDeque<String>(120);

    }

    ServiceConnection msServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myData = MyData.Stub.asInterface(service);
            Log.i("HCM", "------------------绑定成功-----------------");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    @Override
    protected void onStart() {
        super.onStart();
//        Log.i("HCM","------------------onStart-----------------");
        Log.i("Fragment", "onStart_Activity");

//      c();
        B();
    }


    public void C() {
        int a[] = new int[10];
        LinkedList<String> b = new LinkedList<String>();
        b.offerFirst("1");
        b.offerFirst("2");
        b.offerFirst("3");
        b.offerFirst("4");
        b.offerFirst("5");
        Stack<String> mStack = new Stack<>();
        mStack.push("");
        mStack.pop();

        b.pollFirst();
    }

    @OnClick({R.id.test_text, R.id.test_thread})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.test_text:
                break;
            case R.id.test_thread:
                break;
        }
    }

    enum tetEnum {
        heheh,
        hhhh,
        feffdfsf
    }

    public void B() {
        int[] a = {3, 4, 5, 1, 7, 9, -4, -88, -3333, 5555, 7678544, -678};
        int max = 0;
        int min = 0;
        for (int i = 0; i < a.length; i++) {

            if (i == 0) {
                max = a[i];
                min = a[i];
            } else {
                if (max < a[i]) {
                    max = a[i];
                }
                if (min > a[i]) {
                    min = a[i];
                }
            }
        }
        System.out.println("---------------min:" + min + "----max:" + max + "----------");
    }

    private void c() {

//        int size = a.length;
//        for(int i = 0;i<size-1;i++){
//            for(int j=0;j<size-i-1;j++){
//                if(a[j]>a[j+1]){
//                    exchange(j);
//                }
//            }
//        }
//        System.out.print();


        x(stringb, arry);
        Toast.makeText(this, Arrays.toString(arry) + "---------" + stringb, Toast.LENGTH_LONG).show();
        Arrays.asList(arry);
//        RecyclerView mRecyclerView = null;
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

//        Toast.makeText(this,Arrays.toString(a),Toast.LENGTH_LONG).show();
        List<String> mList = new ArrayList<>();
        while (mList.iterator().hasNext()) {
            mList.iterator().next();
        }
        mList.add("2222");
        mList.add("333333333333333");
        mList.add("444444444444");
        mList.add("55555555555");
        mList.add("66666666666");
        mList.add("7");
        mList.add("55");
        mList.add("6666");
        Collections.sort(mList, mComparator);
        Iterator mInterator = mList.iterator();
        while (mInterator.hasNext()) {
            System.out.println("------------------" + mInterator.next() + "---------------");
        }
//        synchronized (mList){
//
//            try {
//                mList.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        new Thread(new Product()).start();
//        new Thread(new Cuestem()).start();
        short a = 1;
        a += 1;
        String mString = "ahdbfudyhvdfsdf";
        System.out.println("---------" + mString + "----------");
        char[] charlist = mString.toCharArray();
        for (int i = 0; i < charlist.length / 2; i++) {
            char temp = charlist[i];
            charlist[i] = charlist[charlist.length - i - 1];
            charlist[charlist.length - i - 1] = temp;
        }
        System.out.println("---------" + String.copyValueOf(charlist) + "----------");

        getAC();
    }

    public void getAC() {
        for (int a = 0; a <= 9; a++) {
            for (int c = 0; c <= 9; c++) {
                if (a + c == 13) {
                    System.out.println("--------a:" + a + "--------c:" + c);
                }
            }
        }
    }

    class Product implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (mBlockingQueue) {
                    if (mBlockingQueue.size() == MaxSize) {
                        try {
                            System.out.println("-------------Product:wait" + "-----------");
                            mBlockingQueue.wait();
                            System.out.println("-------------Product:wait_Over" + "-----------");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    mBlockingQueue.offer(1);
                    System.out.println("-------------Product" + mBlockingQueue.size() + "-----------");
                    mBlockingQueue.notify();
                }
            }

        }
    }

    class Cuestem implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (mBlockingQueue) {
                    if (mBlockingQueue.size() == 0) {
                        try {
                            System.out.println("-------------Cuestem:wait" + "-----------");
                            mBlockingQueue.wait();
                            System.out.println("-------------Cuestem:wait_over" + "-----------");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    mBlockingQueue.poll();
                    System.out.println("-------------Cuestem" + mBlockingQueue.size() + "-----------");
                    mBlockingQueue.notify();
                }
            }
        }
    }

    Comparator<String> mComparator = new Comparator<String>() {
        @Override
        public int compare(String lhs, String rhs) {
            if (lhs.length() > rhs.length()) {
                return -1;
            } else if (lhs.length() < rhs.length()) {
                return 1;
            }
            return 0;
        }
    };

    private void x(String stringb, int arry[]) {
        int[] y = {1, 1};
        arry[0] = 1;
        arry[1] = 1;
        stringb = "rrrrr";
    }

    private void exchange(int j) {
//        int temp = a[j];
//        a[j]=a[j+1];
//        a[j+1]=temp;
        WebView r = null;
    }


    @Override
    protected void onRestart() {
        super.onRestart();
//        Log.i("HCM","------------------onRestart-----------------");
        Log.i("Fragment", "onRestart_Activity");
        runOnUiThread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

//        Log.i("HCM","------------------onResume-----------------");
        Log.i("Fragment", "onResume_Activity");
        String mString = "aaddfffvvvvverrr";
        List<String> mStringList = new ArrayList<>();
        StringBuilder mStringBuilder = new StringBuilder();
        char temp = 's';
        for (int i = 0; i < mString.length(); i++) {
            if (i == 0) {
                temp = mString.charAt(i);
                mStringBuilder.append(temp);
            } else {
                if (mString.charAt(i) == temp) {
                    mStringBuilder.append(mString.charAt(i));
                } else {
                    mStringList.add(mStringBuilder.toString());
                    mStringBuilder.delete(0, mStringBuilder.length());
                    temp = mString.charAt(i);
                    mStringBuilder.append(temp);
                }
            }
        }
        for (int i = 0; i < mStringList.size(); i++) {
            System.out.println("------------------" + mStringList.get(i) + "-------------");

        }
    }

    @Override
    protected void onPause() {
        super.onPause();
//
        Log.i("Fragment", "onPause_Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
//        Log.i("HCM","------------------onStop-----------------");
        Log.i("Fragment", "onStop_Activity");
    }


    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
//        Log.i("HCM","------------------onSaveInstanceState-----------------");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
//        Log.i("HCM","------------------onRestoreInstanceState-----------------");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
//        Log.i("HCM","------------------onConfigurationChanged-----------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Log.i("HCM","------------------onDestroy-----------------");
        Log.i("Fragment", "onDestroy_Activity");
    }

    Thread mThread = new Thread(new Runnable() {

        @Override
        public void run() {
//                        textView.setText("子线程刷新界面");
            Handler handler = new Handler() {
                @Override
                public void handleMessage(Message msg) {
                    super.handleMessage(msg);
                    System.out.println(" 子线程handleMessage CurrentThread = " +
                            Thread.currentThread().getName());
                    textView.setText("子线程handler刷新界面");
                }
            };
            textTheard();
            AsyncTask mAsyncTask = new AsyncTask() {
                @Override
                protected Object doInBackground(Object[] params) {
                    return null;
                }

                @Override
                protected void onPostExecute(Object o) {
                    super.onPostExecute(o);
                }
            };
        }
    });


    public void textTheard() {
        System.out.println(" 子线程handleMessage CurrentThread = " +
                Thread.currentThread().getName());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}
