package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.NoCopySpan;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.format.DateUtils;
import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class lg7 {
    public static final int[][] a = {new int[]{-16842910}, new int[0]};
    public static final Pattern b = Pattern.compile("[\\p{Cntrl}\\\\/?*:|<>\"]");

    public static void a(Context context, Uri uri) {
        if (s29.g(uri)) {
            try {
                context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public static int b(String str) {
        return str.getBytes(Charset.forName("UTF-8")).length;
    }

    public static CharSequence c(Context context, long j, boolean z) {
        if (j <= 0) {
            return "…";
        }
        if (j >= 36000000) {
            return context.getResources().getString(2132019733);
        }
        return DateUtils.getRelativeTimeSpanString(System.currentTimeMillis() + j, System.currentTimeMillis(), 1000L, z ? 262144 : 0);
    }

    public static String d(Context context, Uri uri, String str) {
        boolean zEquals = uri.getScheme().equals("file");
        HashMap mapK = zEquals ? null : rf7.k(context.getContentResolver(), uri);
        int i = 0;
        if (zEquals && b(str) > 255) {
            int iLastIndexOf = str.lastIndexOf(".");
            if (iLastIndexOf < 0) {
                iLastIndexOf = str.length();
            }
            String strSubstring = str.substring(0, iLastIndexOf);
            String strSubstring2 = str.substring(iLastIndexOf);
            if (b(strSubstring2) > 127) {
                strSubstring2 = h(127, strSubstring2);
            }
            str = h(255 - b(strSubstring2), strSubstring).concat(strSubstring2);
        }
        if (mapK == null ? new File(uri.getPath(), str).exists() : mapK.containsKey(str)) {
            int iLastIndexOf2 = str.lastIndexOf(".");
            if (iLastIndexOf2 < 0) {
                iLastIndexOf2 = str.length();
            }
            String strSubstring3 = str.substring(0, iLastIndexOf2);
            String strSubstring4 = str.substring(iLastIndexOf2);
            if (b(strSubstring4) > 127) {
                strSubstring4 = h(127, strSubstring4);
            }
            String str2 = strSubstring4;
            do {
                i++;
                String strI = p3p.i(i, "-", str2);
                if (zEquals) {
                    strSubstring3 = h(255 - b(strI), strSubstring3);
                }
                str = strSubstring3.concat(strI);
            } while (mapK == null ? new File(uri.getPath(), str).exists() : mapK.containsKey(str));
        }
        return str;
    }

    public static boolean e(Context context, Uri uri) {
        dd7 bkhVar;
        if ("content".equals(uri.getScheme())) {
            bkhVar = dd7.f(context, uri);
        } else {
            File file = new File(uri.getPath());
            if (!file.exists() && !file.mkdirs()) {
                return false;
            }
            bkhVar = new bkh(file);
        }
        return bkhVar.d() && bkhVar.b();
    }

    public static SpannableStringBuilder f(CharSequence charSequence) {
        Matcher matcher = b.matcher(charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, charSequence.length(), Object.class);
            for (int i = 0; i < spans.length; i++) {
                Object obj = spans[i];
                if (obj instanceof NoCopySpan) {
                    spannableStringBuilder.setSpan(spans[i], spanned.getSpanStart(obj), spanned.getSpanEnd(spans[i]), spanned.getSpanFlags(spans[i]));
                }
            }
        }
        while (matcher.find()) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), (CharSequence) "_");
        }
        return spannableStringBuilder;
    }

    public static kg7 g(o29 o29Var) {
        switch (o29Var.ordinal()) {
            case 0:
            case 1:
                return kg7.g;
            case 2:
            case 3:
            case 4:
                return kg7.h;
            case 5:
                return kg7.j;
            case 6:
            case 12:
                return kg7.l;
            case 7:
                return kg7.m;
            case 8:
                return kg7.k;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return kg7.i;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return kg7.n;
            case 11:
            default:
                return kg7.f;
        }
    }

    public static String h(int i, String str) {
        while (b(str) > i) {
            int length = str.length();
            int i2 = length - 1;
            if (Character.isLowSurrogate(str.charAt(i2))) {
                i2 = length - 2;
            }
            str = str.substring(0, i2);
        }
        return str;
    }
}
