package com.example.safalcrm.service;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;

import androidx.core.app.NotificationCompat;

//import com.google.firebase.messaging.RemoteMessage;
//import com.example.safalcrm.Activity.DashBoard.DashboardActivity;
//import com.example.safalcrm.Activity.Login.LoginActivity;
//import com.example.safalcrm.Activity.Members.ViewMemberProfileDetails;
//import com.example.safalcrm.Activity.Notification.CustomNotificationActivity;
//import com.example.safalcrm.Fragment.Timeline.SingleFeedActivity;
//import com.example.safalcrm.R;
//import com.example.safalcrm.chat.activity.ChatViewActivity;
//import com.example.safalcrm.network.RestCall;
//import com.example.safalcrm.network.RestClient;
import com.example.safalcrm.utillity.Delegate;
import com.example.safalcrm.utillity.PreferenceManager;
import com.example.safalcrm.utillity.Tools;

import org.json.JSONObject;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Random;

public class FirebaseDataReceiver /*extends BroadcastReceiver*/ {

    static int numMessages = 0;
    NotificationManager notificationManager;
    Bitmap bitmap;
    PreferenceManager preferenceManager;
    String TAG = "FirebaseDataReceiver";
//    RestCall restCall;
    Tools tools;

//    @Override
//    public void onReceive(Context context, Intent var1) {
//        Log.e(TAG, "I'm in!!!");
//        String var2 = var1.getAction();
//        tools = new Tools(context);
//        restCall = RestClient.createService(RestCall.class);
//        notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
//        preferenceManager = new PreferenceManager(context);
//        if ("com.google.android.c2dm.intent.RECEIVE".equals(var2)) {
//
//            Bundle var20;
//
//            if ((var20 = var1.getExtras()) == null) {
//                var20 = new Bundle();
//            }
//
//            var20.remove("android.support.content.wakelockid");
//
//            RemoteMessage remoteMessage = new RemoteMessage(var20);
//            final String title = remoteMessage.getData().get("title");
//            final String message = remoteMessage.getData().get("body");
//            final String clickAction = remoteMessage.getData().get("click_action");
//            String image = remoteMessage.getData().get("image");
//            final String menuClick = remoteMessage.getData().get("menuClick");
//
//            Log.e("##", "" + title);
//            Log.e("##", "" + message);
//            Log.e("##", "" + menuClick);
//
//
//            if(Delegate.dashboardActivity != null && !Delegate.dashboardActivity.isDestroyed()){
//                Delegate.dashboardActivity.CheckLogin();
//            }
//            if (image != null) {
//                if (image.contains("logo.png")) {
//                    bitmap = null;
//                    image = null;
//                } else {
//                    bitmap = getBitmapFromUrl(image);
//                }
//            }
//
//            JSONObject mainObject = null;
//            try {
//                if (title != null) {
//                    if (title.equalsIgnoreCase("logout")) {
//                        boolean foregroud = new ForegroundCheckTask().execute(context).get();
//                        if (foregroud) {
//                            preferenceManager.deleteLoginsession();
//                            preferenceManager.clearPreferences();
//                            Intent intent = new Intent(context, LoginActivity.class);
//                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                            context.startActivity(intent);
//                        } else {
//                            preferenceManager.deleteLoginsession();
//                            preferenceManager.clearPreferences();
//                            Intent intent = new Intent(context, LoginActivity.class);
//                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                            context.startActivity(intent);
//                        }
//
//                    }
//                    if (menuClick != null && menuClick.equalsIgnoreCase("chatMsg")) {
//                        try {
//                            if (Delegate.chatWebView != null && !Delegate.chatWebView.isDestroyed()) {
//                                Delegate.chatWebView.refreshFcm();
//                            } else {
//                                sendNotification(context, title, message, clickAction, "", image, menuClick);
//                            }
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            sendNotification(context, title, message, clickAction, "", image, menuClick);
//                        }
//
//                        try {
//                            if (Delegate.chatMainActivity != null && !Delegate.chatMainActivity.isDestroyed()) {
//                                Delegate.chatMainActivity.refresh();
//                            }
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            //sendNotification(context,title,message,clickAction);
//                        }
//                    }
//                    else if (menuClick != null && menuClick.equalsIgnoreCase("Circulars")) {
//                        sendNotification(context, title, message, clickAction, "", image, menuClick);
//                    } else if (menuClick != null && menuClick.equalsIgnoreCase("logout")) {
//                        boolean foregroud = new ForegroundCheckTask().execute(context).get();
//                        if (foregroud) {
//                            preferenceManager.deleteLoginsession();
//                            preferenceManager.clearPreferences();
//                            Intent intent = new Intent(context, LoginActivity.class);
//                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                            context.startActivity(intent);
//                        } else {
//                            preferenceManager.deleteLoginsession();
//                            preferenceManager.clearPreferences();
//                            Intent intent = new Intent(context, LoginActivity.class);
//                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                            context.startActivity(intent);
//                        }
//
//                    }
//                    else {
//                        sendNotification(context, title, message, clickAction, "", image, menuClick);
//                    }
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//                sendNotification(context, title, message, clickAction, "", image, menuClick);
//            }
//
//            //sendNotification(context, title, message, clickAction, "", image, menuClick);
//        }
//    }
//
//    public Bitmap getBitmapFromUrl(String imageUrl) {
//
//        Log.e("firebase imge url  ", ": " + imageUrl);
//
//        StrictMode.ThreadPolicy policy =
//                new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);
//        try {
//            URL url = new URL(imageUrl);
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setDoInput(true);
//            connection.connect();
//            InputStream input = connection.getInputStream();
//            return BitmapFactory.decodeStream(input);
//
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            return null;
//
//        }
//    }
//
//    private void sendNotification(Context context, String title, String message, String clickAction, String society_id, String image, String menuClick) {
//        JSONObject mainObject = null;
//        Log.e(TAG, "I'm in!!! sendNotification");
//
//        Log.e("## menuClick : ",menuClick);
//        Log.e("## clickAction : ",clickAction);
//
//        if (title != null) {
//            try {
//                if (bitmap == null) {
//                    bitmap = BitmapFactory.decodeResource(context.getResources(),
//                            R.mipmap.ic_launcher_round);
//                }
//
//                int NOTIFICATION_COLOR = context.getResources().getColor(R.color.colorPrimary);
//                long[] VIBRATE_PATTERN = {0, 500};
//
//                String channelId = "channel-01";
//                String channelName = "Channel Name";
//                int importance = 0;
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//                    importance = NotificationManager.IMPORTANCE_HIGH;
//                }
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//                    NotificationChannel mChannel = new NotificationChannel(
//                            channelId, channelName, importance);
//
//                    mChannel.setShowBadge(true);
//                    mChannel.setDescription(title);
//                    mChannel.setLightColor(NOTIFICATION_COLOR);
//                    mChannel.setVibrationPattern(VIBRATE_PATTERN);
//                    mChannel.enableVibration(true);
//
//                    if (notificationManager != null) {
//                        notificationManager.createNotificationChannel(mChannel);
//                    }
//                }
//                Intent intent = null;
//
//                if (menuClick != null && menuClick.equalsIgnoreCase("chatMsg")) {
//                    intent = new Intent(context, ChatViewActivity.class);
//                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    mainObject = new JSONObject(clickAction);
//                    intent.putExtra("userType", mainObject.getString("userType"));
//                    intent.putExtra("userId", mainObject.getString("userId"));
//                    intent.putExtra("userProfile", mainObject.getString("userProfile"));
//                    intent.putExtra("userName", mainObject.getString("userName"));
//                    intent.putExtra("from", mainObject.getString("from"));
//                    intent.putExtra("sentTo", mainObject.getString("sentTo"));
//                    intent.putExtra("recidentMobile", mainObject.getString("recidentMobile"));
//                    intent.putExtra("publicMobile", mainObject.getString("publicMobile"));
//                }else if (menuClick != null && menuClick.equalsIgnoreCase("custom_notification")) {
//                    mainObject = new JSONObject(clickAction);
//                    intent = new Intent(context, CustomNotificationActivity.class);
//                    intent.putExtra("img", mainObject.getString("img"));
//                    intent.putExtra("title", mainObject.getString("title"));
//                    intent.putExtra("desc", mainObject.getString("desc"));
//                    intent.putExtra("time", mainObject.getString("time"));
//                }else if (menuClick.equalsIgnoreCase("timeline")) {
//                    intent = new Intent(context, SingleFeedActivity.class);
//                    intent.putExtra("feedId", clickAction);
//                    intent.putExtra("isFromFCM",true);
//                }
//                else if (menuClick != null && menuClick.equalsIgnoreCase("viewMemeber"))
//                {
//                    intent = new Intent(context, ViewMemberProfileDetails.class);
//                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    intent.putExtra("user_id",clickAction);
//                 }else {
//                    intent = new Intent(context, DashboardActivity.class);
//                    if (menuClick != null && menuClick.length() > 0) {
//                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        intent.putExtra("callVid", "6");
//                        intent.putExtra("menuClick", menuClick);
//                        Log.e("##", "else");
//                    }
//                }
//
//
//                PendingIntent pendingIntent = PendingIntent.getActivity(context, getRandomNumber(1, 10000), intent,
//                        PendingIntent.FLAG_ONE_SHOT);
//
//                //pendingIntent.
//
//                if (image != null && bitmap != null) {
//                    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, channelId)
//                            .setSmallIcon(R.drawable.ic_stat_name)
//                            .setContentTitle(title)
//                            .setContentText(message)
//                            .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap))
//                            .setLights(Color.RED, 1000, 1000)
//                            .setVibrate(new long[]{0, 400, 250, 400})
//                            .setAutoCancel(true)
//                            .setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL)
//                            .setContentIntent(pendingIntent);
//
//
//                    if (notificationManager != null) {
//
//                        notificationManager.notify(getRandomNumber(1, 10000), mBuilder.build());
//
//                    }
//
//                }
//                else {
//
//                    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, channelId)
//                            .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher_round))
//                            .setSmallIcon(R.drawable.ic_stat_name)
//                            .setContentTitle(title)
//                            .setContentText(message)
//                            .setStyle(new NotificationCompat.BigTextStyle().bigText(message))
//                            .setLights(Color.RED, 1000, 1000)
//                            .setVibrate(new long[]{0, 400, 250, 400})
//                            .setAutoCancel(true)
//                            .setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL)
//                            .setContentIntent(pendingIntent);
//
//
//                    if (notificationManager != null) {
//
//                        notificationManager.notify(getRandomNumber(1, 10000), mBuilder.build());
//
//
//                    }
//
//                }
//                AudioManager am = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
//
//                if (am != null) {
//
//                    switch (am.getRingerMode()) {
//                        case AudioManager.RINGER_MODE_SILENT:
//                            Log.i("MyApp", "Silent mode");
//                            break;
//                        case AudioManager.RINGER_MODE_VIBRATE:
//                            Log.i("MyApp", "Vibrate mode");
//                            break;
//                        case AudioManager.RINGER_MODE_NORMAL:
//                            Log.i("MyApp", "Normal mode");
//
//                            if (preferenceManager.getNotificationSoundSetting()) {
//
//                                MediaPlayer mediaPlayer = new MediaPlayer();
//
//                                AssetFileDescriptor descriptor = null;
//                                try {
//                                    descriptor = context.getAssets().openFd("juntos.mp3");
//                                    mediaPlayer.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
//                                    descriptor.close();
//                                    mediaPlayer.prepare();
//                                    mediaPlayer.setVolume(1f, 1f);
//                                    mediaPlayer.setLooping(false);
//                                    mediaPlayer.start();
//                                } catch (Exception e) {
//                                    e.printStackTrace();
//                                }
//
//                            }
//                            break;
//                    }
//
//                }
//
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//
//    }
//
//    public int getRandomNumber(int min, int max) {
//        // min (inclusive) and max (exclusive)
//        Random r = new Random();
//        return r.nextInt(max - min) + min;
//    }
//
//    static class ForegroundCheckTask extends AsyncTask<Context, Void, Boolean> {
//
//        @Override
//        protected Boolean doInBackground(Context... params) {
//            final Context context = params[0].getApplicationContext();
//            return isAppOnForeground(context);
//        }
//
//        private boolean isAppOnForeground(Context context) {
//            ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
//            List<ActivityManager.RunningAppProcessInfo> appProcesses = activityManager.getRunningAppProcesses();
//            if (appProcesses == null) {
//                return false;
//            }
//            final String packageName = context.getPackageName();
//            for (ActivityManager.RunningAppProcessInfo appProcess : appProcesses) {
//                if (appProcess.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND && appProcess.processName.equals(packageName)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//    }
}
