package defpackage;

import android.widget.TextView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class laj {
    public static final laj e = new laj(0.0f, 0.0f, 0.0f, 0);
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public laj(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final void a(TextView textView) {
        textView.setShadowLayer(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && laj.class == obj.getClass()) {
            laj lajVar = (laj) obj;
            if (Float.compare(lajVar.a, this.a) == 0 && Float.compare(lajVar.b, this.b) == 0 && Float.compare(lajVar.c, this.c) == 0 && this.d == lajVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Integer.valueOf(this.d));
    }
}
