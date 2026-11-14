package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.opera.android.suggestion.Suggestion;

/* loaded from: classes.dex */
public final class sri implements pri {
    public static final SparseArray d;
    public final SparseIntArray a = new SparseIntArray();
    public final eu3 b;
    public final int c;

    static {
        SparseArray sparseArray = new SparseArray();
        d = sparseArray;
        sparseArray.append(1, new rri(2, 3, false));
        sparseArray.append(2, new rri(5, 0, true));
    }

    public sri(eu3 eu3Var, int i) {
        this.b = eu3Var;
        this.c = i;
    }

    @Override // defpackage.pri
    public final Suggestion a(dri driVar, int i) {
        dri driVar2 = driVar;
        byte b = driVar2.a;
        rri rriVar = (rri) d.get(b, rri.d);
        boolean asBoolean = this.b.getAsBoolean();
        SparseIntArray sparseIntArray = this.a;
        if (((asBoolean && !rriVar.c) || this.c < rriVar.b || sparseIntArray.get(b) >= rriVar.a) && driVar2.a != 0) {
            driVar2 = new dri(driVar2.b, "", "", "", 0, 0, "");
        }
        String str = driVar2.b;
        byte b2 = driVar2.a;
        sparseIntArray.put(b2, sparseIntArray.get(b2) + 1);
        if (b2 == 0) {
            return new Suggestion(8, str, "", str, null, null, i, "", 0, -1, null);
        }
        if (b2 != 1) {
            return b2 != 2 ? new Suggestion(8, str, "", str, null, null, i, "", 0, -1, null) : new Suggestion(19, driVar2.c, "", str, null, null, i, "", 0, -1, null);
        }
        return new Suggestion(18, driVar2.c, driVar2.d, driVar2.e, null, str, i, driVar2.f, driVar2.g, -1, null);
    }
}
