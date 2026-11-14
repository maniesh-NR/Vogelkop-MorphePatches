package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.permissions.PermissionBridge;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final class jb implements AccountManagerFacade, bag {
    public int a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public final Serializable g;
    public final Serializable h;
    public Object i;
    public Object j;

    public jb(a4f a4fVar) throws e22 {
        e2j e2jVar;
        this.e = new h7f();
        this.f = new AtomicReference();
        this.g = new AtomicReference();
        this.h = new AtomicReference();
        this.i = new s14((byte) 17);
        this.d = a4fVar;
        if (tjj.c.b()) {
            hb hbVar = new hb(this, (byte) 1);
            e2jVar = fe2.f;
            hbVar.b(e2jVar);
        } else {
            hb hbVar2 = new hb(this, (byte) 0);
            e2jVar = fe2.f;
            hbVar2.b(e2jVar);
        }
        wa waVar = new wa(this, (byte) 1);
        n9a n9aVar = new n9a((byte) 14);
        t8.Q(t8.a, new tb(n9aVar, waVar, (byte) 0), new IntentFilter("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED"));
        s14 s14Var = new s14((byte) 17);
        new ib(n9aVar, s14Var, (byte) 1).b(e2jVar);
        s14Var.L(waVar);
        ((s14) this.i).L(new fb((byte) 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jb(nrl nrlVar, ChromiumContent chromiumContent, int i, lag[] lagVarArr, cag[] cagVarArr, String str, String str2, boolean z, PermissionBridge.PermissionCallback permissionCallback) {
        this.d = nrlVar;
        this.e = chromiumContent;
        this.a = i;
        this.f = lagVarArr;
        this.g = cagVarArr;
        this.h = str;
        this.i = str2;
        this.b = z;
        this.j = permissionCallback;
    }

    public static String b(Activity activity, String str) {
        String string;
        string = activity.getString(2132017591);
        str.getClass();
        switch (str) {
            case "android.permission.ACCESS_FINE_LOCATION":
            case "android.permission.ACCESS_COARSE_LOCATION":
                return activity.getString(2132020440, string);
            case "android.permission.ACCESS_LOCAL_NETWORK":
                return activity.getString(2132020439, string);
            case "android.permission.CAMERA":
                return activity.getString(2132020438, string);
            case "android.permission.RECORD_AUDIO":
                return activity.getString(2132020441, string);
            default:
                qp2.o(str);
                return null;
        }
    }

    public final void a() {
        ib ibVar = (ib) this.j;
        if (ibVar != null) {
            ((fe2) ibVar).c.set(true);
            ((fe2) ibVar).a.cancel(true);
            this.j = null;
        }
        ArrayList arrayList = new ArrayList();
        List<z7g> list = (List) ((AtomicReference) this.h).get();
        Iterator it = ((List) ((AtomicReference) this.f).get()).iterator();
        while (it.hasNext()) {
            String str = ((Account) it.next()).name;
            boolean zIsEmpty = list.isEmpty();
            for (z7g z7gVar : list) {
                if (zIsEmpty) {
                    break;
                }
                ArrayList arrayList2 = z7gVar.a;
                if (arrayList2.size() == 1) {
                    zIsEmpty = str.equals(arrayList2.get(0));
                } else {
                    String str2 = (String) arrayList2.get(0);
                    if (str.startsWith(str2)) {
                        String str3 = (String) am2.k(1, arrayList2);
                        if (str.endsWith(str3)) {
                            int length = str2.length();
                            Iterator it2 = arrayList2.subList(1, arrayList2.size() - 1).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str4 = (String) it2.next();
                                    int iIndexOf = str.indexOf(str4, length);
                                    if (iIndexOf == -1) {
                                        break;
                                    } else {
                                        length = iIndexOf + str4.length();
                                    }
                                } else if (str3.length() + length <= str.length()) {
                                    zIsEmpty = true;
                                }
                            }
                        }
                    }
                    zIsEmpty = false;
                }
            }
            if (zIsEmpty) {
                arrayList.add(str);
            }
        }
        ib ibVar2 = new ib(this, arrayList);
        this.j = ibVar2;
        ibVar2.b(fe2.f);
    }

    public final void c() {
        AtomicReference atomicReference = (AtomicReference) this.g;
        if (atomicReference.get() != null) {
            Iterator it = ((List) atomicReference.get()).iterator();
            if (it.hasNext()) {
                throw p3p.g(it);
            }
        }
    }

    public final void d(int i, boolean z, boolean z2) {
        ChromiumContent chromiumContent = (ChromiumContent) this.e;
        cag[] cagVarArr = (cag[]) this.g;
        nrl nrlVar = (nrl) this.d;
        lag[] lagVarArr = (lag[]) this.f;
        int i2 = this.c;
        if (i != i2) {
            return;
        }
        kag kagVar = z ? kag.GRANTED : kag.DENIED;
        lag lagVar = lagVarArr[i2];
        String str = (lagVar == lag.b || lagVar == lag.h) ? (String) this.h : (String) this.i;
        ((s9g) nrlVar.b).o(nrlVar.a, str, lagVar, kagVar, z2);
        int i3 = this.c;
        if (i3 < lagVarArr.length - 1 && lagVarArr[i3] == lag.f) {
            int i4 = i3 + 1;
            if (lagVarArr[i4] == lag.e && cagVarArr[i4].a == kag.ASK) {
                cagVarArr[i4] = new cag(kagVar, cagVarArr[i3].b);
                ((s9g) nrlVar.b).o(nrlVar.a, str, lagVarArr[i3 + 1], kagVar, z2);
            }
        }
        if (z && f03.z(lagVarArr[this.c]) == 3) {
            String[] strArrJ = f03.j(lagVarArr[this.c]);
            Objects.requireNonNull(strArrJ);
            f03.T(chromiumContent.b, strArrJ, this, true);
        } else {
            int i5 = this.c;
            Context context = (Context) ((WindowAndroid) chromiumContent.b).f.get();
            Objects.requireNonNull(context);
            cagVarArr[i5] = f03.m(context, lagVarArr[this.c], kagVar);
            this.c++;
            f();
        }
    }

    public final void e() {
        this.c--;
    }

    public final void f() {
        cag[] cagVarArr = (cag[]) this.g;
        lag[] lagVarArr = (lag[]) this.f;
        ChromiumContent chromiumContent = (ChromiumContent) this.e;
        while (true) {
            int i = this.c;
            if (i >= lagVarArr.length) {
                PermissionBridge.PermissionCallback permissionCallback = (PermissionBridge.PermissionCallback) this.j;
                if (permissionCallback != null) {
                    permissionCallback.run(cagVarArr);
                }
                ((s9g) ((nrl) this.d).b).g.remove(Integer.valueOf(this.a));
                return;
            }
            kag kagVar = cagVarArr[i].a;
            if (kagVar == kag.ASK) {
                lag lagVar = lagVarArr[i];
                if (lagVar != lag.b) {
                    chromiumContent.p.a(new z9g(this, lagVar, i));
                    return;
                }
                chromiumContent.getClass();
                boolean z = chromiumContent.t;
                d(this.c, false, !z);
                chromiumContent.p.j(new s2f((String) this.h, z));
                return;
            }
            if (kagVar == kag.GRANTED && f03.z(lagVarArr[i]) == 3) {
                int i2 = this.c;
                cagVarArr[i2] = new cag(kag.DENIED, cagVarArr[i2].b);
                String[] strArrJ = f03.j(lagVarArr[i2]);
                Objects.requireNonNull(strArrJ);
                f03.T(chromiumContent.b, strArrJ, this, true);
                return;
            }
            this.c++;
        }
    }

    @Override // defpackage.bag
    public final v9g g(Activity activity, List list) {
        return new t9g(activity, 2132020437, b(activity, (String) list.get(0)));
    }

    public final void h() {
        AtomicReference atomicReference = (AtomicReference) this.h;
        AtomicReference atomicReference2 = (AtomicReference) this.g;
        if (atomicReference2.get() == null || atomicReference.get() == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((List) atomicReference2.get()).iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            throw p3p.g(it2);
        }
        s14 s14Var = (s14) this.i;
        if (s14Var.b) {
            s14 s14Var2 = new s14((byte) 17);
            s14Var2.x(arrayList);
            this.i = s14Var2;
        } else {
            s14Var.x(arrayList);
        }
        h7f h7fVar = (h7f) this.e;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        if (g7fVarH.hasNext()) {
            throw am2.j(g7fVarH);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bag
    public final v9g n(dx3 dx3Var, ArrayList arrayList) {
        return new t9g(dx3Var, b(dx3Var, (String) arrayList.get(0)));
    }

    @Override // defpackage.bag
    public final void s() {
        cag[] cagVarArr = (cag[]) this.g;
        int i = this.c;
        cagVarArr[i] = new cag(kag.DENIED, cagVarArr[i].b);
        this.c = i + 1;
        f();
    }

    @Override // defpackage.bag
    public final void t() {
        cag[] cagVarArr = (cag[]) this.g;
        int i = this.c;
        Context context = (Context) ((WindowAndroid) ((ChromiumContent) this.e).b).f.get();
        Objects.requireNonNull(context);
        cagVarArr[i] = f03.m(context, ((lag[]) this.f)[this.c], kag.GRANTED);
        this.c++;
        f();
    }
}
