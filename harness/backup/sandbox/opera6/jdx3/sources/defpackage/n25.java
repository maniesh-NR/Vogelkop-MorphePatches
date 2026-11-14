package defpackage;

import J.N;
import android.content.res.Resources;
import android.text.TextUtils;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.CreditCard;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n25 extends r25 {
    public final ii f;
    public int g;
    public int h;
    public int i;
    public int j;

    public n25() {
        super("Autofill", new rxh(2132021316), new rxh(2132021317), 2131231742, a35.l);
        this.f = new ii((byte) 7);
    }

    @Override // defpackage.r25
    public final void a(s25 s25Var, Runnable runnable) {
        final AutofillManager autofillManager = (AutofillManager) this.f.get();
        autofillManager.getClass();
        final byte b = 0;
        autofillManager.e(new Callback() { // from class: ft2
            @Override // com.opera.api.Callback
            public final void run(Object obj) {
                byte b2 = b;
                AutofillManager autofillManager2 = autofillManager;
                List list = (List) obj;
                switch (b2) {
                    case 0:
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str = ((CreditCard) it.next()).a;
                            nrl nrlVar = autofillManager2.a;
                            if (nrlVar.a) {
                                N.Mk6fI$HM(str);
                            } else {
                                nrlVar.d(new et2(str, (byte) 1));
                            }
                        }
                        break;
                    default:
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            autofillManager2.f(((Address) it2.next()).a);
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        autofillManager.c(new Callback() { // from class: ft2
            @Override // com.opera.api.Callback
            public final void run(Object obj) {
                byte b22 = b2;
                AutofillManager autofillManager2 = autofillManager;
                List list = (List) obj;
                switch (b22) {
                    case 0:
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str = ((CreditCard) it.next()).a;
                            nrl nrlVar = autofillManager2.a;
                            if (nrlVar.a) {
                                N.Mk6fI$HM(str);
                            } else {
                                nrlVar.d(new et2(str, (byte) 1));
                            }
                        }
                        break;
                    default:
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            autofillManager2.f(((Address) it2.next()).a);
                        }
                        break;
                }
            }
        });
        i16.r(s25Var.a, s25Var.b, s25Var.g).k();
        i7f i7fVar = lx3.a;
        N.M2mWEj0S();
        runnable.run();
    }

    @Override // defpackage.r25
    public final void c(s25 s25Var, Callback callback) {
        ii iiVar = this.f;
        AutofillManager autofillManager = (AutofillManager) iiVar.get();
        iu2 iu2Var = (iu2) callback;
        byte b = 0;
        l25 l25Var = new l25(this, s25Var, iu2Var, (byte) 0);
        nrl nrlVar = autofillManager.a;
        if (nrlVar.a) {
            ArrayList arrayList = new ArrayList();
            N.M_nAabU4(arrayList);
            l25Var.run(arrayList);
        } else {
            nrlVar.d(new bi2(autofillManager, l25Var, (byte) 7));
        }
        ((AutofillManager) iiVar.get()).e(new l25(this, s25Var, iu2Var, (byte) 1));
        m25 m25Var = new m25(this, s25Var, iu2Var, b);
        i7f i7fVar = lx3.a;
        N.MQS4iFQv(m25Var);
    }

    public final void e(s25 s25Var, iu2 iu2Var) {
        int i = this.j + 1;
        this.j = i;
        if (i < 3) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.g > 0) {
            Resources resources = s25Var.a.getResources();
            int i2 = this.g;
            arrayList.add(resources.getQuantityString(2131886103, i2, Integer.valueOf(i2)));
        }
        if (this.h > 0) {
            Resources resources2 = s25Var.a.getResources();
            int i3 = this.h;
            arrayList.add(resources2.getQuantityString(2131886105, i3, Integer.valueOf(i3)));
        }
        if (this.i > 0) {
            Resources resources3 = s25Var.a.getResources();
            int i4 = arrayList.isEmpty() ? 2131886112 : 2131886108;
            int i5 = this.i;
            arrayList.add(resources3.getQuantityString(i4, i5, Integer.valueOf(i5)));
        }
        if (arrayList.isEmpty()) {
            iu2Var.run(s25Var.a.getString(2132021318));
        } else {
            iu2Var.run(TextUtils.join(s25Var.a.getString(2132020007, "", ""), arrayList));
        }
    }
}
