package defpackage;

import android.os.Message;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class aod {
    public final snd a;
    public final int b;
    public final boolean c;
    public final cod d;
    public final cod e;
    public final cod f;
    public final ArrayList g;
    public final WeakReference h;
    public ListenableFuture i = null;
    public boolean j = false;
    public boolean k = false;

    public aod(ez9 ez9Var, cod codVar, snd sndVar, int i, int i2, boolean z, cod codVar2, ArrayList arrayList) {
        this.h = new WeakReference(ez9Var);
        this.e = codVar;
        this.a = sndVar;
        this.b = i;
        this.c = z;
        this.d = ez9Var.d;
        this.f = codVar2;
        this.g = arrayList != null ? new ArrayList(arrayList) : null;
        ez9Var.a.postDelayed(new znd(this, (byte) 0), 15000L);
    }

    public final void a() {
        if (this.j || this.k) {
            return;
        }
        this.k = true;
        snd sndVar = this.a;
        if (sndVar != null) {
            sndVar.h(0);
            sndVar.d();
        }
    }

    public final void b() {
        ListenableFuture listenableFuture;
        ynd yndVarA;
        dod.b();
        if (this.j || this.k) {
            return;
        }
        WeakReference weakReference = this.h;
        ez9 ez9Var = (ez9) weakReference.get();
        if (ez9Var == null || ez9Var.g != this || ((listenableFuture = this.i) != null && listenableFuture.isCancelled())) {
            a();
            return;
        }
        this.j = true;
        ez9Var.g = null;
        ez9 ez9Var2 = (ez9) weakReference.get();
        cod codVar = this.d;
        int i = this.b;
        if (ez9Var2 != null) {
            HashMap map = ez9Var2.b;
            if (ez9Var2.d == codVar) {
                Message messageObtainMessage = ez9Var2.a.obtainMessage(263, codVar);
                messageObtainMessage.arg1 = i;
                messageObtainMessage.sendToTarget();
                snd sndVar = ez9Var2.e;
                if (sndVar != null) {
                    sndVar.h(i);
                    ez9Var2.e.d();
                }
                if (!map.isEmpty()) {
                    for (snd sndVar2 : map.values()) {
                        sndVar2.h(i);
                        sndVar2.d();
                    }
                    map.clear();
                }
                ez9Var2.e = null;
            }
        }
        ez9 ez9Var3 = (ez9) weakReference.get();
        if (ez9Var3 != null) {
            cod codVar2 = this.e;
            ez9Var3.d = codVar2;
            ez9Var3.e = this.a;
            sa2 sa2Var = new sa2((byte) 16);
            sa2Var.b = i;
            jzi jziVar = new jzi(sa2Var);
            az9 az9Var = ez9Var3.a;
            boolean z = this.c;
            int i2 = jziVar.a;
            cod codVar3 = this.f;
            if (codVar3 == null) {
                az9Var.getClass();
                Message messageObtainMessage2 = az9Var.obtainMessage(262, new dz9(codVar, codVar2, jziVar, z));
                messageObtainMessage2.arg1 = i2;
                messageObtainMessage2.sendToTarget();
            } else {
                az9Var.getClass();
                Message messageObtainMessage3 = az9Var.obtainMessage(264, new dz9(codVar3, codVar2, jziVar, z));
                messageObtainMessage3.arg1 = i2;
                messageObtainMessage3.sendToTarget();
            }
            ez9Var3.b.clear();
            ez9Var3.j();
            ez9Var3.o();
            ArrayList arrayList = this.g;
            if (arrayList == null || (yndVarA = ez9Var3.d.a()) == null) {
                return;
            }
            yndVarA.p(arrayList);
        }
    }
}
