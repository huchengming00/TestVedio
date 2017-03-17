//package Dao;
//
//import android.app.Activity;
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import test.hcm.com.testapplication.BDHelper;
//
///**
// * 项目名SIM+Coffee-Android客户端
// * Created by ${huchengming} on 2017-03-06.
// */
//
//public class PepoleDao {
//    public static PepoleDao instance;
//    public BDHelper mBdHelper;
//    public SQLiteDatabase DB;
//    public Context context;
//    private PepoleDao(Context context){
//        mBdHelper = BDHelper.getInstance(context);
//        DB = mBdHelper.getWritableDatabase();
//        this.context = context;
//    }
//    public static PepoleDao instance(Context context){
//        if(instance ==null){
//            synchronized (PepoleDao.class){
//                if(instance==null){
//                    instance = new PepoleDao(context);
//                }
//            }
//        }
//        return instance;
//    }
//
//    private  void addPeople(){
//        ContentValues m = new ContentValues();
//        m.put("title","fff");
//        DB.update("people",m,"id = ?",new String[]{"e"});
//        DB.delete("peopel","id=?",new String[]{"2"});
//        DB.insert("peopel",null,m);
//        DB.execSQL("DELETE FROM people where id = ?",new String[]{"1"});
//        DB.execSQL("DROP TABLE IF EXISTS ?" ,new String[]{"people"});
//        DB.execSQL("CREATE INDEX IF NOT EXISTS ?  people{title}");
//    }
//
//    private void getHttp(){
//        Request request= new Request.Builder().addHeader("rang","").build();
//    }
//}
