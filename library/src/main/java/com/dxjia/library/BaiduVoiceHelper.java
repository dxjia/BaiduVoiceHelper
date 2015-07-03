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
     * @param activity the call activity
     * @param apiKey your own baidu voice apikey
     * @param secret your baidu voice secret
     * @param requestId the request id in ui for receiving result
     */
    public static void startBaiduVoiceDialogForResult(Activity activity, String apiKey,
                                                      String secret, int requestId) {
        Intent intent = new Intent();
        setNecessaryParams(intent, apiKey, secret);
        activity.startActivityForResult(intent, requestId);
    }

    /**
     * @param activity the call activity
     * @param apiKey your api key
     * @param secret your secret
     * @param intent the intent contains your own extras
     * @param requestId the request id
     */
    public static void startBaiduVoiceDialogForResult(Activity activity, String apiKey,
                                                      String secret, Intent intent, int requestId) {
        setNecessaryParams(intent, apiKey, secret);
        activity.startActivityForResult(intent, requestId);
    }

    /**
     * @param fragment the fragment calls from
     * @param apiKey your apikey
     * @param secret your secret
     * @param requestId the request id in ui
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void startBaiduVoiceDialogForResult(Fragment fragment, String apiKey,
                                                      String secret, int requestId) {
        Intent intent = new Intent();
        setNecessaryParams(intent, apiKey, secret);
        fragment.startActivityForResult(intent, requestId);
    }

    /**
     * @param fragment the call fragment
     * @param apiKey your apikey
     * @param secret your secret
     * @param intent the intent contains your own extras
     * @param requestId the request id
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void startBaiduVoiceDialogForResult(Fragment fragment, String apiKey,
                                                      String secret, Intent intent, int requestId) {
        setNecessaryParams(intent, apiKey, secret);
        fragment.startActivityForResult(intent, requestId);
    }

    /**
     *
     * @param v4Fragment support v4 fragment
     * @param apiKey apikey
     * @param secret your secret
     * @param requestId the ui request id which receive the result data
     */
    public static void startBaiduVoiceForV4Fragment(android.support.v4.app.Fragment v4Fragment,
                                                      String apiKey, String secret, int requestId) {
        Intent intent = new Intent();
        setNecessaryParams(intent, apiKey, secret);
        v4Fragment.startActivityForResult(intent, requestId);
    }

    /**
     *
     * @param v4Fragment support v4 fragment
     * @param apiKey apikey
     * @param secret your secret
     * @param intent the intent have your own extras
     * @param requestId the ui request id which receive the result data
     */
    public static void startBaiduVoiceForV4Fragment(android.support.v4.app.Fragment v4Fragment,
                                                      String apiKey, String secret, Intent intent,
                                                      int requestId) {
        setNecessaryParams(intent, apiKey, secret);
        v4Fragment.startActivityForResult(intent, requestId);
    }

    /**
     * @param intent your own intent
     * @param apiKey your apikey
     * @param secret your secret
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
