package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class x3n implements u3n {
    public final u3n a;
    public final Range b;
    public final Range c;
    public final HashSet d;

    public x3n(u3n u3nVar) {
        this.a = u3nVar;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        int iQ = u3nVar.q();
        this.b = Range.create(Integer.valueOf(iQ), Integer.valueOf(((int) Math.ceil(4096.0d / iQ)) * iQ));
        int iH = u3nVar.h();
        this.c = Range.create(Integer.valueOf(iH), Integer.valueOf(((int) Math.ceil(2160.0d / iH)) * iH));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    @Override // defpackage.u3n
    public final Range C() {
        return this.b;
    }

    @Override // defpackage.u3n
    public final Range E() {
        return this.c;
    }

    @Override // defpackage.u3n
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.u3n
    public final Range g(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean zContains = range.contains((Range) numValueOf);
        u3n u3nVar = this.a;
        if (zContains && i % u3nVar.h() == 0) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder("Not supported height: ");
        sb.append(i);
        sb.append(" which is not in ");
        sb.append(range);
        int iH = u3nVar.h();
        sb.append(" or can not be divided by alignment ");
        sb.append(iH);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.u3n
    public final int h() {
        return this.a.h();
    }

    @Override // defpackage.u3n
    public final boolean i(int i, int i2) {
        u3n u3nVar = this.a;
        if (u3nVar.i(i, i2)) {
            return true;
        }
        HashSet hashSet = this.d;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (size.getWidth() == i && size.getHeight() == i2) {
                    return true;
                }
            }
        }
        return this.b.contains((Range) Integer.valueOf(i)) && this.c.contains((Range) Integer.valueOf(i2)) && i % u3nVar.q() == 0 && i2 % u3nVar.h() == 0;
    }

    @Override // defpackage.u3n
    public final int q() {
        return this.a.q();
    }

    @Override // defpackage.u3n
    public final Range r() {
        return this.a.r();
    }

    @Override // defpackage.u3n
    public final Range z(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean zContains = range.contains((Range) numValueOf);
        u3n u3nVar = this.a;
        if (zContains && i % u3nVar.q() == 0) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder("Not supported width: ");
        sb.append(i);
        sb.append(" which is not in ");
        sb.append(range);
        int iQ = u3nVar.q();
        sb.append(" or can not be divided by alignment ");
        sb.append(iQ);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
