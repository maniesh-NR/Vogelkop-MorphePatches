package defpackage;

import androidx.annotation.Nullable;
import com.opera.android.annotations.WeakOwner;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c15 extends t7j {
    public final ta7 j;
    public final s9i k;
    public final ip4 l;
    public final i3j m;

    @Nullable
    @WeakOwner
    private q8j n;
    public boolean o;

    public c15(ta7 ta7Var, tm5 tm5Var, s9i s9iVar, ip4 ip4Var) {
        super(tm5Var);
        this.o = true;
        this.j = ta7Var;
        this.k = s9iVar;
        this.l = ip4Var;
        i3j i3jVar = new i3j();
        i3jVar.a = ta7Var;
        i3jVar.b = s9iVar;
        this.m = i3jVar;
    }

    public static boolean g(fp4 fp4Var, bre breVar, boolean z) {
        if (breVar == null) {
            return false;
        }
        if (!z && breVar.e != 1) {
            return false;
        }
        Iterator it = fp4Var.f.iterator();
        while (it.hasNext()) {
            if (((yqe) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.t7j
    public final k7j a(isd isdVar) {
        return new b15(this, isdVar);
    }

    public final void h(bre breVar) {
        a15 a15Var = new a15(this, this, breVar);
        this.n = a15Var;
        b(a15Var);
    }
}
