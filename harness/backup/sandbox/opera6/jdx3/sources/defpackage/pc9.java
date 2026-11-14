package defpackage;

import android.content.Context;
import com.opera.android.settings.SettingsManager;
import com.opera.android.touch.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class pc9 implements vwl {
    public final Context a;
    public final umi b;
    public final bf9 c;
    public final a d = new a(this);
    public final Set e = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet f = new HashSet();
    public final qie g = new qie((byte) 19);
    public final xc9 h;
    public final SettingsManager i;
    public jc9 j;

    public pc9(Context context, umi umiVar, bf9 bf9Var, SettingsManager settingsManager) {
        this.a = context.getApplicationContext();
        this.b = umiVar;
        this.c = bf9Var;
        this.h = new xc9(context, umiVar);
        this.i = settingsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hb9 a(defpackage.fvd r24, javax.crypto.spec.SecretKeySpec r25, java.lang.String r26) throws org.json.JSONException, javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc9.a(fvd, javax.crypto.spec.SecretKeySpec, java.lang.String):hb9");
    }

    public static void b(List list, SecretKeySpec secretKeySpec, String str, ArrayList arrayList) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hb9 hb9VarA = a((fvd) it.next(), secretKeySpec, str);
            if (hb9VarA != null) {
                arrayList.add(hb9VarA);
            }
        }
    }

    public final jvd c() {
        return (jvd) this.d.get();
    }

    public final void d() {
        this.h.a();
        ec9 ec9Var = new ec9(this, (byte) 3);
        umi umiVar = this.b;
        nml nmlVarB = umiVar.b(ec9Var);
        nmlVarB.b(umiVar.f(new dc9(this, (byte) 0)));
        this.g.n(new oml(nmlVarB), null);
    }

    public final void e(long j) {
        gc9 gc9Var = new gc9(this, j, (byte) 0);
        umi umiVar = this.b;
        nml nmlVarB = umiVar.b(gc9Var);
        nmlVarB.b(umiVar.f(new dc9(this, (byte) 4)));
        this.g.n(new oml(nmlVarB), null);
    }

    public final void f(final long j, final String str, String str2, String str3, String str4, String str5, String str6, final boolean z) {
        final fvd fvdVar = new fvd(j, System.currentTimeMillis(), str, str2, str3, str4, str5, str6, null);
        esk eskVar = new esk() { // from class: hc9
            /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 532
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hc9.get():java.lang.Object");
            }
        };
        umi umiVar = this.b;
        nml nmlVarB = umiVar.b(eskVar);
        nmlVarB.b(umiVar.f(new dc9(this, (byte) 6)));
        this.g.n(new oml(nmlVarB), null);
    }

    public final void g(int i, List list) {
        Set set = this.e;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = new HashSet(set).iterator();
        while (it.hasNext()) {
            sc9 sc9Var = (sc9) it.next();
            if (!this.f.contains(sc9Var) && set.contains(sc9Var)) {
                ((qc9) sc9Var).a(i, list);
            }
        }
    }

    public final void h(int i, int i2) {
        Set set = this.e;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = new HashSet(set).iterator();
        while (it.hasNext()) {
            sc9 sc9Var = (sc9) it.next();
            if (!this.f.contains(sc9Var) && set.contains(sc9Var)) {
                rc9 rc9Var = ((qc9) sc9Var).a;
                rc9Var.c.subList(i, i + i2).clear();
                h7f h7fVar = rc9Var.d;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((mb9) g7fVarH.next()).f(i, i2);
                }
            }
        }
    }
}
