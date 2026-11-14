package defpackage;

import android.media.VolumeProvider;
import android.os.Build;

/* loaded from: classes.dex */
public final class cz9 {
    public int a;
    public int b;
    public String c;
    public byte d;
    public Object e;
    public Object f;

    public final prp a() {
        String str;
        String str2;
        String str3;
        if (this.d == 3 && (str = this.c) != null && (str2 = (String) this.e) != null && (str3 = (String) this.f) != null) {
            return new prp(this.a, this.b, str, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" width");
        }
        if ((this.d & 2) == 0) {
            sb.append(" height");
        }
        if (this.c == null) {
            sb.append(" altText");
        }
        if (((String) this.e) == null) {
            sb.append(" creativeType");
        }
        if (((String) this.f) == null) {
            sb.append(" staticResourceUri");
        }
        qp2.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public final VolumeProvider b() {
        cz9 cz9Var;
        if (((VolumeProvider) this.e) != null) {
            cz9Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            cz9Var = this;
            cz9Var.e = new fcn(cz9Var, this.d, this.a, this.b, this.c, (byte) 1);
        } else {
            cz9Var = this;
            cz9Var.e = new gcn((byte) 1, cz9Var.d, cz9Var.a, cz9Var.b, cz9Var);
        }
        return (VolumeProvider) cz9Var.e;
    }
}
