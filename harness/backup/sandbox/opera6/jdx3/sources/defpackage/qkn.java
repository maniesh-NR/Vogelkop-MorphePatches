package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class qkn {
    public final gjm a;
    public final qln b;
    public final onn c;
    public final SettingsManager d;
    public final ezg e;
    public final RecyclerView f;
    public final k3i g;
    public final x4i h;
    public final qs7 i;
    public final ujn j;
    public final zk7 k;
    public final q87 l;
    public t79 m;
    public i4a n;
    public boolean o;
    public final ysj p;
    public exd q;
    public final StatusBarDrawingFrameLayout r;
    public final t77 s;

    public qkn(gjm gjmVar, qln qlnVar, onn onnVar, SettingsManager settingsManager, RecyclerView recyclerView, n1 n1Var, ysj ysjVar, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout, orm ormVar, eej eejVar, wln wlnVar, k3i k3iVar, x4i x4iVar) throws wed {
        ezg ezgVar = new ezg(this, (byte) 11);
        this.e = ezgVar;
        t77 t77Var = new t77((Object) this, (byte) 12);
        this.s = t77Var;
        this.a = gjmVar;
        this.b = qlnVar;
        this.c = onnVar;
        this.d = settingsManager;
        this.f = recyclerView;
        this.g = k3iVar;
        this.h = x4iVar;
        this.i = qs7.o;
        this.p = ysjVar;
        this.r = statusBarDrawingFrameLayout;
        k56 k56Var = new k56();
        k56Var.g = false;
        ujn ujnVar = new ujn(n1Var, qlnVar.g, settingsManager, new pkn(this, wlnVar, n1Var, qlnVar, ormVar, eejVar));
        this.j = ujnVar;
        b(recyclerView.getResources().getInteger(2131493011));
        recyclerView.B0(k56Var);
        recyclerView.y0(ujnVar);
        zk7 zk7Var = new zk7(new g00(recyclerView.getContext(), 2131233314, (byte) 2), new r2n((Object) this, (byte) 8));
        this.k = zk7Var;
        recyclerView.m(zk7Var);
        q87 q87Var = new q87(recyclerView.getContext(), 2131233316, new z4k((Object) this, (byte) 13));
        this.l = q87Var;
        recyclerView.m(q87Var);
        d();
        settingsManager.F(ezgVar);
        x4iVar.h.k(t77Var);
    }

    public final void a() {
        this.h.h.p(this.s);
        this.d.H(this.e);
        while (true) {
            RecyclerView recyclerView = this.f;
            if (recyclerView.p.size() <= 0) {
                this.o = true;
                return;
            }
            recyclerView.r0(0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r21) throws wed {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkn.b(int):void");
    }

    public final void c(boolean z) {
        ArrayList arrayList;
        ujn ujnVar = this.j;
        ujnVar.e.G0(z);
        boolean zC = this.g.c();
        qln qlnVar = this.b;
        if (!zC || !z) {
            ujnVar.T((List) ((kze) qlnVar.f.g).g());
            return;
        }
        List list = (List) ((kze) qlnVar.f.g).g();
        Map map = (Map) this.h.h.g();
        if (map == null || map.isEmpty()) {
            arrayList = l08.a;
        } else {
            Set setKeySet = map.keySet();
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (setKeySet.contains(((aln) obj).getId())) {
                    arrayList.add(obj);
                }
            }
        }
        ujnVar.T(arrayList);
    }

    public final boolean d() {
        int iP = this.j.P(this.b.i());
        this.i.getClass();
        if (qs7.p == null || iP == -1) {
            return false;
        }
        boolean zContains = this.d.a.contains("wallpaper_current");
        RecyclerView recyclerView = this.f;
        if (zContains) {
            exg.z(recyclerView, iP, fan.a(64.0f, recyclerView.getResources()));
            return true;
        }
        recyclerView.invalidate();
        return false;
    }
}
