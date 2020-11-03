package com.example.safalcrm;

import android.content.Context;

import androidx.core.provider.FontRequest;
import androidx.emoji.text.EmojiCompat;
import androidx.emoji.text.FontRequestEmojiCompatConfig;
import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

public class CustomApp extends MultiDexApplication {
    public static Context context;
    private static CustomApp instance;
    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
        MultiDex.install(this);
        initEmojiCompat();
    }
    public CustomApp() {
        super();
    }

    public static CustomApp getInstance() {
        return instance;
    }

    public Context getContext() {
        return context;
    }

    private final void initEmojiCompat() {
        FontRequest fontRequest = new FontRequest("com.google.android.gms.fonts", "com.google.android.gms", "Noto Color Emoji Compat", R.array.com_google_android_gms_fonts_certs);
        EmojiCompat.Config config = (EmojiCompat.Config)(new FontRequestEmojiCompatConfig((Context)this, fontRequest));
        EmojiCompat.init(config);
    }

   }
