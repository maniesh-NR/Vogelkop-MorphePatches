package defpackage;

import J.N;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.opera.android.autofill.AddressEditorManager;
import com.opera.api.Callback;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class p1 implements mo7, pqk {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ p1(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ p1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public p1(jbf jbfVar) {
        this.a = (byte) 7;
        this.c = new SparseBooleanArray();
        this.b = jbfVar;
        jbfVar.F(this);
    }

    public p1(lld lldVar) {
        this.a = (byte) 8;
        this.c = lldVar;
        this.b = new LinkedHashSet();
        ((no7) lldVar.b).F(this);
    }

    public p1(xnh xnhVar, x5f x5fVar) {
        this.a = (byte) 2;
        this.b = xnhVar;
        this.c = x5fVar;
        xnhVar.F(this);
    }

    @Override // defpackage.pqk
    public final boolean i(int i) {
        return ((SparseBooleanArray) this.c).get(i, true);
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                v1 v1Var = (v1) ((pjn) obj).b;
                if (v1Var.y()) {
                    v1Var.H(this);
                    ((Callback) obj2).run(v1Var.x());
                    break;
                }
                break;
            case 1:
                xnh xnhVar = (xnh) obj;
                xnhVar.H(this);
                AddressEditorManager addressEditorManager = (AddressEditorManager) obj2;
                String str = ((wnh) xnhVar.i()).e;
                if (!addressEditorManager.b) {
                    if (str == null) {
                        str = "";
                    }
                    addressEditorManager.c = N.MVNOhSNx(str);
                    addressEditorManager.a.K();
                    break;
                }
                break;
            case 2:
                x5f x5fVar = (x5f) obj2;
                boolean z2 = !((wnh) ((xnh) obj).i()).a(2);
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                x56VarF.L(zpaVar).r(16, 1, z2);
                x5fVar.U0(x56VarF);
                break;
            case 3:
                e3j e3jVar = (e3j) obj;
                e3jVar.H(this);
                c3j c3jVarD = ((d3j) e3jVar.i()).d(11, false);
                ((Callback) obj2).run(Uri.parse("https://" + (c3jVarD != null ? (String) c3jVarD.d : "subscriptions.opera.com") + "/"));
                break;
            case 4:
                e3j e3jVar2 = (e3j) ((pjn) obj).b;
                e3jVar2.H(this);
                Callback callback = (Callback) obj2;
                qsh qshVarB = ((d3j) e3jVar2.i()).b(4);
                z45 z45Var = null;
                if (qshVarB != null) {
                    String str2 = (String) qshVarB.b;
                    if (!TextUtils.isEmpty(str2)) {
                        z45Var = new z45(str2);
                    }
                }
                callback.run(z45Var);
                break;
            case 5:
                ((no7) obj2).e.c(this);
                ((Runnable) obj).run();
                break;
            case 6:
                no7 no7Var = (no7) obj;
                no7Var.H(this);
                nh4 nh4Var = (nh4) obj2;
                if (nh4Var.r() instanceof c0f) {
                    p0i p0iVar = t0i.b;
                    nh4Var.resumeWith(no7Var.i());
                    break;
                }
                break;
            case 7:
                ibf ibfVar = (ibf) ((jbf) obj).i();
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) obj2;
                sparseBooleanArray.put(1, !ibfVar.a(2));
                sparseBooleanArray.put(2, !ibfVar.a(4));
                break;
            case 8:
                no7 no7Var2 = (no7) ((lld) obj2).b;
                if (!z) {
                    ffd ffdVar = (ffd) no7Var2.i();
                    if (!ffdVar.isEmpty()) {
                        no7Var2.H(this);
                        Iterator it = ((LinkedHashSet) obj).iterator();
                        while (it.hasNext()) {
                            ((Callback) it.next()).run(ffdVar);
                        }
                        break;
                    }
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                dj9 dj9Var = (dj9) obj;
                String str3 = ((cj9) dj9Var.i()).a;
                if (str3 != null) {
                    dj9Var.H(this);
                    ((tt2) obj2).run(str3);
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                v1 v1Var2 = (v1) obj;
                if (v1Var2.y()) {
                    v1Var2.H(this);
                    ((tt2) obj2).run(v1Var2.x());
                    break;
                }
                break;
            default:
                x5f x5fVar2 = (x5f) obj2;
                int i = ((aml) ((bml) obj).i()).b;
                zpa zpaVar2 = x5fVar2.d;
                x56 x56VarF2 = zpa.F();
                x56VarF2.M(zpaVar2).o(8, 1, i);
                x5fVar2.U0(x56VarF2);
                break;
        }
    }
}
