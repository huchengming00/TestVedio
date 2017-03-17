package test.hcm.com.testapplication;

import android.app.IntentService;
import android.content.Intent;

/**
 * 项目名SIM+Coffee-Android客户端
 * Created by ${huchengming} on 2017-03-03.
 */

public class TestIntentSrvice extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public TestIntentSrvice(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
