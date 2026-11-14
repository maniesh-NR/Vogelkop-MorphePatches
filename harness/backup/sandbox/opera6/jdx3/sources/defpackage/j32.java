package defpackage;

import com.opera.android.Lazy;

/* loaded from: classes.dex */
public final class j32 extends e32 {
    public final qii d;
    public final String e;
    public boolean f;
    public final i32 g;
    public final c32 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j32(umi umiVar, Lazy lazy, String str, cv2 cv2Var, f9 f9Var) {
        super(cv2Var);
        r16 r16Var = ngh.a;
        qii qiiVar = qii.d;
        this.d = qiiVar;
        this.e = str;
        this.f = true;
        i32 i32Var = new i32(umiVar, lazy, this);
        this.g = i32Var;
        this.h = new c32(new q3(this, f9Var, (byte) 22));
        i32Var.h();
    }
}
