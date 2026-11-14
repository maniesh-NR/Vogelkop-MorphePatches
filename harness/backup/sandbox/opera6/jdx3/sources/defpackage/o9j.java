package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GoogleApiAvailability;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o9j extends l7n {
    public final umi b;
    public final a21 c;
    public final oji d;
    public final orm e;
    public final n9j f = new n9j(this);
    public final AtomicReference g = new AtomicReference();
    public boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public o9j(umi umiVar, a21 a21Var, oji ojiVar, orm ormVar) {
        this.b = umiVar;
        this.c = a21Var;
        this.d = ojiVar;
        this.e = ormVar;
        a21Var.j();
        w6j[] w6jVarArr = (w6j[]) a21Var.d;
        ArrayList arrayList = new ArrayList(w6jVarArr.length);
        int length = w6jVarArr.length;
        byte b = 0;
        int i = 0;
        while (i < length) {
            w6j w6jVar = w6jVarArr[i];
            z7j z7jVar = (z7j) w6jVar.b;
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            Context context = (Context) w6jVar.a;
            boolean z = googleApiAvailability.isGooglePlayServicesAvailable(context) == 0 ? 1 : b;
            xc6 xc6Var = new xc6(b);
            ny3 ny3VarC = z7jVar.c();
            lw3 lw3Var = z7jVar.u;
            lw3 lw3Var2 = z7jVar.q;
            w6j[] w6jVarArr2 = w6jVarArr;
            int i2 = length;
            int i3 = i;
            j1c j1cVar = new j1c(lw3Var2.b.J(), (SharedPreferences) z7jVar.j.get(), lw3Var.b.O(), (jbn) z7jVar.y.get());
            d9j[] d9jVarArr = d9j.a;
            iy3 iy3Var = new iy3(ny3VarC, new g1c(j1cVar, new uj((byte) 3, 30000), new uj((byte) 7, 31000), new uj((byte) 9, 48000)));
            ru1 ru1Var = new ru1(z7jVar.a(), new oxe(context), new q9((byte) 0), new uj((byte) 6, 5000));
            x7k x7kVar = new x7k(z7jVar.f(), new qte((ekc) ((zyk) new w6j(lw3Var2.b.J(), z7jVar.s.b.N()).c).getValue(), 7000, (byte) 2), new qte(z7jVar.d(new yqa((byte) 21)).e, 28000, (byte) 0));
            icg icgVar = new icg(new y5g(new qte(((ks3) ((wub) w6jVar.c).a).w().i, 8000, (byte) 1)), new uj((byte) 4, 9000), new uj((byte) 2, 10000), new qte(z7jVar.g().f, 22000, (byte) 3), z);
            xk xkVar = new xk(new uj((byte) 0, 26000), new uj((byte) 1, 51000));
            y5g y5gVar = new y5g(new uj((byte) 8, 24000));
            xoj xojVar = new xoj(new jvg(lw3Var.b.O()));
            q9 q9Var = new q9((lw3) w6jVar.e);
            q9 q9Var2 = new q9((byte) 1);
            uj ujVar = new uj((byte) 5, 15000);
            xoj xojVar2 = new xoj(((tah) ((rii) w6jVar.d).b).R());
            String[] strArr = OperaApplication.K;
            List listAsList = Arrays.asList(xc6Var, iy3Var, ru1Var, x7kVar, icgVar, new bzg(xkVar, y5gVar, xojVar, q9Var, q9Var2, ujVar, xojVar2, ((OperaApplication) context.getApplicationContext()).R().p().a), new mc2(z7jVar.e()), new mc2(new igi(lw3Var2.b.J(), (yk6) z7jVar.d.get())), new mc2(z7jVar.b()), new xc6((byte) 3), new drd(ipe.G()), new xc6((byte) 4), new xc6((byte) 1), new xc6((byte) 2), new a3(context));
            ArrayList arrayList2 = new ArrayList(k95.o(listAsList, 10));
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                arrayList2.add(a21.g((f1g) it.next()));
            }
            arrayList.add(k95.p(arrayList2));
            i = i3 + 1;
            b = 0;
            w6jVarArr = w6jVarArr2;
            length = i2;
        }
        ArrayList arrayListP = k95.p(arrayList);
        int size = arrayListP.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListP.get(i4);
            i4++;
            v6j v6jVar = (v6j) obj;
            v6jVar.b.k((g9j) a21Var.j);
            v6jVar.c().k((g9j) a21Var.k);
        }
        a21Var.l = arrayListP;
        f(new k9j(this, (byte) 0));
    }

    public static /* synthetic */ void h(o9j o9jVar, String str, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        o9jVar.g(str, true);
    }

    public final void e() {
        this.c.j();
    }

    public final void f(n5o n5oVar) {
        new oml(this.b.e(n5oVar)).a(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L17
            java.util.concurrent.atomic.AtomicReference r5 = r3.g
            java.lang.Object r5 = r5.getAndSet(r1)
            oml r5 = (defpackage.oml) r5
            if (r5 == 0) goto L17
            boolean r2 = r5.isCancelled()
            if (r2 != 0) goto L17
            r5.cancel(r0)
        L17:
            a21 r5 = r3.c
            if (r4 == 0) goto L28
            r5.getClass()
            boolean r2 = kotlin.text.StringsKt.N(r4)
            if (r2 != 0) goto L28
            defpackage.a21.s(r5, r1, r4, r0)
            goto L3a
        L28:
            r5.m = r1
            java.lang.Object r0 = r5.e
            shf r0 = (defpackage.shf) r0
            r0.S(r1)
            java.lang.Object r5 = r5.h
            h42 r5 = (defpackage.h42) r5
            l08 r0 = l08.a
            r5.n(r0)
        L3a:
            l9j r5 = new l9j
            r5.<init>(r4, r3)
            umi r3 = r3.b
            nml r3 = r3.f(r5)
            oml r4 = new oml
            r4.<init>(r3)
            r4.a(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9j.g(java.lang.String, boolean):void");
    }
}
