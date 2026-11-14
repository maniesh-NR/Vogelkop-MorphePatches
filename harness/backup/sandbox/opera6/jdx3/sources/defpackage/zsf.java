package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class zsf {
    public final Context a;
    public final umi b;
    public final b59 c;
    public final l45 d;
    public final ssf e;
    public final i16 f;
    public final AtomicBoolean g = new AtomicBoolean();
    public rsf h;
    public final Object i;
    public oml j;

    public zsf(Context context, umi umiVar, String str, String str2, ssf ssfVar) {
        boolean z;
        Object obj = new Object();
        this.i = obj;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = umiVar;
        b59 b59VarL = w1h.l(applicationContext, umiVar, str, new bg1[0]);
        this.c = b59VarL;
        l45 l45Var = new l45();
        l45Var.a = b59VarL;
        l45Var.b = new ni6(b59VarL);
        l45Var.c = new ReentrantLock();
        this.d = l45Var;
        this.e = ssfVar;
        i16 i16Var = new i16(applicationContext, str2, ssfVar);
        this.f = i16Var;
        rsf rsfVarS = i16Var.s("AvroOspCurrent");
        if (rsfVarS == null) {
            b();
        } else {
            this.h = rsfVarS;
        }
        synchronized (obj) {
            rsf rsfVarS2 = i16Var.s("AvroOspPending");
            if (rsfVarS2 == null) {
                z = false;
            } else {
                this.h = this.h.e(rsfVarS2);
                z = true;
                d(true);
                ((SharedPreferences) i16Var.b).edit().remove("AvroOspPending").apply();
            }
            if (z) {
                int iA = this.h.a();
                if (iA == 0) {
                    return;
                }
                this.h.g(7, iA, 0);
                e();
            }
        }
    }

    public final void a(byte[] bArr) {
        rsf rsfVarV = this.e.v(new ByteArrayInputStream(bArr));
        synchronized (this.i) {
            this.h = rsfVarV.e(this.h);
            e();
        }
    }

    public final void b() {
        synchronized (this.i) {
            rsf rsfVarB = this.e.b();
            this.h = rsfVarB;
            rsfVarB.c();
        }
    }

    public final void c(ab9 ab9Var) {
        boolean z;
        synchronized (this.i) {
            if (ab9Var.c != 1) {
                i16 i16Var = this.f;
                rsf rsfVarS = i16Var.s("AvroOspPending");
                if (rsfVarS == null) {
                    z = false;
                } else {
                    this.h = this.h.e(rsfVarS);
                    d(true);
                    ((SharedPreferences) i16Var.b).edit().remove("AvroOspPending").apply();
                    z = true;
                }
                if (z) {
                    this.h.g(ab9Var.c, 1, ab9Var.b);
                    e();
                }
            } else {
                ((SharedPreferences) this.f.b).edit().remove("AvroOspPending").apply();
            }
        }
    }

    public final void d(boolean z) {
        if (z || this.j != null) {
            this.f.z("AvroOspCurrent", this.h);
        }
        oml omlVar = this.j;
        if (omlVar != null) {
            omlVar.cancel(false);
            this.j = null;
        }
    }

    public final void e() {
        if (this.j != null) {
            return;
        }
        oml omlVar = new oml(this.b.c(new vdf(this, (byte) 9)));
        this.j = omlVar;
        omlVar.b(null, 5000L, TimeUnit.MILLISECONDS, null);
    }

    public final void f(long j, boolean z) {
        b59 b59Var = this.c;
        long j2 = ((SharedPreferences) b59Var.get()).getLong("Consents", 0L);
        long j3 = z ? j2 | j : (~j) & j2;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) b59Var.get()).edit();
        if (j2 != j3) {
            editorEdit.putLong("Consents", j3);
        }
        if ((j & 1) != 0 && ((SharedPreferences) b59Var.get()).contains("StatsFiltered")) {
            editorEdit.remove("StatsFiltered");
        }
        editorEdit.apply();
    }
}
