package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class en3 implements ato {
    public final ah3 a;
    public final nx5 b;

    public en3(ah3 ah3Var, nx5 nx5Var) {
        this.a = ah3Var;
        this.b = nx5Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) throws NumberFormatException {
        bz0 bz0VarD;
        String str;
        vy0 vy0Var;
        try {
            bz0VarD = cy0Var.d();
            str = (String) map.get("duration");
        } catch (NumberFormatException e) {
            xh3.a("Exception handling video metadata", e, 4);
            this.a.a("VideoMetadataGmsgHandler.onGmsg", (Throwable) e);
        }
        if (str == null) {
            xh3.a("Invalid videoMeta gmsg with no duration.", null, 6);
            return Unit.a;
        }
        Float.parseFloat(str);
        if (bz0VarD == null) {
            "1".equals(map.get("customControlsAllowed"));
            "1".equals(map.get("clickToExpandAllowed"));
            bz0VarD = new bz0(this.b, cy0Var);
            synchronized (cy0Var) {
                if (cy0Var.d() != null) {
                    xu0.a("Attempt to create multiple GmaWebViewVideoController.", (Exception) null);
                } else {
                    cy0Var.r = bz0VarD;
                }
            }
        }
        boolean zEquals = "1".equals(map.get("muted"));
        String str2 = (String) map.get("playbackState");
        if (str2 == null) {
            xh3.a("Invalid videoMeta gmsg with no playback state.", null, 6);
            return Unit.a;
        }
        int i = Integer.parseInt(str2);
        vy0[] vy0VarArrValues = vy0.values();
        int length = vy0VarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                vy0Var = null;
                break;
            }
            vy0Var = vy0VarArrValues[i2];
            if (vy0Var.a == i) {
                break;
            }
            i2++;
        }
        if (vy0Var == null) {
            vy0Var = vy0.UNKNOWN;
        }
        String str3 = (String) map.get("aspectRatio");
        if (str3 != null) {
            bz0VarD.a(vy0Var, zEquals, Float.parseFloat(str3));
            return Unit.a;
        }
        xh3.a("Invalid videoMeta gmsg with no aspect ratio.", null, 6);
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 10;
    }

    @Override // defpackage.ato
    public final boolean c() {
        return true;
    }
}
