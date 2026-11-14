package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class nac {
    public static final /* synthetic */ int a = 0;

    static {
        u1b.t("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", new String[]{"android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"});
    }

    public static long a(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                qp2.o(sko.i(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static xjd b(vjd vjdVar, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        nv6 nv6Var = new nv6((byte) 25);
        nv6Var.I("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = vjdVar.a;
        Bundle bundle = vjdVar.I;
        Integer num = vjdVar.p;
        Uri uri2 = vjdVar.m;
        if (charSequence != null) {
            nv6Var.J(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = vjdVar.e;
        if (charSequence2 != null) {
            nv6Var.J(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = vjdVar.f;
        if (charSequence3 != null) {
            nv6Var.J(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = vjdVar.g;
        if (charSequence4 != null) {
            nv6Var.J(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = vjdVar.b;
        if (charSequence5 != null) {
            nv6Var.J(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = vjdVar.c;
        if (charSequence6 != null) {
            nv6Var.J(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = vjdVar.d;
        if (charSequence7 != null) {
            nv6Var.J(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (vjdVar.t != null) {
            nv6Var.G("android.media.metadata.YEAR", r7.intValue());
        }
        if (uri != null) {
            nv6Var.I("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            nv6Var.I("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            nv6Var.I("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            nv6Var.I("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            nv6Var.F("android.media.metadata.DISPLAY_ICON", bitmap);
            nv6Var.F("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            nv6Var.G("android.media.metadata.BT_FOLDER_TYPE", a(num.intValue()));
        }
        if (j == -9223372036854775807L && (l = vjdVar.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        nv6Var.G("android.media.metadata.DURATION", j);
        yjh yjhVarD = d(vjdVar.i);
        if (yjhVarD != null) {
            nv6Var.H("android.media.metadata.USER_RATING", yjhVarD);
        }
        yjh yjhVarD2 = d(vjdVar.j);
        if (yjhVarD2 != null) {
            nv6Var.H("android.media.metadata.RATING", yjhVarD2);
        }
        if (vjdVar.H != null) {
            nv6Var.G("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", r6.intValue());
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    nv6Var.J((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    nv6Var.G(str2, ((Number) obj).longValue());
                }
            }
        }
        return new xjd((Bundle) nv6Var.a);
    }

    public static xjh c(yjh yjhVar) {
        if (yjhVar == null) {
            return null;
        }
        float f = yjhVar.b;
        int i = yjhVar.a;
        switch (i) {
            case 1:
                if (yjhVar.b()) {
                    return new s9a(i == 1 && f == 1.0f);
                }
                return new s9a();
            case 2:
                if (yjhVar.b()) {
                    return new nnl(i == 2 && f == 1.0f);
                }
                return new nnl();
            case 3:
                return yjhVar.b() ? new q3k(3, yjhVar.a()) : new q3k(3);
            case 4:
                return yjhVar.b() ? new q3k(4, yjhVar.a()) : new q3k(4);
            case 5:
                return yjhVar.b() ? new q3k(5, yjhVar.a()) : new q3k(5);
            case 6:
                if (!yjhVar.b()) {
                    return new i9g();
                }
                if (i != 6 || !yjhVar.b()) {
                    f = -1.0f;
                }
                return new i9g(f);
            default:
                return null;
        }
    }

    public static yjh d(xjh xjhVar) {
        if (xjhVar != null) {
            int iF = f(xjhVar);
            if (!xjhVar.b()) {
                switch (iF) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new yjh(iF, -1.0f);
                    default:
                        return null;
                }
            }
            switch (iF) {
                case 1:
                    return new yjh(1, ((s9a) xjhVar).c ? 1.0f : 0.0f);
                case 2:
                    return new yjh(2, ((nnl) xjhVar).c ? 1.0f : 0.0f);
                case 3:
                case 4:
                case 5:
                    return yjh.d(((q3k) xjhVar).c, iF);
                case 6:
                    return yjh.c(((i9g) xjhVar).b);
            }
        }
        return null;
    }

    public static void e(ListenableFuture listenableFuture) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    listenableFuture.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    z = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j = 3000 - jElapsedRealtime2;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static int f(xjh xjhVar) {
        if (xjhVar instanceof s9a) {
            return 1;
        }
        if (xjhVar instanceof nnl) {
            return 2;
        }
        if (!(xjhVar instanceof q3k)) {
            return xjhVar instanceof i9g ? 6 : 0;
        }
        int i = ((q3k) xjhVar).b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }
}
