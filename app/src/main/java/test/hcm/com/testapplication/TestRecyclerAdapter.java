package test.hcm.com.testapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.zip.Inflater;

/**
 * 项目名SIM+Coffee-Android客户端
 * Created by ${huchengming} on 2017-03-03.
 */

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestHolder> {
    List<String> list;
    Context context;
    public TestRecyclerAdapter(Context context,List<String> list){
        this.list = list;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        return 1;
    }

    @Override
    public TestHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TestHolder mTestHolder=null;
        if(viewType==1){
            View mView = LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false);
             mTestHolder = new TestHolder(mView);

        }
        return mTestHolder;
    }

    @Override
    public void onBindViewHolder(TestHolder holder, int position) {
        holder.textView.setText("heheheh");
        holder.mImageView.setImageResource(R.drawable.ic_launcher);
        ExecutorService mExecutors = Executors.newCachedThreadPool();
        FutureTask<String> mFutureTask = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return null;
            }
        });
        mExecutors.submit(mFutureTask);
        mExecutors.execute(mFutureTask);
        Collections.reverse(new LinkedList<Object>());
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }
}

class TestHolder extends RecyclerView.ViewHolder {
    TextView textView;
    ImageView mImageView;

    public TestHolder(View itemView) {
        super(itemView);

    }
}