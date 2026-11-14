package com.opera.android.articles;

import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.aik;
import defpackage.b2l;
import defpackage.bmg;
import defpackage.d7l;
import defpackage.f90;
import defpackage.g82;
import defpackage.mn;
import defpackage.q9n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class NewsfeedArticleExtension {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, com.opera.android.BrowserActivity, dx3] */
    public static void playPodcast(@NonNull ChromiumContent chromiumContent, @NonNull GURL gurl, @NonNull String str, @NonNull String str2, @NonNull GURL[] gurlArr) {
        String str3;
        String str4;
        ?? O = q9n.o(chromiumContent.c());
        if (O != 0) {
            b2l b2lVarV = O.V(chromiumContent.e());
            String strF0 = b2lVarV != null ? ((d7l) b2lVarV).f0() : null;
            String str5 = "";
            if (strF0 != null) {
                g82 g82Var = (g82) ((HashMap) O.e0.a).get(strF0);
                if (g82Var != null) {
                    strF0 = g82Var.a;
                    String str6 = g82Var.g;
                    String[] strArr = aik.a;
                    if (str6 != null) {
                        str5 = str6;
                    }
                }
                str3 = strF0;
                str4 = str5;
            } else {
                str3 = "";
                str4 = str3;
            }
            ((bmg) O.y.L.get()).a(O, gurl.g(), str, str3, str2, str4, (List) Arrays.asList(gurlArr).stream().map(new mn((byte) 11)).collect(Collectors.toList()), f90.f);
        }
    }

    public static boolean shouldInstall(@NonNull GURL gurl) {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) context.getApplicationContext()).A().a(gurl);
    }
}
