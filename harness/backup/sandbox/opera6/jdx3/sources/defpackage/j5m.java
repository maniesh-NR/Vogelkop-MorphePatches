package defpackage;

import J.N;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class j5m {
    public final int a;
    public final String b;
    public final String c;
    public final kze d;
    public final umi e;
    public final short f;
    public final q65 g;
    public final ArrayList h;
    public final oji i;
    public Runnable j;
    public final /* synthetic */ vz5 k;

    /* JADX WARN: Type inference failed for: r4v3, types: [int, short] */
    public j5m(vz5 vz5Var, int i, String str, String str2, oji ojiVar, int i2, long j) {
        Objects.requireNonNull(vz5Var);
        this.k = vz5Var;
        b5m b5mVar = new b5m(i2);
        umi umiVar = (umi) vz5Var.h;
        this.g = new q65(new ld9(this, (byte) 16), (byte) 4);
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.a = i;
        this.b = str;
        this.c = str2;
        this.e = umiVar;
        this.f = (int) j;
        this.d = new kze(b5mVar);
        if (i != -1) {
            b(b5mVar);
        }
        arrayList.add(new v6a(this, (byte) 0));
        this.i = ojiVar;
        arrayList.add(new v6a(this, (byte) 1));
    }

    public hh4 a(Runnable runnable) {
        this.j = runnable;
        long j = ((ChromiumContent) ((eme) this.k.g).a).n;
        if (j != 0) {
            N.M1mYb9xT(j, this.a);
        }
        return new crk(this, (byte) 22);
    }

    public final void b(d5m d5mVar) {
        if (this.a == -1) {
            return;
        }
        c5m c5mVar = d5mVar.a;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v6a v6aVar = (v6a) obj;
            int iOrdinal = c5mVar.ordinal();
            if (iOrdinal == 0) {
                a5m a5mVar = (a5m) d5mVar;
                switch (v6aVar.a) {
                    case 0:
                        break;
                    default:
                        j5m j5mVar = v6aVar.b;
                        oji ojiVar = j5mVar.i;
                        byte b = a5mVar.b;
                        d7h d7hVar = (d7h) ((vz5) ojiVar.a).i;
                        if (d7hVar == null) {
                            break;
                        } else {
                            String str = j5mVar.b;
                            String str2 = j5mVar.c;
                            v3m v3mVar = (v3m) d7hVar.c;
                            szb szbVarB = v3mVar.b(str);
                            szb szbVarB2 = v3mVar.b(str2);
                            if (szbVarB != null && szbVarB2 != null) {
                                d7hVar.d(szbVarB, szbVarB2, b != 6 ? ps0.k : ps0.e);
                                break;
                            } else {
                                break;
                            }
                        }
                        break;
                }
            } else if (iOrdinal == 1) {
                b5m b5mVar = (b5m) d5mVar;
                switch (v6aVar.a) {
                    case 0:
                        byte b2 = b5mVar.b;
                        if (b2 != 0 && b2 != 1 && b2 != 3 && b2 != 4) {
                            break;
                        } else {
                            j5m j5mVar2 = v6aVar.b;
                            j5mVar2.g.B0(j5mVar2.e, j5mVar2.f, TimeUnit.MILLISECONDS);
                            break;
                        }
                    default:
                        if (b5mVar.b != 5) {
                            break;
                        } else {
                            j5m j5mVar3 = v6aVar.b;
                            d7h d7hVar2 = (d7h) ((vz5) ((oji) j5mVar3.k.e).a).i;
                            if (d7hVar2 == null) {
                                break;
                            } else {
                                String str3 = j5mVar3.b;
                                String str4 = j5mVar3.c;
                                v3m v3mVar2 = (v3m) d7hVar2.c;
                                szb szbVarB3 = v3mVar2.b(str3);
                                szb szbVarB4 = v3mVar2.b(str4);
                                if (szbVarB3 != null && szbVarB4 != null) {
                                    d7hVar2.d(szbVarB3, szbVarB4, ps0.b);
                                    break;
                                } else {
                                    break;
                                }
                            }
                        }
                }
            }
        }
    }

    public void c() {
        vz5 vz5Var = this.k;
        if (vz5Var.b == -1) {
            d(new b5m(0));
            long j = ((ChromiumContent) ((eme) vz5Var.g).a).n;
            if (j == 0) {
                return;
            }
            N.MK6hIkOd(j, this.a);
            return;
        }
        kze kzeVar = (kze) vz5Var.f;
        j5m j5mVar = (j5m) kzeVar.g();
        Runnable runnable = j5mVar.j;
        if (runnable != null) {
            runnable.run();
            j5mVar.j = null;
        }
        kzeVar.r((i5m) vz5Var.d);
        vz5Var.b = -1;
    }

    public final void d(d5m d5mVar) {
        int i = this.a;
        if (i == -1) {
            return;
        }
        this.g.S();
        kze kzeVar = this.d;
        if (d5mVar.equals(kzeVar.g())) {
            return;
        }
        d5m d5mVar2 = (d5m) kzeVar.g();
        if (i == -1) {
            d5mVar = (d5m) kzeVar.g();
        } else if ((d5mVar instanceof a5m) && d5mVar2.a()) {
            d5mVar = new b5m(2);
        }
        kzeVar.r(d5mVar);
        b(d5mVar);
    }
}
