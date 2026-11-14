package com.opera.android.live_score;

import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.SystemClock;
import defpackage.c37;
import defpackage.ix5;
import defpackage.nwa;
import defpackage.q4b;
import defpackage.qfb;
import defpackage.ujc;
import defpackage.vjc;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/opera/android/live_score/LiveCommentaryService;", "Landroid/app/Service;", "<init>", "()V", "ujc", "live_score"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LiveCommentaryService extends Service {
    public static ix5 o;
    public static deg p;
    public ujc a;
    public pod b;
    public gkg c;
    public nwa d;
    public Bitmap e;
    public String f;
    public long i;
    public long j;
    public boolean k;
    public final c37 n;
    public String g = "";
    public String h = "";
    public final vjc l = new vjc(this);
    public final qfb m = new qfb((Object) this, (byte) 4);

    public LiveCommentaryService() {
        c37 c37Var = new c37();
        c37Var.b = this;
        c37Var.a = z4c.b(new q4b(this, (byte) 14));
        this.n = c37Var;
    }

    public final void a() {
        deg degVar;
        nwa nwaVar = this.d;
        if (nwaVar != null && (degVar = p) != null) {
            degVar.a(nwaVar);
        }
        this.d = null;
        gkg gkgVar = this.c;
        if (gkgVar != null) {
            gkgVar.b((gk9) null);
        }
        this.c = null;
        if (this.f != null && this.a != null) {
            if (this.k) {
                this.i = (SystemClock.elapsedRealtime() - this.j) + this.i;
                this.k = false;
            }
            if (o != null) {
                on7 on7Var = pn7.b;
                cs5.y0(this.i, un7.d);
            }
        }
        ujc ujcVar = this.a;
        if (ujcVar != null) {
            ujcVar.g0(this.l);
        }
        ujc ujcVar2 = this.a;
        if (ujcVar2 != null) {
            ujcVar2.release();
        }
        this.a = null;
        pod podVar = this.b;
        if (podVar != null) {
            podVar.a();
        }
        this.b = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a();
        stopForeground(1);
        super.onDestroy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0263  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.live_score.LiveCommentaryService.onStartCommand(android.content.Intent, int, int):int");
    }
}
