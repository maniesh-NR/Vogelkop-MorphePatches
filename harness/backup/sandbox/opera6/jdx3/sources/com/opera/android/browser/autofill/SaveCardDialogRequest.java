package com.opera.android.browser.autofill;

import J.N;
import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.dx3;
import defpackage.eej;
import defpackage.i16;
import defpackage.ijm;
import defpackage.nej;
import defpackage.qp2;
import defpackage.rii;
import defpackage.umi;
import defpackage.vml;
import defpackage.xq3;

/* loaded from: classes.dex */
public final class SaveCardDialogRequest {
    public final i16 a;
    public final Context b;
    public final eej c;
    public final rii d;
    public final long e;

    /* JADX WARN: Multi-variable type inference failed */
    public SaveCardDialogRequest(long j, dx3 dx3Var, umi umiVar, eej eejVar) {
        Context applicationContext = dx3Var.getApplicationContext();
        this.b = applicationContext;
        String[] strArr = OperaApplication.K;
        this.a = i16.r(applicationContext, umiVar, ((OperaApplication) applicationContext.getApplicationContext()).u);
        this.c = eejVar;
        this.e = j;
        this.d = new rii(this, (byte) 0);
    }

    public static SaveCardDialogRequest create(long j, @NonNull ChromiumContent chromiumContent) {
        dx3 dx3VarC = chromiumContent.c();
        umi umiVar = vml.d;
        eej eejVar = chromiumContent.G;
        if (eejVar != null) {
            return new SaveCardDialogRequest(j, dx3VarC, umiVar, eejVar);
        }
        qp2.n("Error");
        return null;
    }

    public final void showDialog(@NonNull String str, @NonNull String str2, @NonNull String str3, int i, @NonNull String str4, @NonNull String str5) {
        String[] strArr = OperaApplication.K;
        boolean zI = ((OperaApplication) this.b.getApplicationContext()).J().i("automatic_card_save_ask");
        long j = this.e;
        if (!zI) {
            N.MltfAxC5(j);
            return;
        }
        if (this.a.m(str4, str5)) {
            N.MltfAxC5(j);
            return;
        }
        pr prVar = new pr();
        prVar.b = str;
        prVar.c = str2;
        prVar.d = str3;
        prVar.a = i;
        prVar.e = str4;
        prVar.f = str5;
        nej nejVar = this.c.a;
        xq3 xq3Var = new xq3(prVar, this.d, (byte) 9);
        nejVar.getClass();
        nejVar.b(xq3Var, ijm.b);
    }
}
