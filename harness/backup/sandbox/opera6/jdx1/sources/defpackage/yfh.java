package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class yfh implements h28 {
    public static final HashMap f;
    public final h28 c;
    public final xd4 d;
    public final ygh e;

    static {
        HashMap map = new HashMap();
        f = map;
        map.put(1, mo2.j);
        map.put(8, mo2.h);
        map.put(6, mo2.g);
        map.put(5, mo2.f);
        map.put(4, mo2.e);
        map.put(0, mo2.i);
    }

    public yfh(h28 h28Var, xd4 xd4Var, ygh yghVar) {
        this.c = h28Var;
        this.d = xd4Var;
        this.e = yghVar;
    }

    @Override // defpackage.h28
    public final boolean a(int i) {
        if (this.c.a(i)) {
            mo2 mo2Var = (mo2) f.get(Integer.valueOf(i));
            if (mo2Var == null) {
                return true;
            }
            ArrayList arrayListC = this.e.c(VideoQualityQuirk.class);
            int size = arrayListC.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListC.get(i2);
                i2++;
                VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) obj;
                if (videoQualityQuirk == null || !videoQualityQuirk.c(this.d, mo2Var) || ((videoQualityQuirk instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) videoQualityQuirk).d())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.h28
    public final j28 b(int i) {
        if (a(i)) {
            return this.c.b(i);
        }
        return null;
    }
}
