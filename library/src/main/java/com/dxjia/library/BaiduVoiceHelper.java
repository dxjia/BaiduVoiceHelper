package com.dxjia.library;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;

/**
 * Created by 德祥 on 2015/7/2.
 */
public class BaiduVoiceHelper {

    public static final String EXTRA_KEY = "key";
    public static final String EXTRA_SECRET = "secret";

    public static final String EXTRA_SOUND_START = "sound_start";
    public static final String EXTRA_SOUND_END = "sound_end";
    public static final String EXTRA_SOUND_SUCCESS = "sound_success";
    public static final String EXTRA_SOUND_ERROR = "sound_error";
    public static final String EXTRA_SOUND_CANCEL = "sound_cancel";

    /**
     *
     * add default sound params
     * just for easy using
     * @param activity where call from
     * @param apiKey your baidu voice apikey
     * @param secret your baidu voice secret
     * @param requestId request id for UI
     */
    public static void startBaiduVoiceDialogForResult(Activity activity, String apiKey,
                                                      String secret, int requestId) {
        Intent intent = new Intent();
        setNecessaryParams(intent, apiKey, secret);
        activity.startActivityForResult(intent, requestId);
    }

    /**
	 * just for easy using
     * @param activity where call from
     * @param apiKey your baidu voice apikey
     * @param secret your baidu voice secret
     * @param intent the intent cotained your custom extras, see more in baidu docs
     * @param requestId request id for UI
     */
    public static void startBaiduVoiceDialogForResult(Activity activity, String apiKey,
                                                      String secret, Intent intent, int requestId) {
        setNecessaryParams(intent, apiKey, secret);
        activity.startActivityForResult(intent, requestId);
    }

    /**
	 * just for easy using
     * @param fragment where call from
     * @param apiKey your baidu voice apikey
     * @param secret your baidu voice secret
     * @param requestId request id for UI
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void startBaiduVoiceDialogForResult(Fragment fragment, String apiKey,
                                                      String secret, int requestId) {
        Intent intent = new Intent();
        setNecessaryParams(intent, apiKey, secret);
        fragment.startActivityForResult(intent, requestId);
    }

    /**
	 * just for easy using
     * @param fragment where call from
     * @param apiKey your baidu voice apikey
     * @param secret your baidu voice secret
     * @param intent the intent cotained your custom extras, see more in baidu docs
     * @param requestId request id for UI
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void startBaiduVoiceDialogForResult(Fragment fragment, String apiKey,
                                                      String secret, Intent intent, int requestId) {
        setNecessaryParams(intent, apiKey, secret);
        fragment.startActivityForResult(intent, requestId);
    }

    /**
	 * set necessary params, apikey,secrect, sounds and action
     * @param intent the intent cotained your custom extras, see more in baidu docs
     * @param apiKey your baidu voice apikey
     * @param secret your baidu voice secret
     */
    public static void setNecessaryParams(Intent intent, String apiKey, String secret) {
        intent.putExtra(EXTRA_KEY, apiKey);
        intent.putExtra(EXTRA_SECRET, secret);

        intent.putExtra(EXTRA_SOUND_START, R.raw.bdspeech_recognition_start);
        intent.putExtra(EXTRA_SOUND_END, R.raw.bdspeech_speech_end);
        intent.putExtra(EXTRA_SOUND_SUCCESS, R.raw.bdspeech_recognition_success);
        intent.putExtra(EXTRA_SOUND_ERROR, R.raw.bdspeech_recognition_error);
        intent.putExtra(EXTRA_SOUND_CANCEL, R.raw.bdspeech_recognition_cancel);

        intent.setAction("com.baidu.action.RECOGNIZE_SPEECH");
    }
}
