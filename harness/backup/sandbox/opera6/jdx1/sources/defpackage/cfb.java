package defpackage;

/* loaded from: classes.dex */
public interface cfb extends ffb {
    void addInt(int i);

    int getInt(int i);

    @Override // defpackage.ffb
    /* synthetic */ boolean isModifiable();

    @Override // defpackage.ffb
    /* synthetic */ void makeImmutable();

    @Override // defpackage.ffb
    cfb mutableCopyWithCapacity(int i);

    int setInt(int i, int i2);
}
