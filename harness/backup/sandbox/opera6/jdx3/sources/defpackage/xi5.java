package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class xi5 implements w6f {
    public static xi5 l;
    public final umi a;
    public final pjn b;
    public final qy4 c;
    public final tr3 d;
    public final qy4 e;
    public final qy4 f;
    public final si5 g;
    public final si5 h;
    public final h7f i;
    public final x5f j;
    public final vi5 k;

    public xi5(Context context) {
        tr3 tr3Var = new tr3();
        tr3Var.d = this;
        tr3Var.c = new Object();
        this.d = tr3Var;
        si5 si5Var = new si5(this, (byte) 0);
        this.g = si5Var;
        si5 si5Var2 = new si5(this, (byte) 1);
        this.h = si5Var2;
        this.i = new h7f();
        this.k = new vi5(this);
        String[] strArr = OperaApplication.K;
        this.j = ((OperaApplication) context.getApplicationContext()).L().c;
        umi umiVar = vml.d;
        this.a = umiVar;
        k32 k32Var = new k32(this, context, (byte) 2);
        Lazy.e(k32Var, umiVar);
        this.b = new pjn(k32Var, (byte) 28);
        this.c = new qy4(new s6h(k32Var, "data_savings_", false), tr3Var, 10);
        this.e = new qy4(new s6h(k32Var, "ad_block_stats_", false), si5Var, 20);
        this.f = new qy4(new s6h(k32Var, "tracker_block_stats_", false), si5Var2, 20);
    }

    public static xi5 a(Context context) {
        xi5 xi5Var;
        synchronized (xi5.class) {
            xi5Var = l;
            if (xi5Var == null) {
                xi5Var = new xi5(context.getApplicationContext());
                l = xi5Var;
            }
        }
        return xi5Var;
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.i.b((ti5) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.i.c((ti5) obj);
    }

    public final long b() {
        return ((SharedPreferences) ((k32) this.b.b).get()).getLong("ad_block_count", 0L);
    }

    public final ui5 c() {
        ui5 ui5Var = new ui5(Calendar.getInstance());
        pjn pjnVar = this.b;
        ui5Var.d = ((SharedPreferences) ((k32) pjnVar.b).get()).getLong("turbo_compressed_bytes", 0L);
        ui5Var.e = ((SharedPreferences) ((k32) pjnVar.b).get()).getLong("turbo_uncompressed_bytes", 0L);
        return ui5Var;
    }

    public final long e() {
        return ((SharedPreferences) ((k32) this.b.b).get()).getLong("tracker_block_count", 0L);
    }

    public final void f(long j) {
        ((SharedPreferences) ((k32) this.b.b).get()).edit().putLong("ad_block_count", j).apply();
        h7f h7fVar = this.i;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((ti5) g7fVarH.next()).y();
        }
    }

    public final void g(long j) {
        ((SharedPreferences) ((k32) this.b.b).get()).edit().putLong("tracker_block_count", j).apply();
        h7f h7fVar = this.i;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((ti5) g7fVarH.next()).B();
        }
    }

    public final void h(long j, long j2) {
        ((SharedPreferences) ((k32) this.b.b).get()).edit().putLong("turbo_compressed_bytes", j).putLong("turbo_uncompressed_bytes", j2).apply();
        this.a.d(new lb4(this, (byte) 23)).a(null);
    }

    public final void i(long j, long j2) {
        tr3 tr3Var = this.d;
        synchronized (tr3Var.c) {
            tr3Var.a = j;
            tr3Var.b = j2;
            ((xi5) tr3Var.d).c.g();
        }
        h(((SharedPreferences) ((k32) this.b.b).get()).getLong("turbo_compressed_bytes", 0L) + j, ((SharedPreferences) ((k32) this.b.b).get()).getLong("turbo_uncompressed_bytes", 0L) + j2);
        vi5 vi5Var = this.k;
        synchronized (vi5Var.d) {
            long j3 = vi5Var.a + j;
            vi5Var.a = j3;
            long j4 = vi5Var.b + j2;
            vi5Var.b = j4;
            long jMax = Math.max(0L, j4 - j3);
            long j5 = vi5Var.c;
            if (jMax > j5) {
                x5f x5fVar = ((xi5) vi5Var.e).j;
                long j6 = jMax - j5;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).e().b.p(39, 1, j6);
                    x5fVar.U0(x56VarF);
                }
                vi5Var.c = jMax;
            }
        }
    }
}
