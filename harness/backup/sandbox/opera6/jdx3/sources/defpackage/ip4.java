package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.annotations.WeakOwner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ip4 extends t7j {
    public final ta7 j;
    public final s9i k;
    public final stm l;

    @NonNull
    @WeakOwner
    private final jp4 m;

    @Nullable
    @WeakOwner
    private q8j n;
    public boolean o;

    public ip4(Context context, ta7 ta7Var, tm5 tm5Var, s9i s9iVar, stm stmVar) {
        super(tm5Var);
        this.o = true;
        this.j = ta7Var;
        this.k = s9iVar;
        this.l = stmVar;
        jp4 jp4Var = new jp4(context, this);
        hb6 hb6Var = jp4Var.c;
        if (hb6Var.d() != null || hb6Var.b() != null) {
            b(jp4Var);
        }
        this.m = jp4Var;
    }

    @Override // defpackage.t7j
    public final k7j a(isd isdVar) {
        return new hp4(this, isdVar);
    }

    public final void g(List list, Set set) {
        gp4 gp4Var = new gp4(this, this, new ArrayList(list), new HashSet(set));
        this.n = gp4Var;
        b(gp4Var);
    }
}
