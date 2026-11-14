package ads_mobile_sdk;

import ads_mobile_sdk.a;
import ads_mobile_sdk.fl0;
import ads_mobile_sdk.j63;
import ads_mobile_sdk.le;
import ads_mobile_sdk.pd;
import ads_mobile_sdk.th3;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.goo;
import defpackage.k3p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class j63 {
    public final jjc a;
    public final a b;
    public final Set c;
    public final String d;
    public final k3p e;
    public final rp1 f;
    public final th3 g;

    public j63(jjc jjcVar, a aVar, rp1 rp1Var, ga3 ga3Var, String str, k3p k3pVar, b23 b23Var, b23 b23Var2, b23 b23Var3, th3 th3Var) {
        this.a = jjcVar;
        this.b = aVar;
        this.d = str;
        this.f = rp1Var;
        this.e = k3pVar;
        this.g = th3Var;
        int iOrdinal = ga3Var.ordinal();
        if (iOrdinal == 0) {
            this.c = (Set) b23Var.get();
            return;
        }
        if (iOrdinal == 1) {
            this.c = (Set) b23Var2.get();
        } else if (iOrdinal == 2) {
            this.c = (Set) b23Var3.get();
        } else {
            h9o.e();
            throw null;
        }
    }

    public final ListenableFuture b() {
        boolean z;
        boolean z2;
        a aVar = this.b;
        synchronized (aVar) {
            z = aVar.d;
        }
        if (!z) {
            return yr9.c("7");
        }
        rp1 rp1Var = this.f;
        synchronized (rp1Var) {
            z2 = rp1Var.j;
        }
        final byte b = 0;
        if (!z2) {
            return yr9.e(new Callable(this) { // from class: k7p
                public final /* synthetic */ j63 b;

                {
                    this.b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strEncodeToString;
                    byte b2 = b;
                    j63 j63Var = this.b;
                    switch (b2) {
                        case 0:
                            a aVar2 = j63Var.b;
                            String str = j63Var.d;
                            aVar2.getClass();
                            k3p k3pVarW = pd.w();
                            k3pVarW.b(sko.c(24));
                            return Base64.encodeToString(aVar2.a(((pd) k3pVarW.a()).a(), str, true), 11);
                        default:
                            th3 th3Var = j63Var.g;
                            try {
                                new iao(fl0.EVENT_ID_ENCRYPTION, th3Var.b, th3Var.a).b();
                                a aVar3 = j63Var.b;
                                pd pdVar = (pd) j63Var.e.a();
                                String str2 = j63Var.d;
                                aVar3.getClass();
                                try {
                                    strEncodeToString = Base64.encodeToString(((le) aVar3.a(str2, pdVar.a()).a()).a(), 11);
                                } catch (IllegalArgumentException unused) {
                                    k3p k3pVarW2 = pd.w();
                                    k3pVarW2.b(sko.c(22));
                                    strEncodeToString = Base64.encodeToString(aVar3.a(((pd) k3pVarW2.a()).a(), str2, true), 11);
                                }
                                return strEncodeToString;
                            } finally {
                            }
                    }
                }
            }, this.a);
        }
        ArrayList arrayList = new ArrayList(this.c.size());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a.submit((goo) it.next()));
        }
        h1b h1bVarR = h1b.r(arrayList);
        final byte b2 = 1;
        Callable callable = new Callable(this) { // from class: k7p
            public final /* synthetic */ j63 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strEncodeToString;
                byte b22 = b2;
                j63 j63Var = this.b;
                switch (b22) {
                    case 0:
                        a aVar2 = j63Var.b;
                        String str = j63Var.d;
                        aVar2.getClass();
                        k3p k3pVarW = pd.w();
                        k3pVarW.b(sko.c(24));
                        return Base64.encodeToString(aVar2.a(((pd) k3pVarW.a()).a(), str, true), 11);
                    default:
                        th3 th3Var = j63Var.g;
                        try {
                            new iao(fl0.EVENT_ID_ENCRYPTION, th3Var.b, th3Var.a).b();
                            a aVar3 = j63Var.b;
                            pd pdVar = (pd) j63Var.e.a();
                            String str2 = j63Var.d;
                            aVar3.getClass();
                            try {
                                strEncodeToString = Base64.encodeToString(((le) aVar3.a(str2, pdVar.a()).a()).a(), 11);
                            } catch (IllegalArgumentException unused) {
                                k3p k3pVarW2 = pd.w();
                                k3pVarW2.b(sko.c(22));
                                strEncodeToString = Base64.encodeToString(aVar3.a(((pd) k3pVarW2.a()).a(), str2, true), 11);
                            }
                            return strEncodeToString;
                        } finally {
                        }
                }
            }
        };
        nb5 nb5Var = new nb5(h1bVarR, false, false);
        nb5Var.g = new mb5(nb5Var, callable);
        nb5Var.m();
        return nb5Var;
    }
}
