package defpackage;

import android.app.ActivityManager;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import java.io.File;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class wu5 implements a47, ch7, cs9, o9d, qye {
    public static hr5 a;

    public static void d(Context context, Uri uri, MediaMetadata.Builder builder) {
        try {
            Uri uriNormalizeScheme = uri.normalizeScheme();
            dd7 bkhVar = "file".equals(uriNormalizeScheme.getScheme()) ? new bkh(new File(uriNormalizeScheme.getPath())) : dd7.e(context, uriNormalizeScheme);
            long j = bkhVar.j();
            if (j > 0) {
                builder.putLong("com.opera.android.media.FILE_LENGTH", j);
            }
            String strH = bkhVar.h();
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            builder.putString("com.opera.android.media.FILE_TYPE", strH);
        } catch (RuntimeException unused) {
        }
    }

    public static void e(String str, Bitmap bitmap, String str2, String str3, String str4, long j, MediaMetadata.Builder builder) {
        if (!TextUtils.isEmpty(str)) {
            builder.putString("android.media.metadata.TITLE", str);
        }
        if (bitmap != null) {
            builder.putBitmap("android.media.metadata.ART", bitmap);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.putString("android.media.metadata.ARTIST", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            builder.putString("android.media.metadata.ALBUM_ARTIST", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.putString("android.media.metadata.ALBUM", str4);
        }
        if (j > 0) {
            builder.putLong("android.media.metadata.DURATION", j);
        }
    }

    public static f7h f(String str) {
        f7h f7hVar = f7h.HTTP_1_0;
        if (Intrinsics.a(str, "http/1.0")) {
            return f7hVar;
        }
        f7h f7hVar2 = f7h.HTTP_1_1;
        if (Intrinsics.a(str, "http/1.1")) {
            return f7hVar2;
        }
        f7h f7hVar3 = f7h.H2_PRIOR_KNOWLEDGE;
        if (Intrinsics.a(str, "h2_prior_knowledge")) {
            return f7hVar3;
        }
        f7h f7hVar4 = f7h.HTTP_2;
        if (Intrinsics.a(str, "h2")) {
            return f7hVar4;
        }
        f7h f7hVar5 = f7h.SPDY_3;
        if (Intrinsics.a(str, "spdy/3.1")) {
            return f7hVar5;
        }
        f7h f7hVar6 = f7h.QUIC;
        if (Intrinsics.a(str, "quic")) {
            return f7hVar6;
        }
        f7h f7hVar7 = f7h.HTTP_3;
        if (c.q(str, "h3", false)) {
            return f7hVar7;
        }
        s49.m("Unexpected protocol: ".concat(str));
        return null;
    }

    public static e9i h(String str) {
        Object next;
        h58 h58Var = e9i.h;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (true) {
            if (!w4VarE.hasNext()) {
                next = null;
                break;
            }
            next = w4VarE.next();
            if (((e9i) next).a.equals(str)) {
                break;
            }
        }
        e9i e9iVar = (e9i) next;
        return e9iVar == null ? (e9i) CollectionsKt.X(e9i.h, uih.a) : e9iVar;
    }

    public static j2b i(j2b j2bVar) {
        Object next;
        h58 h58Var = j2b.f;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (true) {
            if (!w4VarE.hasNext()) {
                next = null;
                break;
            }
            next = w4VarE.next();
            if (((j2b) next).ordinal() == j2bVar.ordinal() + 1) {
                break;
            }
        }
        return (j2b) next;
    }

    public static void j(ArrayList arrayList, StringBuilder sb) {
        a aVarH = djh.h(djh.j(0, arrayList.size()), 2);
        int i = aVarH.a;
        int i2 = aVarH.b;
        int i3 = aVarH.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) arrayList.get(i);
            String str2 = (String) arrayList.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public final void a() {
    }

    public final void b(zg3 zg3Var, Bitmap bitmap) {
    }

    public final String[] c(Object obj) {
        return ((Bundle) obj).getStringArray(Constants.Params.DATA);
    }

    public final boolean g(Object obj, String str) {
        return ((Bundle) obj).containsKey(str);
    }

    @Override // defpackage.qye
    public final nf2 k(AssistStructure.ViewNode viewNode) {
        ks2 ks2Var;
        String strM;
        String[] autofillHints = viewNode.getAutofillHints();
        if (autofillHints != null) {
            int length = autofillHints.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    ks2Var = null;
                    break;
                }
                String str = autofillHints[i];
                u9d u9dVar = ls2.a;
                ks2Var = (str == null || (strM = t0h.m(str)) == null) ? null : (ks2) ls2.a.get(strM);
                if (ks2Var != null) {
                    break;
                }
                i++;
            }
            if (ks2Var != null) {
                return ks2Var.d();
            }
        }
        return null;
    }

    @Override // defpackage.o9d
    public final Object l(udg udgVar) {
        return udgVar.I;
    }

    public final String m(Object obj, String str) {
        return ((Bundle) obj).getString(str);
    }

    public final void y(Function1 function1) {
        function1.invoke(ActivityManager.isUserAMonkey() ? z37.b : z37.a);
    }
}
