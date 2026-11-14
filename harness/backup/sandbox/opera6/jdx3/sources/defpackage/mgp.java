package defpackage;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class mgp {
    public static final ggp b;
    public static final /* synthetic */ mgp[] c;
    public static final /* synthetic */ h58 d;
    public final byte a;

    static {
        ggp ggpVar = new ggp("RAW", 0, (byte) 1);
        b = ggpVar;
        mgp[] mgpVarArr = {ggpVar, new fgp("GZIP", 1, (byte) 2)};
        c = mgpVarArr;
        d = new h58(mgpVarArr);
    }

    public mgp(String str, int i, byte b2) {
        this.a = b2;
    }

    public static mgp valueOf(String str) {
        return (mgp) Enum.valueOf(mgp.class, str);
    }

    public static mgp[] values() {
        return (mgp[]) c.clone();
    }

    public InputStream d(fxo fxoVar) {
        return new GZIPInputStream(fxoVar);
    }
}
