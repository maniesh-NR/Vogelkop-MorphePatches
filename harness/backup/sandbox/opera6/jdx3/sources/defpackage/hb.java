package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.task.PostTask;

/* loaded from: classes.dex */
public final class hb extends fe2 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ jb h;

    public /* synthetic */ hb(jb jbVar, byte b) {
        this.g = b;
        this.h = jbVar;
    }

    public final Object a() {
        switch (this.g) {
            case 0:
                ((a4f) this.h.d).getClass();
                return Collections.unmodifiableList(Arrays.asList(new Account[0]));
            default:
                ((a4f) this.h.d).getClass();
                return new ArrayList();
        }
    }

    public final void g(Object obj) {
        byte b = this.g;
        jb jbVar = this.h;
        switch (b) {
            case 0:
                List list = (List) obj;
                jbVar.b = true;
                AtomicReference atomicReference = (AtomicReference) jbVar.f;
                if (list == null) {
                    jbVar.b = false;
                    int i = jbVar.a;
                    if (i < 5) {
                        jbVar.a = i + 1;
                        PostTask.b(7, new c4(this, (byte) 1), 1000L);
                        break;
                    } else {
                        list = atomicReference.get() == null ? Collections.EMPTY_LIST : (List) atomicReference.get();
                    }
                }
                if (jbVar.a != 0) {
                    ioh.t("Signin.GetAccountsBackoffSuccess", jbVar.b);
                    if (jbVar.b) {
                        ioh.y(jbVar.a, 6, "Signin.GetAccountsBackoffRetries");
                    }
                }
                jbVar.a = 0;
                atomicReference.set(list);
                if (atomicReference.get() != null && ((AtomicReference) jbVar.h).get() != null) {
                    jbVar.a();
                    break;
                }
                break;
            default:
                List list2 = (List) obj;
                jbVar.b = true;
                AtomicReference atomicReference2 = (AtomicReference) jbVar.g;
                if (list2 == null) {
                    jbVar.b = false;
                    int i2 = jbVar.a;
                    if (i2 < 5) {
                        jbVar.a = i2 + 1;
                        PostTask.b(7, new c4(this, (byte) 2), 1000L);
                        break;
                    } else {
                        list2 = atomicReference2.get() == null ? Collections.EMPTY_LIST : (List) atomicReference2.get();
                    }
                }
                if (jbVar.a != 0) {
                    ioh.t("Signin.GetAccountsBackoffSuccess", jbVar.b);
                    if (jbVar.b) {
                        ioh.y(jbVar.a, 6, "Signin.GetAccountsBackoffRetries");
                    }
                }
                jbVar.a = 0;
                atomicReference2.set(list2);
                jbVar.h();
                break;
        }
    }
}
