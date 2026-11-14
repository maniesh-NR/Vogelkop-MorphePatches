package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@h2j
/* loaded from: classes.dex */
public final class fuo {

    @NotNull
    public static final qto Companion;
    public static final l4c b;
    public static final fuo c;
    public static final fuo d;
    public static final fuo e;
    public static final /* synthetic */ fuo[] f;
    public static final /* synthetic */ h58 g;
    public final byte a;

    static {
        fuo fuoVar = new fuo("Banner", 0, 1);
        c = fuoVar;
        fuo fuoVar2 = new fuo("Video", 1, 2);
        d = fuoVar2;
        fuo fuoVar3 = new fuo("Native", 2, 4);
        e = fuoVar3;
        fuo[] fuoVarArr = {fuoVar, fuoVar2, fuoVar3};
        f = fuoVarArr;
        g = new h58(fuoVarArr);
        Companion = new qto();
        b = z4c.a(f7c.b, a43.K);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fuo(String str, int i, int i2) {
        this.a = i2;
    }

    public static fuo valueOf(String str) {
        return (fuo) Enum.valueOf(fuo.class, str);
    }

    public static fuo[] values() {
        return (fuo[]) f.clone();
    }
}
