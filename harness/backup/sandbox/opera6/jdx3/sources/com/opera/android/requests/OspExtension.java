package com.opera.android.requests;

import androidx.annotation.NonNull;
import defpackage.bk0;
import defpackage.e5f;
import defpackage.hd;
import defpackage.o5f;
import defpackage.qie;
import defpackage.rml;
import defpackage.umi;
import defpackage.vdn;
import defpackage.w56;
import defpackage.ydn;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class OspExtension {
    public static volatile OspExtension c;
    public final hd a;
    public final ydn b;

    public OspExtension(hd hdVar, ydn ydnVar) {
        this.a = hdVar;
        this.b = ydnVar;
        c = this;
    }

    public static String[] a(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf <= 0 || iLastIndexOf >= str.length() - 1) {
            return null;
        }
        return new String[]{str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1)};
    }

    public static void increment(@NonNull String str, @NonNull String str2) {
        String[] strArrA;
        OspExtension ospExtension = c;
        if (ospExtension != null) {
            hd hdVar = ospExtension.a;
            ydn ydnVar = ospExtension.b;
            vdn vdnVar = ydnVar.d;
            if (!((vdnVar.a && vdnVar.a()) ? ydnVar.t(str) : true) || (strArrA = a(str2)) == null) {
                return;
            }
            if (strArrA[1].equals("paywall_on")) {
                hdVar.r(strArrA[0], true);
            } else if (strArrA[1].equals("paywall_off")) {
                hdVar.r(strArrA[0], false);
            }
        }
    }

    public static void log(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        String[] strArrA;
        OspExtension ospExtension = c;
        if (ospExtension != null) {
            ydn ydnVar = ospExtension.b;
            vdn vdnVar = ydnVar.d;
            if (!((vdnVar.a && vdnVar.a()) ? ydnVar.t(str) : true) || (strArrA = a(str2)) == null) {
                return;
            }
            hd hdVar = ospExtension.a;
            String str4 = strArrA[0];
            String str5 = strArrA[1];
            if (hdVar.b) {
                n9a n9aVar = (n9a) hdVar.d;
                w56 w56VarO = n9a.o();
                new bk0(n9aVar, w56VarO).b(str4, new e5f(str5, str3, (byte) 9));
                if (((mgh) hdVar.g).c(w56VarO)) {
                    return;
                }
                new rml(Unit.a, (umi) hdVar.c).a(new o5f(hdVar, (byte) 18)).m((qie) hdVar.f);
            }
        }
    }
}
