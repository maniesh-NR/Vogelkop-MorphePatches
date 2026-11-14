package defpackage;

import android.os.Build;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.obml.Platform;
import com.opera.android.history.HistoryManager;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class uu1 implements esk {
    public final /* synthetic */ byte a;

    public /* synthetic */ uu1(byte b) {
        this.a = b;
    }

    public final Object get() {
        byte b = this.a;
        ulp ulpVar = u55.Ro;
        switch (b) {
            case 0:
                return Boolean.valueOf(i0l.g());
            case 1:
                avj avjVar = cak.d;
                return avj.b(1) ? Platform.c() : "";
            case 2:
                return Boolean.valueOf(i0l.g());
            case 3:
                return Boolean.FALSE;
            case 4:
                return Platform.c();
            case 5:
                return yne.b;
            case 6:
                return scd.w(Locale.getDefault());
            case 7:
                return Boolean.valueOf(i0l.g());
            case 8:
                return Integer.valueOf(Build.VERSION.SDK_INT);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return Platform.c();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return vml.d;
            case 11:
                return new File(snf.d);
            case 12:
                return ulpVar;
            case 13:
                return new tv1();
            case 14:
                return new ech();
            case 15:
                tm5 tm5Var = new tm5();
                tm5Var.b = true;
                tm5Var.d = new HashSet();
                tm5Var.e = Collections.newSetFromMap(new WeakHashMap());
                return tm5Var;
            case 16:
                return new zwk();
            case 17:
                return new HistoryManager();
            case SizeUtil.textSize0_1 /* 18 */:
                return new r9c();
            case 19:
                return new djg();
            case SizeUtil.textSize0 /* 20 */:
                return new qwe();
            case 21:
                return new m6l();
            case SizeUtil.textSize1 /* 22 */:
                vvg vvgVar = new vvg();
                vvgVar.a = (byte) 0;
                return vvgVar;
            case 23:
                return sgb.f();
            case SizeUtil.textSize2 /* 24 */:
                return Pattern.compile("http(s)?://([\\d\\w]+\\.)*booking\\.[\\d\\w]+(/[\\w\\d-]+)*/(?i)confirmation(?-i)(.+)*");
            case 25:
                int i = BrowserActivity.E1;
                return s9g.h;
            case 26:
                return new i52();
            case 27:
                return new qth();
            case 28:
                return scd.w(Locale.getDefault());
            default:
                return ulpVar;
        }
    }
}
