package com.example.safalcrm.utillity;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;

import io.paperdb.Paper;


public class PreferenceManager {

    public static PreferenceManager preferenceManager;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    public PreferenceManager(Context context) {
        preferenceManager = this;
        mSharedPreferences = context.getSharedPreferences(VariableBag.PREF_NAME, Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
        Paper.init(context);
    }

    public static PreferenceManager getPreferenceManager() {
        return preferenceManager;
    }

    public static void setPreferenceManager(PreferenceManager preferenceManager) {
        PreferenceManager.preferenceManager = preferenceManager;
    }



    public static PreferenceManager getInstance() {
        return preferenceManager;
    }

    public static String toCamelCase(String str) {

        if (str == null) {
            return null;
        }

        boolean space = true;
        StringBuilder builder = new StringBuilder(str);
        final int len = builder.length();

        for (int i = 0; i < len; ++i) {
            char c = builder.charAt(i);
            if (space) {
                if (!Character.isWhitespace(c)) {
                    // Convert to title case and switch out of whitespace mode.
                    builder.setCharAt(i, Character.toTitleCase(c));
                    space = false;
                }
            } else if (Character.isWhitespace(c)) {
                space = true;
            } else {
                builder.setCharAt(i, Character.toLowerCase(c));
            }
        }

        return builder.toString();
    }

    public SharedPreferences getmSharedPreferences() {
        return mSharedPreferences;
    }

    public void setmSharedPreferences(SharedPreferences mSharedPreferences) {
        this.mSharedPreferences = mSharedPreferences;
    }

    public SharedPreferences.Editor getmEditor() {
        return mEditor;
    }

    public void setmEditor(SharedPreferences.Editor mEditor) {
        this.mEditor = mEditor;
    }

    public void clearPreferences() {
        try {
            Paper.book().destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        mEditor.clear();
        mEditor.commit();
    }

    /*set preference for registration*/

    public void removePref(Context context, String keyToRemove) {
        mSharedPreferences = context.getSharedPreferences(VariableBag.PREF_NAME, Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
        mEditor.remove(keyToRemove);
        mEditor.commit();
    }


    public String getRegisteredUserId() {
        String strUserId = mSharedPreferences.getString(VariableBag.USER_ID, "0");
        return strUserId;
    }

    public void setRegisteredUserId(String strUserId) {
        mEditor.putString(VariableBag.USER_ID, strUserId).commit();
    }

    public int getlastTimeLineEntry() {
        int strUserId = mSharedPreferences.getInt(VariableBag.LAST_TIME_LINE_ENTRY, 0);
        return strUserId;
    }

    public void setlastTimeLineEntry(int lastTimelineId) {
        mEditor.putInt(VariableBag.LAST_TIME_LINE_ENTRY, lastTimelineId).commit();
    }



    public String getCountryId() {
        String strUserId = mSharedPreferences.getString(VariableBag.COUNTRY_ID, "0");
        return strUserId;
    }

    public void setCountryId(String countryId) {
        mEditor.putString(VariableBag.COUNTRY_ID, countryId).commit();
    }

    public String getStateId() {
        String strUserId = mSharedPreferences.getString(VariableBag.STATE_ID, "0");
        return strUserId;
    }

    public void setStateId(String stateId) {
        mEditor.putString(VariableBag.STATE_ID, stateId).commit();
    }

    public String getCityId() {
        String strUserId = mSharedPreferences.getString(VariableBag.CITY_ID, "0");
        return strUserId;
    }

    public void setCityId(String cityId) {
        mEditor.putString(VariableBag.CITY_ID, cityId).commit();
    }

    public String getAreaId() {
        String strUserId = mSharedPreferences.getString(VariableBag.AREA_ID, "0");
        return strUserId;
    }

    public void setAreaId(String areaId) {
        mEditor.putString(VariableBag.AREA_ID, areaId).commit();
    }

    public void deleteLoginsession() {
        mEditor.putBoolean(VariableBag.LOGIN, false);
        mEditor.commit();
    }

    public void setLoginSession() {
        mEditor.putBoolean(VariableBag.LOGIN, true);
        mEditor.commit();
    }

    public boolean getLoginSession() {
        boolean login = mSharedPreferences.getBoolean(VariableBag.LOGIN, false);
        return login;
    }


    public void setLogEntry(Boolean b) {
        mEditor.putBoolean(VariableBag.LOG_ENTRY, b);
        mEditor.commit();
    }

    public boolean getLogEntry() {
        boolean login = mSharedPreferences.getBoolean(VariableBag.LOG_ENTRY, false);
        return login;
    }


    public void setCurrentSociety(String key, String value) {
        mEditor.putString(key, value);
        mEditor.commit();
    }

    public String getCurrentSociety(String key) {
        return mSharedPreferences.getString(key, "");
    }

    public boolean getFirstSession() {
        boolean login = mSharedPreferences.getBoolean("first_start", false);
        return login;
    }
    public void setFirstSession(boolean wiFiSession) {
        mEditor.putBoolean("first_start", wiFiSession).commit();
    }

    public void setApikey(String wiFiSession) {
        mEditor.putString("key", wiFiSession).commit();
    }

    public String getApiKey() {
        return mSharedPreferences.getString("key", "0");
    }


    public void setKeyValueString(String key, String value) {
        mEditor.putString(key, value).commit();
    }

    public int getVersionCode() {
        int getValue = mSharedPreferences.getInt(VariableBag.VERSION_CODE, 0);
        return getValue;
    }

    public void setVersionCode(int value) {
        mEditor.putInt(VariableBag.VERSION_CODE, value).commit();
    }

    public void setKeyValueInt(String key, int value) {
        mEditor.putInt(key, value).commit();
    }

    public void setKeyValueBoolean(String key, boolean value) {
        mEditor.putBoolean(key, value).commit();
    }

    public boolean getFirstTime() {
        boolean val = mSharedPreferences.getBoolean("firstTime", false);
        return val;
    }

    public void setFirstTime(boolean key) {
        mEditor.putBoolean("firstTime", key).commit();
    }

    public String getBackBanner() {
        return mSharedPreferences.getString("bannerBack", VariableBag.BACKIMG);
    }

    public void setBackBanner(String key) {
        mEditor.putString("bannerBack", key).commit();
    }

    public String getKeyValueString(String key) {
        String getValue = mSharedPreferences.getString(key, " ");
        return getValue;
    }

    public int getKeyValueInt(String key) {
        int getValue = mSharedPreferences.getInt(key, 0);
        return getValue;
    }

    public boolean getKeyValueBoolean(String key) {
        boolean getValue = mSharedPreferences.getBoolean(key, false);
        return getValue;
    }

    public void setUserFullName(String userFullName) {
        mEditor.putString(VariableBag.FULL_NAME, userFullName).commit();
    }

    public String getUserFullName() {
        return mSharedPreferences.getString(VariableBag.FULL_NAME, "");
    }

    public void setUserEmail(String userEmail) {
        mEditor.putString(VariableBag.EMAIL, userEmail).commit();
    }

    public String getUserEmail() {
        return mSharedPreferences.getString(VariableBag.EMAIL, "");
    }

    public void setMobilePrivacy(String privacy) {
        mEditor.putString(VariableBag.MOBILE_PRIVACY, privacy).commit();
    }

    public String getMobilePrivacy() {
        return mSharedPreferences.getString(VariableBag.MOBILE_PRIVACY, "");
    }

    public void setWhatsAppPrivacy(String privacy) {
        mEditor.putString(VariableBag.WHATSAPP_PRIVACY, privacy).commit();
    }

    public String getWhatsAppPrivacy() {
        return mSharedPreferences.getString(VariableBag.WHATSAPP_PRIVACY, "");
    }

    public void setEmailPrivacy(String privacy) {
        mEditor.putString(VariableBag.EMAIL_PRIVACY, privacy).commit();
    }

    public String getEmailPrivacy() {
        return mSharedPreferences.getString(VariableBag.EMAIL_PRIVACY, "");
    }

    public void setClassifiedSound(String privacy) {
        mEditor.putString(VariableBag.CLASSIFIED_SOUND, privacy).commit();
    }

    public String getClassifiedSound() {
        return mSharedPreferences.getString(VariableBag.CLASSIFIED_SOUND, "");
    }

    public void setObject(String key, Object object) {
        Gson gson = new Gson();
        String json = gson.toJson(object);
        mEditor.putString(key, json).commit();
    }

    public <GenericClass> GenericClass getObject(String key, Class<GenericClass> object) {
        try {
            Gson gson = new Gson();
            String json = mSharedPreferences.getString(key, "");
            return gson.fromJson(json, object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setArrayList(String key, ArrayList<String> list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        Log.e("**** ids - ", json);
        mEditor.putString(key, json).commit();
    }

    public ArrayList<String> getArrayList(String key) {
        Gson gson = new Gson();
        String json = mSharedPreferences.getString(key, null);
        Log.e("**** get ids - ", json);
        Type type = new TypeToken<ArrayList<String>>() {
        }.getType();
        return gson.fromJson(json, type);
    }

    public void setJSONPref(String key, String json) {
        mEditor.putString(key, json).commit();
    }

    public JSONObject getJSONObject(String key) {
        try {
            return new JSONObject(mSharedPreferences.getString(key, ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONArray getJSONArray(String key) {
        try {
            return new JSONArray(mSharedPreferences.getString(key, ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getJSONKeyString(String objKey, String stringKey) {
        JSONObject obj = getJSONObject(objKey);
        if (objKey != null) {
            try {
                return obj.getString(stringKey);
            } catch (JSONException e) {
                e.printStackTrace();
                return "";
            }
        } else {
            return "";
        }
    }

    public boolean getNotificationSoundSetting(){
        return mSharedPreferences.getBoolean(VariableBag.NOTI_SOUND_SETTING, true);
    }

    public void setNotificationSoundSetting(boolean value){
        mEditor.putBoolean(VariableBag.NOTI_SOUND_SETTING, value).commit();
    }

    public void setNotificationVibrationSetting(boolean v){
        mEditor.putBoolean(VariableBag.NOTI_VIBR_SETTING, v);
        mEditor.commit();
    }

}


