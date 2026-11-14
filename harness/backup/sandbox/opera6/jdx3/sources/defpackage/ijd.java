package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ijd {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ijd() {
        this.f = hsh.d;
        this.b = true;
        a1b a1bVar = h1b.b;
        this.g = csh.e;
    }

    public ijd(rki rkiVar, j3i j3iVar) {
        this.d = rkiVar;
        this.e = j3iVar;
        this.f = new ftj((byte) 3);
        long[] jArr = imi.a;
        this.g = new see();
        this.c = true;
    }

    public final ArrayList a() {
        boolean zI;
        i0a i0aVar;
        h0a h0aVar = (h0a) this.e;
        yk6 yk6Var = (yk6) this.d;
        h58 h58Var = qdf.c;
        ArrayList arrayList = new ArrayList();
        h58Var.getClass();
        w4 w4Var = new w4(h58Var, (byte) 0);
        while (true) {
            boolean zA = true;
            if (!w4Var.hasNext()) {
                ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    qdf qdfVar = (qdf) obj;
                    int iOrdinal = qdfVar.ordinal();
                    if (iOrdinal == 0) {
                        zI = this.a;
                    } else if (iOrdinal == 1) {
                        zI = ((Boolean) yk6Var.j.g()).booleanValue() || ((i0aVar = (i0a) h0aVar.d.g()) != null && i0aVar.b);
                    } else if (iOrdinal == 2) {
                        zI = ((SettingsManager) this.g).i("live_scores_enabled");
                    } else if (iOrdinal == 3) {
                        zI = this.b;
                    } else {
                        if (iOrdinal != 4) {
                            h9o.p();
                            return null;
                        }
                        zI = this.c;
                    }
                    arrayList2.add(new rdf(qdfVar, zI));
                }
                return arrayList2;
            }
            Object next = w4Var.next();
            int iOrdinal2 = ((qdf) next).ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 == 2) {
                        zA = ((Boolean) ((xnc) this.f).a.g()).booleanValue();
                    } else if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                        h9o.p();
                        return null;
                    }
                } else if (!((Boolean) yk6Var.i.g()).booleanValue() || ((Boolean) yk6Var.k.g()).booleanValue()) {
                    i0a i0aVar2 = (i0a) h0aVar.d.g();
                    zA = Intrinsics.a(i0aVar2 != null ? Boolean.valueOf(i0aVar2.a) : null, Boolean.TRUE);
                }
            }
            if (zA) {
                arrayList.add(next);
            }
        }
    }

    public final void b() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        rki rkiVar = (rki) this.d;
        if (rkiVar.getLifecycle().i != qcc.b) {
            qp2.n("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.a) {
                qp2.n("SavedStateRegistry was already attached.");
                return;
            }
            ((j3i) this.e).invoke();
            rkiVar.getLifecycle().a(new h9(this, (byte) 1));
            this.a = true;
        }
    }
}
