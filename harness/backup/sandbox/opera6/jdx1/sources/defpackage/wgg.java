package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class wgg {
    public final CoroutineContext a;
    public final Context b;
    public final myi c;
    public final awc d;
    public TextClassifier f;
    public final pfe e = new pfe();
    public final t0g g = hyg.k((Object) null);
    public final Object h = new Object();

    public wgg(CoroutineContext coroutineContext, Context context, myi myiVar, awc awcVar) {
        this.a = coroutineContext;
        this.b = context;
        this.c = myiVar;
        this.d = awcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (r4.i(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.CharSequence r11, long r12, android.view.textclassifier.TextClassifier r14, nt5 r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.ugg
            if (r0 == 0) goto L13
            r0 = r15
            ugg r0 = (defpackage.ugg) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ugg r0 = new ugg
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.x
            px5 r1 = px5.a
            int r2 = r0.z
            t0g r3 = r10.g
            pfe r4 = r10.e
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L53
            if (r2 == r6) goto L3f
            if (r2 != r5) goto L39
            java.lang.Object r10 = r0.u
            r4 = r10
            pfe r4 = (pfe) r4
            java.lang.Object r10 = r0.t
            gfl r10 = (defpackage.gfl) r10
            defpackage.ybh.y(r15)
            goto Lbf
        L39:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r7
        L3f:
            long r12 = r0.w
            pfe r11 = r0.v
            java.lang.Object r14 = r0.u
            android.view.textclassifier.TextClassifier r14 = (android.view.textclassifier.TextClassifier) r14
            java.lang.Object r2 = r0.t
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            defpackage.ybh.y(r15)
            r15 = r14
            r13 = r12
            r12 = r11
            r11 = r2
            goto L69
        L53:
            defpackage.ybh.y(r15)
            r0.t = r11
            r0.u = r14
            r0.v = r4
            r0.w = r12
            r0.z = r6
            java.lang.Object r15 = r4.i(r0)
            if (r15 == r1) goto Lbe
            r15 = r14
            r13 = r12
            r12 = r4
        L69:
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> Lcd
            gfl r2 = (defpackage.gfl) r2     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto L8c
            long r8 = r2.b     // Catch: java.lang.Throwable -> Lcd
            boolean r8 = defpackage.xjl.b(r13, r8)     // Catch: java.lang.Throwable -> Lcd
            if (r8 == 0) goto L83
            java.lang.CharSequence r2 = r2.a     // Catch: java.lang.Throwable -> Lcd
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r11, r2)     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto L83
            r2 = r6
            goto L84
        L83:
            r2 = 0
        L84:
            if (r2 != r6) goto L8c
            kotlin.Unit r10 = kotlin.Unit.a     // Catch: java.lang.Throwable -> Lcd
            r12.l(r7)
            return r10
        L8c:
            r12.l(r7)
            android.view.textclassifier.TextClassification$Request$Builder r12 = new android.view.textclassifier.TextClassification$Request$Builder
            int r2 = defpackage.xjl.f(r13)
            int r6 = defpackage.xjl.e(r13)
            r12.<init>(r11, r2, r6)
            android.os.LocaleList r2 = r10.c()
            android.view.textclassifier.TextClassification$Request$Builder r12 = r12.setDefaultLocales(r2)
            android.view.textclassifier.TextClassification$Request r12 = r12.build()
            android.view.textclassifier.TextClassification r12 = r15.classifyText(r12)
            gfl r10 = r10.b(r11, r13, r12)
            r0.t = r10
            r0.u = r4
            r0.v = r7
            r0.z = r5
            java.lang.Object r11 = r4.i(r0)
            if (r11 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            r3.setValue(r10)     // Catch: java.lang.Throwable -> Lc8
            r4.l(r7)
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        Lc8:
            r10 = move-exception
            r4.l(r7)
            throw r10
        Lcd:
            r10 = move-exception
            r12.l(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgg.a(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, nt5):java.lang.Object");
    }

    public final gfl b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction remoteAction2 = remoteAction;
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteAction2.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction remoteAction3 = remoteAction;
            if (remoteAction3 != null && (icon = remoteAction3.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new gfl(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList c() {
        awc awcVar = this.d;
        if (awcVar == null) {
            return new LocaleList(((yvc) jgg.a.B().a.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(k95.o(awcVar, 10));
        Iterator it = awcVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((yvc) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
