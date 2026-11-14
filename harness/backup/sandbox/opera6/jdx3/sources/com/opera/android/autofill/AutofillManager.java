package com.opera.android.autofill;

import J.N;
import androidx.annotation.NonNull;
import com.opera.api.Callback;
import defpackage.bi2;
import defpackage.dt2;
import defpackage.et2;
import defpackage.ew;
import defpackage.k3;
import defpackage.nrl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class AutofillManager {
    public final nrl a = new nrl((byte) 26);

    public interface AutofillCallback {
        void onAdded(@NonNull String str);
    }

    public interface NormalizedAddressRequestDelegate {
        void onAddressNormalized(@NonNull Address address);

        void onCouldNotNormalize(@NonNull Address address);
    }

    public AutofillManager() {
        N.MGQKLox_(this);
    }

    public static void addAddress(@NonNull List<Address> list, @NonNull Address address) {
        list.add(address);
    }

    public static void addCreditCard(@NonNull List<CreditCard> list, @NonNull CreditCard creditCard) {
        list.add(creditCard);
    }

    public static PersonalDataMonitor b(Runnable runnable) {
        PersonalDataMonitor personalDataMonitor = new PersonalDataMonitor();
        personalDataMonitor.a = runnable;
        personalDataMonitor.b = N.MdHnJVaE(personalDataMonitor);
        return personalDataMonitor;
    }

    public static void intArrayToFieldSet(@NonNull int[] iArr, @NonNull Set<ew> set) {
        int i;
        ew ewVar;
        for (int i2 : iArr) {
            ew[] ewVarArrValues = ew.values();
            int length = ewVarArrValues.length;
            while (true) {
                if (i >= length) {
                    ewVar = null;
                    break;
                } else {
                    ewVar = ewVarArrValues[i];
                    i = ewVar.a != i2 ? i + 1 : 0;
                }
            }
            set.add(ewVar);
        }
    }

    public static void loaded(@NonNull AutofillManager autofillManager) {
        autofillManager.a.K();
    }

    public final void a(Address address, AutofillCallback autofillCallback) {
        nrl nrlVar = this.a;
        if (nrlVar.a) {
            N.MhsaF0mG(address, autofillCallback);
        } else {
            nrlVar.d(new k3(this, address, autofillCallback, (byte) 15));
        }
    }

    public final void c(Callback callback) {
        nrl nrlVar = this.a;
        if (!nrlVar.a) {
            nrlVar.d(new dt2(this, callback, (byte) 1));
            return;
        }
        ArrayList arrayList = new ArrayList();
        N.MHoflEN5(arrayList);
        callback.run(arrayList);
    }

    public final void d(Callback callback) {
        nrl nrlVar = this.a;
        if (!nrlVar.a) {
            nrlVar.d(new dt2(this, callback, (byte) 2));
            return;
        }
        ArrayList arrayList = new ArrayList();
        N.MJJRBN$k(arrayList);
        callback.run(arrayList);
    }

    public final void e(Callback callback) {
        nrl nrlVar = this.a;
        if (!nrlVar.a) {
            nrlVar.d(new dt2(this, callback, (byte) 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        N.MbezVmo7(arrayList);
        callback.run(arrayList);
    }

    public final void f(String str) {
        nrl nrlVar = this.a;
        if (nrlVar.a) {
            N.MP0_t_nz(str);
        } else {
            nrlVar.d(new et2(str, (byte) 0));
        }
    }

    public final void g(Address address) {
        nrl nrlVar = this.a;
        if (nrlVar.a) {
            N.ME0$ESDd(address);
        } else {
            nrlVar.d(new bi2(this, address, (byte) 6));
        }
    }
}
