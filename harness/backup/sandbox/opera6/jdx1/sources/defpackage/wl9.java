package defpackage;

import android.os.Bundle;
import androidx.fragment.app.w;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class wl9 implements idc {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public wl9(a64 a64Var, b8g b8gVar, hoh hohVar, pqh pqhVar) {
        this.b = a64Var;
        this.c = b8gVar;
        this.d = hohVar;
        this.e = pqhVar;
    }

    public wl9(w wVar, String str, mm9 mm9Var, tcc tccVar) {
        this.e = wVar;
        this.b = str;
        this.c = mm9Var;
        this.d = tccVar;
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) {
        Bundle bundle;
        boolean z;
        switch (this.a) {
            case 0:
                w wVar = (w) this.e;
                Map map = wVar.m;
                String str = (String) this.b;
                if (occVar == occ.ON_START && (bundle = (Bundle) map.get(str)) != null) {
                    ((mm9) this.c).X(bundle, str);
                    map.remove(str);
                }
                if (occVar == occ.ON_DESTROY) {
                    ((tcc) this.d).b(this);
                    wVar.n.remove(str);
                    return;
                }
                return;
            default:
                mh4 mh4VarY = null;
                switch (y3o.a[occVar.ordinal()]) {
                    case 1:
                        na2.B((a64) this.b, null, rx5.d, new bhj(this.e, this.d, (Object) ndcVar, (Object) this, (mt5) null, (byte) 4), 1);
                        return;
                    case 2:
                        b8g b8gVar = (b8g) this.c;
                        if (b8gVar != null) {
                            tn tnVar = b8gVar.b;
                            synchronized (tnVar.b) {
                                synchronized (tnVar.b) {
                                    z = tnVar.a;
                                }
                                if (!z) {
                                    ArrayList arrayList = (ArrayList) tnVar.c;
                                    tnVar.c = (ArrayList) tnVar.d;
                                    tnVar.d = arrayList;
                                    tnVar.a = true;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        mt5 mt5Var = (mt5) arrayList.get(i);
                                        p0i p0iVar = t0i.b;
                                        mt5Var.resumeWith(Unit.a);
                                    }
                                    arrayList.clear();
                                }
                            }
                        }
                        hoh hohVar = (hoh) this.d;
                        synchronized (hohVar.c) {
                            if (hohVar.t) {
                                hohVar.t = false;
                                mh4VarY = hohVar.y();
                            }
                        }
                        if (mh4VarY != null) {
                            p0i p0iVar2 = t0i.b;
                            ((nh4) mh4VarY).resumeWith(Unit.a);
                            return;
                        }
                        return;
                    case 3:
                        hoh hohVar2 = (hoh) this.d;
                        synchronized (hohVar2.c) {
                            hohVar2.t = true;
                        }
                        return;
                    case 4:
                        ((hoh) this.d).x();
                        return;
                    case 5:
                    case 6:
                    case 7:
                        return;
                    default:
                        h9o.p();
                        return;
                }
        }
    }
}
