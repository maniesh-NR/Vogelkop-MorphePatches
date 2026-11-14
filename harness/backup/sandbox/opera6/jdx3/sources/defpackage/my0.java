package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class my0 implements id {
    public final BrowserActivity a;
    public final fd b;
    public final dw3 c;
    public final zyk d;
    public final zyk e = z4c.b(new pa((Object) this, (byte) 16));

    static {
        jf jfVar = fd.e;
        int i = BrowserActivity.E1;
    }

    public my0(BrowserActivity browserActivity, fd fdVar, dw3 dw3Var, dw3 dw3Var2) {
        this.a = browserActivity;
        this.b = fdVar;
        this.c = dw3Var;
        this.d = z4c.b(new x2((Object) dw3Var2, (Object) this, (byte) 8));
    }

    @Override // defpackage.id
    public final jf a(yk5 yk5Var, pc pcVar) {
        if (ly0.a[pcVar.ordinal()] != 1 || !b()) {
            return null;
        }
        whf whfVar = new whf(this, (byte) 4);
        i0a i0aVar = (i0a) ((ekc) this.e.getValue()).g();
        return new jf(whfVar, null, true, i0aVar != null && i0aVar.b, 22);
    }

    public final boolean b() {
        CharSequence charSequence;
        i0a i0aVar = (i0a) ((ekc) this.e.getValue()).g();
        return (i0aVar == null || !i0aVar.a || (charSequence = (CharSequence) ((ekc) this.d.getValue()).g()) == null || charSequence.length() == 0) ? false : true;
    }
}
