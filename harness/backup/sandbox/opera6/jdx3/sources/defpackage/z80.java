package defpackage;

/* loaded from: classes.dex */
public final class z80 implements yc0 {
    public static final z80 b = new z80(0);
    public static final z80 c = new z80(1);
    public static final z80 d = new z80(2);
    public static final z80 e = new z80(3);
    public static final z80 f = new z80(4);
    public static final z80 g = new z80(5);
    public static final z80 h = new z80(6);
    public static final z80 i = new z80(7);
    public static final z80 j = new z80(8);
    public static final z80 k = new z80(9);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public z80(int i2) {
        this.a = i2;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
