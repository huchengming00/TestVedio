//package test.hcm.com.testapplication;
//
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
///**
// * 项目名SIM+Coffee-Android客户端
// * Created by ${huchengming} on 2017-03-06.
// */
//
//public class BDHelper extends SQLiteOpenHelper {
//    public static BDHelper instance;
//    private BDHelper(Context context){
//        super(context,"hhh",null,1);
//    }
//
//    private BDHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, name, factory, version);
//    }
//
//   public static BDHelper getInstance(Context context){
//       if (instance==null){
//           synchronized (BDHelper.class){
//               if(instance ==null){
//                   instance = new BDHelper(context);
//               }
//           }
//       }
//       return instance;
//   }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//            db.execSQL("CREATE TABLE diary (_id INTERGER　PRIMARY KEY AUTOCREMENT, title TEXT (100) " +
//                    ", content TEXT (1000)");
//            db.execSQL("CREATE TABLE people （_id INTERGER PRIMARY AUTOCREMENT , title Text （100），" +
//                    "content TEXT （1000）");
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//            db.execSQL("ALTER TABLE　peopel ADD name TEXT (100)");
//            db.execSQL("DROP TABLE IF EXIST animal");
//    }
//}
