package com.example.safalcrm.utillity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.google.gson.Gson;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.example.safalcrm.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import es.dmoral.toasty.Toasty;
import okio.ByteString;

import static java.nio.charset.StandardCharsets.ISO_8859_1;


public class Tools {


    public final static Pattern INDIAN_MOBILE_NUMBER = Pattern.compile("^[6-9]\\d{9}$");
    private static final String IMAGEPATHTOSAVE = "/download";
    private static final float maxHeight = 1280.0f;
    private static final float maxWidth = 1280.0f;
    private Context context;
    private Dialog dialog;

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    public Tools() {
    }

    public Tools(Context context) {
        this.context = context;
        dialog = new Dialog(context);
        mSharedPreferences = context.getSharedPreferences(VariableBag.PREF_NAME, Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
    }


    public static String Decode(String code) {
        byte[] decodeValue = Base64.decode(code, Base64.DEFAULT);
        return new String(decodeValue);
    }

    public static String encode(String code) {
        byte[] decodeValue = Base64.encode(code.getBytes(), Base64.DEFAULT);
        return new String(decodeValue);
    }


    public static boolean checkMobileNumber(String value) {
        Pattern ps = Pattern.compile("^[1-9][0-9]{9}$");
        Matcher ms = ps.matcher(value);
        boolean bs = ms.matches();
        if (bs) {
            return true;
        }
        return bs;
    }


    public static File getOutputMediaFileFromCacheDir(Context ctx) {
        // To be safe, you should check that the SDCard is mounted
        // using Environment.getExternalStorageState() before doing this.
        StrictMode.VmPolicy.Builder builder2 = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder2.build());

        File file = AndroidUtilities.getCacheDir();

        // Create a media file name
        String timeStamp = new java.text.SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
        File mediaFile;
        String mImageName = "IMAGE_" + timeStamp + ".jpg";
        mediaFile = new File(file.getPath() + File.separator + mImageName);
        return mediaFile;
    }
    public static void setSystemBarColor(Activity act) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = act.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(act.getResources().getColor(R.color.colorPrimary));
        }
    }


    public static void setSystemBarColor(Activity act, @ColorRes int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = act.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(act.getResources().getColor(color));
        }
    }


    public static void setSystemBarLight(Activity act) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            View view = act.findViewById(android.R.id.content);
            int flags = view.getSystemUiVisibility();
            flags |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            view.setSystemUiVisibility(flags);
        }
    }

    public static int dpToPx(Context c, int dp) {
        if (c != null) {
            Resources r = c.getResources();
            return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
        } else {
            return 0;
        }
    }


    public static void displayImageRound(final Context ctx, final ImageView img, @DrawableRes int drawable) {
        try {
            Glide.with(ctx).asBitmap().load(drawable).into(new BitmapImageViewTarget(img) {
                @Override
                protected void setResource(Bitmap resource) {
                    RoundedBitmapDrawable circularBitmapDrawable = RoundedBitmapDrawableFactory.create(ctx.getResources(), resource);
                    circularBitmapDrawable.setCircular(true);
                    img.setImageDrawable(circularBitmapDrawable);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayImageRoundUrl(final Context ctx, final ImageView img, String urlimg) {
        try {
            Glide.with(ctx).asBitmap().load(urlimg).apply(new RequestOptions().placeholder(R.drawable.user_default).error(R.drawable.user_default))
                    .into(new BitmapImageViewTarget(img) {
                        @Override
                        protected void setResource(Bitmap resource) {
                            RoundedBitmapDrawable circularBitmapDrawable = RoundedBitmapDrawableFactory.create(ctx.getResources(), resource);
                            circularBitmapDrawable.setCircular(true);
                            img.setImageDrawable(circularBitmapDrawable);
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void displayImageBG(Context ctx, ImageView img, String drawable) {
        try {
            Glide.with(ctx).load(drawable).into(img);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void displayImageOriginal(Context ctx, ImageView img, String drawable) {
        try {
            Glide.with(ctx).load(drawable).apply(new RequestOptions().placeholder(R.drawable.place_holder).error(R.drawable.place_holder))
                    .into(img);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    public static void displayImageOriginal(Context ctx, ImageView img, @DrawableRes int drawable) {
        try {
            Glide.with(ctx).load(drawable)
                    .into(img);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void setObject(String key, Object object) {
        Gson gson = new Gson();
        String json = gson.toJson(object);
        mSharedPreferences.edit().putString(key, json).commit();
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


    public static void displayImage(Context ctx, ImageView img, String url) {
        try {
            if (url.startsWith("@drawable/")){
                int imageResource = ctx.getResources().getIdentifier(url.toString().trim(), null, ctx.getPackageName());
                Glide.with(ctx).load(imageResource)
                        .into(img);
            }else {
                Glide.with(ctx).load(url).apply(new RequestOptions().placeholder(R.drawable.place_holder).error(R.drawable.place_holder))
                        .into(img);
            }

        } catch (Exception e) {
            Log.e("@@", Objects.requireNonNull(e.getMessage()));
        }
    }


    public static void displayImageFile(Context ctx, ImageView img, String url) {
        try {

            Glide.with(ctx)
                    .load(url)
                    .apply(new RequestOptions().centerCrop())
                    .into(img);
            // Glide.with(ctx).load(url).apply(new RequestOptions().placeholder(R.drawable.placeholder_image).error(R.drawable.placeholder_image)).into(img);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("filePath    ", ": " + e.getLocalizedMessage());
        }
    }

    public static void displayImageDrawable(Context ctx, ImageView img, Drawable url) {
        try {
            Glide.with(ctx).load(url).apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL).skipMemoryCache(true))
                    .into(img);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    public static void displayImageProfile(Context ctx, ImageView img, String url) {
        try {
            Glide.with(ctx).load(url).apply(new RequestOptions().placeholder(R.drawable.user_default).error(R.drawable.user_default))
                    .into(img);
        } catch (Exception e) {
            e.printStackTrace();


        }
    }

    public static void displayImageBanner(Context ctx, ImageView img, String url) {
        try {
            if (url.startsWith("@drawable/")){
                int imageResource = ctx.getResources().getIdentifier(url.toString().trim(), null, ctx.getPackageName());
                Glide.with(ctx).load(imageResource)
                        .into(img);
            }else {
                Glide.with(ctx)
                        .load(url)
                        .apply(new RequestOptions()
                                .placeholder(R.drawable.place_holder)
                                .error(R.drawable.place_holder))
                        .into(img);
            }

        } catch (Exception e) {
            Log.e("@@", Objects.requireNonNull(e.getMessage()));
        }
    }


    public static void displayGestureImageView(Context ctx, ImageView img, String url) {
        try {
            Glide.with(ctx).load(url).apply(new RequestOptions().placeholder(R.drawable.place_holder).error(R.drawable.place_holder))
                    .into(img);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayImageURL(Context ctx, CircularImageView img, String url) {
        try {
            Glide.with(ctx).load(url).apply(new RequestOptions().placeholder(R.drawable.user_default).error(R.drawable.user_default))
                    .into(img);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    public static void nestedScrollTo(final NestedScrollView nested, final View targetView) {
        nested.post(new Runnable() {
            @Override
            public void run() {
                nested.scrollTo(500, targetView.getBottom());
            }
        });
    }


    public static void displayUserImage(Context ctx, CircularImageView img, String url) {
        try {
            if (url.startsWith("@drawable/")){
                int imageResource = ctx.getResources().getIdentifier(url.toString().trim(), null, ctx.getPackageName());
                Glide.with(ctx).load(imageResource)
                        .into(img);
            }else {
                Glide.with(ctx).load(url).apply(new RequestOptions().placeholder(R.drawable.user_default).error(R.drawable.user_default))
                        .into(img);
            }

        } catch (Exception e) {
            Log.e("@@", Objects.requireNonNull(e.getMessage()));
        }
    }
    public static void displayImage(Context ctx, CircularImageView img, String url) {
        try {
            if (url.startsWith("@drawable/")){
                int imageResource = ctx.getResources().getIdentifier(url.toString().trim(), null, ctx.getPackageName());
                Glide.with(ctx).load(imageResource)
                        .into(img);
            }else {
                Glide.with(ctx).load(url).apply(new RequestOptions().placeholder(R.drawable.place_holder).error(R.drawable.place_holder))
                        .into(img);
            }

        } catch (Exception e) {
            Log.e("@@", Objects.requireNonNull(e.getMessage()));
        }
    }

    public static void displayImageViewURL(Context ctx, ImageView img, String url) {
        try {
            Glide.with(ctx).load(url)
                    .into(img);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void displayImageViewURI(Context ctx, ImageView img, Uri url) {
        try {
            Glide.with(ctx)
                    .load(new File(Objects.requireNonNull(url.getPath()))) // Uri of the picture
                    .into(img);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    public static void changeMenuIconColor(Menu menu, @ColorInt int color) {
        for (int i = 0; i < menu.size(); i++) {
            Drawable drawable = menu.getItem(i).getIcon();
            if (drawable == null) continue;
            drawable.mutate();
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public static void toast(Context ctx, String msg, int type) {
        //type 0 info, 1 for Error ,2 for Sucess,3 for warning
        if (type == 0) {
            Toasty.info(ctx, msg, Toast.LENGTH_LONG, true).show();
        } else if (type == 1) {
            Toasty.error(ctx, msg, Toast.LENGTH_LONG, true).show();
        } else if (type == 2) {
            Toasty.success(ctx, msg, Toast.LENGTH_LONG, true).show();
        } else if (type == 3) {
            Toasty.warning(ctx, msg, Toast.LENGTH_LONG, true).show();
        } else {
            Toast.makeText(ctx, "" + msg, Toast.LENGTH_LONG).show();
        }

    }

    public static void log(String tag, String msg) {
        Log.e(tag, "" + msg);
    }

    public static String capFirstLetter(String str) {
        String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
        return cap;
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

    public static String capitalize(String capString) {

        if (capString == null || capString.length() < 1) {
            return "";
        }

        StringBuffer capBuffer = new StringBuffer();
        Matcher capMatcher = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(capString);
        while (capMatcher.find()) {
            capMatcher.appendReplacement(capBuffer, capMatcher.group(1).toUpperCase() + capMatcher.group(2).toLowerCase());
        }
        return capMatcher.appendTail(capBuffer).toString();
    }

    public static String getFileNameFromURL(String url) {
        if (url == null) {
            return "";
        }
        try {
            URL resource = new URL(url);
            String host = resource.getHost();
            if (host.length() > 0 && url.endsWith(host)) {
                // handle ...example.com
                return "";
            }
        } catch (MalformedURLException e) {
            return "";
        }

        int startIndex = url.lastIndexOf('/') + 1;
        int length = url.length();

        // find end index for ?
        int lastQMPos = url.lastIndexOf('?');
        if (lastQMPos == -1) {
            lastQMPos = length;
        }

        // find end index for #
        int lastHashPos = url.lastIndexOf('#');
        if (lastHashPos == -1) {
            lastHashPos = length;
        }

        // calculate the end index
        int endIndex = Math.min(lastQMPos, lastHashPos);
        return url.substring(startIndex, endIndex);
    }

    public static Bitmap handleSamplingAndRotationBitmap(Context context, Uri selectedImage)
            throws IOException {
        int MAX_HEIGHT = 1024;
        int MAX_WIDTH = 1024;

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream imageStream = context.getContentResolver().openInputStream(selectedImage);
        BitmapFactory.decodeStream(imageStream, null, options);
        assert imageStream != null;
        imageStream.close();

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, MAX_WIDTH, MAX_HEIGHT);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        imageStream = context.getContentResolver().openInputStream(selectedImage);
        Bitmap img = BitmapFactory.decodeStream(imageStream, null, options);

        img = rotateImageIfRequired(context, img, selectedImage);
        return img;
    }

    public static int calculateInSampleSize(BitmapFactory.Options options,
                                            int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            // Calculate ratios of height and width to requested height and width
            final int heightRatio = Math.round((float) height / (float) reqHeight);
            final int widthRatio = Math.round((float) width / (float) reqWidth);

            // Choose the smallest ratio as inSampleSize value, this will guarantee a final image
            // with both dimensions larger than or equal to the requested height and width.
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;

            // This offers some additional logic in case the image has a strange
            // aspect ratio. For example, a panorama may have a much larger
            // width than height. In these cases the total pixels might still
            // end up being too large to fit comfortably in memory, so we should
            // be more aggressive with sample down the image (=larger inSampleSize).

            final float totalPixels = width * height;

            // Anything more than 2x the requested pixels we'll sample down further
            final float totalReqPixelsCap = reqWidth * reqHeight * 2;

            while (totalPixels / (inSampleSize * inSampleSize) > totalReqPixelsCap) {
                inSampleSize++;
            }
        }
        return inSampleSize;
    }

    public static Bitmap rotateImageIfRequired(Context context, Bitmap img, Uri selectedImage) throws IOException {

        InputStream input = context.getContentResolver().openInputStream(selectedImage);
        ExifInterface ei;
        if (Build.VERSION.SDK_INT > 23) {
            assert input != null;
            ei = new ExifInterface(input);
        } else
            ei = new ExifInterface(Objects.requireNonNull(selectedImage.getPath()));

        int orientation = ei.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);

        switch (orientation) {
            case ExifInterface.ORIENTATION_ROTATE_90:
                return rotateImage(img, 90);
            case ExifInterface.ORIENTATION_ROTATE_180:
                return rotateImage(img, 180);
            case ExifInterface.ORIENTATION_ROTATE_270:
                return rotateImage(img, 270);
            default:
                return img;
        }
    }

    public static Bitmap rotateImage(Bitmap img, int degree) {
        Matrix matrix = new Matrix();
        matrix.postRotate(degree);
        Bitmap rotatedImg = Bitmap.createBitmap(img, 0, 0, img.getWidth(), img.getHeight(), matrix, true);
        img.recycle();
        return rotatedImg;
    }

    public static String getIds(HashMap<String, String> hashMap) {
        StringBuilder sb = new StringBuilder();
        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            sb.append(key + ",");
        }

        return removeLastCharacter(sb.toString());

    }

    public static String getIdsInteger(HashMap<Integer, String> hashMap) {
        StringBuilder sb = new StringBuilder();
        Set<Integer> keys = hashMap.keySet();
        for (Integer key : keys) {
            sb.append(key + ",");
        }

        return removeLastCharacter(sb.toString());
    }

    public static String removeLastCharacter(String str) {
        if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == ',') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    @SuppressLint("HardwareIds")
    private static String getDeviceID(@NonNull Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    @NonNull
    private static String getPrecision(double d) {
        try {
            return String.format(Locale.ENGLISH, "%.2f", Double.valueOf(d));
        } catch (Exception unused) {
            return "0.00";
        }
    }

    public static String getReverseDate(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "-";
        String[] split = str.split(str2);
        if (split.length <= 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(split[2]);
        sb.append(str2);
        sb.append(split[1]);
        sb.append(str2);
        sb.append(split[0]);
        return sb.toString();
    }

    public static Date convertStringDateToDate(String str) {
        DateFormat format = null;
        Date date = null;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
            try {
                date = format.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return date;
    }

    public static long getRoundingOffDownValue(double d, long j) {
        double d2 = (double) j;
        Double.isNaN(d2);
        double d3 = d % d2;
        return d3 > 0.0d ? Math.round(d - d3) : Math.round(d);
    }

    public static float getRoundingOffValue(double d, float f) {
        double d2 = (double) f;
        Double.isNaN(d2);
        double d3 = d % d2;
        if (d3 > 0.0d) {
            Double.isNaN(d2);
            d += d2 - d3;
        }
        return (float) Math.round(d);
    }

    public static float getRoundingOffValue(float f, float f2) {
        double d = (double) (f % f2);
        if (d <= 0.0d) {
            return (float) Math.round(f);
        }
        double d2 = (double) f;
        double d3 = (double) f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        double d4 = d3 - d;
        Double.isNaN(d2);
        return (float) Math.round(d2 + d4);
    }

    public static long getRoundingOffValue(double d, int i) {
        double d2 = (double) i;
        Double.isNaN(d2);
        double d3 = d % d2;
        if (d3 <= 0.0d) {
            return Math.round(d);
        }
        Double.isNaN(d2);
        return Math.round(d + (d2 - d3));
    }

    public static long getRoundingOffValue(double d, long j) {
        double d2 = (double) j;
        Double.isNaN(d2);
        double d3 = d % d2;
        if (d3 <= 0.0d) {
            return Math.round(d);
        }
        Double.isNaN(d2);
        return Math.round(d + (d2 - d3));
    }

    public static String getSimplifiedUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replace = str.replace("\\", "/");
        String str2 = " ";
        return replace.contains(str2) ? replace.replace(str2, "%20") : replace;
    }

    public static void hideSoftKeyboard(@NonNull Activity activity) {
        @SuppressLint("WrongConstant") InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (activity.getCurrentFocus() != null && inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public static void showSoftKeyboard(@NonNull Activity activity, View view) {
        @SuppressLint("WrongConstant") InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (activity.getCurrentFocus() != null && inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    public static void hideSoftKeyboard(@NonNull Activity activity, View view) {
        if (view != null) {
            @SuppressLint("WrongConstant") InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (activity.getCurrentFocus() != null && inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    private static String imageToSdCard(Bitmap bitmap, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(IMAGEPATHTOSAVE);
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isValidGSTNumber(@NonNull String str) {
        if (str.length() != 15) {
            return false;
        }
        return Pattern.compile("[0-9]{2}[A-Za-z]{5}[0-9]{4}[A-Za-z]{1}[A-Za-z1-9]{1}Z{1}[0-9A-Za-z]{1}").matcher(str).matches();
    }

    public static boolean isValidLatLng(double d, double d2) {
        return d >= -90.0d && d <= 90.0d && d2 >= -180.0d && d2 <= 180.0d;
    }

    public static boolean isValidPanNumber(@NonNull String str) {
        return Pattern.compile("[A-Z,a-z]{5}[0-9]{4}[A-Z,a-z]").matcher(str).matches();
    }

    public static boolean isValidUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            return Patterns.WEB_URL.matcher(str.toLowerCase()).matches();
        }
        return false;
    }

    public static boolean isValidEmail(String str) {
        if (!TextUtils.isEmpty(str)) {
            return Patterns.EMAIL_ADDRESS.matcher(str.toLowerCase()).matches();
        }
        return false;
    }

    private static String getLastCharacterFromString(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() == i) {
            return str;
        }
        if (str.length() > i) {
            str = str.substring(str.length() - i);
        }
        return str;
    }

    public static String mobileNoValidation(@NonNull String str) {
        String str2 = "";
        return !TextUtils.isEmpty(str) ? getLastCharacterFromString(str.replaceAll("\\s+", str2).replace("-", str2).replace("(", str2).replace(")", str2).replace("+", str2).replaceAll("[^\\d.]", str2).replaceFirst("^0*", str2), 10) : str2;
    }

//    public static Fragment getVisibleFragment() {
//        FragmentManager fragmentManager = Delegate.dashboardActivity.getSupportFragmentManager();
//        List<Fragment> fragments = fragmentManager.getFragments();
//        if (fragments != null) {
//            for (Fragment fragment : fragments) {
//                if (fragment != null && fragment.isVisible())
//                    return fragment;
//            }
//        }
//        return null;
//    }

    private static void conf(String lang, Context context) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        context.getResources().updateConfiguration(config,
                context.getResources().getDisplayMetrics());
    }

    public static void setLanguage(int fontId, Context context) {
        switch (fontId) {
            case 1:
                String languageToLoad = "en";
                conf(languageToLoad, context);
                break;
            case 2:
                languageToLoad = "hi";
                conf(languageToLoad, context);
                break;
            case 3:
                languageToLoad = "gu";
                conf(languageToLoad, context);
                break;
        }
    }

    public static Typeface getstyle(Context context, int type) {
        Typeface custom_font = null;

        switch (type) {

            case 1:
                custom_font = Typeface.createFromAsset(context.getAssets(), "font/arial.ttf");
                return custom_font;

            case 2:
                custom_font = Typeface.createFromAsset(context.getAssets(), "font/hindi_one.TTF");
                return custom_font;

            case 3:
                custom_font = Typeface.createFromAsset(context.getAssets(), "font/guj_one.TTF");
                return custom_font;

            default:
                custom_font = Typeface.createFromAsset(context.getAssets(), "font/arial.ttf");
                return custom_font;
        }
    }

    public static String basic(String username, String password) {
        return basic(username, password, ISO_8859_1);
    }

    public static String basic(String username, String password, Charset charset) {
        String usernameAndPassword = username + ":" + password;
        String encoded = ByteString.encodeString(usernameAndPassword, charset).base64();
        return "Basic " + encoded;
    }

    public static boolean vpn() {
        String iface = "";
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.isUp())
                    iface = networkInterface.getName();
                Log.d("DEBUG", "IFACE NAME: " + iface);
                if (iface.contains("tun") || iface.contains("ppp") || iface.contains("pptp")) {
                    return true;
                }
            }
        } catch (SocketException e1) {
            e1.printStackTrace();
        }

        return false;
    }

    public static boolean hostAvailable(String host, int port) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), 2000);
            return true;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public static boolean isPackageInstalled(Context context, String packageName) {
        final PackageManager packageManager = context.getPackageManager();
        Intent intent = packageManager.getLaunchIntentForPackage(packageName);
        if (intent == null) {
            return false;
        }
        List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        return list.size() > 0;
    }

    public static String getByteArrayFromImageView(CircularImageView imageView) {
        BitmapDrawable bitmapDrawable = ((BitmapDrawable) imageView.getDrawable());
        Bitmap bitmap;
        if (bitmapDrawable == null) {
            imageView.buildDrawingCache();
            bitmap = imageView.getDrawingCache();
            imageView.buildDrawingCache(false);
        } else {
            bitmap = bitmapDrawable.getBitmap();
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, stream);

        byte[] byteArray = stream.toByteArray();
        return Base64.encodeToString(byteArray, Base64.DEFAULT);
    }

    public static String getByteArrayFromImageView(ImageView imageView) {
        BitmapDrawable bitmapDrawable = ((BitmapDrawable) imageView.getDrawable());
        Bitmap bitmap;
        if (bitmapDrawable == null) {
            imageView.buildDrawingCache();
            bitmap = imageView.getDrawingCache();
            imageView.buildDrawingCache(false);
        } else {
            bitmap = bitmapDrawable.getBitmap();
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, stream);

        byte[] byteArray = stream.toByteArray();
        return Base64.encodeToString(byteArray, Base64.DEFAULT);
    }

    public boolean isCameraPermissonGranted(Activity ctx) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (ctx.checkSelfPermission(Manifest.permission.CAMERA)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("##", "Permission is granted1");
                return true;
            } else {

                Log.v("##", "Permission is revoked1");
                ActivityCompat.requestPermissions((Activity) ctx, new String[]{Manifest.permission.CAMERA}, 2);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            Log.v("##", "Permission is granted1");
            return true;
        }
    }


    private void displayNeverAskAgainDialog(Context ctx) {

        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
        builder.setMessage("We need to send SMS for performing necessary task. Please permit the permission through "
                + "Settings screen.\n\nSelect Permissions -> Enable permission");
        builder.setCancelable(false);
        builder.setPositiveButton("Permit Manually", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Intent intent = new Intent();
                intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                Uri uri = Uri.fromParts("package", ctx.getPackageName(), null);
                intent.setData(uri);
                ctx.startActivity(intent);
            }
        });
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }
    public static boolean neverAskAgainSelected(final Activity activity, final String permission) {
        final boolean prevShouldShowStatus = getRatinaleDisplayStatus(activity,permission);
        final boolean currShouldShowStatus = activity.shouldShowRequestPermissionRationale(permission);
        return prevShouldShowStatus != currShouldShowStatus;
    }
    public static boolean getRatinaleDisplayStatus(final Context context, final String permission) {
        SharedPreferences genPrefs =     context.getSharedPreferences("GENERIC_PREFERENCES", Context.MODE_PRIVATE);
        return genPrefs.getBoolean(permission, false);
    }


    public static boolean isLocatinPermissonGranted(Context ctx) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (ctx.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
            && ctx.checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
            ) {
                Log.v("##", "Permission is granted1");
                return true;
            } else {
                Log.v("##", "Permission is revoked1");
                ActivityCompat.requestPermissions((Activity) ctx,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION}, 101);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            Log.v("##", "Permission is granted1");
            return true;
        }
    }

    public static boolean isReadStoragePermissionGranted(Context ctx) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (ctx.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("##", "Permission is granted1");
                return true;
            } else {

                Log.v("##", "Permission is revoked1");
                ActivityCompat.requestPermissions((Activity) ctx, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 3);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            Log.v("##", "Permission is granted1");
            return true;
        }
    }

    public static boolean isWriteStoragePermissionGranted(Context ctx) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (ctx.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("##", "Permission is granted2");
                return true;
            } else {

                Log.v("##", "Permission is revoked2");
                ActivityCompat.requestPermissions((Activity) ctx, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            Log.v("##", "Permission is granted2");
            return true;
        }
    }


   /* public static int getAlphabetImage(Context context, String alphabet) {
        String[] alphabetArray = context.getResources().getStringArray(R.array.alphabet_array);

        final TypedArray alphabetIcon = context.getResources().obtainTypedArray(R.array.alphabet_icon);

        for (int i = 0; i < alphabetArray.length; i++) {
            if (alphabet.equalsIgnoreCase(alphabetArray[i])) {
                return alphabetIcon.getResourceId(i, -1);
            }
        }
        return -1;
    }
*/
    public static String getFormattedDate(String strDate) {

        try {
            SimpleDateFormat fmtOut = null;
            SimpleDateFormat fmt = null;
            Date date;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                fmt = new SimpleDateFormat("yyyy-MM-dd");
                date = fmt.parse(strDate);

                fmtOut = new SimpleDateFormat("dd/MM/yyyy");
                return fmtOut.format(date);
            }
            return fmtOut.format(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String getFormattedDateYMD(String strDate) {

        if (strDate != null) {
            try {
                SimpleDateFormat fmtOut = null;
                SimpleDateFormat fmt = null;
                Date date;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    fmt = new SimpleDateFormat("dd-MM-yyyy");
                    date = fmt.parse(strDate);

                    fmtOut = new SimpleDateFormat("yyyy-MM-dd");
                    return fmtOut.format(date);
                }
                return fmtOut.format(strDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return "";

    }

    public static String getFormattedDateYMD(String strDate, String inputPattern, String outputPattern) {

        if (strDate != null) {
            try {
                SimpleDateFormat fmtOut = null;
                SimpleDateFormat fmt = null;
                Date date;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    fmt = new SimpleDateFormat(inputPattern);
                    date = fmt.parse(strDate);

                    fmtOut = new SimpleDateFormat(outputPattern);
                    return fmtOut.format(date);
                }
                return fmtOut.format(strDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return "";

    }

    public static String getOnlyStrings(String s) {
        Pattern pattern = Pattern.compile("[^a-z A-Z]");
        Matcher matcher = pattern.matcher(s);
        String number = matcher.replaceAll("");
        return number;
    }

    public static String getOnlyDigits(String s) {
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(s);
        String number = matcher.replaceAll("");
        return number;
    }

    public static boolean appInstalledOrNot(Context context, String uri) {
        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
        }

        return false;
    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.M)
    public static void setWhiteNavigationBar(@NonNull Dialog dialog) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            Window window = dialog.getWindow();
            if (window != null) {
                DisplayMetrics metrics = new DisplayMetrics();
                window.getWindowManager().getDefaultDisplay().getMetrics(metrics);

                GradientDrawable dimDrawable = new GradientDrawable();
                // ...customize your dim effect here

                GradientDrawable navigationBarDrawable = new GradientDrawable();
                navigationBarDrawable.setShape(GradientDrawable.RECTANGLE);
                navigationBarDrawable.setColor(Color.rgb(226, 226, 226));

                Drawable[] layers = {dimDrawable, navigationBarDrawable};

                LayerDrawable windowBackground = new LayerDrawable(layers);
                windowBackground.setLayerInsetTop(1, metrics.heightPixels);

                window.setBackgroundDrawable(windowBackground);
            }
        }
    }

    public static void openWhatsAppConversationUsingUri(Context context, String numberWithCountryCode, String message) {

        Uri uri = Uri.parse("https://api.whatsapp.com/send?phone=" + numberWithCountryCode + "&text=" + message);

        Intent sendIntent = new Intent(Intent.ACTION_VIEW, uri);

        context.startActivity(sendIntent);
    }

    public static Object getGsonData(Object obj) {
        return new Gson().toJson(obj);
    }

    public static String getFormatedAmount(String amount) {
        return amount;
        /*try {
            NumberFormat myFormat = NumberFormat.getInstance();
            myFormat.setGroupingUsed(true);
            return myFormat.format(amount);
        } catch (Exception e) {
            e.printStackTrace();
            return amount;
        }*/
    }

    public static String getDefaultPath(Context ctx) {
        File mediaStorageDir = new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + ctx.getApplicationContext().getPackageName()
                + "/Files/PDFFiles/");

        File file = new File(Environment.getExternalStorageDirectory() + "/Fincasys/PDFFiles/");
        if (!file.exists()) {
            file.mkdirs();
        }

        // This location works best if you want the created images to be shared
        // between applications and persist after your app has been uninstalled.
        // Create the storage directory if it does not exist
        if (!mediaStorageDir.exists()) {
            mediaStorageDir.mkdir();
        }

        return file.getAbsolutePath() + "/";
    }

    public static File getOutputMediaFile(Context ctx) {
        // To be safe, you should check that the SDCard is mounted
        // using Environment.getExternalStorageState() before doing this.
        File file = new File(Environment.getExternalStorageDirectory() + "/Fincasys/PDFFiles/");
        if (!file.exists()) {
            file.mkdirs();
        }

        File mediaStorageDir = new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + ctx.getApplicationContext().getPackageName()
                + "/Files");

        // This location works best if you want the created images to be shared
        // between applications and persist after your app has been uninstalled.
        // Create the storage directory if it does not exist
        if (!mediaStorageDir.exists()) {
            mediaStorageDir.mkdirs();
        }
        // Create a media file name
        String timeStamp = new java.text.SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
        File mediaFile;
        String mImageName = "IMAGE_" + timeStamp + ".jpg";
        mediaFile = new File(file.getPath() + File.separator + mImageName);
        return mediaFile;
    }

    public static String compressImage(Context ctx, String imagePath) {
        Bitmap scaledBitmap = null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bmp = BitmapFactory.decodeFile(imagePath, options);

        int actualHeight = options.outHeight;
        int actualWidth = options.outWidth;

        float imgRatio = (float) actualWidth / (float) actualHeight;
        float maxRatio = maxWidth / maxHeight;

        if (actualHeight > maxHeight || actualWidth > maxWidth) {
            if (imgRatio < maxRatio) {
                imgRatio = maxHeight / actualHeight;
                actualWidth = (int) (imgRatio * actualWidth);
                actualHeight = (int) maxHeight;
            } else if (imgRatio > maxRatio) {
                imgRatio = maxWidth / actualWidth;
                actualHeight = (int) (imgRatio * actualHeight);
                actualWidth = (int) maxWidth;
            } else {
                actualHeight = (int) maxHeight;
                actualWidth = (int) maxWidth;

            }
        }

        options.inSampleSize = calculateInSampleSizeNew(options, actualWidth, actualHeight);
        options.inJustDecodeBounds = false;
        options.inDither = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16 * 1024];

        try {
            bmp = BitmapFactory.decodeFile(imagePath, options);
        } catch (OutOfMemoryError exception) {
            exception.printStackTrace();

        }
        try {
            scaledBitmap = Bitmap.createBitmap(actualWidth, actualHeight, Bitmap.Config.RGB_565);
        } catch (OutOfMemoryError exception) {
            exception.printStackTrace();
        }

        float ratioX = actualWidth / (float) options.outWidth;
        float ratioY = actualHeight / (float) options.outHeight;
        float middleX = actualWidth / 2.0f;
        float middleY = actualHeight / 2.0f;

        Matrix scaleMatrix = new Matrix();
        scaleMatrix.setScale(ratioX, ratioY, middleX, middleY);

        Canvas canvas = new Canvas(scaledBitmap);
        canvas.setMatrix(scaleMatrix);
        canvas.drawBitmap(bmp, middleX - bmp.getWidth() / 2, middleY - bmp.getHeight() / 2, new Paint(Paint.FILTER_BITMAP_FLAG));

        if (bmp != null) {
            bmp.recycle();
        }

     ExifInterface exif;
        try {
            exif = new ExifInterface(imagePath);
            int orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 0);
            Matrix matrix = new Matrix();
            if (orientation == 6) {
                matrix.postRotate(90);
            } else if (orientation == 3) {
                matrix.postRotate(180);
            } else if (orientation == 8) {
                matrix.postRotate(270);
            }
            scaledBitmap = Bitmap.createBitmap(scaledBitmap, 0, 0, scaledBitmap.getWidth(), scaledBitmap.getHeight(), matrix, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileOutputStream out = null;
        String filepath = getFilename(ctx);
        try {
            out = new FileOutputStream(filepath);

            //write the compressed bitmap at the destination specified by filename.
            scaledBitmap.compress(Bitmap.CompressFormat.JPEG, 80, out);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return filepath;
    }

    public static int calculateInSampleSizeNew(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {
            final int heightRatio = Math.round((float) height / (float) reqHeight);
            final int widthRatio = Math.round((float) width / (float) reqWidth);
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
        }
        final float totalPixels = width * height;
        final float totalReqPixelsCap = reqWidth * reqHeight * 2;

        while (totalPixels / (inSampleSize * inSampleSize) > totalReqPixelsCap) {
            inSampleSize++;
        }

        return inSampleSize;
    }

    public static String getFilename(Context ctx) {
        File mediaStorageDir = new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + ctx.getApplicationContext().getPackageName()
                + "/Files/Compressed");

        // Create the storage directory if it does not exist
        if (!mediaStorageDir.exists()) {
            mediaStorageDir.mkdirs();
        }

        String mImageName = "IMG_" + String.valueOf(System.currentTimeMillis()) + ".jpg";
        String uriString = (mediaStorageDir.getAbsolutePath() + "/" + mImageName);
        return uriString;
    }

    @SuppressLint("NewApi")
    public static String timeCoversion12to24(String twelveHoursTime) {

        try {
            DateFormat df = new SimpleDateFormat("hh:mm aa");
            DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
            Date date = null;
            String output = null;

            //Returns Date object
            date = df.parse(twelveHoursTime);

            //old date format to new date format
            output = outputformat.format(date);

            return output;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void showLoading() {
        try {
            if (dialog != null) {
                dialog.setContentView(R.layout.loadingdailog);
                dialog.setCancelable(false);
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopLoading() {
        try {
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getMimeType(Context context, Uri uri) {
        String extension;

        //Check uri format to avoid null
        if (uri.getScheme().equals(ContentResolver.SCHEME_CONTENT)) {
            //If scheme is a content
            final MimeTypeMap mime = MimeTypeMap.getSingleton();
            extension = mime.getExtensionFromMimeType(context.getContentResolver().getType(uri));
        } else {
            //If scheme is a File
            //This will replace white spaces with %20 and also other special characters. This will avoid returning null values on file name with spaces and special characters.
            extension = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());

        }

        return extension;
    }

    public static boolean isImageFile(String path) {
        String mimeType = URLConnection.guessContentTypeFromName(path);
        return mimeType != null && mimeType.startsWith("image");
    }

    public static boolean isVideoFile(String path) {
        String mimeType = URLConnection.guessContentTypeFromName(path);
        return mimeType != null && mimeType.startsWith("video");
    }

    public static int RoundFloatValue(float f) {
        int c = (int) ((f) + 0.5f);
        float n = f + 0.5f;
        return (n - c) % 2 == 0 ? (int) f : c;
    }

    public static long getTimeDiff(String time1, String time2){
        long difference=0;

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                SimpleDateFormat format = new SimpleDateFormat("h:mm a");
                Date date1 = null,date2 =null;
                date1 = format.parse(time1);
                date2 = format.parse(time2);
                difference= date2.getTime() - date1.getTime();
                difference=difference/1000;

            }



        } catch (ParseException e) {
            e.printStackTrace();
        }
        return difference;
    }

    public static String getUrlExtenssion(String serverPath){
        if (!serverPath.contains(".")){
            return null;
        }
        return serverPath.substring(serverPath.lastIndexOf("."));
    }

    public static String getMimeTypeExtenssion(String url) {
        String type = null;
        String extension = MimeTypeMap.getFileExtensionFromUrl(url);
        if (extension != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension);
        }
        return type;
    }
    public static void viewImageFromLatLong(Context ctx, ImageView img, String latitudelongitude,String key) {
        String mapUrl = "https://maps.googleapis.com/maps/api/staticmap?" +
                "zoom=15&size=600x300&maptype=roadmap&markers=color:green%7Clabel:G%7C"
                + latitudelongitude + "&key="+key;

        Log.e("###", "viewImageFromLatLong: "+mapUrl);

        try {
            Glide.with(ctx).load(mapUrl)
                    .into(img);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
    public static String getDuration(File file) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
        String durationStr = mediaMetadataRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
        return Tools.formateMilliSeccond(Long.parseLong(durationStr));
    }

    public static String formateMilliSeccond(long milliseconds) {
        String finalTimerString = "";
        String secondsString = "";

        // Convert total duration into time
        int hours = (int) (milliseconds / (1000 * 60 * 60));
        int minutes = (int) (milliseconds % (1000 * 60 * 60)) / (1000 * 60);
        int seconds = (int) ((milliseconds % (1000 * 60 * 60)) % (1000 * 60) / 1000);

        // Add hours if there
        if (hours > 0) {
            finalTimerString = hours + ":";
        }

        // Prepending 0 to seconds if it is one digit
        if (seconds < 10) {
            secondsString = "0" + seconds;
        } else {
            secondsString = "" + seconds;
        }

        finalTimerString = finalTimerString + minutes + ":" + secondsString;

        //      return  String.format("%02d Min, %02d Sec",
        //                TimeUnit.MILLISECONDS.toMinutes(milliseconds),
        //                TimeUnit.MILLISECONDS.toSeconds(milliseconds) -
        //                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds)));

        // return timer string
        return finalTimerString;
    }

    public static boolean getMicrophoneAvailable(Context context) {
        MediaRecorder recorder = new MediaRecorder();
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
        recorder.setOutputFile(new File(context.getCacheDir(), "MediaUtil#micAvailTestFile").getAbsolutePath());
        boolean available = true;
        try {
            recorder.prepare();
            recorder.start();

        }
        catch (Exception exception) {
            available = false;
        }
        recorder.release();
        return available;
    }

}
