package defpackage;

/* loaded from: classes.dex */
public interface web extends ffb {
    void addDouble(double d);

    double getDouble(int i);

    @Override // defpackage.ffb
    /* synthetic */ boolean isModifiable();

    @Override // defpackage.ffb
    /* synthetic */ void makeImmutable();

    @Override // defpackage.ffb
    web mutableCopyWithCapacity(int i);

    double setDouble(int i, double d);
}
