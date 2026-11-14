package defpackage;

import com.opera.android.autofill.AutofillItem;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.PersonalDataMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class gv2 implements w6f, kkm, lkm {
    public final AutofillManager a;
    public List b;
    public final ArrayList c = new ArrayList();
    public final i7f d = new i7f();
    public PersonalDataMonitor e;

    public gv2(AutofillManager autofillManager) {
        this.a = autofillManager;
        if (this.e == null) {
            fv2 fv2Var = new fv2(this, (byte) 0);
            autofillManager.getClass();
            this.e = AutofillManager.b(fv2Var);
            a(autofillManager).invoke(new iu2(this, (byte) 2));
        }
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.d.b((bx) obj);
        if (this.e == null) {
            fv2 fv2Var = new fv2(this, (byte) 0);
            AutofillManager autofillManager = this.a;
            autofillManager.getClass();
            this.e = AutofillManager.b(fv2Var);
            a(autofillManager).invoke(new iu2(this, (byte) 2));
        }
    }

    @Override // defpackage.kkm
    public final e5d N(List list) {
        int i;
        if (list == null) {
            list = l08.a;
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        for (String str : list2) {
            this.c.add(str);
            l08 l08Var = this.b;
            if (l08Var == null) {
                l08Var = l08.a;
            }
            Iterator it = l08Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                i = Intrinsics.a(((AutofillItem) it.next()).a, str) ? 0 : i + 1;
            }
            arrayList.add(new guh(str, i));
        }
        e();
        return new e5d(arrayList, l08.a, (byte) 2);
    }

    @Override // defpackage.kkm
    public final void O(l46 l46Var) {
    }

    public final void R(ArrayList arrayList) {
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            c(this.a).invoke((String) obj);
        }
        arrayList2.clear();
    }

    public Function1 a(AutofillManager autofillManager) {
        return new r2(1, autofillManager, AutofillManager.class, "getAddresses", "getAddresses(Lcom/opera/api/Callback;)V", 0, (byte) 3);
    }

    public final ArrayList b() {
        l08 l08Var = this.b;
        if (l08Var == null) {
            l08Var = l08.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) l08Var) {
            if (!this.c.contains(((AutofillItem) obj).a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public Function1 c(AutofillManager autofillManager) {
        return new r2(1, autofillManager, AutofillManager.class, "removeAddress", "removeAddress(Ljava/lang/String;)V", 0, (byte) 4);
    }

    public final void e() {
        i7f i7fVar = this.d;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            bx bxVar = (bx) g7fVarC.next();
            switch (bxVar.a) {
                case 0:
                    ((cx) bxVar.b).g();
                    break;
                case 1:
                    ((br2) bxVar.b).g();
                    break;
                default:
                    ((dl4) bxVar.b).g();
                    break;
            }
        }
    }

    @Override // defpackage.w6f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void H(bx bxVar) {
        i7f i7fVar = this.d;
        i7fVar.c(bxVar);
        if (i7fVar.c == 0) {
            PersonalDataMonitor personalDataMonitor = this.e;
            if (personalDataMonitor != null) {
                personalDataMonitor.a();
            }
            this.e = null;
            this.b = null;
        }
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        Iterator it = e5dVar.iterator();
        while (it.hasNext()) {
            this.c.remove(((guh) it.next()).a);
        }
        e();
    }
}
