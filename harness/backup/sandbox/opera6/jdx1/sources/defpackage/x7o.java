package defpackage;

import android.graphics.Paint;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class x7o {
    public static final x7o a = new x7o();

    public final long a(@NotNull Paint paint) {
        int i = u95.h;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        if (j >= 16) {
            colorLong = (colorLong & (-64)) | (j + 1);
        }
        igm igmVar = jgm.b;
        return colorLong;
    }

    public final void b(@NotNull Paint paint, int i) {
        paint.setBlendMode(alo.e0(i));
    }

    public final void c(@NotNull Paint paint, long j) {
        paint.setColor(jpo.U(j));
    }
}
