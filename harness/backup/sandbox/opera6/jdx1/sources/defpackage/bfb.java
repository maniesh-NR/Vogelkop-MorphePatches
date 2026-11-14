package defpackage;

/* loaded from: classes.dex */
public interface bfb extends ffb {
    void addFloat(float f);

    float getFloat(int i);

    @Override // defpackage.ffb
    /* synthetic */ boolean isModifiable();

    @Override // defpackage.ffb
    /* synthetic */ void makeImmutable();

    @Override // defpackage.ffb
    bfb mutableCopyWithCapacity(int i);

    float setFloat(int i, float f);
}
