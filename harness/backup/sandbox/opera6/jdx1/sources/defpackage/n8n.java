package defpackage;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n8n implements lsp {
    public final ArrayList a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;
    public final Object f;

    public n8n() {
        this.b = -1L;
        this.f = new m8n(this);
        this.a = new ArrayList();
    }

    public n8n(cp8 cp8Var, ArrayList arrayList, ArrayList arrayList2, long j, boolean z, ArrayList arrayList3) {
        this.f = cp8Var;
        this.a = arrayList;
        this.d = arrayList2;
        this.b = j;
        this.c = z;
        this.e = arrayList3;
    }

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((l8n) obj).b();
            }
            this.c = false;
        }
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l8n l8nVar = (l8n) obj;
            long j = this.b;
            if (j >= 0) {
                l8nVar.c(j);
            }
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.d;
            if (baseInterpolator != null && (view = (View) l8nVar.a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (((p8n) this.e) != null) {
                l8nVar.d((m8n) this.f);
            }
            View view2 = (View) l8nVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void zza() {
        cp8 cp8Var = (cp8) this.f;
        ArrayList arrayList = (ArrayList) this.d;
        long j = this.b;
        cp8Var.k.addAll(this.a);
        cp8Var.l.addAll(arrayList);
        Long lValueOf = Long.valueOf(j);
        cp8Var.p(5, 0, (Integer) null, lValueOf, lValueOf, (ArrayList) null, (ArrayList) null);
    }

    public final void zzb(int i) {
        ((cp8) this.f).p(6, i, (Integer) null, (Long) null, (Long) null, (ArrayList) null, (ArrayList) null);
    }

    public final void zzc() {
        if (this.c) {
            return;
        }
        cp8 cp8Var = (cp8) this.f;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.d;
        long j = this.b;
        ipp ippVar = (ipp) ytp.a.get();
        n8n n8nVar = new n8n(cp8Var, this.a, arrayList2, j, true, arrayList);
        ippVar.getClass();
        if (n0k.e.get() != null) {
            ippVar.d.execute(new iv(ippVar, arrayList, n8nVar, (byte) 17));
        } else {
            qp2.n("Ingestion should only be called in SplitCompat mode.");
        }
    }
}
