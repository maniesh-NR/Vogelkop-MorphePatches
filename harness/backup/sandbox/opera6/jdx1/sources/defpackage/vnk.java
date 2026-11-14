package defpackage;

/* loaded from: classes.dex */
public interface vnk {
    void j(byte[] bArr, int i, int i2, unk unkVar, op5 op5Var);

    default void reset() {
    }

    default lnk u(int i, int i2, byte[] bArr) {
        z0b z0bVarP = h1b.p();
        j(bArr, 0, i2, unk.c, new txi(z0bVarP, (byte) 23));
        return new b46(z0bVarP.g());
    }

    int z();
}
