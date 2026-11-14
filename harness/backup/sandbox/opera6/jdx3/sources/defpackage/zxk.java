package defpackage;

import android.os.CancellationSignal;
import android.view.View;
import com.opera.android.settings.SettingsManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zxk implements u9j {
    public final zwk a;
    public final SettingsManager b;
    public final db c;
    public final som d;
    public final bf9 e;
    public final v9j f = new v9j(this);
    public final h5k g;
    public boolean h;
    public boolean i;
    public CancellationSignal j;
    public final yxk k;

    public zxk(zwk zwkVar, SettingsManager settingsManager, db dbVar, som somVar, bf9 bf9Var) {
        this.a = zwkVar;
        this.b = settingsManager;
        this.c = dbVar;
        this.d = somVar;
        this.e = bf9Var;
        h5k h5kVar = new h5k();
        h5kVar.d = this;
        h5kVar.c = new HashSet();
        h5kVar.b = new HashSet();
        this.g = h5kVar;
        this.i = settingsManager.i("enable_sync");
        this.k = new yxk(this);
    }

    public static oe6 a(ne6 ne6Var, boolean z) {
        int iGenerateViewId;
        HashMap map = xxk.b;
        String str = ne6Var.b;
        String str2 = ne6Var.b;
        wxk wxkVar = (wxk) map.get(str);
        if (wxkVar != null) {
            iGenerateViewId = wxkVar.b;
        } else {
            l5b l5bVar = q9n.c;
            iGenerateViewId = View.generateViewId();
            map.put(str2, new wxk(map.size(), iGenerateViewId, 0));
        }
        wxk wxkVar2 = (wxk) map.get(str2);
        return new oe6(ne6Var, z, iGenerateViewId, wxkVar2 != null ? wxkVar2.c : 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxk.b():void");
    }

    @Override // defpackage.u9j
    public final void j() {
        SettingsManager settingsManager;
        h5k h5kVar = this.g;
        HashSet hashSet = (HashSet) h5kVar.c;
        hashSet.clear();
        HashSet hashSet2 = (HashSet) h5kVar.b;
        hashSet2.clear();
        h5kVar.a = false;
        zwk zwkVar = this.a;
        zwkVar.getClass();
        Iterator it = zwk.b().a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            settingsManager = this.b;
            if (!zHasNext) {
                break;
            }
            ne6 ne6Var = (ne6) it.next();
            if (!this.i) {
                settingsManager.getClass();
                if (!settingsManager.i(SettingsManager.B(ne6Var))) {
                    hashSet2.add(ne6Var);
                }
            }
            hashSet.add(ne6Var);
        }
        for (ne6 ne6Var2 : zwk.b().b) {
            settingsManager.getClass();
            if (settingsManager.i(SettingsManager.B(ne6Var2))) {
                h5kVar.a = true;
                hashSet.add(ne6Var2);
            } else {
                hashSet2.add(ne6Var2);
            }
        }
        b();
        zwkVar.F(this.k);
    }

    @Override // defpackage.u9j
    public final void onStopped() {
        CancellationSignal cancellationSignal = this.j;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.j = null;
        this.a.H(this.k);
        if (this.c.f()) {
            boolean z = this.i;
            h5k h5kVar = this.g;
            boolean z2 = h5kVar.a;
            HashSet hashSet = (HashSet) h5kVar.c;
            SettingsManager settingsManager = this.b;
            if (z2) {
                h5kVar.a = false;
                zwk zwkVar = ((zxk) h5kVar.d).a;
                if (z) {
                    zwkVar.k(hashSet);
                } else {
                    zwkVar.k(v08.a);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ne6 ne6Var = (ne6) it.next();
                    settingsManager.getClass();
                    settingsManager.V(1, SettingsManager.B(ne6Var));
                }
                Iterator it2 = ((HashSet) h5kVar.b).iterator();
                while (it2.hasNext()) {
                    ne6 ne6Var2 = (ne6) it2.next();
                    settingsManager.getClass();
                    settingsManager.V(0, SettingsManager.B(ne6Var2));
                }
            }
            if (this.i == settingsManager.i("enable_sync") || zwk.i()) {
                return;
            }
            settingsManager.V(this.i ? 1 : 0, "enable_sync");
        }
    }
}
