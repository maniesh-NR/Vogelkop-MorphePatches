package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.provider.DocumentsContract;
import com.leanplum.utils.SizeUtil;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class mdb {
    public static final HashSet a = new HashSet(Arrays.asList("http", "https", "about", "ofa", "file", "content", "momi"));
    public static final Random b = new Random();

    public static ComponentName a(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null && launchIntentForPackage.getComponent() != null) {
            return launchIntentForPackage.getComponent();
        }
        HashMap map = new HashMap();
        map.put("package_name", context.getPackageName());
        map.put("context_class", context.getClass().getSimpleName());
        if (launchIntentForPackage != null) {
            map.put("intent", launchIntentForPackage.toString());
        }
        ks3.E(new yo8("Unusable launch intent", (String) null), map);
        return new ComponentName(context, "com.opera.Opera");
    }

    public static Intent b(Context context) {
        Intent intent = new Intent();
        intent.setFlags(335544320);
        intent.setComponent(a(context));
        return intent;
    }

    public static String c(String str) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf < 0) {
            return null;
        }
        String strTrim = str.substring(0, iIndexOf).toLowerCase(Locale.US).trim();
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '-' && cCharAt != '+' && cCharAt != '.') {
                return strTrim.replaceAll("[^a-z0-9.+-]", "");
            }
        }
        return strTrim;
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        Locale locale = Locale.US;
        return str.toLowerCase(locale).equals("javascript") || str.toLowerCase(locale).equals("jar");
    }

    public static boolean e(String str) {
        String strP = wqm.p(str);
        if (strP == null) {
            return false;
        }
        if (btb.a(strP, wqm.i(str))) {
            return true;
        }
        return a.contains(strP.toLowerCase(Locale.ROOT));
    }

    public static void f(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                extras.size();
            } catch (BadParcelableException e) {
                ks3.D(e);
                intent.replaceExtras((Bundle) null);
            } catch (RuntimeException e2) {
                if (!(e2.getCause() instanceof ClassNotFoundException)) {
                    throw e2;
                }
                ks3.D(e2);
                intent.replaceExtras((Bundle) null);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void g(x5f x5fVar, boolean z, boolean z2, Intent intent) {
        je0 je0Var = z2 ? je0.b : je0.c;
        le0 le0Var = le0.c;
        String action = null;
        if (intent != null && intent.getAction() != null) {
            String action2 = intent.getAction();
            action2.getClass();
            char c = 65535;
            switch (action2.hashCode()) {
                case -2051532163:
                    if (action2.equals("com.opera.android.action.AI_WIDGET_VOICE")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1628686692:
                    if (action2.equals("com.opera.android.action.AI_WIDGET_KEYBOARD")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1580460549:
                    if (action2.equals("com.opera.android.flow.ACTION_NOTIFICATION")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1531633755:
                    if (action2.equals("com.opera.android.action.NEW_TAB")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1263673724:
                    if (action2.equals("com.opera.android.action.SHOW_NEWS")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1237018695:
                    if (action2.equals("com.opera.android.action.SHOW_NEWSFEED_ARTICLE")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1177962093:
                    if (action2.equals("com.opera.android.action.SEARCH_FROM_WIDGET")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1173447682:
                    if (action2.equals("android.intent.action.MAIN")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1173264947:
                    if (action2.equals("android.intent.action.SEND")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1173171990:
                    if (action2.equals("android.intent.action.VIEW")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1068556000:
                    if (action2.equals("com.opera.android.action.VOICE_SEARCH_FROM_WIDGET")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1009361574:
                    if (action2.equals("com.opera.android.action.JUMP_MINIGAME_WIDGET")) {
                        c = 11;
                        break;
                    }
                    break;
                case -868263571:
                    if (action2.equals("com.opera.android.action.SCAN_QR_CODE_FROM_SHORTCUT_WIDGET")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -862415788:
                    if (action2.equals("com.opera.android.action.UNINSTALL_SHORTCUT")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -837053414:
                    if (action2.equals("com.opera.android.action.ACTIVATE_TAB")) {
                        c = 14;
                        break;
                    }
                    break;
                case -753616645:
                    if (action2.equals("com.opera.android.action.VPN_PRO_NOTIFICATION_OPEN_OFA")) {
                        c = 15;
                        break;
                    }
                    break;
                case -740792631:
                    if (action2.equals("com.opera.android.action.NEW_PRIVATE_TAB")) {
                        c = 16;
                        break;
                    }
                    break;
                case -588994499:
                    if (action2.equals("com.opera.android.action.SHOW_MANAGE_SPACE")) {
                        c = 17;
                        break;
                    }
                    break;
                case -412737042:
                    if (action2.equals("com.opera.android.action.SEARCH_FROM_SHORTCUT_WIDGET")) {
                        c = 18;
                        break;
                    }
                    break;
                case -322572199:
                    if (action2.equals("com.opera.android.action.SEARCH")) {
                        c = 19;
                        break;
                    }
                    break;
                case -194238494:
                    if (action2.equals("android.service.quicksettings.action.QS_TILE_PREFERENCES")) {
                        c = 20;
                        break;
                    }
                    break;
                case 83739150:
                    if (action2.equals("com.opera.android.action.SHOW_MEDIA_PLAYER_FROM_NOTIFICATION")) {
                        c = 21;
                        break;
                    }
                    break;
                case 250419739:
                    if (action2.equals("com.opera.android.action.SHOW_NEWS_ARTICLE")) {
                        c = 22;
                        break;
                    }
                    break;
                case 264382330:
                    if (action2.equals("com.opera.android.action.SCAN_QR_CODE")) {
                        c = 23;
                        break;
                    }
                    break;
                case 335417372:
                    if (action2.equals("com.opera.android.settings.SITE_SETTING")) {
                        c = 24;
                        break;
                    }
                    break;
                case 611820474:
                    if (action2.equals("com.opera.android.action.SHOW_DOWNLOADS")) {
                        c = 25;
                        break;
                    }
                    break;
                case 672089908:
                    if (action2.equals("com.opera.android.action.SCAN_QR_CODE_FROM_WIDGET")) {
                        c = 26;
                        break;
                    }
                    break;
                case 762803791:
                    if (action2.equals("com.opera.android.action.AI_ASSISTANT_FROM_SHORTCUT_WIDGET")) {
                        c = 27;
                        break;
                    }
                    break;
                case 1164997954:
                    if (action2.equals("com.opera.android.action.VPN_PRO_WIDGET_OPEN_OFA")) {
                        c = 28;
                        break;
                    }
                    break;
                case 1333613390:
                    if (action2.equals("com.opera.android.SERVICE_TAB_LAUNCH")) {
                        c = 29;
                        break;
                    }
                    break;
                case 1338932074:
                    if (action2.equals("com.opera.android.action.SHOW_WALLET")) {
                        c = 30;
                        break;
                    }
                    break;
                case 1411219700:
                    if (action2.equals("com.opera.android.action.SHOW_MEDIA_PLAYER_FROM_PIP")) {
                        c = 31;
                        break;
                    }
                    break;
                case 1703997026:
                    if (action2.equals("android.intent.action.PROCESS_TEXT")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 1790957502:
                    if (action2.equals("android.intent.action.INSERT")) {
                        c = '!';
                        break;
                    }
                    break;
                case 1865807226:
                    if (action2.equals("android.nfc.action.NDEF_DISCOVERED")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 1937529752:
                    if (action2.equals("android.intent.action.WEB_SEARCH")) {
                        c = '#';
                        break;
                    }
                    break;
            }
            je0 je0Var2 = je0.e;
            switch (c) {
                case 0:
                    le0Var = le0.L;
                    je0Var = je0Var2;
                    break;
                case 1:
                    le0Var = le0.K;
                    je0Var = je0Var2;
                    break;
                case 2:
                    le0Var = le0.w;
                    je0Var = je0Var2;
                    break;
                case 3:
                    le0Var = le0.p;
                    break;
                case 4:
                case 5:
                case SizeUtil.textSize1 /* 22 */:
                    le0Var = le0.t;
                    break;
                case 6:
                    le0Var = le0.y;
                    je0Var = je0Var2;
                    break;
                case 7:
                    break;
                case '\b':
                    le0Var = le0.F;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    le0Var = le0.d;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    le0Var = le0.A;
                    je0Var = je0Var2;
                    break;
                case 11:
                    le0Var = le0.N;
                    je0Var = je0Var2;
                    break;
                case '\f':
                    le0Var = le0.J;
                    je0Var = je0Var2;
                    break;
                case '\r':
                    le0Var = le0.M;
                    je0Var = je0Var2;
                    break;
                case 14:
                    le0Var = le0.n;
                    break;
                case 15:
                    le0Var = le0.B;
                    je0Var = je0Var2;
                    break;
                case 16:
                    le0Var = le0.q;
                    break;
                case 17:
                    le0Var = le0.v;
                    je0Var = je0Var2;
                    break;
                case SizeUtil.textSize0_1 /* 18 */:
                    le0Var = le0.I;
                    je0Var = je0Var2;
                    break;
                case 19:
                    le0Var = le0.o;
                    je0Var = je0Var2;
                    break;
                case SizeUtil.textSize0 /* 20 */:
                    le0Var = le0.D;
                    je0Var = je0Var2;
                    break;
                case 21:
                case 31:
                    le0Var = le0.x;
                    je0Var = je0Var2;
                    break;
                case 23:
                    le0Var = le0.r;
                    je0Var = je0Var2;
                    break;
                case SizeUtil.textSize2 /* 24 */:
                    le0Var = le0.k;
                    je0Var = je0Var2;
                    break;
                case 25:
                    le0Var = le0.l;
                    je0Var = je0Var2;
                    break;
                case 26:
                    le0Var = le0.z;
                    je0Var = je0Var2;
                    break;
                case 27:
                    le0Var = le0.H;
                    je0Var = je0Var2;
                    break;
                case 28:
                    le0Var = le0.C;
                    je0Var = je0Var2;
                    break;
                case 29:
                    le0Var = le0.j;
                    break;
                case 30:
                    le0Var = le0.m;
                    je0Var = je0Var2;
                    break;
                case ' ':
                    if (!"com.opera.android.SearchInOpera".equals(intent.getStringExtra("com.opera.android.extra.ORIGINAL_COMPONENT_CLASS_NAME"))) {
                        le0Var = le0.g;
                        break;
                    } else {
                        le0Var = le0.G;
                        break;
                    }
                case '!':
                    le0Var = le0.i;
                    break;
                case '\"':
                    le0Var = le0.e;
                    break;
                case '#':
                    le0Var = le0.f;
                    break;
                default:
                    action = intent.getAction();
                    le0Var = le0.b;
                    break;
            }
        }
        x5fVar.T(z, action, le0Var, je0Var);
    }

    public static String h(String str) {
        String strTrim = str.trim();
        while (true) {
            String strC = c(strTrim);
            if (strC == null || !d(strC)) {
                break;
            }
            strTrim = strTrim.substring(strTrim.indexOf(":") + 1);
        }
        return strTrim;
    }

    public static void i(Intent intent, Uri uri) {
        if (s29.g(uri)) {
            File file = new File(uri.getPath());
            uri = DocumentsContract.buildDocumentUriUsingTree(v61.a(file.getParentFile()), "raw:" + file.getAbsolutePath());
        }
        intent.putExtra("android.provider.extra.INITIAL_URI", uri);
    }
}
